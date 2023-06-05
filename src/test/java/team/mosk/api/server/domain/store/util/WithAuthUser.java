package team.mosk.api.server.domain.store.util;

import org.springframework.security.test.context.support.WithSecurityContext;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@WithSecurityContext(factory = WithAuthUserSecurityContextFactory.class)
public @interface WithAuthUser {
    long id() default 1L;
    String email() default "test@test.test";
    String password() default "password";

    long period() default 1L;
}
