package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTuojiangosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTuojiangosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended main;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended leftPlate10;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended rightPlate10;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended leftbabyPlate6;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended rightbabyPlate6;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended backleftleg;
    private final AdvancedModelRendererExtended backleftleg2;
    private final AdvancedModelRendererExtended backleftleg3;
    private final AdvancedModelRendererExtended backleftleg4;
    private final AdvancedModelRendererExtended backrightleg;
    private final AdvancedModelRendererExtended backrightleg2;
    private final AdvancedModelRendererExtended backrightleg3;
    private final AdvancedModelRendererExtended backrightleg4;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended leftPlate11;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended rightPlate11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended leftbabyPlate7;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended rightbabyPlate7;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended leftPlate12;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended rightPlate12;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended leftbabyPlate8;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended rightbabyPlate8;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended leftPlate13;
    private final AdvancedModelRendererExtended cube_r28;
    private final AdvancedModelRendererExtended cube_r29;
    private final AdvancedModelRendererExtended rightPlate13;
    private final AdvancedModelRendererExtended cube_r30;
    private final AdvancedModelRendererExtended cube_r31;
    private final AdvancedModelRendererExtended leftbabyPlate9;
    private final AdvancedModelRendererExtended cube_r32;
    private final AdvancedModelRendererExtended cube_r33;
    private final AdvancedModelRendererExtended rightbabyPlate9;
    private final AdvancedModelRendererExtended cube_r34;
    private final AdvancedModelRendererExtended cube_r35;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended leftPlate14;
    private final AdvancedModelRendererExtended cube_r36;
    private final AdvancedModelRendererExtended cube_r37;
    private final AdvancedModelRendererExtended rightPlate14;
    private final AdvancedModelRendererExtended cube_r38;
    private final AdvancedModelRendererExtended cube_r39;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended leftPlate15;
    private final AdvancedModelRendererExtended cube_r40;
    private final AdvancedModelRendererExtended cube_r41;
    private final AdvancedModelRendererExtended rightPlate15;
    private final AdvancedModelRendererExtended cube_r42;
    private final AdvancedModelRendererExtended cube_r43;
    private final AdvancedModelRendererExtended leftPlate16;
    private final AdvancedModelRendererExtended cube_r44;
    private final AdvancedModelRendererExtended cube_r45;
    private final AdvancedModelRendererExtended rightPlate16;
    private final AdvancedModelRendererExtended cube_r46;
    private final AdvancedModelRendererExtended cube_r47;
    private final AdvancedModelRendererExtended tail6;
    private final AdvancedModelRendererExtended lefttailSpike;
    private final AdvancedModelRendererExtended babyskewer_r1;
    private final AdvancedModelRendererExtended cube_r48;
    private final AdvancedModelRendererExtended cube_r49;
    private final AdvancedModelRendererExtended righttailSpike;
    private final AdvancedModelRendererExtended babyskewer_r2;
    private final AdvancedModelRendererExtended cube_r50;
    private final AdvancedModelRendererExtended cube_r51;
    private final AdvancedModelRendererExtended lefttailSpike2;
    private final AdvancedModelRendererExtended babyskewer_r3;
    private final AdvancedModelRendererExtended cube_r52;
    private final AdvancedModelRendererExtended cube_r53;
    private final AdvancedModelRendererExtended righttailSpike2;
    private final AdvancedModelRendererExtended babyskewer_r4;
    private final AdvancedModelRendererExtended cube_r54;
    private final AdvancedModelRendererExtended cube_r55;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended leftPlate8;
    private final AdvancedModelRendererExtended cube_r56;
    private final AdvancedModelRendererExtended cube_r57;
    private final AdvancedModelRendererExtended rightPlate8;
    private final AdvancedModelRendererExtended cube_r58;
    private final AdvancedModelRendererExtended cube_r59;
    private final AdvancedModelRendererExtended leftbabyPlate4;
    private final AdvancedModelRendererExtended cube_r60;
    private final AdvancedModelRendererExtended cube_r61;
    private final AdvancedModelRendererExtended rightbabyPlate4;
    private final AdvancedModelRendererExtended cube_r62;
    private final AdvancedModelRendererExtended cube_r63;
    private final AdvancedModelRendererExtended leftPlate7;
    private final AdvancedModelRendererExtended cube_r64;
    private final AdvancedModelRendererExtended cube_r65;
    private final AdvancedModelRendererExtended rightPlate7;
    private final AdvancedModelRendererExtended cube_r66;
    private final AdvancedModelRendererExtended cube_r67;
    private final AdvancedModelRendererExtended leftbabyPlate3;
    private final AdvancedModelRendererExtended cube_r68;
    private final AdvancedModelRendererExtended cube_r69;
    private final AdvancedModelRendererExtended rightbabyPlate3;
    private final AdvancedModelRendererExtended cube_r70;
    private final AdvancedModelRendererExtended cube_r71;
    private final AdvancedModelRendererExtended leftPlate9;
    private final AdvancedModelRendererExtended cube_r72;
    private final AdvancedModelRendererExtended cube_r73;
    private final AdvancedModelRendererExtended rightPlate9;
    private final AdvancedModelRendererExtended cube_r74;
    private final AdvancedModelRendererExtended cube_r75;
    private final AdvancedModelRendererExtended leftbabyPlate5;
    private final AdvancedModelRendererExtended cube_r76;
    private final AdvancedModelRendererExtended cube_r77;
    private final AdvancedModelRendererExtended rightbabyPlate5;
    private final AdvancedModelRendererExtended cube_r78;
    private final AdvancedModelRendererExtended cube_r79;
    private final AdvancedModelRendererExtended upperbody;
    private final AdvancedModelRendererExtended cube_r80;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended cube_r81;
    private final AdvancedModelRendererExtended cube_r82;
    private final AdvancedModelRendererExtended leftPlate4;
    private final AdvancedModelRendererExtended rightPlate4;
    private final AdvancedModelRendererExtended leftPlate3;
    private final AdvancedModelRendererExtended rightPlate3;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended leftPlate2;
    private final AdvancedModelRendererExtended rightPlate2;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended leftPlate1;
    private final AdvancedModelRendererExtended rightPlate1;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r83;
    private final AdvancedModelRendererExtended cube_r84;
    private final AdvancedModelRendererExtended cube_r85;
    private final AdvancedModelRendererExtended cube_r86;
    private final AdvancedModelRendererExtended cube_r87;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r88;
    private final AdvancedModelRendererExtended cube_r89;
    private final AdvancedModelRendererExtended cube_r90;
    private final AdvancedModelRendererExtended cube_r91;
    private final AdvancedModelRendererExtended cube_r92;
    private final AdvancedModelRendererExtended frontleftleg;
    private final AdvancedModelRendererExtended frontleftleg2;
    private final AdvancedModelRendererExtended frontleftleg3;
    private final AdvancedModelRendererExtended frontrightleg;
    private final AdvancedModelRendererExtended frontrightleg2;
    private final AdvancedModelRendererExtended frontrightleg3;
    private final AdvancedModelRendererExtended leftPlate6;
    private final AdvancedModelRendererExtended cube_r93;
    private final AdvancedModelRendererExtended cube_r94;
    private final AdvancedModelRendererExtended cube_r95;
    private final AdvancedModelRendererExtended rightPlate6;
    private final AdvancedModelRendererExtended cube_r96;
    private final AdvancedModelRendererExtended cube_r97;
    private final AdvancedModelRendererExtended cube_r98;
    private final AdvancedModelRendererExtended leftbabyPlate2;
    private final AdvancedModelRendererExtended cube_r99;
    private final AdvancedModelRendererExtended cube_r100;
    private final AdvancedModelRendererExtended cube_r101;
    private final AdvancedModelRendererExtended rightbabyPlate2;
    private final AdvancedModelRendererExtended cube_r102;
    private final AdvancedModelRendererExtended cube_r103;
    private final AdvancedModelRendererExtended cube_r104;
    private final AdvancedModelRendererExtended leftPlate5;
    private final AdvancedModelRendererExtended cube_r105;
    private final AdvancedModelRendererExtended cube_r106;
    private final AdvancedModelRendererExtended cube_r107;
    private final AdvancedModelRendererExtended cube_r108;
    private final AdvancedModelRendererExtended rightPlate5;
    private final AdvancedModelRendererExtended cube_r109;
    private final AdvancedModelRendererExtended cube_r110;
    private final AdvancedModelRendererExtended cube_r111;
    private final AdvancedModelRendererExtended cube_r112;
    private final AdvancedModelRendererExtended leftbabyPlate1;
    private final AdvancedModelRendererExtended cube_r113;
    private final AdvancedModelRendererExtended cube_r114;
    private final AdvancedModelRendererExtended cube_r115;
    private final AdvancedModelRendererExtended cube_r116;
    private final AdvancedModelRendererExtended rightbabyPlate1;
    private final AdvancedModelRendererExtended cube_r117;
    private final AdvancedModelRendererExtended cube_r118;
    private final AdvancedModelRendererExtended cube_r119;
    private final AdvancedModelRendererExtended cube_r120;
    private final AdvancedModelRendererExtended Leftlegspike;
    private final AdvancedModelRendererExtended Leftlegspiketip_r1;
    private final AdvancedModelRendererExtended Leftlegspikebase_r1;
    private final AdvancedModelRendererExtended Rightlegspike;
    private final AdvancedModelRendererExtended Leftlegspiketip_r2;
    private final AdvancedModelRendererExtended Leftlegspikebase_r2;

    private ModelAnimator animator;

    public ModelTuojiangosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.main = new AdvancedModelRendererExtended(this);
        this.main.setRotationPoint(0.0F, 13.8F, -2.0F);


        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -14.0F, 13.0F);
        this.main.addChild(body);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -7.25F, -9.25F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 35, -6.5F, 0.0F, 2.25F, 13, 17, 13, 0.0F, false));

        this.leftPlate10 = new AdvancedModelRendererExtended(this);
        this.leftPlate10.setRotationPoint(2.5F, -6.7946F, 0.7464F);
        this.body.addChild(leftPlate10);
        this.setRotateAngle(leftPlate10, -0.4305F, 0.0735F, 0.1585F);
        this.leftPlate10.cubeList.add(new ModelBox(leftPlate10, 27, 65, -0.5F, -3.8468F, -1.0202F, 1, 5, 3, -0.01F, false));
        this.leftPlate10.cubeList.add(new ModelBox(leftPlate10, 55, 35, -0.5F, -6.8968F, -0.6202F, 1, 4, 2, -0.02F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -0.503F, 0.1628F);
        this.leftPlate10.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2051F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 82, 56, -0.5F, -8.9233F, 1.4985F, 1, 9, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -0.503F, 0.1628F);
        this.leftPlate10.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 74, -0.5F, -8.8438F, -1.883F, 1, 11, 1, 0.01F, false));

        this.rightPlate10 = new AdvancedModelRendererExtended(this);
        this.rightPlate10.setRotationPoint(-2.5F, -6.7946F, 0.7464F);
        this.body.addChild(rightPlate10);
        this.setRotateAngle(rightPlate10, -0.4305F, -0.0735F, -0.1585F);
        this.rightPlate10.cubeList.add(new ModelBox(rightPlate10, 27, 65, -0.5F, -3.8468F, -1.0202F, 1, 5, 3, -0.01F, true));
        this.rightPlate10.cubeList.add(new ModelBox(rightPlate10, 55, 35, -0.5F, -6.8968F, -0.6202F, 1, 4, 2, -0.02F, true));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -0.503F, 0.1628F);
        this.rightPlate10.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2051F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 82, 56, -0.5F, -8.9233F, 1.4985F, 1, 9, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -0.503F, 0.1628F);
        this.rightPlate10.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 70, 74, -0.5F, -8.8438F, -1.883F, 1, 11, 1, 0.01F, true));

        this.leftbabyPlate6 = new AdvancedModelRendererExtended(this);
        this.leftbabyPlate6.setRotationPoint(2.5F, -2.7946F, -1.0536F);
        this.body.addChild(leftbabyPlate6);
        this.setRotateAngle(leftbabyPlate6, -0.4305F, 0.0735F, 0.1585F);
        this.leftbabyPlate6.cubeList.add(new ModelBox(leftbabyPlate6, 100, 42, -0.5F, -6.8968F, -0.6202F, 1, 3, 2, -0.02F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -0.503F, 0.1628F);
        this.leftbabyPlate6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2051F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 101, -0.5F, -8.9233F, 1.4985F, 1, 5, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -0.503F, 0.1628F);
        this.leftbabyPlate6.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 105, -0.5F, -8.8438F, -1.883F, 1, 6, 1, 0.01F, false));

        this.rightbabyPlate6 = new AdvancedModelRendererExtended(this);
        this.rightbabyPlate6.setRotationPoint(-2.5F, -2.7946F, -1.0536F);
        this.body.addChild(rightbabyPlate6);
        this.setRotateAngle(rightbabyPlate6, -0.4305F, -0.0735F, -0.1585F);
        this.rightbabyPlate6.cubeList.add(new ModelBox(rightbabyPlate6, 100, 42, -0.5F, -6.8968F, -0.6202F, 1, 3, 2, -0.02F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, -0.503F, 0.1628F);
        this.rightbabyPlate6.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2051F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 101, -0.5F, -8.9233F, 1.4985F, 1, 5, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, -0.503F, 0.1628F);
        this.rightbabyPlate6.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 64, 105, -0.5F, -8.8438F, -1.883F, 1, 6, 1, 0.01F, true));

        this.backleftleg = new AdvancedModelRendererExtended(this);
        this.backleftleg.setRotationPoint(6.75F, 1.25F, 0.5F);
        this.body.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.1745F, 0.0F, 0.0F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 36, 74, -4.25F, -4.5F, -4.0F, 7, 14, 8, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRendererExtended(this);
        this.backleftleg2.setRotationPoint(0.25F, 9.25F, -1.5F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.3491F, 0.0F, 0.0F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 96, 15, -4.0F, -1.9942F, -1.7192F, 6, 9, 6, 0.0F, false));

        this.backleftleg3 = new AdvancedModelRendererExtended(this);
        this.backleftleg3.setRotationPoint(0.5F, 7.0058F, 2.7808F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.1309F, 0.0F, 0.0F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 0, 101, -4.0F, -0.25F, -4.5F, 5, 7, 6, 0.0F, false));

        this.backleftleg4 = new AdvancedModelRendererExtended(this);
        this.backleftleg4.setRotationPoint(-1.5F, 5.6163F, -0.122F);
        this.backleftleg3.addChild(backleftleg4);
        this.setRotateAngle(backleftleg4, -0.0436F, 0.0F, 0.0F);
        this.backleftleg4.cubeList.add(new ModelBox(backleftleg4, 92, 48, -3.5F, -0.75F, -6.75F, 7, 3, 8, 0.0F, false));

        this.backrightleg = new AdvancedModelRendererExtended(this);
        this.backrightleg.setRotationPoint(-6.75F, 1.25F, 0.5F);
        this.body.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.1745F, 0.0F, 0.0F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 36, 74, -2.75F, -4.5F, -4.0F, 7, 14, 8, 0.0F, true));

        this.backrightleg2 = new AdvancedModelRendererExtended(this);
        this.backrightleg2.setRotationPoint(-0.25F, 9.25F, -1.5F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.3491F, 0.0F, 0.0F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 96, 15, -2.0F, -1.9942F, -1.7192F, 6, 9, 6, 0.0F, true));

        this.backrightleg3 = new AdvancedModelRendererExtended(this);
        this.backrightleg3.setRotationPoint(-0.5F, 7.0058F, 2.7808F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.1309F, 0.0F, 0.0F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 0, 101, -1.0F, -0.25F, -4.5F, 5, 7, 6, 0.0F, true));

        this.backrightleg4 = new AdvancedModelRendererExtended(this);
        this.backrightleg4.setRotationPoint(1.5F, 5.6163F, -0.122F);
        this.backrightleg3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, -0.0436F, 0.0F, 0.0F);
        this.backrightleg4.cubeList.add(new ModelBox(backrightleg4, 92, 48, -3.5F, -0.75F, -6.75F, 7, 3, 8, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -6.25F, 3.75F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 64, 0, -5.0F, 0.0F, -0.25F, 10, 12, 9, 0.0F, false));

        this.leftPlate11 = new AdvancedModelRendererExtended(this);
        this.leftPlate11.setRotationPoint(1.9F, 0.8133F, 5.1806F);
        this.tail.addChild(leftPlate11);
        this.setRotateAngle(leftPlate11, -0.5199F, 0.0653F, 0.1135F);
        this.leftPlate11.cubeList.add(new ModelBox(leftPlate11, 36, 74, -0.5F, -3.0374F, -1.5886F, 1, 3, 3, -0.01F, false));
        this.leftPlate11.cubeList.add(new ModelBox(leftPlate11, 93, 0, -0.5F, -6.0374F, -1.2886F, 1, 4, 2, -0.02F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -1.1807F, -0.2014F);
        this.leftPlate11.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2487F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 27, 85, -0.5F, -7.4695F, 1.1293F, 1, 8, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, -1.1807F, -0.2014F);
        this.leftPlate11.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 85, -0.5F, -7.3566F, -1.6872F, 1, 9, 1, 0.01F, false));

        this.rightPlate11 = new AdvancedModelRendererExtended(this);
        this.rightPlate11.setRotationPoint(-1.9F, 0.8133F, 5.1806F);
        this.tail.addChild(rightPlate11);
        this.setRotateAngle(rightPlate11, -0.5199F, -0.0653F, -0.1135F);
        this.rightPlate11.cubeList.add(new ModelBox(rightPlate11, 36, 74, -0.5F, -3.0374F, -1.5886F, 1, 3, 3, -0.01F, true));
        this.rightPlate11.cubeList.add(new ModelBox(rightPlate11, 93, 0, -0.5F, -6.0374F, -1.2886F, 1, 4, 2, -0.02F, true));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, -1.1807F, -0.2014F);
        this.rightPlate11.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2487F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 85, -0.5F, -7.4695F, 1.1293F, 1, 8, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, -1.1807F, -0.2014F);
        this.rightPlate11.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 85, -0.5F, -7.3566F, -1.6872F, 1, 9, 1, 0.01F, true));

        this.leftbabyPlate7 = new AdvancedModelRendererExtended(this);
        this.leftbabyPlate7.setRotationPoint(1.9F, 4.8133F, 3.1806F);
        this.tail.addChild(leftbabyPlate7);
        this.setRotateAngle(leftbabyPlate7, -0.5199F, 0.0653F, 0.1135F);
        this.leftbabyPlate7.cubeList.add(new ModelBox(leftbabyPlate7, 104, 90, -0.5F, -6.0374F, -1.2886F, 1, 1, 2, -0.02F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, -1.1807F, -0.2014F);
        this.leftbabyPlate7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2487F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 8, -0.5F, -7.4695F, 1.1293F, 1, 4, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, -1.1807F, -0.2014F);
        this.leftbabyPlate7.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 108, 83, -0.5F, -7.3566F, -1.6872F, 1, 4, 1, 0.01F, false));

        this.rightbabyPlate7 = new AdvancedModelRendererExtended(this);
        this.rightbabyPlate7.setRotationPoint(-1.9F, 4.8133F, 3.1806F);
        this.tail.addChild(rightbabyPlate7);
        this.setRotateAngle(rightbabyPlate7, -0.5199F, -0.0653F, -0.1135F);
        this.rightbabyPlate7.cubeList.add(new ModelBox(rightbabyPlate7, 104, 90, -0.5F, -6.0374F, -1.2886F, 1, 1, 2, -0.02F, true));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.0F, -1.1807F, -0.2014F);
        this.rightbabyPlate7.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2487F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 8, -0.5F, -7.4695F, 1.1293F, 1, 4, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.0F, -1.1807F, -0.2014F);
        this.rightbabyPlate7.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 108, 83, -0.5F, -7.3566F, -1.6872F, 1, 4, 1, 0.01F, true));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 2.5F, 7.75F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 84, 66, -3.5F, -2.0F, 0.0F, 7, 9, 8, 0.0F, false));

        this.leftPlate12 = new AdvancedModelRendererExtended(this);
        this.leftPlate12.setRotationPoint(1.4F, -2.2446F, 6.0714F);
        this.tail2.addChild(leftPlate12);
        this.setRotateAngle(leftPlate12, -0.4331F, 0.0552F, 0.1188F);


        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, -0.0392F, -0.3705F);
        this.leftPlate12.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1614F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 80, 90, -0.5F, -6.2579F, 0.8216F, 1, 7, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(0.0F, -0.0392F, -0.3705F);
        this.leftPlate12.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 94, 83, -0.5F, -3.3703F, -0.104F, 1, 4, 1, -0.01F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(0.0F, -0.0392F, -0.3705F);
        this.leftPlate12.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 31, 85, -0.5F, -6.23F, -0.9866F, 1, 8, 1, 0.01F, false));

        this.rightPlate12 = new AdvancedModelRendererExtended(this);
        this.rightPlate12.setRotationPoint(-1.4F, -2.2446F, 6.0714F);
        this.tail2.addChild(rightPlate12);
        this.setRotateAngle(rightPlate12, -0.4331F, -0.0552F, -0.1188F);


        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(0.0F, -0.0392F, -0.3705F);
        this.rightPlate12.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1614F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 80, 90, -0.5F, -6.2579F, 0.8216F, 1, 7, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(0.0F, -0.0392F, -0.3705F);
        this.rightPlate12.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 94, 83, -0.5F, -3.3703F, -0.104F, 1, 4, 1, -0.01F, true));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(0.0F, -0.0392F, -0.3705F);
        this.rightPlate12.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 31, 85, -0.5F, -6.23F, -0.9866F, 1, 8, 1, 0.01F, true));

        this.leftbabyPlate8 = new AdvancedModelRendererExtended(this);
        this.leftbabyPlate8.setRotationPoint(1.4F, 1.7554F, 4.4214F);
        this.tail2.addChild(leftbabyPlate8);
        this.setRotateAngle(leftbabyPlate8, -0.4331F, 0.0552F, 0.1188F);


        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(0.0F, -0.0392F, -0.3705F);
        this.leftbabyPlate8.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1614F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -0.5F, -6.2579F, 0.8216F, 1, 3, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(0.0F, -0.0392F, -0.3705F);
        this.leftbabyPlate8.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1309F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 110, 8, -0.5F, -6.23F, -0.9866F, 1, 3, 1, 0.01F, false));

        this.rightbabyPlate8 = new AdvancedModelRendererExtended(this);
        this.rightbabyPlate8.setRotationPoint(-1.4F, 1.7554F, 4.4214F);
        this.tail2.addChild(rightbabyPlate8);
        this.setRotateAngle(rightbabyPlate8, -0.4331F, -0.0552F, -0.1188F);


        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(0.0F, -0.0392F, -0.3705F);
        this.rightbabyPlate8.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1614F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, -0.5F, -6.2579F, 0.8216F, 1, 3, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(0.0F, -0.0392F, -0.3705F);
        this.rightbabyPlate8.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1309F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 110, 8, -0.5F, -6.23F, -0.9866F, 1, 3, 1, 0.01F, true));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.55F, 8.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 65, -2.5F, -2.1305F, -2.0086F, 5, 7, 13, 0.0F, false));

        this.leftPlate13 = new AdvancedModelRendererExtended(this);
        this.leftPlate13.setRotationPoint(1.075F, -1.7822F, 6.1628F);
        this.tail3.addChild(leftPlate13);
        this.setRotateAngle(leftPlate13, -0.4349F, 0.0368F, 0.0791F);
        this.leftPlate13.cubeList.add(new ModelBox(leftPlate13, 92, 21, -0.5F, -2.631F, -0.4323F, 1, 3, 1, -0.01F, false));

        this.cube_r28 = new AdvancedModelRendererExtended(this);
        this.cube_r28.setRotationPoint(0.0F, -0.6182F, -0.2019F);
        this.leftPlate13.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2487F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 8, 42, -0.5F, -4.7426F, 0.6947F, 1, 5, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRendererExtended(this);
        this.cube_r29.setRotationPoint(0.0F, -0.6182F, -0.2019F);
        this.leftPlate13.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1309F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 106, 66, -0.5F, -4.6628F, -1.0804F, 1, 6, 1, 0.01F, false));

        this.rightPlate13 = new AdvancedModelRendererExtended(this);
        this.rightPlate13.setRotationPoint(-1.075F, -1.7822F, 6.1628F);
        this.tail3.addChild(rightPlate13);
        this.setRotateAngle(rightPlate13, -0.4349F, -0.0368F, -0.0791F);
        this.rightPlate13.cubeList.add(new ModelBox(rightPlate13, 92, 21, -0.5F, -2.631F, -0.4323F, 1, 3, 1, -0.01F, true));

        this.cube_r30 = new AdvancedModelRendererExtended(this);
        this.cube_r30.setRotationPoint(0.0F, -0.6182F, -0.2019F);
        this.rightPlate13.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2487F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 8, 42, -0.5F, -4.7426F, 0.6947F, 1, 5, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRendererExtended(this);
        this.cube_r31.setRotationPoint(0.0F, -0.6182F, -0.2019F);
        this.rightPlate13.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1309F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 106, 66, -0.5F, -4.6628F, -1.0804F, 1, 6, 1, 0.01F, true));

        this.leftbabyPlate9 = new AdvancedModelRendererExtended(this);
        this.leftbabyPlate9.setRotationPoint(1.075F, 1.7178F, 4.7628F);
        this.tail3.addChild(leftbabyPlate9);
        this.setRotateAngle(leftbabyPlate9, -0.4349F, 0.0368F, 0.0791F);


        this.cube_r32 = new AdvancedModelRendererExtended(this);
        this.cube_r32.setRotationPoint(0.0F, -0.6182F, -0.2019F);
        this.leftbabyPlate9.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2487F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 109, 64, -0.5F, -4.7426F, 0.6947F, 1, 2, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRendererExtended(this);
        this.cube_r33.setRotationPoint(0.0F, -0.6182F, -0.2019F);
        this.leftbabyPlate9.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1309F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 110, 70, -0.5F, -4.6628F, -1.0804F, 1, 2, 1, 0.01F, false));

        this.rightbabyPlate9 = new AdvancedModelRendererExtended(this);
        this.rightbabyPlate9.setRotationPoint(-1.075F, 1.7178F, 4.7628F);
        this.tail3.addChild(rightbabyPlate9);
        this.setRotateAngle(rightbabyPlate9, -0.4349F, -0.0368F, -0.0791F);


        this.cube_r34 = new AdvancedModelRendererExtended(this);
        this.cube_r34.setRotationPoint(0.0F, -0.6182F, -0.2019F);
        this.rightbabyPlate9.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.2487F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 109, 64, -0.5F, -4.7426F, 0.6947F, 1, 2, 1, 0.0F, true));

        this.cube_r35 = new AdvancedModelRendererExtended(this);
        this.cube_r35.setRotationPoint(0.0F, -0.6182F, -0.2019F);
        this.rightbabyPlate9.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1309F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 110, 70, -0.5F, -4.6628F, -1.0804F, 1, 2, 1, 0.01F, true));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.3695F, 10.9914F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 85, -2.0F, -2.0F, -2.0F, 4, 5, 11, 0.0F, false));

        this.leftPlate14 = new AdvancedModelRendererExtended(this);
        this.leftPlate14.setRotationPoint(0.95F, -2.1088F, 3.0459F);
        this.tail4.addChild(leftPlate14);
        this.setRotateAngle(leftPlate14, -0.3914F, 0.0334F, 0.0807F);
        this.leftPlate14.cubeList.add(new ModelBox(leftPlate14, 65, 0, -0.5F, -0.8516F, -0.4538F, 1, 1, 1, -0.01F, false));

        this.cube_r36 = new AdvancedModelRendererExtended(this);
        this.cube_r36.setRotationPoint(0.0F, -0.0205F, -0.1408F);
        this.leftPlate14.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.2487F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 108, 59, -0.5F, -3.531F, 0.387F, 1, 4, 1, 0.0F, false));

        this.cube_r37 = new AdvancedModelRendererExtended(this);
        this.cube_r37.setRotationPoint(0.0F, -0.0205F, -0.1408F);
        this.leftPlate14.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1309F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 20, 101, -0.5F, -3.4235F, -0.9173F, 1, 5, 1, 0.01F, false));

        this.rightPlate14 = new AdvancedModelRendererExtended(this);
        this.rightPlate14.setRotationPoint(-0.95F, -2.1088F, 3.0459F);
        this.tail4.addChild(rightPlate14);
        this.setRotateAngle(rightPlate14, -0.3914F, -0.0334F, -0.0807F);
        this.rightPlate14.cubeList.add(new ModelBox(rightPlate14, 65, 0, -0.5F, -0.8516F, -0.4538F, 1, 1, 1, -0.01F, true));

        this.cube_r38 = new AdvancedModelRendererExtended(this);
        this.cube_r38.setRotationPoint(0.0F, -0.0205F, -0.1408F);
        this.rightPlate14.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.2487F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 108, 59, -0.5F, -3.531F, 0.387F, 1, 4, 1, 0.0F, true));

        this.cube_r39 = new AdvancedModelRendererExtended(this);
        this.cube_r39.setRotationPoint(0.0F, -0.0205F, -0.1408F);
        this.rightPlate14.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.1309F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 20, 101, -0.5F, -3.4235F, -0.9173F, 1, 5, 1, 0.01F, true));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, -0.25F, 9.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 86, 83, -1.5F, -1.25F, -1.0F, 3, 3, 12, 0.0F, false));

        this.leftPlate15 = new AdvancedModelRendererExtended(this);
        this.leftPlate15.setRotationPoint(0.7F, -1.1588F, 0.9459F);
        this.tail5.addChild(leftPlate15);
        this.setRotateAngle(leftPlate15, -0.4349F, 0.0368F, 0.0791F);


        this.cube_r40 = new AdvancedModelRendererExtended(this);
        this.cube_r40.setRotationPoint(0.0F, -0.1138F, 0.0551F);
        this.leftPlate15.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.2487F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 108, 88, -0.5F, -2.5196F, -0.0719F, 1, 3, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRendererExtended(this);
        this.cube_r41.setRotationPoint(0.0F, -0.1138F, 0.0551F);
        this.leftPlate15.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1309F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 108, 105, -0.5F, -2.3141F, -0.9687F, 1, 3, 1, 0.01F, false));

        this.rightPlate15 = new AdvancedModelRendererExtended(this);
        this.rightPlate15.setRotationPoint(-0.7F, -1.1588F, 0.9459F);
        this.tail5.addChild(rightPlate15);
        this.setRotateAngle(rightPlate15, -0.4349F, -0.0368F, -0.0791F);


        this.cube_r42 = new AdvancedModelRendererExtended(this);
        this.cube_r42.setRotationPoint(0.0F, -0.1138F, 0.0551F);
        this.rightPlate15.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.2487F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 108, 88, -0.5F, -2.5196F, -0.0719F, 1, 3, 1, 0.0F, true));

        this.cube_r43 = new AdvancedModelRendererExtended(this);
        this.cube_r43.setRotationPoint(0.0F, -0.1138F, 0.0551F);
        this.rightPlate15.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.1309F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 108, 105, -0.5F, -2.3141F, -0.9687F, 1, 3, 1, 0.01F, true));

        this.leftPlate16 = new AdvancedModelRendererExtended(this);
        this.leftPlate16.setRotationPoint(0.7F, -1.2588F, 7.0459F);
        this.tail5.addChild(leftPlate16);
        this.setRotateAngle(leftPlate16, -0.4349F, 0.0368F, 0.0791F);


        this.cube_r44 = new AdvancedModelRendererExtended(this);
        this.cube_r44.setRotationPoint(0.0F, 0.2295F, -0.1408F);
        this.leftPlate16.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.2487F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 110, 12, -0.5F, -1.8349F, -0.0438F, 1, 2, 1, 0.0F, false));

        this.cube_r45 = new AdvancedModelRendererExtended(this);
        this.cube_r45.setRotationPoint(0.0F, 0.2295F, -0.1408F);
        this.leftPlate16.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.1309F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 110, 45, -0.5F, -1.6885F, -0.6888F, 1, 2, 1, 0.01F, false));

        this.rightPlate16 = new AdvancedModelRendererExtended(this);
        this.rightPlate16.setRotationPoint(-0.7F, -1.2588F, 7.0459F);
        this.tail5.addChild(rightPlate16);
        this.setRotateAngle(rightPlate16, -0.4349F, -0.0368F, -0.0791F);


        this.cube_r46 = new AdvancedModelRendererExtended(this);
        this.cube_r46.setRotationPoint(0.0F, 0.2295F, -0.1408F);
        this.rightPlate16.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.2487F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 110, 12, -0.5F, -1.8349F, -0.0438F, 1, 2, 1, 0.0F, true));

        this.cube_r47 = new AdvancedModelRendererExtended(this);
        this.cube_r47.setRotationPoint(0.0F, 0.2295F, -0.1408F);
        this.rightPlate16.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.1309F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 110, 45, -0.5F, -1.6885F, -0.6888F, 1, 2, 1, 0.01F, true));

        this.tail6 = new AdvancedModelRendererExtended(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.1745F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 66, 74, -1.0F, -0.75F, -1.0F, 2, 2, 14, 0.0F, false));

        this.lefttailSpike = new AdvancedModelRendererExtended(this);
        this.lefttailSpike.setRotationPoint(2.05F, -0.7962F, 2.7572F);
        this.tail6.addChild(lefttailSpike);
        this.setRotateAngle(lefttailSpike, 0.1893F, -0.0033F, 1.0022F);


        this.babyskewer_r1 = new AdvancedModelRendererExtended(this);
        this.babyskewer_r1.setRotationPoint(0.0F, -2.1057F, 0.3298F);
        this.lefttailSpike.addChild(babyskewer_r1);
        this.setRotateAngle(babyskewer_r1, -0.624F, 0.0F, 0.0F);
        this.babyskewer_r1.cubeList.add(new ModelBox(babyskewer_r1, 46, 96, -0.5F, -1.625F, 0.35F, 1, 6, 1, -0.01F, false));

        this.cube_r48 = new AdvancedModelRendererExtended(this);
        this.cube_r48.setRotationPoint(0.0F, -7.5057F, 5.6298F);
        this.lefttailSpike.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.5367F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 8, 65, -0.5F, -0.0714F, -0.988F, 1, 11, 1, 0.0F, false));

        this.cube_r49 = new AdvancedModelRendererExtended(this);
        this.cube_r49.setRotationPoint(0.0F, 0.623F, -1.0056F);
        this.lefttailSpike.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.6545F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 65, -0.5F, -10.5878F, -0.6862F, 1, 12, 1, 0.01F, false));

        this.righttailSpike = new AdvancedModelRendererExtended(this);
        this.righttailSpike.setRotationPoint(-2.05F, -0.7962F, 2.7572F);
        this.tail6.addChild(righttailSpike);
        this.setRotateAngle(righttailSpike, 0.1893F, 0.0033F, -1.0022F);


        this.babyskewer_r2 = new AdvancedModelRendererExtended(this);
        this.babyskewer_r2.setRotationPoint(0.0F, -2.1057F, 0.3298F);
        this.righttailSpike.addChild(babyskewer_r2);
        this.setRotateAngle(babyskewer_r2, -0.624F, 0.0F, 0.0F);
        this.babyskewer_r2.cubeList.add(new ModelBox(babyskewer_r2, 46, 96, -0.5F, -1.625F, 0.35F, 1, 6, 1, -0.01F, true));

        this.cube_r50 = new AdvancedModelRendererExtended(this);
        this.cube_r50.setRotationPoint(0.0F, -7.5057F, 5.6298F);
        this.righttailSpike.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.5367F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 8, 65, -0.5F, -0.0714F, -0.988F, 1, 11, 1, 0.0F, true));

        this.cube_r51 = new AdvancedModelRendererExtended(this);
        this.cube_r51.setRotationPoint(0.0F, 0.623F, -1.0056F);
        this.righttailSpike.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.6545F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 65, -0.5F, -10.5878F, -0.6862F, 1, 12, 1, 0.01F, true));

        this.lefttailSpike2 = new AdvancedModelRendererExtended(this);
        this.lefttailSpike2.setRotationPoint(1.275F, -0.2712F, 6.9822F);
        this.tail6.addChild(lefttailSpike2);
        this.setRotateAngle(lefttailSpike2, -0.1148F, -0.0131F, 1.0529F);


        this.babyskewer_r3 = new AdvancedModelRendererExtended(this);
        this.babyskewer_r3.setRotationPoint(0.0F, -2.1057F, 0.3298F);
        this.lefttailSpike2.addChild(babyskewer_r3);
        this.setRotateAngle(babyskewer_r3, -0.624F, 0.0F, 0.0F);
        this.babyskewer_r3.cubeList.add(new ModelBox(babyskewer_r3, 97, 98, -0.5F, -2.625F, 0.35F, 1, 6, 1, -0.01F, false));

        this.cube_r52 = new AdvancedModelRendererExtended(this);
        this.cube_r52.setRotationPoint(0.0F, -7.5057F, 5.6298F);
        this.lefttailSpike2.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.5367F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 74, 74, -0.5F, -0.0714F, -0.988F, 1, 10, 1, 0.0F, false));

        this.cube_r53 = new AdvancedModelRendererExtended(this);
        this.cube_r53.setRotationPoint(0.0F, 0.623F, -1.0056F);
        this.lefttailSpike2.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.6545F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 4, 65, -0.5F, -10.5878F, -0.6862F, 1, 12, 1, 0.01F, false));

        this.righttailSpike2 = new AdvancedModelRendererExtended(this);
        this.righttailSpike2.setRotationPoint(-1.275F, -0.2712F, 6.9822F);
        this.tail6.addChild(righttailSpike2);
        this.setRotateAngle(righttailSpike2, -0.1148F, 0.0131F, -1.0529F);


        this.babyskewer_r4 = new AdvancedModelRendererExtended(this);
        this.babyskewer_r4.setRotationPoint(0.0F, -2.1057F, 0.3298F);
        this.righttailSpike2.addChild(babyskewer_r4);
        this.setRotateAngle(babyskewer_r4, -0.624F, 0.0F, 0.0F);
        this.babyskewer_r4.cubeList.add(new ModelBox(babyskewer_r4, 97, 98, -0.5F, -2.625F, 0.35F, 1, 6, 1, -0.01F, true));

        this.cube_r54 = new AdvancedModelRendererExtended(this);
        this.cube_r54.setRotationPoint(0.0F, -7.5057F, 5.6298F);
        this.righttailSpike2.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.5367F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 74, 74, -0.5F, -0.0714F, -0.988F, 1, 10, 1, 0.0F, true));

        this.cube_r55 = new AdvancedModelRendererExtended(this);
        this.cube_r55.setRotationPoint(0.0F, 0.623F, -1.0056F);
        this.righttailSpike2.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.6545F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 4, 65, -0.5F, -10.5878F, -0.6862F, 1, 12, 1, 0.01F, true));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -7.5F, -6.25F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -8.5F, 0.0F, -14.0F, 17, 20, 15, 0.0F, false));

        this.leftPlate8 = new AdvancedModelRendererExtended(this);
        this.leftPlate8.setRotationPoint(3.0F, -0.3F, -6.7F);
        this.body2.addChild(leftPlate8);
        this.setRotateAngle(leftPlate8, 0.0859F, -0.0151F, 0.1739F);
        this.leftPlate8.cubeList.add(new ModelBox(leftPlate8, 56, 8, -0.5F, -2.6F, -1.6F, 1, 3, 3, -0.01F, false));
        this.leftPlate8.cubeList.add(new ModelBox(leftPlate8, 67, 0, -0.5F, -6.05F, -1.1F, 1, 4, 2, -0.02F, false));

        this.cube_r56 = new AdvancedModelRendererExtended(this);
        this.cube_r56.setRotationPoint(0.0F, 1.0F, -1.25F);
        this.leftPlate8.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.1309F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 35, 65, -0.5F, -10.225F, 2.1F, 1, 11, 1, 0.0F, false));

        this.cube_r57 = new AdvancedModelRendererExtended(this);
        this.cube_r57.setRotationPoint(0.0F, 1.0F, -1.25F);
        this.leftPlate8.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.1745F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 85, -0.5F, -10.35F, -1.05F, 1, 10, 1, 0.01F, false));

        this.rightPlate8 = new AdvancedModelRendererExtended(this);
        this.rightPlate8.setRotationPoint(-3.0F, -0.3F, -6.7F);
        this.body2.addChild(rightPlate8);
        this.setRotateAngle(rightPlate8, 0.0859F, 0.0151F, -0.1739F);
        this.rightPlate8.cubeList.add(new ModelBox(rightPlate8, 56, 8, -0.5F, -2.6F, -1.6F, 1, 3, 3, -0.01F, true));
        this.rightPlate8.cubeList.add(new ModelBox(rightPlate8, 67, 0, -0.5F, -6.05F, -1.1F, 1, 4, 2, -0.02F, true));

        this.cube_r58 = new AdvancedModelRendererExtended(this);
        this.cube_r58.setRotationPoint(0.0F, 1.0F, -1.25F);
        this.rightPlate8.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.1309F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 35, 65, -0.5F, -10.225F, 2.1F, 1, 11, 1, 0.0F, true));

        this.cube_r59 = new AdvancedModelRendererExtended(this);
        this.cube_r59.setRotationPoint(0.0F, 1.0F, -1.25F);
        this.rightPlate8.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.1745F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 85, -0.5F, -10.35F, -1.05F, 1, 10, 1, 0.01F, true));

        this.leftbabyPlate4 = new AdvancedModelRendererExtended(this);
        this.leftbabyPlate4.setRotationPoint(3.0F, 4.2F, -6.4F);
        this.body2.addChild(leftbabyPlate4);
        this.setRotateAngle(leftbabyPlate4, 0.0859F, -0.0151F, 0.1739F);
        this.leftbabyPlate4.cubeList.add(new ModelBox(leftbabyPlate4, 102, 59, -0.5F, -6.05F, -1.1F, 1, 2, 2, -0.02F, false));

        this.cube_r60 = new AdvancedModelRendererExtended(this);
        this.cube_r60.setRotationPoint(0.0F, 1.0F, -1.25F);
        this.leftbabyPlate4.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.1309F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 102, 8, -0.5F, -10.225F, 2.1F, 1, 6, 1, 0.0F, false));

        this.cube_r61 = new AdvancedModelRendererExtended(this);
        this.cube_r61.setRotationPoint(0.0F, 1.0F, -1.25F);
        this.leftbabyPlate4.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.1745F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 104, 104, -0.5F, -10.35F, -1.05F, 1, 6, 1, 0.01F, false));

        this.rightbabyPlate4 = new AdvancedModelRendererExtended(this);
        this.rightbabyPlate4.setRotationPoint(-3.0F, 4.2F, -6.4F);
        this.body2.addChild(rightbabyPlate4);
        this.setRotateAngle(rightbabyPlate4, 0.0859F, 0.0151F, -0.1739F);
        this.rightbabyPlate4.cubeList.add(new ModelBox(rightbabyPlate4, 102, 59, -0.5F, -6.05F, -1.1F, 1, 2, 2, -0.02F, true));

        this.cube_r62 = new AdvancedModelRendererExtended(this);
        this.cube_r62.setRotationPoint(0.0F, 1.0F, -1.25F);
        this.rightbabyPlate4.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.1309F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 102, 8, -0.5F, -10.225F, 2.1F, 1, 6, 1, 0.0F, true));

        this.cube_r63 = new AdvancedModelRendererExtended(this);
        this.cube_r63.setRotationPoint(0.0F, 1.0F, -1.25F);
        this.rightbabyPlate4.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.1745F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 104, 104, -0.5F, -10.35F, -1.05F, 1, 6, 1, 0.01F, true));

        this.leftPlate7 = new AdvancedModelRendererExtended(this);
        this.leftPlate7.setRotationPoint(2.5F, 1.13F, -12.6992F);
        this.body2.addChild(leftPlate7);
        this.setRotateAngle(leftPlate7, 0.258F, -0.045F, 0.1687F);
        this.leftPlate7.cubeList.add(new ModelBox(leftPlate7, 86, 56, -0.5F, -2.4928F, -1.3716F, 1, 2, 3, -0.01F, false));
        this.leftPlate7.cubeList.add(new ModelBox(leftPlate7, 39, 35, -0.5F, -6.0928F, -0.8716F, 1, 4, 2, -0.02F, false));

        this.cube_r64 = new AdvancedModelRendererExtended(this);
        this.cube_r64.setRotationPoint(-5.5F, 0.9572F, -1.0216F);
        this.leftPlate7.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.1309F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 4, 85, 5.0F, -10.225F, 2.1F, 1, 9, 1, 0.0F, false));

        this.cube_r65 = new AdvancedModelRendererExtended(this);
        this.cube_r65.setRotationPoint(-5.5F, 0.9572F, -1.0216F);
        this.leftPlate7.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.1745F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 19, 85, 5.0F, -10.35F, -1.05F, 1, 9, 1, 0.01F, false));

        this.rightPlate7 = new AdvancedModelRendererExtended(this);
        this.rightPlate7.setRotationPoint(-2.5F, 1.13F, -12.6992F);
        this.body2.addChild(rightPlate7);
        this.setRotateAngle(rightPlate7, 0.258F, 0.045F, -0.1687F);
        this.rightPlate7.cubeList.add(new ModelBox(rightPlate7, 86, 56, -0.5F, -2.4928F, -1.3716F, 1, 2, 3, -0.01F, true));
        this.rightPlate7.cubeList.add(new ModelBox(rightPlate7, 39, 35, -0.5F, -6.0928F, -0.8716F, 1, 4, 2, -0.02F, true));

        this.cube_r66 = new AdvancedModelRendererExtended(this);
        this.cube_r66.setRotationPoint(5.5F, 0.9572F, -1.0216F);
        this.rightPlate7.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.1309F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 4, 85, -6.0F, -10.225F, 2.1F, 1, 9, 1, 0.0F, true));

        this.cube_r67 = new AdvancedModelRendererExtended(this);
        this.cube_r67.setRotationPoint(5.5F, 0.9572F, -1.0216F);
        this.rightPlate7.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -0.1745F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 19, 85, -6.0F, -10.35F, -1.05F, 1, 9, 1, 0.01F, true));

        this.leftbabyPlate3 = new AdvancedModelRendererExtended(this);
        this.leftbabyPlate3.setRotationPoint(2.5F, 5.13F, -11.6992F);
        this.body2.addChild(leftbabyPlate3);
        this.setRotateAngle(leftbabyPlate3, 0.258F, -0.045F, 0.1687F);
        this.leftbabyPlate3.cubeList.add(new ModelBox(leftbabyPlate3, 46, 43, -0.5F, -6.0928F, -0.8716F, 1, 1, 2, -0.02F, false));

        this.cube_r68 = new AdvancedModelRendererExtended(this);
        this.cube_r68.setRotationPoint(-5.5F, 0.9572F, -1.0216F);
        this.leftbabyPlate3.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.1309F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 16, 101, 5.0F, -10.225F, 2.1F, 1, 5, 1, 0.0F, false));

        this.cube_r69 = new AdvancedModelRendererExtended(this);
        this.cube_r69.setRotationPoint(-5.5F, 0.9572F, -1.0216F);
        this.leftbabyPlate3.addChild(cube_r69);
        this.setRotateAngle(cube_r69, -0.1745F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 105, 98, 5.0F, -10.35F, -1.05F, 1, 5, 1, 0.01F, false));

        this.rightbabyPlate3 = new AdvancedModelRendererExtended(this);
        this.rightbabyPlate3.setRotationPoint(-2.5F, 5.13F, -11.6992F);
        this.body2.addChild(rightbabyPlate3);
        this.setRotateAngle(rightbabyPlate3, 0.258F, 0.045F, -0.1687F);
        this.rightbabyPlate3.cubeList.add(new ModelBox(rightbabyPlate3, 46, 43, -0.5F, -6.0928F, -0.8716F, 1, 1, 2, -0.02F, true));

        this.cube_r70 = new AdvancedModelRendererExtended(this);
        this.cube_r70.setRotationPoint(5.5F, 0.9572F, -1.0216F);
        this.rightbabyPlate3.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.1309F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 16, 101, -6.0F, -10.225F, 2.1F, 1, 5, 1, 0.0F, true));

        this.cube_r71 = new AdvancedModelRendererExtended(this);
        this.cube_r71.setRotationPoint(5.5F, 0.9572F, -1.0216F);
        this.rightbabyPlate3.addChild(cube_r71);
        this.setRotateAngle(cube_r71, -0.1745F, 0.0F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 105, 98, -6.0F, -10.35F, -1.05F, 1, 5, 1, 0.01F, true));

        this.leftPlate9 = new AdvancedModelRendererExtended(this);
        this.leftPlate9.setRotationPoint(2.75F, 0.4054F, -0.1036F);
        this.body2.addChild(leftPlate9);
        this.setRotateAngle(leftPlate9, -0.215F, 0.0376F, 0.1705F);
        this.leftPlate9.cubeList.add(new ModelBox(leftPlate9, 0, 40, -0.5F, -4.9338F, -1.482F, 1, 5, 3, -0.01F, false));
        this.leftPlate9.cubeList.add(new ModelBox(leftPlate9, 92, 90, -0.5F, -7.6838F, -1.082F, 1, 3, 2, -0.02F, false));

        this.cube_r72 = new AdvancedModelRendererExtended(this);
        this.cube_r72.setRotationPoint(0.0F, -1.39F, -0.2989F);
        this.leftPlate9.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.2051F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 23, 65, -0.5F, -8.9233F, 1.4985F, 1, 11, 1, 0.0F, false));

        this.cube_r73 = new AdvancedModelRendererExtended(this);
        this.cube_r73.setRotationPoint(0.0F, -1.39F, -0.2989F);
        this.leftPlate9.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -0.1745F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 66, 74, -0.5F, -8.8438F, -1.883F, 1, 11, 1, 0.01F, false));

        this.rightPlate9 = new AdvancedModelRendererExtended(this);
        this.rightPlate9.setRotationPoint(-2.75F, 0.4054F, -0.1036F);
        this.body2.addChild(rightPlate9);
        this.setRotateAngle(rightPlate9, -0.215F, -0.0376F, -0.1705F);
        this.rightPlate9.cubeList.add(new ModelBox(rightPlate9, 0, 40, -0.5F, -4.9338F, -1.482F, 1, 5, 3, -0.01F, true));
        this.rightPlate9.cubeList.add(new ModelBox(rightPlate9, 92, 90, -0.5F, -7.6838F, -1.082F, 1, 3, 2, -0.02F, true));

        this.cube_r74 = new AdvancedModelRendererExtended(this);
        this.cube_r74.setRotationPoint(0.0F, -1.39F, -0.2989F);
        this.rightPlate9.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.2051F, 0.0F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 23, 65, -0.5F, -8.9233F, 1.4985F, 1, 11, 1, 0.0F, true));

        this.cube_r75 = new AdvancedModelRendererExtended(this);
        this.cube_r75.setRotationPoint(0.0F, -1.39F, -0.2989F);
        this.rightPlate9.addChild(cube_r75);
        this.setRotateAngle(cube_r75, -0.1745F, 0.0F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 66, 74, -0.5F, -8.8438F, -1.883F, 1, 11, 1, 0.01F, true));

        this.leftbabyPlate5 = new AdvancedModelRendererExtended(this);
        this.leftbabyPlate5.setRotationPoint(2.75F, 5.4054F, -1.1036F);
        this.body2.addChild(leftbabyPlate5);
        this.setRotateAngle(leftbabyPlate5, -0.215F, 0.0376F, 0.1705F);
        this.leftbabyPlate5.cubeList.add(new ModelBox(leftbabyPlate5, 9, 8, -0.5F, -7.6838F, -1.082F, 1, 3, 2, -0.02F, false));

        this.cube_r76 = new AdvancedModelRendererExtended(this);
        this.cube_r76.setRotationPoint(0.0F, -1.39F, -0.2989F);
        this.leftbabyPlate5.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.2051F, 0.0F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 101, 98, -0.5F, -8.9233F, 1.4985F, 1, 6, 1, 0.0F, false));

        this.cube_r77 = new AdvancedModelRendererExtended(this);
        this.cube_r77.setRotationPoint(0.0F, -1.39F, -0.2989F);
        this.leftbabyPlate5.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.1745F, 0.0F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 104, 83, -0.5F, -8.8438F, -1.883F, 1, 6, 1, 0.01F, false));

        this.rightbabyPlate5 = new AdvancedModelRendererExtended(this);
        this.rightbabyPlate5.setRotationPoint(-2.75F, 5.4054F, -1.1036F);
        this.body2.addChild(rightbabyPlate5);
        this.setRotateAngle(rightbabyPlate5, -0.215F, -0.0376F, -0.1705F);
        this.rightbabyPlate5.cubeList.add(new ModelBox(rightbabyPlate5, 9, 8, -0.5F, -7.6838F, -1.082F, 1, 3, 2, -0.02F, true));

        this.cube_r78 = new AdvancedModelRendererExtended(this);
        this.cube_r78.setRotationPoint(0.0F, -1.39F, -0.2989F);
        this.rightbabyPlate5.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.2051F, 0.0F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 101, 98, -0.5F, -8.9233F, 1.4985F, 1, 6, 1, 0.0F, true));

        this.cube_r79 = new AdvancedModelRendererExtended(this);
        this.cube_r79.setRotationPoint(0.0F, -1.39F, -0.2989F);
        this.rightbabyPlate5.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.1745F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 104, 83, -0.5F, -8.8438F, -1.883F, 1, 6, 1, 0.01F, true));

        this.upperbody = new AdvancedModelRendererExtended(this);
        this.upperbody.setRotationPoint(0.0F, 0.296F, -13.9452F);
        this.body2.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.0873F, 0.0F, 0.0F);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 52, 35, -7.5F, 5.954F, -6.8048F, 15, 12, 9, 0.0F, false));

        this.cube_r80 = new AdvancedModelRendererExtended(this);
        this.cube_r80.setRotationPoint(1.0F, -0.2322F, 0.4166F);
        this.upperbody.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.6545F, 0.0F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 42, 56, -8.5F, -0.1076F, -9.968F, 15, 8, 10, -0.01F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, 7.2629F, -6.4954F);
        this.upperbody.addChild(neck3);
        this.setRotateAngle(neck3, 0.0873F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 59, 91, -3.5F, 0.4229F, -9.4762F, 7, 7, 7, 0.0F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 64, 21, -6.0F, -0.309F, -3.3095F, 12, 9, 4, 0.0F, false));

        this.cube_r81 = new AdvancedModelRendererExtended(this);
        this.cube_r81.setRotationPoint(0.5F, -1.4952F, -0.0881F);
        this.neck3.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.48F, 0.0F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 92, 30, -6.5F, -0.3563F, -3.4119F, 12, 8, 4, -0.01F, false));

        this.cube_r82 = new AdvancedModelRendererExtended(this);
        this.cube_r82.setRotationPoint(-0.5F, 0.6729F, -3.7262F);
        this.neck3.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.1047F, 0.0F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 93, 0, -3.0F, -0.85F, -5.65F, 7, 1, 7, -0.01F, false));

        this.leftPlate4 = new AdvancedModelRendererExtended(this);
        this.leftPlate4.setRotationPoint(1.75F, 0.4229F, -4.4762F);
        this.neck3.addChild(leftPlate4);
        this.setRotateAngle(leftPlate4, 0.1309F, 0.0F, 0.0F);
        this.leftPlate4.cubeList.add(new ModelBox(leftPlate4, 0, 33, 0.0F, -3.3F, -1.0F, 0, 3, 2, 0.0F, false));

        this.rightPlate4 = new AdvancedModelRendererExtended(this);
        this.rightPlate4.setRotationPoint(-1.75F, 0.4229F, -4.4762F);
        this.neck3.addChild(rightPlate4);
        this.setRotateAngle(rightPlate4, 0.1309F, 0.0F, 0.0F);
        this.rightPlate4.cubeList.add(new ModelBox(rightPlate4, 0, 33, 0.0F, -3.3F, -1.0F, 0, 3, 2, 0.0F, true));

        this.leftPlate3 = new AdvancedModelRendererExtended(this);
        this.leftPlate3.setRotationPoint(1.4216F, 0.4437F, -8.3663F);
        this.neck3.addChild(leftPlate3);
        this.setRotateAngle(leftPlate3, -0.0436F, 0.0F, 0.0F);
        this.leftPlate3.cubeList.add(new ModelBox(leftPlate3, 49, 3, 0.0F, -3.0F, -0.95F, 0, 3, 2, 0.0F, false));

        this.rightPlate3 = new AdvancedModelRendererExtended(this);
        this.rightPlate3.setRotationPoint(-1.4216F, 0.4437F, -8.3663F);
        this.neck3.addChild(rightPlate3);
        this.setRotateAngle(rightPlate3, -0.0436F, 0.0F, 0.0F);
        this.rightPlate3.cubeList.add(new ModelBox(rightPlate3, 49, 3, 0.0F, -3.0F, -0.95F, 0, 3, 2, 0.0F, true));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(-0.5F, 1.6729F, -8.9762F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.3491F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 80, 98, -2.0F, -1.0F, -6.0F, 5, 5, 7, 0.0F, false));

        this.leftPlate2 = new AdvancedModelRendererExtended(this);
        this.leftPlate2.setRotationPoint(1.75F, -0.5319F, -3.5333F);
        this.neck2.addChild(leftPlate2);
        this.setRotateAngle(leftPlate2, 0.1745F, 0.0F, 0.0F);
        this.leftPlate2.cubeList.add(new ModelBox(leftPlate2, 8, 33, 0.0F, -2.75F, -1.0F, 0, 3, 2, 0.0F, false));

        this.rightPlate2 = new AdvancedModelRendererExtended(this);
        this.rightPlate2.setRotationPoint(-0.75F, -0.5319F, -3.5333F);
        this.neck2.addChild(rightPlate2);
        this.setRotateAngle(rightPlate2, 0.1745F, 0.0F, 0.0F);
        this.rightPlate2.cubeList.add(new ModelBox(rightPlate2, 8, 33, 0.0F, -2.75F, -1.0F, 0, 3, 2, 0.0F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -0.75F, -6.0F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.3054F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 0, -1.0F, 0.0F, -3.0F, 3, 4, 4, -0.02F, false));

        this.leftPlate1 = new AdvancedModelRendererExtended(this);
        this.leftPlate1.setRotationPoint(1.25F, 0.0F, -1.0F);
        this.neck.addChild(leftPlate1);
        this.leftPlate1.cubeList.add(new ModelBox(leftPlate1, 55, 5, 0.0F, -1.7819F, -0.8333F, 0, 2, 2, 0.0F, false));

        this.rightPlate1 = new AdvancedModelRendererExtended(this);
        this.rightPlate1.setRotationPoint(-0.25F, 0.0F, -1.0F);
        this.neck.addChild(rightPlate1);
        this.rightPlate1.cubeList.add(new ModelBox(rightPlate1, 55, 5, 0.0F, -1.7819F, -0.8333F, 0, 2, 2, 0.0F, true));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(1.0F, 0.0F, -2.9F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.3491F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 36, 80, 0.085F, 0.225F, -2.25F, 1, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 48, 46, -2.085F, 0.225F, -2.25F, 1, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 84, 83, -2.0F, 0.0F, -3.0F, 3, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 84, 90, -2.0F, 0.0F, -1.0F, 3, 3, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 100, 63, -1.5F, 1.0F, -4.75F, 2, 1, 2, 0.01F, false));

        this.cube_r83 = new AdvancedModelRendererExtended(this);
        this.cube_r83.setRotationPoint(0.0F, 0.25F, -4.75F);
        this.head.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.1745F, 0.0F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 39, 43, -1.5F, 0.0577F, -2.63F, 2, 1, 3, -0.02F, false));

        this.cube_r84 = new AdvancedModelRendererExtended(this);
        this.cube_r84.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.head.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.1745F, 0.0F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 50, 96, -1.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r85 = new AdvancedModelRendererExtended(this);
        this.cube_r85.setRotationPoint(-0.5F, 1.0F, -4.75F);
        this.head.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.0873F, 0.0F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 49, 11, -1.0F, 0.0F, -2.5F, 2, 1, 3, -0.01F, false));

        this.cube_r86 = new AdvancedModelRendererExtended(this);
        this.cube_r86.setRotationPoint(-1.7F, 0.5F, -2.0F);
        this.head.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.0F, 0.0F, 1.3963F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 104, 45, -0.6F, -0.65F, -0.825F, 1, 1, 2, -0.05F, false));

        this.cube_r87 = new AdvancedModelRendererExtended(this);
        this.cube_r87.setRotationPoint(0.7F, 0.5F, -2.0F);
        this.head.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.0F, 0.0F, -1.3963F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 106, 42, -0.4F, -0.65F, -0.825F, 1, 1, 2, -0.05F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(-0.5F, 2.0F, -1.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0087F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 86, 61, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 55, 1, 0.99F, -1.75F, -3.25F, 0, 2, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 5, 36, -0.99F, -1.75F, -3.25F, 0, 2, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 117, 89, -0.94F, -1.75F, -3.25F, 0, 2, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 117, 89, 0.94F, -1.75F, -3.25F, 0, 2, 4, 0.0F, true));

        this.cube_r88 = new AdvancedModelRendererExtended(this);
        this.cube_r88.setRotationPoint(0.0F, -0.1195F, -3.7256F);
        this.jaw.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.0436F, 0.0F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 58, 79, -1.0F, 0.0183F, -1.9388F, 2, 1, 2, -0.03F, false));

        this.cube_r89 = new AdvancedModelRendererExtended(this);
        this.cube_r89.setRotationPoint(0.5F, 1.0F, -1.75F);
        this.jaw.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -0.0436F, 0.0F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 72, 85, -1.5F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r90 = new AdvancedModelRendererExtended(this);
        this.cube_r90.setRotationPoint(0.7F, -0.25F, -3.0F);
        this.jaw.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -0.4363F, 0.0F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 115, 60, 0.23F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 115, 60, -1.63F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 3, 7, -1.68F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 9, 7, 0.28F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r91 = new AdvancedModelRendererExtended(this);
        this.cube_r91.setRotationPoint(0.0F, 1.5F, -1.0F);
        this.jaw.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -0.3054F, 0.0F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 0, 35, -1.0F, -1.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r92 = new AdvancedModelRendererExtended(this);
        this.cube_r92.setRotationPoint(0.0F, 0.75F, -4.0F);
        this.jaw.addChild(cube_r92);
        this.setRotateAngle(cube_r92, -0.2618F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 0, 8, -1.0F, -0.6868F, 2.0867F, 2, 1, 5, 0.0F, false));
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 107, 102, -0.5F, -0.8868F, 0.0867F, 1, 1, 2, 0.0F, false));

        this.frontleftleg = new AdvancedModelRendererExtended(this);
        this.frontleftleg.setRotationPoint(6.25F, 14.704F, -3.1548F);
        this.upperbody.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.6109F, 0.0F, -0.2618F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 24, 96, -2.5F, -2.0597F, -2.9263F, 5, 11, 6, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRendererExtended(this);
        this.frontleftleg2.setRotationPoint(0.0F, 8.9403F, 0.9737F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.7286F, 0.1096F, 0.2382F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 46, 100, -2.0F, -1.436F, -3.3169F, 4, 10, 5, -0.01F, false));

        this.frontleftleg3 = new AdvancedModelRendererExtended(this);
        this.frontleftleg3.setRotationPoint(0.5F, 7.664F, -0.5669F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.1745F, 0.0873F, 0.0F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 39, 35, -3.0F, 0.0F, -4.0F, 5, 2, 6, 0.0F, false));

        this.frontrightleg = new AdvancedModelRendererExtended(this);
        this.frontrightleg.setRotationPoint(-6.25F, 14.704F, -3.1548F);
        this.upperbody.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.6109F, 0.0F, 0.2618F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 24, 96, -2.5F, -2.0597F, -2.9263F, 5, 11, 6, 0.0F, true));

        this.frontrightleg2 = new AdvancedModelRendererExtended(this);
        this.frontrightleg2.setRotationPoint(0.0F, 8.9403F, 0.9737F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.7286F, -0.1096F, -0.2382F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 46, 100, -2.0F, -1.436F, -3.3169F, 4, 10, 5, -0.01F, true));

        this.frontrightleg3 = new AdvancedModelRendererExtended(this);
        this.frontrightleg3.setRotationPoint(-0.5F, 7.664F, -0.5669F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.1745F, -0.0873F, 0.0F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 39, 35, -2.0F, 0.0F, -4.0F, 5, 2, 6, 0.0F, true));

        this.leftPlate6 = new AdvancedModelRendererExtended(this);
        this.leftPlate6.setRotationPoint(2.5F, 3.054F, -3.5548F);
        this.upperbody.addChild(leftPlate6);
        this.setRotateAngle(leftPlate6, 0.517F, -0.0869F, 0.1515F);
        this.leftPlate6.cubeList.add(new ModelBox(leftPlate6, 61, 3, -1.0F, -1.0082F, -2.0733F, 1, 2, 4, 0.01F, false));

        this.cube_r93 = new AdvancedModelRendererExtended(this);
        this.cube_r93.setRotationPoint(0.0F, 0.407F, -0.1701F);
        this.leftPlate6.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.1955F, 0.0F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 72, 105, -1.0F, -6.9899F, 1.329F, 1, 6, 1, 0.0F, false));

        this.cube_r94 = new AdvancedModelRendererExtended(this);
        this.cube_r94.setRotationPoint(0.0F, 0.407F, -0.1701F);
        this.leftPlate6.addChild(cube_r94);
        this.setRotateAngle(cube_r94, -0.0524F, 0.0F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 96, 59, -1.0F, -5.1568F, -0.9592F, 1, 4, 2, -0.02F, false));

        this.cube_r95 = new AdvancedModelRendererExtended(this);
        this.cube_r95.setRotationPoint(0.0F, 0.407F, -0.1701F);
        this.leftPlate6.addChild(cube_r95);
        this.setRotateAngle(cube_r95, -0.3142F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 106, 8, -1.0F, -6.75F, -2.25F, 1, 6, 1, -0.01F, false));

        this.rightPlate6 = new AdvancedModelRendererExtended(this);
        this.rightPlate6.setRotationPoint(-2.5F, 3.054F, -3.5548F);
        this.upperbody.addChild(rightPlate6);
        this.setRotateAngle(rightPlate6, 0.517F, 0.0869F, -0.1515F);
        this.rightPlate6.cubeList.add(new ModelBox(rightPlate6, 61, 3, 0.0F, -1.0082F, -2.0733F, 1, 2, 4, 0.01F, true));

        this.cube_r96 = new AdvancedModelRendererExtended(this);
        this.cube_r96.setRotationPoint(0.0F, 0.407F, -0.1701F);
        this.rightPlate6.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.1955F, 0.0F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 72, 105, 0.0F, -6.9899F, 1.329F, 1, 6, 1, 0.0F, true));

        this.cube_r97 = new AdvancedModelRendererExtended(this);
        this.cube_r97.setRotationPoint(0.0F, 0.407F, -0.1701F);
        this.rightPlate6.addChild(cube_r97);
        this.setRotateAngle(cube_r97, -0.0524F, 0.0F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 96, 59, 0.0F, -5.1568F, -0.9592F, 1, 4, 2, -0.02F, true));

        this.cube_r98 = new AdvancedModelRendererExtended(this);
        this.cube_r98.setRotationPoint(0.0F, 0.407F, -0.1701F);
        this.rightPlate6.addChild(cube_r98);
        this.setRotateAngle(cube_r98, -0.3142F, 0.0F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 106, 8, 0.0F, -6.75F, -2.25F, 1, 6, 1, -0.01F, true));

        this.leftbabyPlate2 = new AdvancedModelRendererExtended(this);
        this.leftbabyPlate2.setRotationPoint(2.5F, 6.054F, -2.0548F);
        this.upperbody.addChild(leftbabyPlate2);
        this.setRotateAngle(leftbabyPlate2, 0.517F, -0.0869F, 0.1515F);
        this.leftbabyPlate2.cubeList.add(new ModelBox(leftbabyPlate2, 49, 5, -1.0F, -1.0082F, -2.0733F, 1, 2, 4, 0.01F, false));

        this.cube_r99 = new AdvancedModelRendererExtended(this);
        this.cube_r99.setRotationPoint(0.0F, 0.407F, -0.1701F);
        this.leftbabyPlate2.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.1955F, 0.0F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 68, 105, -1.0F, -6.9899F, 1.329F, 1, 6, 1, 0.0F, false));

        this.cube_r100 = new AdvancedModelRendererExtended(this);
        this.cube_r100.setRotationPoint(0.0F, 0.407F, -0.1701F);
        this.leftbabyPlate2.addChild(cube_r100);
        this.setRotateAngle(cube_r100, -0.0524F, 0.0F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 40, 96, -1.0F, -5.1568F, -0.9592F, 1, 4, 2, -0.02F, false));

        this.cube_r101 = new AdvancedModelRendererExtended(this);
        this.cube_r101.setRotationPoint(0.0F, 0.407F, -0.1701F);
        this.leftbabyPlate2.addChild(cube_r101);
        this.setRotateAngle(cube_r101, -0.3142F, 0.0F, 0.0F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 76, 105, -1.0F, -6.75F, -2.25F, 1, 6, 1, -0.01F, false));

        this.rightbabyPlate2 = new AdvancedModelRendererExtended(this);
        this.rightbabyPlate2.setRotationPoint(-2.5F, 6.054F, -2.0548F);
        this.upperbody.addChild(rightbabyPlate2);
        this.setRotateAngle(rightbabyPlate2, 0.517F, 0.0869F, -0.1515F);
        this.rightbabyPlate2.cubeList.add(new ModelBox(rightbabyPlate2, 49, 5, 0.0F, -1.0082F, -2.0733F, 1, 2, 4, 0.01F, true));

        this.cube_r102 = new AdvancedModelRendererExtended(this);
        this.cube_r102.setRotationPoint(0.0F, 0.407F, -0.1701F);
        this.rightbabyPlate2.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.1955F, 0.0F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 68, 105, 0.0F, -6.9899F, 1.329F, 1, 6, 1, 0.0F, true));

        this.cube_r103 = new AdvancedModelRendererExtended(this);
        this.cube_r103.setRotationPoint(0.0F, 0.407F, -0.1701F);
        this.rightbabyPlate2.addChild(cube_r103);
        this.setRotateAngle(cube_r103, -0.0524F, 0.0F, 0.0F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 40, 96, 0.0F, -5.1568F, -0.9592F, 1, 4, 2, -0.02F, true));

        this.cube_r104 = new AdvancedModelRendererExtended(this);
        this.cube_r104.setRotationPoint(0.0F, 0.407F, -0.1701F);
        this.rightbabyPlate2.addChild(cube_r104);
        this.setRotateAngle(cube_r104, -0.3142F, 0.0F, 0.0F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 76, 105, 0.0F, -6.75F, -2.25F, 1, 6, 1, -0.01F, true));

        this.leftPlate5 = new AdvancedModelRendererExtended(this);
        this.leftPlate5.setRotationPoint(1.75F, 6.154F, -7.4548F);
        this.upperbody.addChild(leftPlate5);
        this.setRotateAngle(leftPlate5, 0.5654F, -0.0561F, 0.0669F);


        this.cube_r105 = new AdvancedModelRendererExtended(this);
        this.cube_r105.setRotationPoint(0.5F, -2.0246F, -0.1757F);
        this.leftPlate5.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.2321F, 0.0F, 0.0F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 108, 109, -1.0F, -2.1767F, 0.5119F, 1, 3, 1, 0.0F, false));

        this.cube_r106 = new AdvancedModelRendererExtended(this);
        this.cube_r106.setRotationPoint(0.5F, -2.0246F, -0.1757F);
        this.leftPlate5.addChild(cube_r106);
        this.setRotateAngle(cube_r106, -0.2007F, 0.0F, 0.0F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 109, 92, -1.0F, -1.2451F, -0.2312F, 1, 2, 1, -0.02F, false));

        this.cube_r107 = new AdvancedModelRendererExtended(this);
        this.cube_r107.setRotationPoint(0.5F, -2.0246F, -0.1757F);
        this.leftPlate5.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.0F, 0.0F, 0.0F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 58, 74, -1.0F, 0.4487F, -1.3411F, 1, 2, 3, 0.01F, false));

        this.cube_r108 = new AdvancedModelRendererExtended(this);
        this.cube_r108.setRotationPoint(0.5F, -2.0246F, -0.1757F);
        this.leftPlate5.addChild(cube_r108);
        this.setRotateAngle(cube_r108, -0.4625F, 0.0F, 0.0F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 64, 21, -1.0F, -2.0F, -1.0F, 1, 3, 1, -0.01F, false));

        this.rightPlate5 = new AdvancedModelRendererExtended(this);
        this.rightPlate5.setRotationPoint(-1.75F, 6.154F, -7.4548F);
        this.upperbody.addChild(rightPlate5);
        this.setRotateAngle(rightPlate5, 0.5654F, 0.0561F, -0.0669F);


        this.cube_r109 = new AdvancedModelRendererExtended(this);
        this.cube_r109.setRotationPoint(-0.5F, -2.0246F, -0.1757F);
        this.rightPlate5.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.2321F, 0.0F, 0.0F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 108, 109, 0.0F, -2.1767F, 0.5119F, 1, 3, 1, 0.0F, true));

        this.cube_r110 = new AdvancedModelRendererExtended(this);
        this.cube_r110.setRotationPoint(-0.5F, -2.0246F, -0.1757F);
        this.rightPlate5.addChild(cube_r110);
        this.setRotateAngle(cube_r110, -0.2007F, 0.0F, 0.0F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 109, 92, 0.0F, -1.2451F, -0.2312F, 1, 2, 1, -0.02F, true));

        this.cube_r111 = new AdvancedModelRendererExtended(this);
        this.cube_r111.setRotationPoint(-0.5F, -2.0246F, -0.1757F);
        this.rightPlate5.addChild(cube_r111);
        this.setRotateAngle(cube_r111, 0.0F, 0.0F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 58, 74, 0.0F, 0.4487F, -1.3411F, 1, 2, 3, 0.01F, true));

        this.cube_r112 = new AdvancedModelRendererExtended(this);
        this.cube_r112.setRotationPoint(-0.5F, -2.0246F, -0.1757F);
        this.rightPlate5.addChild(cube_r112);
        this.setRotateAngle(cube_r112, -0.4625F, 0.0F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 64, 21, 0.0F, -2.0F, -1.0F, 1, 3, 1, -0.01F, true));

        this.leftbabyPlate1 = new AdvancedModelRendererExtended(this);
        this.leftbabyPlate1.setRotationPoint(1.75F, 8.654F, -6.2048F);
        this.upperbody.addChild(leftbabyPlate1);
        this.setRotateAngle(leftbabyPlate1, 0.5654F, -0.0561F, 0.0669F);


        this.cube_r113 = new AdvancedModelRendererExtended(this);
        this.cube_r113.setRotationPoint(0.5F, -2.0246F, -0.1757F);
        this.leftbabyPlate1.addChild(cube_r113);
        this.setRotateAngle(cube_r113, 0.2321F, 0.0F, 0.0F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 109, 98, -1.0F, -2.1767F, 0.5119F, 1, 3, 1, 0.0F, false));

        this.cube_r114 = new AdvancedModelRendererExtended(this);
        this.cube_r114.setRotationPoint(0.5F, -2.0246F, -0.1757F);
        this.leftbabyPlate1.addChild(cube_r114);
        this.setRotateAngle(cube_r114, -0.2007F, 0.0F, 0.0F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 110, 67, -1.0F, -1.2451F, -0.2312F, 1, 2, 1, -0.02F, false));

        this.cube_r115 = new AdvancedModelRendererExtended(this);
        this.cube_r115.setRotationPoint(0.5F, -2.0246F, -0.1757F);
        this.leftbabyPlate1.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 0.0F, 0.0F, 0.0F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 27, 73, -1.0F, 0.4487F, -1.3411F, 1, 2, 3, 0.01F, false));

        this.cube_r116 = new AdvancedModelRendererExtended(this);
        this.cube_r116.setRotationPoint(0.5F, -2.0246F, -0.1757F);
        this.leftbabyPlate1.addChild(cube_r116);
        this.setRotateAngle(cube_r116, -0.4625F, 0.0F, 0.0F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 10, 0, -1.0F, -2.0F, -1.0F, 1, 3, 1, -0.01F, false));

        this.rightbabyPlate1 = new AdvancedModelRendererExtended(this);
        this.rightbabyPlate1.setRotationPoint(-1.75F, 8.654F, -6.2048F);
        this.upperbody.addChild(rightbabyPlate1);
        this.setRotateAngle(rightbabyPlate1, 0.5654F, 0.0561F, -0.0669F);


        this.cube_r117 = new AdvancedModelRendererExtended(this);
        this.cube_r117.setRotationPoint(-0.5F, -2.0246F, -0.1757F);
        this.rightbabyPlate1.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 0.2321F, 0.0F, 0.0F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 109, 98, 0.0F, -2.1767F, 0.5119F, 1, 3, 1, 0.0F, true));

        this.cube_r118 = new AdvancedModelRendererExtended(this);
        this.cube_r118.setRotationPoint(-0.5F, -2.0246F, -0.1757F);
        this.rightbabyPlate1.addChild(cube_r118);
        this.setRotateAngle(cube_r118, -0.2007F, 0.0F, 0.0F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 110, 67, 0.0F, -1.2451F, -0.2312F, 1, 2, 1, -0.02F, true));

        this.cube_r119 = new AdvancedModelRendererExtended(this);
        this.cube_r119.setRotationPoint(-0.5F, -2.0246F, -0.1757F);
        this.rightbabyPlate1.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 0.0F, 0.0F, 0.0F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 27, 73, 0.0F, 0.4487F, -1.3411F, 1, 2, 3, 0.01F, true));

        this.cube_r120 = new AdvancedModelRendererExtended(this);
        this.cube_r120.setRotationPoint(-0.5F, -2.0246F, -0.1757F);
        this.rightbabyPlate1.addChild(cube_r120);
        this.setRotateAngle(cube_r120, -0.4625F, 0.0F, 0.0F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 10, 0, 0.0F, -2.0F, -1.0F, 1, 3, 1, -0.01F, true));

        this.Leftlegspike = new AdvancedModelRendererExtended(this);
        this.Leftlegspike.setRotationPoint(7.6F, 8.854F, -2.5548F);
        this.upperbody.addChild(Leftlegspike);
        this.setRotateAngle(Leftlegspike, 0.1333F, 0.1772F, 0.101F);


        this.Leftlegspiketip_r1 = new AdvancedModelRendererExtended(this);
        this.Leftlegspiketip_r1.setRotationPoint(3.1819F, -0.9069F, 3.5014F);
        this.Leftlegspike.addChild(Leftlegspiketip_r1);
        this.setRotateAngle(Leftlegspiketip_r1, 1.026F, -1.3894F, -1.1021F);
        this.Leftlegspiketip_r1.cubeList.add(new ModelBox(Leftlegspiketip_r1, 49, 3, -1.4009F, -1.0468F, -1.1014F, 7, 1, 1, 0.1F, false));

        this.Leftlegspikebase_r1 = new AdvancedModelRendererExtended(this);
        this.Leftlegspikebase_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Leftlegspike.addChild(Leftlegspikebase_r1);
        this.setRotateAngle(Leftlegspikebase_r1, 0.2986F, -0.841F, -0.3189F);
        this.Leftlegspikebase_r1.cubeList.add(new ModelBox(Leftlegspikebase_r1, 49, 0, -3.0F, -1.0F, -1.5F, 7, 1, 2, 0.3F, false));

        this.Rightlegspike = new AdvancedModelRendererExtended(this);
        this.Rightlegspike.setRotationPoint(-7.6F, 8.854F, -2.5548F);
        this.upperbody.addChild(Rightlegspike);
        this.setRotateAngle(Rightlegspike, 0.1333F, -0.1772F, -0.101F);


        this.Leftlegspiketip_r2 = new AdvancedModelRendererExtended(this);
        this.Leftlegspiketip_r2.setRotationPoint(-3.1819F, -0.9069F, 3.5014F);
        this.Rightlegspike.addChild(Leftlegspiketip_r2);
        this.setRotateAngle(Leftlegspiketip_r2, 1.026F, 1.3894F, 1.1021F);
        this.Leftlegspiketip_r2.cubeList.add(new ModelBox(Leftlegspiketip_r2, 49, 3, -5.5991F, -1.0468F, -1.1014F, 7, 1, 1, 0.1F, true));

        this.Leftlegspikebase_r2 = new AdvancedModelRendererExtended(this);
        this.Leftlegspikebase_r2.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.Rightlegspike.addChild(Leftlegspikebase_r2);
        this.setRotateAngle(Leftlegspikebase_r2, 0.2986F, 0.841F, 0.3189F);
        this.Leftlegspikebase_r2.cubeList.add(new ModelBox(Leftlegspikebase_r2, 49, 0, -4.0F, -1.0F, -1.5F, 7, 1, 2, 0.3F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.main.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraTuojiangosaurus kentrosaurus = (EntityPrehistoricFloraTuojiangosaurus) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        kentrosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (kentrosaurus.getAnimation() == kentrosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!kentrosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !kentrosaurus.getIsMoving()) {
                    if (kentrosaurus.getAnimation() != kentrosaurus.EAT_ANIMATION
                        && kentrosaurus.getAnimation() != kentrosaurus.DRINK_ANIMATION
                        && kentrosaurus.getAnimation() != kentrosaurus.ATTACK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    if (kentrosaurus.getAnimation() != kentrosaurus.ATTACK_ANIMATION) {
                        this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    }

                    return;
                }

                if (kentrosaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTuojiangosaurus ee = (EntityPrehistoricFloraTuojiangosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTuojiangosaurus entity = (EntityPrehistoricFloraTuojiangosaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = 7.25 + (((tickAnim - 28) / 30) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 7.25 + (((tickAnim - 58) / 22) * (0-(7.25)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = 6 + (((tickAnim - 28) / 30) * (6-(6)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 6 + (((tickAnim - 58) / 22) * (0-(6)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (18.09961-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.14454-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-3.042-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 18.09961 + (((tickAnim - 28) / 8) * (20.59961-(18.09961)));
            yy = 1.14454 + (((tickAnim - 28) / 8) * (1.14454-(1.14454)));
            zz = -3.042 + (((tickAnim - 28) / 8) * (-3.042-(-3.042)));
        }
        else if (tickAnim >= 36 && tickAnim < 58) {
            xx = 20.59961 + (((tickAnim - 36) / 22) * (18.09961-(20.59961)));
            yy = 1.14454 + (((tickAnim - 36) / 22) * (1.14454-(1.14454)));
            zz = -3.042 + (((tickAnim - 36) / 22) * (-3.042-(-3.042)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 18.09961 + (((tickAnim - 58) / 22) * (0-(18.09961)));
            yy = 1.14454 + (((tickAnim - 58) / 22) * (0-(1.14454)));
            zz = -3.042 + (((tickAnim - 58) / 22) * (0-(-3.042)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = -0.85 + (((tickAnim - 28) / 8) * (-1.03-(-0.85)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 36) / 44) * (0-(0)));
            yy = -1.03 + (((tickAnim - 36) / 44) * (0-(-1.03)));
            zz = 0 + (((tickAnim - 36) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (25.63119-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.01848-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-4.35723-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 25.63119 + (((tickAnim - 28) / 8) * (29.131-(25.63119)));
            yy = 1.01848 + (((tickAnim - 28) / 8) * (1.02138-(1.01848)));
            zz = -4.35723 + (((tickAnim - 28) / 8) * (-4.36967-(-4.35723)));
        }
        else if (tickAnim >= 36 && tickAnim < 58) {
            xx = 29.131 + (((tickAnim - 36) / 22) * (25.63081-(29.131)));
            yy = 1.02138 + (((tickAnim - 36) / 22) * (1.02429-(1.02138)));
            zz = -4.36967 + (((tickAnim - 36) / 22) * (-4.38211-(-4.36967)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 25.63081 + (((tickAnim - 58) / 22) * (0-(25.63081)));
            yy = 1.02429 + (((tickAnim - 58) / 22) * (0-(1.02429)));
            zz = -4.38211 + (((tickAnim - 58) / 22) * (0-(-4.38211)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (5.53845-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0.16763-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-0.45687-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 5.53845 + (((tickAnim - 28) / 8) * (-4.71234-(5.53845)));
            yy = 0.16763 + (((tickAnim - 28) / 8) * (1.33795-(0.16763)));
            zz = -0.45687 + (((tickAnim - 28) / 8) * (-5.33527-(-0.45687)));
        }
        else if (tickAnim >= 36 && tickAnim < 58) {
            xx = -4.71234 + (((tickAnim - 36) / 22) * (6.53766-(-4.71234)));
            yy = 1.33795 + (((tickAnim - 36) / 22) * (1.33795-(1.33795)));
            zz = -5.33527 + (((tickAnim - 36) / 22) * (-5.33527-(-5.33527)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 6.53766 + (((tickAnim - 58) / 22) * (0-(6.53766)));
            yy = 1.33795 + (((tickAnim - 58) / 22) * (0-(1.33795)));
            zz = -5.33527 + (((tickAnim - 58) / 22) * (0-(-5.33527)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            yy = -0.1 + (((tickAnim - 28) / 30) * (-0.3-(-0.1)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            yy = -0.3 + (((tickAnim - 58) / 22) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 8 + (((tickAnim - 29) / 7) * (0-(8)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (8-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 8 + (((tickAnim - 43) / 37) * (0-(8)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+50))*-1));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-170))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-170))*2.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+200))*-5));



        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = 12.25 + (((tickAnim - 28) / 30) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 66) {
            xx = 12.25 + (((tickAnim - 58) / 8) * (-5.6-(12.25)));
            yy = 0 + (((tickAnim - 58) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 8) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 73) {
            xx = -5.6 + (((tickAnim - 66) / 7) * (0-(-5.6)));
            yy = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 0) / 73) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 73) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 73) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 73) / 2) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 75) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 75) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 75) / 2) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 77) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 77) / 1) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 78) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 58) / 8) * (30.44-(0)));
            yy = 0 + (((tickAnim - 58) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 8) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 70) {
            xx = 30.44 + (((tickAnim - 66) / 4) * (6.65-(30.44)));
            yy = 0 + (((tickAnim - 66) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 4) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 6.65 + (((tickAnim - 70) / 3) * (0-(6.65)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 58) / 8) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 58) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 8) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 73) {
            xx = -0.25 + (((tickAnim - 66) / 7) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 28 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 58) / 8) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 58) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 8) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 70) {
            xx = -15.5 + (((tickAnim - 66) / 4) * (1.63-(-15.5)));
            yy = 0 + (((tickAnim - 66) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 4) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 1.63 + (((tickAnim - 70) / 3) * (0-(1.63)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 58) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = -12.5 + (((tickAnim - 28) / 30) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 66) {
            xx = -12.5 + (((tickAnim - 58) / 8) * (6.16-(-12.5)));
            yy = 0 + (((tickAnim - 58) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 8) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 71) {
            xx = 6.16 + (((tickAnim - 66) / 5) * (-14.36-(6.16)));
            yy = 0 + (((tickAnim - 66) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 5) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 73) {
            xx = -14.36 + (((tickAnim - 71) / 2) * (0-(-14.36)));
            yy = 0 + (((tickAnim - 71) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            yy = -0.65 + (((tickAnim - 28) / 30) * (-0.65-(-0.65)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 58) / 15) * (0-(0)));
            yy = -0.65 + (((tickAnim - 58) / 15) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 58) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(xx);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(yy);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+250))*1), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+250))*-1));



        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 5.5 + (((tickAnim - 29) / 7) * (25.78-(5.5)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 25.78 + (((tickAnim - 36) / 7) * (0-(25.78)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 43) / 6) * (25.78-(0)));
            yy = 0 + (((tickAnim - 43) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 6) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 56) {
            xx = 25.78 + (((tickAnim - 49) / 7) * (0-(25.78)));
            yy = 0 + (((tickAnim - 49) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 7) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 56) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 1.5 + (((tickAnim - 8) / 14) * (6.75-(1.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 6.75 + (((tickAnim - 22) / 7) * (0.5-(6.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = 0.5 + (((tickAnim - 29) / 29) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 29) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 77) {
            xx = 0.5 + (((tickAnim - 58) / 19) * (-6-(0.5)));
            yy = 0 + (((tickAnim - 58) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 19) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = -6 + (((tickAnim - 77) / 3) * (0-(-6)));
            yy = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 14) * (0-(0.575)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 24) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 29) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 32) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 45) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 1.5 + (((tickAnim - 8) / 14) * (6.75-(1.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 6.75 + (((tickAnim - 22) / 7) * (0.5-(6.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = 0.5 + (((tickAnim - 29) / 29) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 29) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = 0.5 + (((tickAnim - 58) / 7) * (0-(0.5)));
            yy = 0 + (((tickAnim - 58) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 7) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 65) / 12) * (-6-(0)));
            yy = 0 + (((tickAnim - 65) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 12) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = -6 + (((tickAnim - 77) / 3) * (0-(-6)));
            yy = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 14) * (0.65-(0.575)));
            zz = 0 + (((tickAnim - 8) / 14) * (-0.125-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0.65 + (((tickAnim - 22) / 2) * (-0.15-(0.65)));
            zz = -0.125 + (((tickAnim - 22) / 2) * (0-(-0.125)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 24) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = -0.225 + (((tickAnim - 29) / 29) * (-0.225-(-0.225)));
            yy = 0.5 + (((tickAnim - 29) / 29) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 29) / 29) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = -0.225 + (((tickAnim - 58) / 7) * (-0.125-(-0.225)));
            yy = 0.5 + (((tickAnim - 58) / 7) * (1.875-(0.5)));
            zz = 0 + (((tickAnim - 58) / 7) * (0.9-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 77) {
            xx = -0.125 + (((tickAnim - 65) / 12) * (0-(-0.125)));
            yy = 1.875 + (((tickAnim - 65) / 12) * (0-(1.875)));
            zz = 0.9 + (((tickAnim - 65) / 12) * (0-(0.9)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = -29.5 + (((tickAnim - 8) / 14) * (-33.5-(-29.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -33.5 + (((tickAnim - 22) / 7) * (-14.25-(-33.5)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = -14.25 + (((tickAnim - 29) / 29) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 29) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = -14.25 + (((tickAnim - 58) / 7) * (7.5-(-14.25)));
            yy = 0 + (((tickAnim - 58) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 7) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 77) {
            xx = 7.5 + (((tickAnim - 65) / 12) * (0-(7.5)));
            yy = 0 + (((tickAnim - 65) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 12) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 7) * (0.75-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0.25-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            yy = 0.75 + (((tickAnim - 29) / 29) * (0.75-(0.75)));
            zz = 0.25 + (((tickAnim - 29) / 29) * (0.25-(0.25)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 58) / 7) * (0-(0)));
            yy = 0.75 + (((tickAnim - 58) / 7) * (0-(0.75)));
            zz = 0.25 + (((tickAnim - 58) / 7) * (0-(0.25)));
        }
        else if (tickAnim >= 65 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 65) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 12) * (0.575-(0)));
            zz = 0 + (((tickAnim - 65) / 12) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 77) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 77) / 3) * (0-(0.575)));
            zz = 0 + (((tickAnim - 77) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = -25.5 + (((tickAnim - 29) / 29) * (-25.5-(-25.5)));
            yy = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 29) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -25.5 + (((tickAnim - 58) / 22) * (0-(-25.5)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 29 && tickAnim < 58) {
            xx = 0.3 + (((tickAnim - 29) / 29) * (0.3-(0.3)));
            yy = 0.6 + (((tickAnim - 29) / 29) * (0.6-(0.6)));
            zz = -0.475 + (((tickAnim - 29) / 29) * (-0.475-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (49.35795-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (3.51739-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (-1.90808-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = 49.35795 + (((tickAnim - 29) / 29) * (49.35795-(49.35795)));
            yy = 3.51739 + (((tickAnim - 29) / 29) * (3.51739-(3.51739)));
            zz = -1.90808 + (((tickAnim - 29) / 29) * (-1.90808-(-1.90808)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 49.35795 + (((tickAnim - 58) / 22) * (0-(49.35795)));
            yy = 3.51739 + (((tickAnim - 58) / 22) * (0-(3.51739)));
            zz = -1.90808 + (((tickAnim - 58) / 22) * (0-(-1.90808)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0.525-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            zz = 0.525 + (((tickAnim - 29) / 29) * (0.525-(0.525)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0.525 + (((tickAnim - 58) / 22) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-37.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 58) {
            xx = -37.75 + (((tickAnim - 29) / 29) * (-37.75-(-37.75)));
            yy = 0 + (((tickAnim - 29) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 29) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -37.75 + (((tickAnim - 58) / 22) * (0-(-37.75)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 6) * (0.565-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.565 + (((tickAnim - 6) / 7) * (0.875-(0.565)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0.875 + (((tickAnim - 13) / 8) * (0.7-(0.875)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 21) / 7) * (0.255-(0.7)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0.255 + (((tickAnim - 28) / 1) * (-0.075-(0.255)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 29) / -29) * (-(0)));
            yy = -0.075 + (((tickAnim - 29) / -29) * (-(-0.075)));
            zz = 0 + (((tickAnim - 29) / -29) * (-(0)));
        }

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTuojiangosaurus entity = (EntityPrehistoricFloraTuojiangosaurus) entitylivingbaseIn;

        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 7.25 + (((tickAnim - 28) / 20) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 7.25 + (((tickAnim - 48) / 22) * (0-(7.25)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 6 + (((tickAnim - 28) / 20) * (6-(6)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 6 + (((tickAnim - 48) / 22) * (0-(6)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (18.09961-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.14454-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-3.042-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 18.09961 + (((tickAnim - 28) / 8) * (20.59961-(18.09961)));
            yy = 1.14454 + (((tickAnim - 28) / 8) * (1.14454-(1.14454)));
            zz = -3.042 + (((tickAnim - 28) / 8) * (-3.042-(-3.042)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 20.59961 + (((tickAnim - 36) / 12) * (18.09961-(20.59961)));
            yy = 1.14454 + (((tickAnim - 36) / 12) * (1.14454-(1.14454)));
            zz = -3.042 + (((tickAnim - 36) / 12) * (-3.042-(-3.042)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 18.09961 + (((tickAnim - 48) / 22) * (0-(18.09961)));
            yy = 1.14454 + (((tickAnim - 48) / 22) * (0-(1.14454)));
            zz = -3.042 + (((tickAnim - 48) / 22) * (0-(-3.042)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = -0.85 + (((tickAnim - 28) / 8) * (-1.03-(-0.85)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 36) / 34) * (0-(0)));
            yy = -1.03 + (((tickAnim - 36) / 34) * (0-(-1.03)));
            zz = 0 + (((tickAnim - 36) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (25.63119-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.01848-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-4.35723-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 25.63119 + (((tickAnim - 28) / 8) * (29.131-(25.63119)));
            yy = 1.01848 + (((tickAnim - 28) / 8) * (1.02138-(1.01848)));
            zz = -4.35723 + (((tickAnim - 28) / 8) * (-4.36967-(-4.35723)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 29.131 + (((tickAnim - 36) / 12) * (25.63081-(29.131)));
            yy = 1.02138 + (((tickAnim - 36) / 12) * (1.02429-(1.02138)));
            zz = -4.36967 + (((tickAnim - 36) / 12) * (-4.38211-(-4.36967)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 25.63081 + (((tickAnim - 48) / 22) * (0-(25.63081)));
            yy = 1.02429 + (((tickAnim - 48) / 22) * (0-(1.02429)));
            zz = -4.38211 + (((tickAnim - 48) / 22) * (0-(-4.38211)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (5.53845-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0.16763-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-0.45687-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 5.53845 + (((tickAnim - 28) / 8) * (-4.71234-(5.53845)));
            yy = 0.16763 + (((tickAnim - 28) / 8) * (1.33795-(0.16763)));
            zz = -0.45687 + (((tickAnim - 28) / 8) * (-5.33527-(-0.45687)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = -4.71234 + (((tickAnim - 36) / 12) * (6.53766-(-4.71234)));
            yy = 1.33795 + (((tickAnim - 36) / 12) * (1.33795-(1.33795)));
            zz = -5.33527 + (((tickAnim - 36) / 12) * (-5.33527-(-5.33527)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 6.53766 + (((tickAnim - 48) / 22) * (0-(6.53766)));
            yy = 1.33795 + (((tickAnim - 48) / 22) * (0-(1.33795)));
            zz = -5.33527 + (((tickAnim - 48) / 22) * (0-(-5.33527)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = -0.1 + (((tickAnim - 28) / 20) * (-0.3-(-0.1)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            yy = -0.3 + (((tickAnim - 48) / 22) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 8 + (((tickAnim - 29) / 7) * (0-(8)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (8-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 70) {
            xx = 8 + (((tickAnim - 43) / 27) * (0-(8)));
            yy = 0 + (((tickAnim - 43) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+50))*-1));

        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+190))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+220))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+220))*-5));



        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 12.25 + (((tickAnim - 28) / 20) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 12.25 + (((tickAnim - 48) / 8) * (-5.6-(12.25)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = -5.6 + (((tickAnim - 56) / 7) * (0-(-5.6)));
            yy = 0 + (((tickAnim - 56) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 65) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 65) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 65) / 2) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 67) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 67) / 1) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 68) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 48) / 8) * (30.44-(0)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 30.44 + (((tickAnim - 56) / 4) * (6.65-(30.44)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 6.65 + (((tickAnim - 60) / 3) * (0-(6.65)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 48) / 8) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = -0.25 + (((tickAnim - 56) / 7) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 56) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 48) / 8) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = -15.5 + (((tickAnim - 56) / 4) * (1.63-(-15.5)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 1.63 + (((tickAnim - 60) / 3) * (0-(1.63)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = -12.5 + (((tickAnim - 28) / 20) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = -12.5 + (((tickAnim - 48) / 8) * (6.16-(-12.5)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = 6.16 + (((tickAnim - 56) / 5) * (-14.36-(6.16)));
            yy = 0 + (((tickAnim - 56) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 5) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 63) {
            xx = -14.36 + (((tickAnim - 61) / 2) * (0-(-14.36)));
            yy = 0 + (((tickAnim - 61) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = -0.65 + (((tickAnim - 28) / 20) * (-0.65-(-0.65)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            yy = -0.65 + (((tickAnim - 48) / 15) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(xx);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(yy);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+250))*1), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+250))*-1));



        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 5.25 + (((tickAnim - 29) / 7) * (26.03-(5.25)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 26.03 + (((tickAnim - 36) / 7) * (0-(26.03)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 43) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 1.5 + (((tickAnim - 8) / 14) * (6.75-(1.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 6.75 + (((tickAnim - 22) / 7) * (0.5-(6.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0.5 + (((tickAnim - 29) / 19) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 67) {
            xx = 0.5 + (((tickAnim - 48) / 19) * (-6-(0.5)));
            yy = 0 + (((tickAnim - 48) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 19) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = -6 + (((tickAnim - 67) / 3) * (0-(-6)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 14) * (0-(0.575)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 24) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 29) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 32) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 35) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 1.5 + (((tickAnim - 8) / 14) * (6.75-(1.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 6.75 + (((tickAnim - 22) / 7) * (0.5-(6.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0.5 + (((tickAnim - 29) / 19) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0.5 + (((tickAnim - 48) / 7) * (0-(0.5)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 55) / 12) * (-6-(0)));
            yy = 0 + (((tickAnim - 55) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 12) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = -6 + (((tickAnim - 67) / 3) * (0-(-6)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 14) * (0.65-(0.575)));
            zz = 0 + (((tickAnim - 8) / 14) * (-0.125-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0.65 + (((tickAnim - 22) / 2) * (-0.15-(0.65)));
            zz = -0.125 + (((tickAnim - 22) / 2) * (0-(-0.125)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 24) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -0.225 + (((tickAnim - 29) / 19) * (-0.225-(-0.225)));
            yy = 0.5 + (((tickAnim - 29) / 19) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -0.225 + (((tickAnim - 48) / 7) * (-0.125-(-0.225)));
            yy = 0.5 + (((tickAnim - 48) / 7) * (1.875-(0.5)));
            zz = 0 + (((tickAnim - 48) / 7) * (0.9-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 67) {
            xx = -0.125 + (((tickAnim - 55) / 12) * (0-(-0.125)));
            yy = 1.875 + (((tickAnim - 55) / 12) * (0-(1.875)));
            zz = 0.9 + (((tickAnim - 55) / 12) * (0-(0.9)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = -29.5 + (((tickAnim - 8) / 14) * (-33.5-(-29.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -33.5 + (((tickAnim - 22) / 7) * (-14.25-(-33.5)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -14.25 + (((tickAnim - 29) / 19) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -14.25 + (((tickAnim - 48) / 7) * (7.5-(-14.25)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 67) {
            xx = 7.5 + (((tickAnim - 55) / 12) * (0-(7.5)));
            yy = 0 + (((tickAnim - 55) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 12) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 7) * (0.75-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0.25-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            yy = 0.75 + (((tickAnim - 29) / 19) * (0.75-(0.75)));
            zz = 0.25 + (((tickAnim - 29) / 19) * (0.25-(0.25)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = 0.75 + (((tickAnim - 48) / 7) * (0-(0.75)));
            zz = 0.25 + (((tickAnim - 48) / 7) * (0-(0.25)));
        }
        else if (tickAnim >= 55 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 55) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 12) * (0.575-(0)));
            zz = 0 + (((tickAnim - 55) / 12) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 67) / 3) * (0-(0.575)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -25.5 + (((tickAnim - 29) / 19) * (-25.5-(-25.5)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = -25.5 + (((tickAnim - 48) / 22) * (0-(-25.5)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0.3 + (((tickAnim - 29) / 19) * (0.3-(0.3)));
            yy = 0.6 + (((tickAnim - 29) / 19) * (0.6-(0.6)));
            zz = -0.475 + (((tickAnim - 29) / 19) * (-0.475-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (49.35795-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (3.51739-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (-1.90808-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 49.35795 + (((tickAnim - 29) / 19) * (49.35795-(49.35795)));
            yy = 3.51739 + (((tickAnim - 29) / 19) * (3.51739-(3.51739)));
            zz = -1.90808 + (((tickAnim - 29) / 19) * (-1.90808-(-1.90808)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 49.35795 + (((tickAnim - 48) / 22) * (0-(49.35795)));
            yy = 3.51739 + (((tickAnim - 48) / 22) * (0-(3.51739)));
            zz = -1.90808 + (((tickAnim - 48) / 22) * (0-(-1.90808)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0.525-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0.525 + (((tickAnim - 29) / 19) * (0.525-(0.525)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0.525 + (((tickAnim - 48) / 22) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-37.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -37.75 + (((tickAnim - 29) / 19) * (-37.75-(-37.75)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = -37.75 + (((tickAnim - 48) / 22) * (0-(-37.75)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 6) * (0.565-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.565 + (((tickAnim - 6) / 7) * (0.875-(0.565)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0.875 + (((tickAnim - 13) / 8) * (0.7-(0.875)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 21) / 7) * (0.255-(0.7)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0.255 + (((tickAnim - 28) / 1) * (-0.075-(0.255)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            yy = -0.075 + (((tickAnim - 29) / 19) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = -0.075 + (((tickAnim - 48) / 5) * (0.605-(-0.075)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 53) / -53) * (-(0)));
            yy = 0.605 + (((tickAnim - 53) / -53) * (-(0.605)));
            zz = 0 + (((tickAnim - 53) / -53) * (-(0)));
        }

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTuojiangosaurus entity = (EntityPrehistoricFloraTuojiangosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (5.85436-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (45.29103-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 5.85436 + (((tickAnim - 8) / 10) * (5.357-(5.85436)));
            yy = 45.29103 + (((tickAnim - 8) / 10) * (120.2532-(45.29103)));
            zz = 0 + (((tickAnim - 8) / 10) * (10.89405-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 5.357 + (((tickAnim - 18) / 22) * (0-(5.357)));
            yy = 120.2532 + (((tickAnim - 18) / 22) * (0-(120.2532)));
            zz = 10.89405 + (((tickAnim - 18) / 22) * (0-(10.89405)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.025-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = -1.025 + (((tickAnim - 18) / 22) * (0-(-1.025)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.66053-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.71609-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (4.21469-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -1.66053 + (((tickAnim - 5) / 4) * (-3.04458-(-1.66053)));
            yy = -7.71609 + (((tickAnim - 5) / 4) * (-10.45542-(-7.71609)));
            zz = 4.21469 + (((tickAnim - 5) / 4) * (7.68833-(4.21469)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -3.04458 + (((tickAnim - 9) / 9) * (-3.77575-(-3.04458)));
            yy = -10.45542 + (((tickAnim - 9) / 9) * (27.30419-(-10.45542)));
            zz = 7.68833 + (((tickAnim - 9) / 9) * (-11.44316-(7.68833)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -3.77575 + (((tickAnim - 18) / 5) * (-2.84473-(-3.77575)));
            yy = 27.30419 + (((tickAnim - 18) / 5) * (23.45068-(27.30419)));
            zz = -11.44316 + (((tickAnim - 18) / 5) * (-8.61508-(-11.44316)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = -2.84473 + (((tickAnim - 23) / 13) * (0-(-2.84473)));
            yy = 23.45068 + (((tickAnim - 23) / 13) * (0-(23.45068)));
            zz = -8.61508 + (((tickAnim - 23) / 13) * (0-(-8.61508)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = -0.775 + (((tickAnim - 18) / 18) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.394-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.7628-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5.46462-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.394 + (((tickAnim - 5) / 4) * (0.96965-(-0.394)));
            yy = -3.7628 + (((tickAnim - 5) / 4) * (-11.22851-(-3.7628)));
            zz = 5.46462 + (((tickAnim - 5) / 4) * (11.54346-(5.46462)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0.96965 + (((tickAnim - 9) / 9) * (-2.69513-(0.96965)));
            yy = -11.22851 + (((tickAnim - 9) / 9) * (19.30931-(-11.22851)));
            zz = 11.54346 + (((tickAnim - 9) / 9) * (-10.092-(11.54346)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -2.69513 + (((tickAnim - 18) / 5) * (-1.09706-(-2.69513)));
            yy = 19.30931 + (((tickAnim - 18) / 5) * (17.71328-(19.30931)));
            zz = -10.092 + (((tickAnim - 18) / 5) * (-5.7041-(-10.092)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = -1.09706 + (((tickAnim - 23) / 13) * (0-(-1.09706)));
            yy = 17.71328 + (((tickAnim - 23) / 13) * (0-(17.71328)));
            zz = -5.7041 + (((tickAnim - 23) / 13) * (0-(-5.7041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = -5.75 + (((tickAnim - 5) / 4) * (-17.98-(-5.75)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = -17.98 + (((tickAnim - 9) / 9) * (28.75-(-17.98)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-0.73711-(0)));
            yy = 28.75 + (((tickAnim - 18) / 5) * (13.71924-(28.75)));
            zz = 0 + (((tickAnim - 18) / 5) * (-3.07643-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = -0.73711 + (((tickAnim - 23) / 13) * (0-(-0.73711)));
            yy = 13.71924 + (((tickAnim - 23) / 13) * (0-(13.71924)));
            zz = -3.07643 + (((tickAnim - 23) / 13) * (0-(-3.07643)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (8.43908-(0)));
            yy = -15 + (((tickAnim - 5) / 4) * (-21.62191-(-15)));
            zz = 0 + (((tickAnim - 5) / 4) * (-0.4052-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 8.43908 + (((tickAnim - 9) / 9) * (17.3458-(8.43908)));
            yy = -21.62191 + (((tickAnim - 9) / 9) * (29.89993-(-21.62191)));
            zz = -0.4052 + (((tickAnim - 9) / 9) * (1.34085-(-0.4052)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 17.3458 + (((tickAnim - 18) / 5) * (7.57666-(17.3458)));
            yy = 29.89993 + (((tickAnim - 18) / 5) * (15.5933-(29.89993)));
            zz = 1.34085 + (((tickAnim - 18) / 5) * (-13.47782-(1.34085)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = 7.57666 + (((tickAnim - 23) / 13) * (0-(7.57666)));
            yy = 15.5933 + (((tickAnim - 23) / 13) * (0-(15.5933)));
            zz = -13.47782 + (((tickAnim - 23) / 13) * (0-(-13.47782)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (5.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 5.5 + (((tickAnim - 8) / 5) * (9.5-(5.5)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 9.5 + (((tickAnim - 13) / 5) * (13.5-(9.5)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = 13.5 + (((tickAnim - 18) / 18) * (0-(13.5)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-21.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -21.5 + (((tickAnim - 8) / 5) * (-23.75-(-21.5)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -23.75 + (((tickAnim - 13) / 5) * (-26.25-(-23.75)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = -26.25 + (((tickAnim - 18) / 18) * (0-(-26.25)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-19.75-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -19.75 + (((tickAnim - 13) / 5) * (-26.25-(-19.75)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = -26.25 + (((tickAnim - 18) / 18) * (0-(-26.25)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -4 + (((tickAnim - 13) / 5) * (-3.98851-(-4)));
            yy = 0 + (((tickAnim - 13) / 5) * (-2.96702-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.44383-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = -3.98851 + (((tickAnim - 18) / 18) * (0-(-3.98851)));
            yy = -2.96702 + (((tickAnim - 18) / 18) * (0-(-2.96702)));
            zz = -0.44383 + (((tickAnim - 18) / 18) * (0-(-0.44383)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = -5 + (((tickAnim - 18) / 18) * (0-(-5)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0.4-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.145-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0.59-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0.4 + (((tickAnim - 14) / 2) * (0.36-(0.4)));
            yy = 0.145 + (((tickAnim - 14) / 2) * (-0.145-(0.145)));
            zz = 0.59 + (((tickAnim - 14) / 2) * (0.53-(0.59)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0.36 + (((tickAnim - 16) / 2) * (0-(0.36)));
            yy = -0.145 + (((tickAnim - 16) / 2) * (0-(-0.145)));
            zz = 0.53 + (((tickAnim - 16) / 2) * (0-(0.53)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0.36-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (-0.145-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0.53-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0.36 + (((tickAnim - 19) / 2) * (0-(0.36)));
            yy = -0.145 + (((tickAnim - 19) / 2) * (0-(-0.145)));
            zz = 0.53 + (((tickAnim - 19) / 2) * (0-(0.53)));
        }
        else if (tickAnim >= 21 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 21) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4.75029-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.01199-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.74997-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 4.75029 + (((tickAnim - 18) / 18) * (0-(4.75029)));
            yy = 0.01199 + (((tickAnim - 18) / 18) * (0-(0.01199)));
            zz = 2.74997 + (((tickAnim - 18) / 18) * (0-(2.74997)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = -13 + (((tickAnim - 7) / 11) * (-16.5-(-13)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = -16.5 + (((tickAnim - 18) / 18) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 18) / 3) * (0.13-(0.175)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 0.13 + (((tickAnim - 21) / 3) * (0.525-(0.13)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            yy = 0.525 + (((tickAnim - 24) / 12) * (0-(0.525)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (32.47716-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-6.79703-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-8.02203-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 32.47716 + (((tickAnim - 7) / 11) * (7.75-(32.47716)));
            yy = -6.79703 + (((tickAnim - 7) / 11) * (0-(-6.79703)));
            zz = -8.02203 + (((tickAnim - 7) / 11) * (0-(-8.02203)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 7.75 + (((tickAnim - 18) / 18) * (0-(7.75)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0.4-(0)));
            yy = 0 + (((tickAnim - 7) / 11) * (-0.73-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0.59-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0.4 + (((tickAnim - 18) / 1) * (0.36-(0.4)));
            yy = -0.73 + (((tickAnim - 18) / 1) * (-0.67-(-0.73)));
            zz = 0.59 + (((tickAnim - 18) / 1) * (0.53-(0.59)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0.36 + (((tickAnim - 19) / 2) * (0.5-(0.36)));
            yy = -0.67 + (((tickAnim - 19) / 2) * (-0.75-(-0.67)));
            zz = 0.53 + (((tickAnim - 19) / 2) * (0-(0.53)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0.5 + (((tickAnim - 21) / 2) * (0.36-(0.5)));
            yy = -0.75 + (((tickAnim - 21) / 2) * (-0.145-(-0.75)));
            zz = 0 + (((tickAnim - 21) / 2) * (0.53-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0.36 + (((tickAnim - 23) / 1) * (0-(0.36)));
            yy = -0.145 + (((tickAnim - 23) / 1) * (0-(-0.145)));
            zz = 0.53 + (((tickAnim - 23) / 1) * (0-(0.53)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = -20.5 + (((tickAnim - 7) / 11) * (7.5-(-20.5)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 7.5 + (((tickAnim - 18) / 18) * (0-(7.5)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (24.01-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 24.01 + (((tickAnim - 7) / 5) * (-8.65-(24.01)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -8.65 + (((tickAnim - 12) / 6) * (7.99-(-8.65)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 7.99 + (((tickAnim - 18) / 18) * (0-(7.99)));
            yy = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 18) / 18) * (0-(0)));
            yy = 0.225 + (((tickAnim - 18) / 18) * (0-(0.225)));
            zz = 0 + (((tickAnim - 18) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.66302-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (14.29062-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (9.83721-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 10.66302 + (((tickAnim - 18) / 5) * (-0.37-(10.66302)));
            yy = 14.29062 + (((tickAnim - 18) / 5) * (0-(14.29062)));
            zz = 9.83721 + (((tickAnim - 18) / 5) * (0-(9.83721)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -0.37 + (((tickAnim - 23) / 8) * (-13.86-(-0.37)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -13.86 + (((tickAnim - 31) / 3) * (0-(-13.86)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.445-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.445 + (((tickAnim - 4) / 4) * (-1.275-(-0.445)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -1.275 + (((tickAnim - 8) / 5) * (0.555-(-1.275)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.555 + (((tickAnim - 13) / 5) * (1.265-(0.555)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            yy = 1.265 + (((tickAnim - 18) / 16) * (0-(1.265)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.29999-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.92052-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-4.34525-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 6.29999 + (((tickAnim - 8) / 5) * (10.74779-(6.29999)));
            yy = 1.92052 + (((tickAnim - 8) / 5) * (3.84418-(1.92052)));
            zz = -4.34525 + (((tickAnim - 8) / 5) * (-7.47898-(-4.34525)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 10.74779 + (((tickAnim - 13) / 5) * (14.37-(10.74779)));
            yy = 3.84418 + (((tickAnim - 13) / 5) * (0-(3.84418)));
            zz = -7.47898 + (((tickAnim - 13) / 5) * (0-(-7.47898)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 14.37 + (((tickAnim - 18) / 5) * (30.75-(14.37)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 30.75 + (((tickAnim - 23) / 11) * (0-(30.75)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.165-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.165 + (((tickAnim - 8) / 10) * (-1.3-(0.165)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-0.14-(0)));
            yy = -1.3 + (((tickAnim - 18) / 5) * (-0.385-(-1.3)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.75-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -0.14 + (((tickAnim - 23) / 8) * (-0.375-(-0.14)));
            yy = -0.385 + (((tickAnim - 23) / 8) * (-0.26-(-0.385)));
            zz = -0.75 + (((tickAnim - 23) / 8) * (0-(-0.75)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -0.375 + (((tickAnim - 31) / 3) * (0-(-0.375)));
            yy = -0.26 + (((tickAnim - 31) / 3) * (0-(-0.26)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-5.29-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = -5.29 + (((tickAnim - 18) / 16) * (0-(-5.29)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-12.78-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -12.78 + (((tickAnim - 8) / 10) * (-14.69915-(-12.78)));
            yy = 0 + (((tickAnim - 8) / 10) * (-0.5712-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (-2.17632-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -14.69915 + (((tickAnim - 18) / 5) * (13.5-(-14.69915)));
            yy = -0.5712 + (((tickAnim - 18) / 5) * (0-(-0.5712)));
            zz = -2.17632 + (((tickAnim - 18) / 5) * (0-(-2.17632)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 13.5 + (((tickAnim - 23) / 8) * (-7.7-(13.5)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -7.7 + (((tickAnim - 31) / 3) * (0-(-7.7)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-13-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (9.76595-(0)));
            yy = -13 + (((tickAnim - 5) / 4) * (-26.24982-(-13)));
            zz = 0 + (((tickAnim - 5) / 4) * (3.05461-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 9.76595 + (((tickAnim - 9) / 9) * (20.8604-(9.76595)));
            yy = -26.24982 + (((tickAnim - 9) / 9) * (36.22306-(-26.24982)));
            zz = 3.05461 + (((tickAnim - 9) / 9) * (0.65246-(3.05461)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 20.8604 + (((tickAnim - 18) / 5) * (9.63424-(20.8604)));
            yy = 36.22306 + (((tickAnim - 18) / 5) * (26.39489-(36.22306)));
            zz = 0.65246 + (((tickAnim - 18) / 5) * (-11.55234-(0.65246)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = 9.63424 + (((tickAnim - 23) / 13) * (0-(9.63424)));
            yy = 26.39489 + (((tickAnim - 23) / 13) * (0-(26.39489)));
            zz = -11.55234 + (((tickAnim - 23) / 13) * (0-(-11.55234)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 8 + (((tickAnim - 13) / 5) * (25-(8)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 25 + (((tickAnim - 18) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 22) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -24 + (((tickAnim - 0) / 13) * (-5.13425-(-24)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.48208-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-2.19778-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -5.13425 + (((tickAnim - 13) / 5) * (0-(-5.13425)));
            yy = 0.48208 + (((tickAnim - 13) / 5) * (0-(0.48208)));
            zz = -2.19778 + (((tickAnim - 13) / 5) * (0-(-2.19778)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 18) / 16) * (-24-(0)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.425 + (((tickAnim - 0) / 4) * (1.005-(0.425)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 1.005 + (((tickAnim - 4) / 3) * (1.73-(1.005)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.73 + (((tickAnim - 7) / 1) * (2.065-(1.73)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 2.065 + (((tickAnim - 8) / 0) * (2.085-(2.065)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 2.085 + (((tickAnim - 8) / 1) * (1.96-(2.085)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.96 + (((tickAnim - 9) / 4) * (0.95-(1.96)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.95 + (((tickAnim - 13) / 5) * (-1.475-(0.95)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            yy = -1.475 + (((tickAnim - 18) / 16) * (0.425-(-1.475)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -1.75 + (((tickAnim - 0) / 18) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (-40-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = -40 + (((tickAnim - 25) / 9) * (-1.75-(-40)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 34) {
            xx = -0.15 + (((tickAnim - 0) / 34) * (-0.15-(-0.15)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTuojiangosaurus entity = (EntityPrehistoricFloraTuojiangosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -11.5 + (((tickAnim - 19) / 12) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -11.5 + (((tickAnim - 31) / 19) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-2.125-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-0.8-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = -2.125 + (((tickAnim - 19) / 12) * (-2.125-(-2.125)));
            zz = -0.8 + (((tickAnim - 19) / 12) * (-0.8-(-0.8)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = -2.125 + (((tickAnim - 31) / 19) * (0-(-2.125)));
            zz = -0.8 + (((tickAnim - 31) / 19) * (0-(-0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));








        if (tickAnim >= 19 && tickAnim < 31) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-170))*-1 + (((tickAnim - 19) / 12) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-170))*-1-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-170))*-1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-170))*2.5 + (((tickAnim - 19) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-170))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-170))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-170))*-3 + (((tickAnim - 19) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-170))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-170))*-3)));
        }





        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (5.25-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*2.5 + (((tickAnim - 0) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*2.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*-3 + (((tickAnim - 0) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*-3)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 5.25 + (((tickAnim - 19) / 12) * (5.25-(5.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*2.5 + (((tickAnim - 19) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*-3 + (((tickAnim - 19) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*-3)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 31) / 19) * (0-(5.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*2.5 + (((tickAnim - 31) / 19) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*-3 + (((tickAnim - 31) / 19) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (13-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*3 + (((tickAnim - 0) / 19) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*-5 + (((tickAnim - 0) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*-5)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 13 + (((tickAnim - 19) / 12) * (13-(13)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*3 + (((tickAnim - 19) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*-5 + (((tickAnim - 19) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*-5)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 31) / 19) * (0-(13)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*3 + (((tickAnim - 31) / 19) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*-5 + (((tickAnim - 31) / 19) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 8.75 + (((tickAnim - 19) / 12) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 31) / 19) * (0-(8.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 5 + (((tickAnim - 19) / 12) * (5-(5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 31) / 19) * (0-(5)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-6-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = -6 + (((tickAnim - 16) / 11) * (-12-(-6)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = -12 + (((tickAnim - 27) / 8) * (-13.75-(-12)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -13.75 + (((tickAnim - 35) / 15) * (0-(-13.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-7.25-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = -7.25 + (((tickAnim - 16) / 11) * (-13.5-(-7.25)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = -13.5 + (((tickAnim - 27) / 8) * (-19.5-(-13.5)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -19.5 + (((tickAnim - 35) / 15) * (0-(-19.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = -5 + (((tickAnim - 16) / 11) * (-14-(-5)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = -14 + (((tickAnim - 27) / 8) * (-19.75-(-14)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -19.75 + (((tickAnim - 35) / 15) * (0-(-19.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = -7.5 + (((tickAnim - 16) / 11) * (-12.25-(-7.5)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = -12.25 + (((tickAnim - 27) / 8) * (-12.25-(-12.25)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -12.25 + (((tickAnim - 35) / 15) * (0-(-12.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 17 + (((tickAnim - 19) / 12) * (17-(17)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 31) / 19) * (0-(17)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 21.75 + (((tickAnim - 19) / 12) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 21.75 + (((tickAnim - 31) / 19) * (0-(21.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -26.25 + (((tickAnim - 19) / 12) * (-26.25-(-26.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -26.25 + (((tickAnim - 31) / 19) * (0-(-26.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 17 + (((tickAnim - 19) / 12) * (17-(17)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 31) / 19) * (0-(17)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 21.75 + (((tickAnim - 19) / 12) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 21.75 + (((tickAnim - 31) / 19) * (0-(21.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -26.25 + (((tickAnim - 19) / 12) * (-26.25-(-26.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -26.25 + (((tickAnim - 31) / 19) * (0-(-26.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (13-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*1 + (((tickAnim - 0) / 19) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*-1 + (((tickAnim - 0) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*-1)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 13 + (((tickAnim - 19) / 12) * (13-(13)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*1 + (((tickAnim - 19) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*-1 + (((tickAnim - 19) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*-1)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 31) / 19) * (0-(13)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*1 + (((tickAnim - 31) / 19) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*-1 + (((tickAnim - 31) / 19) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(0), frontleftleg2.rotateAngleY + (float) Math.toRadians(0), frontleftleg2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -4.25 + (((tickAnim - 19) / 12) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -4.25 + (((tickAnim - 31) / 19) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(0), frontrightleg2.rotateAngleY + (float) Math.toRadians(0), frontrightleg2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -4.25 + (((tickAnim - 19) / 12) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -4.25 + (((tickAnim - 31) / 19) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 19 && tickAnim < 31) {
            xx = 8.25 + (((tickAnim - 19) / 12) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTuojiangosaurus entity = (EntityPrehistoricFloraTuojiangosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));

        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+190))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+220))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+220))*-5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0), upperbody.rotateAngleY + (float) Math.toRadians(0), upperbody.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0.30588-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-8.65742-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-2.02113-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0.30588 + (((tickAnim - 16) / 17) * (0.6592-(0.30588)));
            yy = -8.65742 + (((tickAnim - 16) / 17) * (-10.03833-(-8.65742)));
            zz = -2.02113 + (((tickAnim - 16) / 17) * (-4.37723-(-2.02113)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0.6592 + (((tickAnim - 33) / 17) * (0-(0.6592)));
            yy = -10.03833 + (((tickAnim - 33) / 17) * (0-(-10.03833)));
            zz = -4.37723 + (((tickAnim - 33) / 17) * (0-(-4.37723)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-23-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = -23 + (((tickAnim - 16) / 17) * (-23-(-23)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -23 + (((tickAnim - 33) / 17) * (0-(-23)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-28-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = -28 + (((tickAnim - 16) / 17) * (-28-(-28)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -28 + (((tickAnim - 33) / 17) * (0-(-28)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-2-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = -2 + (((tickAnim - 16) / 17) * (-2-(-2)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -2 + (((tickAnim - 33) / 17) * (0-(-2)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 18.5 + (((tickAnim - 14) / 13) * (0-(18.5)));
            yy = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 13) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 27) / 11) * (18.5-(0)));
            yy = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 11) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 18.5 + (((tickAnim - 38) / 12) * (0-(18.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (1.425-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 1.425 + (((tickAnim - 20) / 7) * (0-(1.425)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (1.425-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.425 + (((tickAnim - 43) / 7) * (0-(1.425)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 24 + (((tickAnim - 20) / 7) * (0-(24)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 27) / 16) * (24-(0)));
            yy = 0 + (((tickAnim - 27) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 16) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 43) / 7) * (0-(24)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 8) / 19) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 19) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 8) / 19) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -0.25 + (((tickAnim - 33) / 17) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -9.5 + (((tickAnim - 8) / 12) * (0.25-(-9.5)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0.25 + (((tickAnim - 20) / 7) * (0-(0.25)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -9.5 + (((tickAnim - 33) / 10) * (0.25-(-9.5)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0.25 + (((tickAnim - 43) / 7) * (0-(0.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0.55-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0.55 + (((tickAnim - 9) / 11) * (15.75-(0.55)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 15.75 + (((tickAnim - 20) / 3) * (-11.62-(15.75)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -11.62 + (((tickAnim - 23) / 2) * (-14.81-(-11.62)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -14.81 + (((tickAnim - 25) / 2) * (0-(-14.81)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0.55-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0.55 + (((tickAnim - 33) / 10) * (15.75-(0.55)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 15.75 + (((tickAnim - 43) / 4) * (-11.62-(15.75)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = -11.62 + (((tickAnim - 47) / 1) * (-14.81-(-11.62)));
            yy = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 1) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -14.81 + (((tickAnim - 48) / 2) * (0-(-14.81)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(0), backrightleg.rotateAngleY + (float) Math.toRadians(0), backrightleg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(0), backrightleg2.rotateAngleY + (float) Math.toRadians(0), backrightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(0), backrightleg3.rotateAngleY + (float) Math.toRadians(0), backrightleg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(0), backrightleg4.rotateAngleY + (float) Math.toRadians(0), backrightleg4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*1), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(0), frontleftleg.rotateAngleY + (float) Math.toRadians(0), frontleftleg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(0), frontleftleg2.rotateAngleY + (float) Math.toRadians(0), frontleftleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(0), frontleftleg3.rotateAngleY + (float) Math.toRadians(0), frontleftleg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(0), frontrightleg.rotateAngleY + (float) Math.toRadians(0), frontrightleg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(0), frontrightleg2.rotateAngleY + (float) Math.toRadians(0), frontrightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(0), frontrightleg3.rotateAngleY + (float) Math.toRadians(0), frontrightleg3.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTuojiangosaurus entity = (EntityPrehistoricFloraTuojiangosaurus) entitylivingbaseIn;

        int animCycle = 44;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = -4 + (((tickAnim - 9) / 16) * (0-(-4)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 25) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 11 + (((tickAnim - 20) / 24) * (0-(11)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -9 + (((tickAnim - 9) / 11) * (-12-(-9)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = -12 + (((tickAnim - 20) / 24) * (0-(-12)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 20) / 10) * (-6.52-(-6)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 44) {
            xx = -6.52 + (((tickAnim - 30) / 14) * (0-(-6.52)));
            yy = 0 + (((tickAnim - 30) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 7.5 + (((tickAnim - 9) / 8) * (25.5-(7.5)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 25.5 + (((tickAnim - 17) / 17) * (25.5-(25.5)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 25.5 + (((tickAnim - 34) / 5) * (0-(25.5)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 17) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 22) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 27) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 32) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 39) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 39) / 2) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 41) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);

    }
    
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
         EntityPrehistoricFloraTuojiangosaurus entity = (EntityPrehistoricFloraTuojiangosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+190))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+220))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+220))*-5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-2.25+Math.sin((Math.PI/180)*(135/0.75-10))*2), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*-1), body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+180))*1));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-360))*1), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+250))*2), upperbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-120))*1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+55))*1.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+10))*1), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*1), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*1));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-195))*1), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-150))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-55))*1), body.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 3) * (-0.5-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 3) / 2) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 8) / 2) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 23) / 2) * (-0.5-(-0.1)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 25) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 30) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -8 + (((tickAnim - 0) / 18) * (18-(-8)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 18 + (((tickAnim - 18) / 10) * (3-(18)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 3 + (((tickAnim - 28) / 12) * (-8-(3)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.04-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.04 + (((tickAnim - 2) / 2) * (0.49-(0.04)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.49 + (((tickAnim - 4) / 1) * (0.04-(0.49)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.04 + (((tickAnim - 5) / 3) * (0.69-(0.04)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.69 + (((tickAnim - 8) / 2) * (0.54-(0.69)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.54 + (((tickAnim - 10) / 3) * (0.79-(0.54)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.79 + (((tickAnim - 13) / 5) * (0.7-(0.79)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0.7 + (((tickAnim - 18) / 10) * (2.7-(0.7)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 2.7 + (((tickAnim - 28) / 12) * (0-(2.7)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 18) / 10) * (13-(1)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 13 + (((tickAnim - 28) / 12) * (0-(13)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0.375 + (((tickAnim - 0) / 18) * (0-(0.375)));
            yy = -0.85 + (((tickAnim - 0) / 18) * (-1.2-(-0.85)));
            zz = 0.1 + (((tickAnim - 0) / 18) * (0-(0.1)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0.075-(0)));
            yy = -1.2 + (((tickAnim - 18) / 10) * (-0.05-(-1.2)));
            zz = 0 + (((tickAnim - 18) / 10) * (0.15-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0.075 + (((tickAnim - 28) / 12) * (0.375-(0.075)));
            yy = -0.05 + (((tickAnim - 28) / 12) * (-0.85-(-0.05)));
            zz = 0.15 + (((tickAnim - 28) / 12) * (0.1-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 6 + (((tickAnim - 0) / 23) * (-7-(6)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -7 + (((tickAnim - 23) / 9) * (-17-(-7)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -17 + (((tickAnim - 32) / 8) * (6-(-17)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 2 + (((tickAnim - 0) / 23) * (0-(2)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (1.7-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 1.7 + (((tickAnim - 32) / 8) * (2-(1.7)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 0) / 18) * (-12-(1)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -12 + (((tickAnim - 18) / 10) * (17.91-(-12)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 17.91 + (((tickAnim - 28) / 9) * (-13.18-(17.91)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -13.18 + (((tickAnim - 37) / 3) * (1-(-13.18)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 5) * (-0.47-(-1)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            yy = -0.47 + (((tickAnim - 5) / 13) * (-0.9-(-0.47)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = -0.9 + (((tickAnim - 18) / 22) * (-1-(-0.9)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 18 + (((tickAnim - 0) / 8) * (3-(18)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 8) / 10) * (-7-(3)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -7 + (((tickAnim - 18) / 22) * (18-(-7)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.7 + (((tickAnim - 0) / 8) * (2.7-(0.7)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 2.7 + (((tickAnim - 8) / 10) * (0-(2.7)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (-0.26-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = -0.26 + (((tickAnim - 19) / 4) * (-0.01-(-0.26)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = -0.01 + (((tickAnim - 23) / 1) * (-0.37-(-0.01)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.37 + (((tickAnim - 24) / 3) * (-0.12-(-0.37)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = -0.12 + (((tickAnim - 27) / 1) * (-0.48-(-0.12)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = -0.48 + (((tickAnim - 28) / 3) * (-0.23-(-0.48)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = -0.23 + (((tickAnim - 31) / 2) * (-0.6-(-0.23)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -0.6 + (((tickAnim - 33) / 7) * (0.7-(-0.6)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 0) / 6) * (13-(1)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 13 + (((tickAnim - 6) / 9) * (1-(13)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 15) / 25) * (1-(1)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.5-(0)));
            yy = -0.9 + (((tickAnim - 0) / 6) * (-0.9-(-0.9)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -0.5 + (((tickAnim - 6) / 9) * (-0.2-(-0.5)));
            yy = -0.9 + (((tickAnim - 6) / 9) * (-1.475-(-0.9)));
            zz = 0 + (((tickAnim - 6) / 9) * (0.1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -0.2 + (((tickAnim - 15) / 25) * (0-(-0.2)));
            yy = -1.475 + (((tickAnim - 15) / 25) * (-0.9-(-1.475)));
            zz = 0.1 + (((tickAnim - 15) / 25) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -7 + (((tickAnim - 0) / 8) * (-17-(-7)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -17 + (((tickAnim - 8) / 10) * (6-(-17)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 6 + (((tickAnim - 18) / 22) * (-7-(6)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (2.475-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 2.475 + (((tickAnim - 18) / 22) * (0-(2.475)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -12 + (((tickAnim - 0) / 8) * (17.91-(-12)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 17.91 + (((tickAnim - 8) / 7) * (-9.75-(17.91)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -9.75 + (((tickAnim - 15) / 3) * (1-(-9.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 18) / 22) * (-12-(1)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 18) * (-0.8-(-0.9)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = -0.8 + (((tickAnim - 18) / 3) * (-0.51-(-0.8)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = -0.51 + (((tickAnim - 21) / 2) * (-0.11-(-0.51)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = -0.11 + (((tickAnim - 23) / 3) * (0.49-(-0.11)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0.49 + (((tickAnim - 26) / 2) * (0.08-(0.49)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0.08 + (((tickAnim - 28) / 3) * (0.72-(0.08)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0.72 + (((tickAnim - 31) / 2) * (0.36-(0.72)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = 0.36 + (((tickAnim - 33) / 3) * (0.04-(0.36)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 0.04 + (((tickAnim - 36) / 4) * (-0.9-(0.04)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(xx);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(yy);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+250))*1), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+250))*-1));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-65))), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 4.75 + (((tickAnim - 0) / 23) * (-25.5-(4.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -25.5 + (((tickAnim - 23) / 17) * (4.75-(-25.5)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.475 + (((tickAnim - 0) / 11) * (0-(-0.475)));
            zz = 0.225 + (((tickAnim - 0) / 11) * (0-(0.225)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 3) * (-0.485-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0.03-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = -0.485 + (((tickAnim - 26) / 14) * (-0.475-(-0.485)));
            zz = 0.03 + (((tickAnim - 26) / 14) * (0.225-(0.03)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 11 + (((tickAnim - 0) / 11) * (3-(11)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 11) / 7) * (-20-(3)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -20 + (((tickAnim - 18) / 5) * (9.02-(-20)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 9.02 + (((tickAnim - 23) / 3) * (1.81-(9.02)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 1.81 + (((tickAnim - 26) / 2) * (6.18-(1.81)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 6.18 + (((tickAnim - 28) / 12) * (11-(6.18)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.15-(0)));
            zz = -0.325 + (((tickAnim - 0) / 18) * (-0.3-(-0.325)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -0.275 + (((tickAnim - 18) / 3) * (-0.25-(-0.275)));
            yy = 1.15 + (((tickAnim - 18) / 3) * (0.665-(1.15)));
            zz = -0.3 + (((tickAnim - 18) / 3) * (-0.4-(-0.3)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -0.25 + (((tickAnim - 21) / 2) * (-0.25-(-0.25)));
            yy = 0.665 + (((tickAnim - 21) / 2) * (0.665-(0.665)));
            zz = -0.4 + (((tickAnim - 21) / 2) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = -0.25 + (((tickAnim - 23) / 0) * (-0.25-(-0.25)));
            yy = 0.665 + (((tickAnim - 23) / 0) * (0.665-(0.665)));
            zz = -0.4 + (((tickAnim - 23) / 0) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -0.25 + (((tickAnim - 23) / 4) * (-0.25-(-0.25)));
            yy = 0.665 + (((tickAnim - 23) / 4) * (0.79-(0.665)));
            zz = -0.4 + (((tickAnim - 23) / 4) * (0-(-0.4)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -0.25 + (((tickAnim - 27) / 1) * (-0.25-(-0.25)));
            yy = 0.79 + (((tickAnim - 27) / 1) * (0.79-(0.79)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -0.25 + (((tickAnim - 28) / 3) * (-0.25-(-0.25)));
            yy = 0.79 + (((tickAnim - 28) / 3) * (0.615-(0.79)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -0.25 + (((tickAnim - 31) / 1) * (-0.25-(-0.25)));
            yy = 0.615 + (((tickAnim - 31) / 1) * (0.64-(0.615)));
            zz = 0 + (((tickAnim - 31) / 1) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -0.25 + (((tickAnim - 32) / 8) * (0-(-0.25)));
            yy = 0.64 + (((tickAnim - 32) / 8) * (0-(0.64)));
            zz = 0 + (((tickAnim - 32) / 8) * (-0.325-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -14.5 + (((tickAnim - 0) / 10) * (11.74064-(-14.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.30145-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.42565-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 11.74064 + (((tickAnim - 10) / 8) * (53.31618-(11.74064)));
            yy = 0.30145 + (((tickAnim - 10) / 8) * (0.55266-(0.30145)));
            zz = -0.42565 + (((tickAnim - 10) / 8) * (-0.78037-(-0.42565)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 53.31618 + (((tickAnim - 18) / 5) * (1.22898-(53.31618)));
            yy = 0.55266 + (((tickAnim - 18) / 5) * (0.52216-(0.55266)));
            zz = -0.78037 + (((tickAnim - 18) / 5) * (-0.7366-(-0.78037)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 1.22898 + (((tickAnim - 23) / 2) * (22.69883-(1.22898)));
            yy = 0.52216 + (((tickAnim - 23) / 2) * (-0.27122-(0.52216)));
            zz = -0.7366 + (((tickAnim - 23) / 2) * (0.40184-(-0.7366)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 22.69883 + (((tickAnim - 25) / 3) * (14.459-(22.69883)));
            yy = -0.27122 + (((tickAnim - 25) / 3) * (-0.20687-(-0.27122)));
            zz = 0.40184 + (((tickAnim - 25) / 3) * (0.45687-(0.40184)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 14.459 + (((tickAnim - 28) / 4) * (4.59-(14.459)));
            yy = -0.20687 + (((tickAnim - 28) / 4) * (0-(-0.20687)));
            zz = 0.45687 + (((tickAnim - 28) / 4) * (0-(0.45687)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 4.59 + (((tickAnim - 32) / 8) * (-14.5-(4.59)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 18) * (0-(0.1)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0.51-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0.51 + (((tickAnim - 25) / 3) * (0.475-(0.51)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 0.475 + (((tickAnim - 28) / 12) * (0.1-(0.475)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 18.02 + (((tickAnim - 0) / 6) * (9.02-(18.02)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 9.02 + (((tickAnim - 6) / 2) * (4.81-(9.02)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 4.81 + (((tickAnim - 8) / 3) * (6.18-(4.81)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 6.18 + (((tickAnim - 11) / 9) * (11-(6.18)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 11 + (((tickAnim - 20) / 11) * (-20-(11)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -20 + (((tickAnim - 31) / 9) * (18.02-(-20)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.075-(0)));
            yy = 0.665 + (((tickAnim - 0) / 3) * (1.015-(0.665)));
            zz = -0.4 + (((tickAnim - 0) / 3) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.075 + (((tickAnim - 3) / 2) * (-0.05-(-0.075)));
            yy = 1.015 + (((tickAnim - 3) / 2) * (0.74-(1.015)));
            zz = -0.4 + (((tickAnim - 3) / 2) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -0.05 + (((tickAnim - 5) / 1) * (-0.05-(-0.05)));
            yy = 0.74 + (((tickAnim - 5) / 1) * (0.815-(0.74)));
            zz = -0.4 + (((tickAnim - 5) / 1) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.05 + (((tickAnim - 6) / 4) * (0-(-0.05)));
            yy = 0.815 + (((tickAnim - 6) / 4) * (0.59-(0.815)));
            zz = -0.4 + (((tickAnim - 6) / 4) * (0-(-0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.59 + (((tickAnim - 10) / 1) * (0.59-(0.59)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.59 + (((tickAnim - 11) / 2) * (0.465-(0.59)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.465 + (((tickAnim - 13) / 1) * (0.465-(0.465)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.465 + (((tickAnim - 14) / 6) * (-0.2-(0.465)));
            zz = 0 + (((tickAnim - 14) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0.14-(0)));
            yy = -0.2 + (((tickAnim - 20) / 6) * (1.055-(-0.2)));
            zz = -0.4 + (((tickAnim - 20) / 6) * (-0.065-(-0.4)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0.14 + (((tickAnim - 26) / 5) * (0.25-(0.14)));
            yy = 1.055 + (((tickAnim - 26) / 5) * (1.15-(1.055)));
            zz = -0.065 + (((tickAnim - 26) / 5) * (-0.3-(-0.065)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0.25 + (((tickAnim - 31) / 9) * (0-(0.25)));
            yy = 1.15 + (((tickAnim - 31) / 9) * (0.665-(1.15)));
            zz = -0.3 + (((tickAnim - 31) / 9) * (-0.4-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 8.05365 + (((tickAnim - 0) / 2) * (4.00332-(8.05365)));
            yy = 0.13578 + (((tickAnim - 0) / 2) * (0.12344-(0.13578)));
            zz = -0.78469 + (((tickAnim - 0) / 2) * (-0.71335-(-0.78469)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 4.00332 + (((tickAnim - 2) / 2) * (10-(4.00332)));
            yy = 0.12344 + (((tickAnim - 2) / 2) * (0-(0.12344)));
            zz = -0.71335 + (((tickAnim - 2) / 2) * (0-(-0.71335)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 4) / 4) * (11.55-(10)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 11.55 + (((tickAnim - 8) / 2) * (5.83-(11.55)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.83 + (((tickAnim - 10) / 10) * (-14.5-(5.83)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = -14.5 + (((tickAnim - 20) / 11) * (44.56618-(-14.5)));
            yy = 0 + (((tickAnim - 20) / 11) * (0.55266-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (-0.78037-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 44.56618 + (((tickAnim - 31) / 5) * (-10.82422-(44.56618)));
            yy = 0.55266 + (((tickAnim - 31) / 5) * (0.36025-(0.55266)));
            zz = -0.78037 + (((tickAnim - 31) / 5) * (-0.78236-(-0.78037)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -10.82422 + (((tickAnim - 36) / 4) * (8.05365-(-10.82422)));
            yy = 0.36025 + (((tickAnim - 36) / 4) * (0.13578-(0.36025)));
            zz = -0.78236 + (((tickAnim - 36) / 4) * (-0.78469-(-0.78236)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0.235 + (((tickAnim - 0) / 20) * (0.1-(0.235)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            yy = 0.1 + (((tickAnim - 20) / 11) * (0-(0.1)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 9) * (0.235-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+50))*-1));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 1) * (-0.25-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 1) / 18) * (0-(0)));
            yy = -0.25 + (((tickAnim - 1) / 18) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 1) / 18) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -0.45 + (((tickAnim - 22) / 1) * (0-(-0.45)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 23) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 13) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 3) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 36) / 3) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 39) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 39) / 1) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 39) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -25.5 + (((tickAnim - 0) / 20) * (4.75-(-25.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 4.75 + (((tickAnim - 20) / 20) * (-25.5-(4.75)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = -0.475 + (((tickAnim - 20) / 20) * (0-(-0.475)));
            zz = 0.225 + (((tickAnim - 20) / 20) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTuojiangosaurus entity = (EntityPrehistoricFloraTuojiangosaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0.5), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-250))*1), body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+250))*2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 2) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 3) / 2) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 11) / 2) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 14) / 2) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+250))*1), body.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.275 + (((tickAnim - 2) / 1) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 5) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 15) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 18) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);

        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-850))*8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*7));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-360))*3), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+360))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*2), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*5));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 15.75 + (((tickAnim - 0) / 1) * (18.75-(15.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 18.75 + (((tickAnim - 1) / 3) * (3-(18.75)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 3 + (((tickAnim - 4) / 5) * (-6.5-(3)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -6.5 + (((tickAnim - 9) / 2) * (-6.25-(-6.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -6.25 + (((tickAnim - 11) / 9) * (15.75-(-6.25)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 13) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 18) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.5 + (((tickAnim - 0) / 1) * (-3-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -3 + (((tickAnim - 1) / 3) * (27.75-(-3)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 27.75 + (((tickAnim - 4) / 5) * (-10.25-(27.75)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -10.25 + (((tickAnim - 9) / 2) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -1.25 + (((tickAnim - 0) / 1) * (-1.4-(-1.25)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            yy = -1.4 + (((tickAnim - 1) / 3) * (0.5-(-1.4)));
            zz = 0 + (((tickAnim - 1) / 3) * (0.125-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 4) / 3) * (2-(0.5)));
            zz = 0.125 + (((tickAnim - 4) / 3) * (0.125-(0.125)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 2 + (((tickAnim - 7) / 2) * (0.7-(2)));
            zz = 0.125 + (((tickAnim - 7) / 2) * (0-(0.125)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.7 + (((tickAnim - 9) / 2) * (0.25-(0.7)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 11) / 4) * (0.005-(0.25)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.005 + (((tickAnim - 15) / 3) * (-0.16-(0.005)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.16 + (((tickAnim - 18) / 2) * (-1.25-(-0.16)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -3.75 + (((tickAnim - 0) / 1) * (-3.77-(-3.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -3.77 + (((tickAnim - 1) / 3) * (3.5-(-3.77)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 3.5 + (((tickAnim - 4) / 3) * (2.59-(3.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 2.59 + (((tickAnim - 7) / 2) * (7.5-(2.59)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 7.5 + (((tickAnim - 9) / 2) * (1.25-(7.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 1.25 + (((tickAnim - 11) / 4) * (-1.75-(1.25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.75 + (((tickAnim - 15) / 5) * (-3.75-(-1.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0.475 + (((tickAnim - 0) / 11) * (0-(0.475)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0.23-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.23 + (((tickAnim - 14) / 6) * (0.475-(0.23)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -11.5 + (((tickAnim - 0) / 1) * (-11.75-(-11.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -11.75 + (((tickAnim - 1) / 2) * (-8.37-(-11.75)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -8.37 + (((tickAnim - 3) / 0) * (-1.5-(-8.37)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -1.5 + (((tickAnim - 3) / 1) * (11.25-(-1.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 11.25 + (((tickAnim - 4) / 2) * (11.9-(11.25)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 11.9 + (((tickAnim - 6) / 2) * (9.41-(11.9)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.41 + (((tickAnim - 8) / 1) * (-4.5-(9.41)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -4.5 + (((tickAnim - 9) / 2) * (6.08-(-4.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 6.08 + (((tickAnim - 11) / 5) * (-5.15-(6.08)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -5.15 + (((tickAnim - 16) / 4) * (-11.5-(-5.15)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -7.25 + (((tickAnim - 0) / 9) * (18.75-(-7.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 18.75 + (((tickAnim - 9) / 11) * (-7.25-(18.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 2) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 7) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -3 + (((tickAnim - 9) / 4) * (16.37-(-3)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 16.37 + (((tickAnim - 13) / 5) * (-6.45-(16.37)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -6.45 + (((tickAnim - 18) / 2) * (0-(-6.45)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.15 + (((tickAnim - 0) / 2) * (-0.13-(-0.15)));
            yy = -0.35 + (((tickAnim - 0) / 2) * (-0.165-(-0.35)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.13 + (((tickAnim - 2) / 1) * (-0.11-(-0.13)));
            yy = -0.165 + (((tickAnim - 2) / 1) * (-0.125-(-0.165)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.11 + (((tickAnim - 3) / 1) * (-0.07-(-0.11)));
            yy = -0.125 + (((tickAnim - 3) / 1) * (-0.12-(-0.125)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -0.07 + (((tickAnim - 4) / 2) * (-0.06-(-0.07)));
            yy = -0.12 + (((tickAnim - 4) / 2) * (-0.105-(-0.12)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.06 + (((tickAnim - 6) / 2) * (-0.05-(-0.06)));
            yy = -0.105 + (((tickAnim - 6) / 2) * (-0.195-(-0.105)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -0.05 + (((tickAnim - 8) / 0) * (-0.02-(-0.05)));
            yy = -0.195 + (((tickAnim - 8) / 0) * (-0.575-(-0.195)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.02 + (((tickAnim - 8) / 1) * (0-(-0.02)));
            yy = -0.575 + (((tickAnim - 8) / 1) * (-0.95-(-0.575)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (-0.06-(0)));
            yy = -0.95 + (((tickAnim - 9) / 4) * (0.87-(-0.95)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.06 + (((tickAnim - 13) / 3) * (-0.1-(-0.06)));
            yy = 0.87 + (((tickAnim - 13) / 3) * (1.215-(0.87)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.1 + (((tickAnim - 16) / 4) * (-0.15-(-0.1)));
            yy = 1.215 + (((tickAnim - 16) / 4) * (-0.35-(1.215)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 4.5 + (((tickAnim - 0) / 9) * (-3.77-(4.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -3.77 + (((tickAnim - 9) / 4) * (6.15-(-3.77)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 6.15 + (((tickAnim - 13) / 5) * (0.13-(6.15)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.13 + (((tickAnim - 18) / 2) * (4.5-(0.13)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 3.25 + (((tickAnim - 0) / 9) * (-11.75-(3.25)));
            yy = 2 + (((tickAnim - 0) / 9) * (0-(2)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -11.75 + (((tickAnim - 9) / 4) * (6.22114-(-11.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.89807-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 6.22114 + (((tickAnim - 13) / 2) * (7.75487-(6.22114)));
            yy = 0.89807 + (((tickAnim - 13) / 2) * (1.99805-(0.89807)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 7.75487 + (((tickAnim - 15) / 3) * (-9.44081-(7.75487)));
            yy = 1.99805 + (((tickAnim - 15) / 3) * (1.99883-(1.99805)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -9.44081 + (((tickAnim - 18) / 2) * (3.25-(-9.44081)));
            yy = 1.99883 + (((tickAnim - 18) / 2) * (2-(1.99883)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 3) * (0.49-(0.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.49 + (((tickAnim - 3) / 2) * (0.485-(0.49)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.485 + (((tickAnim - 5) / 2) * (-0.055-(0.485)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.055 + (((tickAnim - 7) / 1) * (0.025-(-0.055)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.025 + (((tickAnim - 8) / 1) * (0.22-(0.025)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.22 + (((tickAnim - 9) / 4) * (0.71-(0.22)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.71 + (((tickAnim - 13) / 2) * (0.905-(0.71)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.905 + (((tickAnim - 15) / 5) * (0.5-(0.905)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(xx);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(yy);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*10), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*9));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.75 + (((tickAnim - 0) / 5) * (8.5-(2.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 8.5 + (((tickAnim - 5) / 5) * (2.75-(8.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 2.75 + (((tickAnim - 10) / 5) * (8.5-(2.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 8.5 + (((tickAnim - 15) / 5) * (2.75-(8.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -21.45582 + (((tickAnim - 0) / 9) * (17.25-(-21.45582)));
            yy = 0.43416 + (((tickAnim - 0) / 9) * (0-(0.43416)));
            zz = 1.96229 + (((tickAnim - 0) / 9) * (0-(1.96229)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 17.25 + (((tickAnim - 9) / 11) * (-21.45582-(17.25)));
            yy = 0 + (((tickAnim - 9) / 11) * (0.43416-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (1.96229-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1.2-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -1.2 + (((tickAnim - 9) / 11) * (0-(-1.2)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19.91915 + (((tickAnim - 0) / 3) * (8.6241-(19.91915)));
            yy = -9.26608 + (((tickAnim - 0) / 3) * (-4.61263-(-9.26608)));
            zz = 5.4736 + (((tickAnim - 0) / 3) * (6.97437-(5.4736)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 8.6241 + (((tickAnim - 3) / 6) * (-16-(8.6241)));
            yy = -4.61263 + (((tickAnim - 3) / 6) * (0-(-4.61263)));
            zz = 6.97437 + (((tickAnim - 3) / 6) * (0-(6.97437)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -16 + (((tickAnim - 9) / 6) * (34.75-(-16)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 34.75 + (((tickAnim - 15) / 3) * (8.30018-(34.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.12219-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (-0.24744-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 8.30018 + (((tickAnim - 18) / 2) * (19.91915-(8.30018)));
            yy = 0.12219 + (((tickAnim - 18) / 2) * (-9.26608-(0.12219)));
            zz = -0.24744 + (((tickAnim - 18) / 2) * (5.4736-(-0.24744)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 3) * (0.335-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.335 + (((tickAnim - 3) / 3) * (0.755-(0.335)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0.755 + (((tickAnim - 6) / 3) * (0.225-(0.755)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0.15-(0)));
            yy = 0.225 + (((tickAnim - 9) / 6) * (0.35-(0.225)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.15 + (((tickAnim - 15) / 5) * (0-(0.15)));
            yy = 0.35 + (((tickAnim - 15) / 5) * (-0.2-(0.35)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17.25 + (((tickAnim - 0) / 4) * (6.70997-(17.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.43677-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-3.19184-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 6.70997 + (((tickAnim - 4) / 5) * (-21.45582-(6.70997)));
            yy = 1.43677 + (((tickAnim - 4) / 5) * (0.43416-(1.43677)));
            zz = -3.19184 + (((tickAnim - 4) / 5) * (1.96229-(-3.19184)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -21.45582 + (((tickAnim - 9) / 11) * (17.25-(-21.45582)));
            yy = 0.43416 + (((tickAnim - 9) / 11) * (0-(0.43416)));
            zz = 1.96229 + (((tickAnim - 9) / 11) * (0-(1.96229)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -1.2 + (((tickAnim - 0) / 4) * (0-(-1.2)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (-1.2-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -0.5 + (((tickAnim - 0) / 6) * (-38.75-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -38.75 + (((tickAnim - 6) / 3) * (1.09511-(-38.75)));
            yy = 0 + (((tickAnim - 6) / 3) * (-2.01529-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (-5.65384-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 1.09511 + (((tickAnim - 9) / 11) * (-0.5-(1.09511)));
            yy = -2.01529 + (((tickAnim - 9) / 11) * (0-(-2.01529)));
            zz = -5.65384 + (((tickAnim - 9) / 11) * (0-(-5.65384)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.25 + (((tickAnim - 0) / 6) * (0.375-(0.25)));
            yy = 0.3 + (((tickAnim - 0) / 6) * (0.35-(0.3)));
            zz = -0.675 + (((tickAnim - 0) / 6) * (0-(-0.675)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0.375 + (((tickAnim - 6) / 3) * (0.325-(0.375)));
            yy = 0.35 + (((tickAnim - 6) / 3) * (0.225-(0.35)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0.325 + (((tickAnim - 9) / 3) * (0.2-(0.325)));
            yy = 0.225 + (((tickAnim - 9) / 3) * (-0.065-(0.225)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0.2 + (((tickAnim - 12) / 3) * (0.15-(0.2)));
            yy = -0.065 + (((tickAnim - 12) / 3) * (-0.025-(-0.065)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.15 + (((tickAnim - 15) / 5) * (0.25-(0.15)));
            yy = -0.025 + (((tickAnim - 15) / 5) * (0.3-(-0.025)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.675-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -16 + (((tickAnim - 0) / 5) * (34.75-(-16)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 34.75 + (((tickAnim - 5) / 3) * (8.30018-(34.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.12219-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.24744-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 8.30018 + (((tickAnim - 8) / 1) * (23.15221-(8.30018)));
            yy = 0.12219 + (((tickAnim - 8) / 1) * (-4.07869-(0.12219)));
            zz = -0.24744 + (((tickAnim - 8) / 1) * (-2.49123-(-0.24744)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 23.15221 + (((tickAnim - 9) / 3) * (14.16408-(23.15221)));
            yy = -4.07869 + (((tickAnim - 9) / 3) * (-2.68297-(-4.07869)));
            zz = -2.49123 + (((tickAnim - 9) / 3) * (-1.82373-(-2.49123)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 14.16408 + (((tickAnim - 12) / 3) * (1.29845-(14.16408)));
            yy = -2.68297 + (((tickAnim - 12) / 3) * (-1.60978-(-2.68297)));
            zz = -1.82373 + (((tickAnim - 12) / 3) * (-1.09424-(-1.82373)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.29845 + (((tickAnim - 15) / 5) * (-16-(1.29845)));
            yy = -1.60978 + (((tickAnim - 15) / 5) * (0-(-1.60978)));
            zz = -1.09424 + (((tickAnim - 15) / 5) * (0-(-1.09424)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.15-(0)));
            yy = 0.225 + (((tickAnim - 0) / 5) * (0.35-(0.225)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0.15 + (((tickAnim - 5) / 4) * (0-(0.15)));
            yy = 0.35 + (((tickAnim - 5) / 4) * (0-(0.35)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0.46-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.46 + (((tickAnim - 12) / 3) * (0.8-(0.46)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 15) / 5) * (0.225-(0.8)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-360))*7), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+360))*2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.275 + (((tickAnim - 2) / 1) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 5) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 15) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 18) / 2) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 1.09511 + (((tickAnim - 0) / 9) * (-0.5-(1.09511)));
            yy = -2.01529 + (((tickAnim - 0) / 9) * (0-(-2.01529)));
            zz = -5.65384 + (((tickAnim - 0) / 9) * (0-(-5.65384)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -0.5 + (((tickAnim - 9) / 7) * (-38.75-(-0.5)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -38.75 + (((tickAnim - 16) / 4) * (1.09511-(-38.75)));
            yy = 0 + (((tickAnim - 16) / 4) * (-2.01529-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (-5.65384-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -0.025 + (((tickAnim - 0) / 9) * (-0.05-(-0.025)));
            yy = 0.5 + (((tickAnim - 0) / 9) * (0.3-(0.5)));
            zz = 0 + (((tickAnim - 0) / 9) * (-1.1-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -0.05 + (((tickAnim - 9) / 7) * (-0.475-(-0.05)));
            yy = 0.3 + (((tickAnim - 9) / 7) * (0.35-(0.3)));
            zz = -1.1 + (((tickAnim - 9) / 7) * (0-(-1.1)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.475 + (((tickAnim - 16) / 4) * (-0.025-(-0.475)));
            yy = 0.35 + (((tickAnim - 16) / 4) * (0.5-(0.35)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);

    }

   

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTuojiangosaurus e = (EntityPrehistoricFloraTuojiangosaurus) entity;
        animator.update(entity);


    }
}
