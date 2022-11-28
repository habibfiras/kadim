package tn.esprit.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.Persistance.Etudiant;
@Component
@Aspect
@Slf4j
public class LoggingAspect {
	@AfterThrowing(value= "execution(* tn.esprit.controller.*.*(..)) ",throwing = "e")
	 void afterEtudiantretrieveByID(JoinPoint joinPoint,Exception e) {
		log.info("Etudiant does not exist"+e.getMessage());	
	}
	
	@AfterReturning(value="execution(* tn.esprit.controller.*.*(..))",returning = "etudiant")
	 void afterFindingEtudiant(JoinPoint joinPoint,Etudiant etudiant) { 
		log.info(" Aspect return(after return exist student) :"+etudiant);
	}
}
