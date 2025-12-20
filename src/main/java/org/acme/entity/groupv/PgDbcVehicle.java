package org.acme.entity.groupv;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "dbc_vehicle", schema = "dbc")
@Data
@EqualsAndHashCode(callSuper = false)
public class PgDbcVehicle extends PanacheEntityBase {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "turnspeed", nullable = false)
    private Float turnSpeed;

    @Column(name = "pitchspeed", nullable = false)
    private Float pitchSpeed;

    @Column(name = "pitchmin", nullable = false)
    private Float pitchMin;

    @Column(name = "pitchmax", nullable = false)
    private Float pitchMax;

    @Column(name = "seatid_1", nullable = false)
    private Integer seatId1;

    @Column(name = "seatid_2", nullable = false)
    private Integer seatId2;

    @Column(name = "seatid_3", nullable = false)
    private Integer seatId3;

    @Column(name = "seatid_4", nullable = false)
    private Integer seatId4;

    @Column(name = "seatid_5", nullable = false)
    private Integer seatId5;

    @Column(name = "seatid_6", nullable = false)
    private Integer seatId6;

    @Column(name = "seatid_7", nullable = false)
    private Integer seatId7;

    @Column(name = "seatid_8", nullable = false)
    private Integer seatId8;

    @Column(name = "mouselookoffsetpitch", nullable = false)
    private Float mouseLookOffsetPitch;

    @Column(name = "camerafadedistscalarmin", nullable = false)
    private Float cameraFadeDistScalarMin;

    @Column(name = "camerafadedistscalarmax", nullable = false)
    private Float cameraFadeDistScalarMax;

    @Column(name = "camerapitchoffset", nullable = false)
    private Float cameraPitchOffset;

    @Column(name = "facinglimitright", nullable = false)
    private Float facingLimitRight;

    @Column(name = "facinglimitleft", nullable = false)
    private Float facingLimitLeft;

    @Column(name = "mssltrgtturnlingering", nullable = false)
    private Float msslTrgtTurnLingering;

    @Column(name = "mssltrgtpitchlingering", nullable = false)
    private Float msslTrgtPitchLingering;

    @Column(name = "mssltrgtmouselingering", nullable = false)
    private Float msslTrgtMouseLingering;

    @Column(name = "mssltrgtendopacity", nullable = false)
    private Float msslTrgtEndOpacity;

    @Column(name = "mssltrgtarcspeed", nullable = false)
    private Float msslTrgtArcSpeed;

    @Column(name = "mssltrgtarcrepeat", nullable = false)
    private Float msslTrgtArcRepeat;

    @Column(name = "mssltrgtarcwidth", nullable = false)
    private Float msslTrgtArcWidth;

    @Column(name = "mssltrgtimpactradius_1", nullable = false)
    private Float msslTrgtImpactRadius1;

    @Column(name = "mssltrgtimpactradius_2", nullable = false)
    private Float msslTrgtImpactRadius2;

    @Column(name = "mssltrgtarctexture", columnDefinition = "text")
    private String msslTrgtArcTexture;

    @Column(name = "mssltrgtimpacttexture", columnDefinition = "text")
    private String msslTrgtImpactTexture;

    @Column(name = "mssltrgtimpactmodel_1", columnDefinition = "text")
    private String msslTrgtImpactModel1;

    @Column(name = "mssltrgtimpactmodel_2", columnDefinition = "text")
    private String msslTrgtImpactModel2;

    @Column(name = "camerayawoffset", nullable = false)
    private Float cameraYawOffset;

    @Column(name = "uilocomotiontype", nullable = false)
    private Integer uiLocomotionType;

    @Column(name = "mssltrgtimpacttexradius", nullable = false)
    private Float msslTrgtImpactTexRadius;

    @Column(name = "vehicleuiindicatorid", nullable = false)
    private Integer vehicleUIIndicatorId;

    @Column(name = "powerdisplayid_1", nullable = false)
    private Integer powerDisplayId1;

    @Column(name = "powerdisplayid_2", nullable = false)
    private Integer powerDisplayId2;

    @Column(name = "powerdisplayid_3", nullable = false)
    private Integer powerDisplayId3;
}