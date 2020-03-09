package fr.cdestombes.sonar.sub2;

import fr.cdestombes.sonar.sub1.OtherClass;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class CallMethodWithS2441 {
    public void myFunction(HttpServletRequest request) {
        HttpSession session = request.getSession();

        session.setAttribute("test with method call", getStringResult());

        String s = getStringResult();
        session.setAttribute("test with result of method call", s);

        session.setAttribute("test with method call from other class", new OtherClass().getAttString());

        String sOther = new OtherClass().getAttString();
        session.setAttribute("test with result of method call from other class", sOther);
    }

    private String getStringResult() {
        return new OtherClass().getAttString();
    }
}
