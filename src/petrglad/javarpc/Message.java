package petrglad.javarpc;

import java.io.Serializable;
import java.util.List;

public class Message implements Serializable {
    private static final long serialVersionUID = -3962286458595857088L;

    public final long serialId;
    public final String methodName;
    public final List<Object> args;

    public Message(long serialId, String methodName, List<Object> args) {
        assert !methodName.isEmpty();
        this.serialId = serialId;
        this.methodName = methodName;
        this.args = args;
    }

    @Override
    public String toString() {
        return "Message [serialId=" + serialId + ", methodName=" + methodName + ", args=" + args
                + "]";
    }
}
