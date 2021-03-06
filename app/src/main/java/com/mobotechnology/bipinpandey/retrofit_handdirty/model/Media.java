package com.mobotechnology.bipinpandey.retrofit_handdirty.model;

import java.util.ArrayList;

public class Media {
    private String copyright;

    private ArrayList<Media_metadata> mediametadata;

    private String subtype;

    private String caption;

    private String type;

    private String approved_for_syndication;

    public String getCopyright ()
    {
        return copyright;
    }

    public void setCopyright (String copyright)
    {
        this.copyright = copyright;
    }

    public ArrayList<Media_metadata> getMediametadata ()
    {
        return mediametadata;
    }

    public void setMediametadata (ArrayList<Media_metadata> mediametadata)
    {
        this.mediametadata = mediametadata;
    }

    public String getSubtype ()
    {
        return subtype;
    }

    public void setSubtype (String subtype)
    {
        this.subtype = subtype;
    }

    public String getCaption ()
    {
        return caption;
    }

    public void setCaption (String caption)
    {
        this.caption = caption;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getApproved_for_syndication ()
    {
        return approved_for_syndication;
    }

    public void setApproved_for_syndication (String approved_for_syndication)
    {
        this.approved_for_syndication = approved_for_syndication;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [copyright = "+copyright+", media-metadata = "+mediametadata+", subtype = "+subtype+", caption = "+caption+", type = "+type+", approved_for_syndication = "+approved_for_syndication+"]";
    }
}
