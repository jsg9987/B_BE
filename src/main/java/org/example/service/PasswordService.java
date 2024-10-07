package org.example.service;

import org.example.dto.PasswordRequestDTO;
import org.example.dto.PasswordResponseDTO;

public interface PasswordService {
    /**
     * 비밀번호 변경 로직 정의
     * @param userId 사용자 ID
     * @param requestDTO 비밀번호 변경 정보가 담긴 DTO
     * @return 비밀번호 변경 결과를 포함한 응답 DTO
     */
    PasswordResponseDTO changePassword(Long userId, PasswordRequestDTO requestDTO);
}
