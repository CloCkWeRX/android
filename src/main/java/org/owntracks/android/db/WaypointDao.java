package org.owntracks.android.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import org.owntracks.android.db.Waypoint;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "WAYPOINT".
*/
public class WaypointDao extends AbstractDao<Waypoint, Long> {

    public static final String TABLENAME = "WAYPOINT";

    /**
     * Properties of entity Waypoint.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Description = new Property(1, String.class, "description", false, "DESCRIPTION");
        public final static Property GeofenceLatitude = new Property(2, Double.class, "geofenceLatitude", false, "GEOFENCE_LATITUDE");
        public final static Property GeofenceLongitude = new Property(3, Double.class, "geofenceLongitude", false, "GEOFENCE_LONGITUDE");
        public final static Property GeofenceRadius = new Property(4, Integer.class, "geofenceRadius", false, "GEOFENCE_RADIUS");
        public final static Property GeofenceId = new Property(5, String.class, "geofenceId", false, "GEOFENCE_ID");
        public final static Property WifiSSID = new Property(6, String.class, "wifiSSID", false, "WIFI_SSID");
        public final static Property BeaconUUID = new Property(7, String.class, "beaconUUID", false, "BEACON_UUID");
        public final static Property BeaconMajor = new Property(8, Integer.class, "beaconMajor", false, "BEACON_MAJOR");
        public final static Property BeaconMinor = new Property(9, Integer.class, "beaconMinor", false, "BEACON_MINOR");
        public final static Property Shared = new Property(10, Boolean.class, "shared", false, "SHARED");
        public final static Property Date = new Property(11, java.util.Date.class, "date", false, "DATE");
        public final static Property LastTriggered = new Property(12, Long.class, "lastTriggered", false, "LAST_TRIGGERED");
        public final static Property ModeId = new Property(13, int.class, "modeId", false, "MODE_ID");
        public final static Property Type = new Property(14, int.class, "type", false, "TYPE");
    };


    public WaypointDao(DaoConfig config) {
        super(config);
    }
    
    public WaypointDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"WAYPOINT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"DESCRIPTION\" TEXT," + // 1: description
                "\"GEOFENCE_LATITUDE\" REAL," + // 2: geofenceLatitude
                "\"GEOFENCE_LONGITUDE\" REAL," + // 3: geofenceLongitude
                "\"GEOFENCE_RADIUS\" INTEGER," + // 4: geofenceRadius
                "\"GEOFENCE_ID\" TEXT," + // 5: geofenceId
                "\"WIFI_SSID\" TEXT," + // 6: wifiSSID
                "\"BEACON_UUID\" TEXT," + // 7: beaconUUID
                "\"BEACON_MAJOR\" INTEGER," + // 8: beaconMajor
                "\"BEACON_MINOR\" INTEGER," + // 9: beaconMinor
                "\"SHARED\" INTEGER," + // 10: shared
                "\"DATE\" INTEGER," + // 11: date
                "\"LAST_TRIGGERED\" INTEGER," + // 12: lastTriggered
                "\"MODE_ID\" INTEGER NOT NULL ," + // 13: modeId
                "\"TYPE\" INTEGER NOT NULL );"); // 14: type
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"WAYPOINT\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Waypoint entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(2, description);
        }
 
        Double geofenceLatitude = entity.getGeofenceLatitude();
        if (geofenceLatitude != null) {
            stmt.bindDouble(3, geofenceLatitude);
        }
 
        Double geofenceLongitude = entity.getGeofenceLongitude();
        if (geofenceLongitude != null) {
            stmt.bindDouble(4, geofenceLongitude);
        }
 
        Integer geofenceRadius = entity.getGeofenceRadius();
        if (geofenceRadius != null) {
            stmt.bindLong(5, geofenceRadius);
        }
 
        String geofenceId = entity.getGeofenceId();
        if (geofenceId != null) {
            stmt.bindString(6, geofenceId);
        }
 
        String wifiSSID = entity.getWifiSSID();
        if (wifiSSID != null) {
            stmt.bindString(7, wifiSSID);
        }
 
        String beaconUUID = entity.getBeaconUUID();
        if (beaconUUID != null) {
            stmt.bindString(8, beaconUUID);
        }
 
        Integer beaconMajor = entity.getBeaconMajor();
        if (beaconMajor != null) {
            stmt.bindLong(9, beaconMajor);
        }
 
        Integer beaconMinor = entity.getBeaconMinor();
        if (beaconMinor != null) {
            stmt.bindLong(10, beaconMinor);
        }
 
        Boolean shared = entity.getShared();
        if (shared != null) {
            stmt.bindLong(11, shared ? 1L: 0L);
        }
 
        java.util.Date date = entity.getDate();
        if (date != null) {
            stmt.bindLong(12, date.getTime());
        }
 
        Long lastTriggered = entity.getLastTriggered();
        if (lastTriggered != null) {
            stmt.bindLong(13, lastTriggered);
        }
        stmt.bindLong(14, entity.getModeId());
        stmt.bindLong(15, entity.getType());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Waypoint readEntity(Cursor cursor, int offset) {
        Waypoint entity = new Waypoint( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // description
            cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2), // geofenceLatitude
            cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3), // geofenceLongitude
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // geofenceRadius
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // geofenceId
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // wifiSSID
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // beaconUUID
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // beaconMajor
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // beaconMinor
            cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0, // shared
            cursor.isNull(offset + 11) ? null : new java.util.Date(cursor.getLong(offset + 11)), // date
            cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12), // lastTriggered
            cursor.getInt(offset + 13), // modeId
            cursor.getInt(offset + 14) // type
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Waypoint entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDescription(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setGeofenceLatitude(cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2));
        entity.setGeofenceLongitude(cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3));
        entity.setGeofenceRadius(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setGeofenceId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setWifiSSID(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setBeaconUUID(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setBeaconMajor(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setBeaconMinor(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setShared(cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0);
        entity.setDate(cursor.isNull(offset + 11) ? null : new java.util.Date(cursor.getLong(offset + 11)));
        entity.setLastTriggered(cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12));
        entity.setModeId(cursor.getInt(offset + 13));
        entity.setType(cursor.getInt(offset + 14));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Waypoint entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Waypoint entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
