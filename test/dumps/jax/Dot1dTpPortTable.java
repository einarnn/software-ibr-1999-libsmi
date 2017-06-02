/*
 * This Java file has been generated by smidump 0.5.0. Do not edit!
 * It is intended to be used within a Java AgentX sub-agent environment.
 *
 * $Id$
 */

/**
    This class represents a Java AgentX (JAX) implementation of
    the table dot1dTpPortTable defined in BRIDGE-MIB.

    @version 1
    @author  smidump 0.5.0
    @see     AgentXTable
 */

import java.util.Vector;

import jax.AgentXOID;
import jax.AgentXVarBind;
import jax.AgentXResponsePDU;
import jax.AgentXSetPhase;
import jax.AgentXTable;
import jax.AgentXEntry;

public class Dot1dTpPortTable extends AgentXTable
{

    // entry OID
    private final static long[] OID = {1, 3, 6, 1, 2, 1, 17, 4, 4, 1};

    // constructors
    public Dot1dTpPortTable()
    {
        oid = new AgentXOID(OID);

        // register implemented columns
        columns.addElement(new Long(1));
        columns.addElement(new Long(2));
        columns.addElement(new Long(3));
        columns.addElement(new Long(4));
        columns.addElement(new Long(5));
    }

    public Dot1dTpPortTable(boolean shared)
    {
        super(shared);

        oid = new AgentXOID(OID);

        // register implemented columns
        columns.addElement(new Long(1));
        columns.addElement(new Long(2));
        columns.addElement(new Long(3));
        columns.addElement(new Long(4));
        columns.addElement(new Long(5));
    }

    public AgentXVarBind getVarBind(AgentXEntry entry, long column)
    {
        AgentXOID oid = new AgentXOID(getOID(), column, entry.getInstance());

        switch ((int)column) {
        case 1: // dot1dTpPort
        {
            int value = ((Dot1dTpPortEntry)entry).get_dot1dTpPort();
            return new AgentXVarBind(oid, AgentXVarBind.INTEGER, value);
        }
        case 2: // dot1dTpPortMaxInfo
        {
            int value = ((Dot1dTpPortEntry)entry).get_dot1dTpPortMaxInfo();
            return new AgentXVarBind(oid, AgentXVarBind.INTEGER, value);
        }
        case 3: // dot1dTpPortInFrames
        {
            long value = ((Dot1dTpPortEntry)entry).get_dot1dTpPortInFrames();
            return new AgentXVarBind(oid, AgentXVarBind.COUNTER32, value);
        }
        case 4: // dot1dTpPortOutFrames
        {
            long value = ((Dot1dTpPortEntry)entry).get_dot1dTpPortOutFrames();
            return new AgentXVarBind(oid, AgentXVarBind.COUNTER32, value);
        }
        case 5: // dot1dTpPortInDiscards
        {
            long value = ((Dot1dTpPortEntry)entry).get_dot1dTpPortInDiscards();
            return new AgentXVarBind(oid, AgentXVarBind.COUNTER32, value);
        }
        }

        return null;
    }

    public int setEntry(AgentXSetPhase phase,
                        AgentXEntry entry,
                        long column,
                        AgentXVarBind vb)
    {

        switch ((int)column) {
        }

        return AgentXResponsePDU.NOT_WRITABLE;
    }

}

