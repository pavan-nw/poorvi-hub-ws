package hub.poorvi.app.api.resource;

import com.codahale.metrics.annotation.Timed;
import hub.poorvi.app.api.model.Member;
import hub.poorvi.app.api.response.AppResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: pwadawadagi
 * Date: 14/4/17
 * Time: 6:25 PM
 */
@Path("/members")
@Produces(MediaType.APPLICATION_JSON)
public class MemberResource
{

    public static final int STATUS_CODE = Response.Status.OK.getStatusCode();
    public static final String REASON_PHRASE = Response.Status.OK.getReasonPhrase();

    @GET
    @Timed
    public AppResponse listMembers()
    {
        List<Member> members= new ArrayList<Member>();
        Member member = new Member(1L, "TEST");
        members.add(member);
        members.add(member);
        return new AppResponse(STATUS_CODE, REASON_PHRASE, members);
    }

    @GET
    @Path("/first")
    @Timed
    public AppResponse listFirstMember()
    {
        List<Member> members= new ArrayList<Member>();
        Member member = new Member(1L, "TEST");
        members.add(member);
        members.add(member);
        return new AppResponse(STATUS_CODE, REASON_PHRASE, members.get(0));
    }


}
