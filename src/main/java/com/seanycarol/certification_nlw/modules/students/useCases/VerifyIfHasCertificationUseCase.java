package com.seanycarol.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.seanycarol.certification_nlw.modules.students.dtos.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto) {
        if (dto.getEmail().equals("seany@gmail.com") && dto.getTechnology().equals("JAVA")) {
            return true;
        }
        return false;
    }
}
