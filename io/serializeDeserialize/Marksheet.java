package io.serializeDeserialize;

import java.io.Serializable;

public class Marksheet implements Serializable {

    public int id =0;
    public String name = null;
    public int maths = 0;
    public int physics = 0;
    public int chemistry =0;
    public transient int total = 0;
}
