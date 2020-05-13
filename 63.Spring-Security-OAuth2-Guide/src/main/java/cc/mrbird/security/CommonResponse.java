package cc.mrbird.security;

import java.io.Serializable;
import java.util.HashMap;

/**
 * User: cpy
 * Date: 2020/5/13
 * Time: 2:33 下午
 */
public class CommonResponse extends HashMap<String, Object> implements Serializable {

    private static final long serialVersionUID = 967397361339698151L;
    
    public CommonResponse message(String message) {
        this.put("message", message);
        return this;
    }

    public CommonResponse data(Object data) {
        this.put("data", data);
        return this;
    }

    @Override
    public CommonResponse put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public String getMessage() {
        return String.valueOf(get("message"));
    }

    public Object getData() {
        return get("data");
    }
}
    // ===========================================================
    // Fields
    // ===========================================================


    // ===========================================================
    // Override Methods
    // ===========================================================

    // ===========================================================
    // Define Methods
    // ===========================================================


    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================


    // ===========================================================
    // Getter & Setter
    // ===========================================================  

