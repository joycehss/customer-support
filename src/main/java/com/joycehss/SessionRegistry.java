package com.joycehss;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * Created by joyce on 2017/7/8.
 */
public final class SessionRegistry {
    private static final Map<String, HttpSession> SESSIONS = new Hashtable<String, HttpSession>();

    public static void addSession(HttpSession session) {
       // if(session.getAttribute("username") != null)
            SESSIONS.put(session.getId(), session);
    }

    public static void updateSessionId(HttpSession session, String oldSessionId) {
        synchronized (SESSIONS) {
            SESSIONS.remove(oldSessionId);
            addSession(session);
        }
    }

    public static void removeSession(HttpSession session) {
        SESSIONS.remove(session.getId());
    }

    public static List<HttpSession> getAllSessions() {
        return new ArrayList<HttpSession>(SESSIONS.values());
    }

    public static int getNumberOfSessions() {
        return SESSIONS.size();
    }

    private SessionRegistry() {

    }
}
