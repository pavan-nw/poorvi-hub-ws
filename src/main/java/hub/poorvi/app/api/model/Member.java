package hub.poorvi.app.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * Created by IntelliJ IDEA.
 * User: pwadawadagi
 * Date: 14/4/17
 * Time: 6:32 PM
 */
public class Member extends AppResource
{
    @NotNull
    private long id;
    @Length(min=3)
    private String name;

    public Member(long id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Member()
    {
    }

    @JsonProperty
    public long getId()
    {
        return id;
    }

    @JsonProperty
    public String getName()
    {
        return name;
    }
}
