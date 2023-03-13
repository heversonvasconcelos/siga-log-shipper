package siga;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mockito.Mock;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;

public class UserRequestInterceptor {

    private final Level BLAME = Level.forName("BLAME", 450);
    private final Logger logger = LogManager.getLogger(UserRequestInterceptor.class);

    private static Pessoa usuarioteste = new Pessoa("USUARIO TESTE", "99999", "ZZLTEST");
    private static Pessoa usuario11 = new Pessoa("Usuário 11", "10031", "SVUMM");

    private static String ZZPRC202200196 = "ZZPRC202200196";

    public void log() {

        MockHttpServletRequest request = new MockHttpServletRequest();
        MockHttpSession session = new MockHttpSession();

        request.setSession(session);
        request.setRequestedSessionId(session.getId());
        request.setRequestURI(Acao.VISUALIZAR.getUri());

        UserRequestPayload userRequestPayload = new UserRequestPayload(request, ZZPRC202200196,
                Acao.VISUALIZAR.getDescricao(),
                usuarioteste.getMatricula(), usuarioteste.getLocatacao(), usuarioteste.getNomePessoa()
        );

        logger.log(BLAME, userRequestPayload);
    }
}
