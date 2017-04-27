package hub.poorvi.app.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import hub.poorvi.app.api.model.AppResource;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: pwadawadagi
 * Date: 13/4/17
 * Time: 12:15 PM
 */
public class AppResponse
{
    private int status;
    private String message;
    private Object resource;

    public AppResponse(int status, String message, Object resource)
    {
        this.status = status;
        this.message = message;
        this.resource = resource;
    }

    @JsonProperty
    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    @JsonProperty
    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    @JsonProperty
    public Object getResource()
    {
        return resource;
    }

    public void setResource(Object resource)
    {
        this.resource = resource;
    }
}
