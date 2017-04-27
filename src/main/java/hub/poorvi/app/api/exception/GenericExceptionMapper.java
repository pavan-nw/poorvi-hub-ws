package hub.poorvi.app.api.exception;


import hub.poorvi.app.api.response.AppResponse;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * Created by IntelliJ IDEA.
 * User: pwadawadagi
 * Date: 13/4/17
 * Time: 12:55 PM
 */
public class GenericExceptionMapper implements ExceptionMapper<Throwable>
{
    @Override
    public Response toResponse(Throwable ex)
    {
        ex.printStackTrace();
        int statusCode = getStatusCode(ex);
        String message = Response.Status.INTERNAL_SERVER_ERROR.getReasonPhrase();
        if (ex.getMessage() != null)
        {
            message = ex.getMessage();
        }
        return Response.status(statusCode)
                .entity(new AppResponse(statusCode, message, null))
                .type(MediaType.APPLICATION_JSON)
                .build();
    }

    private int getStatusCode(Throwable ex)
    {
        int statusCode = Response.Status.INTERNAL_SERVER_ERROR.getStatusCode();

        if (ex instanceof WebApplicationException)
        {
            statusCode = ((WebApplicationException) ex).getResponse().getStatus();
        }
        return statusCode;
    }
}
