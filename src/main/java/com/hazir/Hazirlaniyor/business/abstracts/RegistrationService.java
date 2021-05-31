package com.hazir.Hazirlaniyor.business.abstracts;

import com.hazir.Hazirlaniyor.business.concretes.EmailValidatorManager;
import com.hazir.Hazirlaniyor.dataAccess.abstracts.AppUserDao;
import com.hazir.Hazirlaniyor.entity.concretes.AppUser;
import com.hazir.Hazirlaniyor.entity.concretes.RegistrationRequest;

import java.util.Optional;

public interface RegistrationService {
   public boolean takenEmail(AppUserDao appUserDao, RegistrationRequest request);
   public boolean isValid(EmailValidatorManager emailValidatorManager,RegistrationRequest request);
}
