package com.bank.profile.service;

import com.bank.profile.entity.audit;
import java.util.List;

public interface AuditService {


         // Создает новый аудит в базе данных
        audit createAudit(audit audit);

         // Обновляет информацию об аудите в базе данных
        audit updateAudit(  audit audit);

         //Удаляет аудит из базы данных по его идентификатору
         void deleteAuditById(Long id);
        //Получает аудит из базы данных по его идентификатору
        audit getAuditById(Long auditId);
    // Получает все аудиты из базы данных
        List<audit> getAllAudits();
    }

