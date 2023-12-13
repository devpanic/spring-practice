package me.miyeon.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.miyeon.springbootdeveloper.domain.User;
import me.miyeon.springbootdeveloper.dto.AddUserRequest;
import me.miyeon.springbootdeveloper.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    // dto로 전달받은 정보를 이용해 userRepository에 저장하고 ID 값을 반환 받는다.
    public Long save(AddUserRequest dto) {
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }
}
