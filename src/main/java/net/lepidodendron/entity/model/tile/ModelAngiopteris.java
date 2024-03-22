package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelAngiopteris extends ModelBase {
    private final ModelRenderer leaf13;
    private final ModelRenderer bone97;
    private final ModelRenderer bone98;
    private final ModelRenderer bone99;
    private final ModelRenderer bone100;
    private final ModelRenderer bone101;
    private final ModelRenderer bone102;
    private final ModelRenderer bone103;
    private final ModelRenderer bone104;
    private final ModelRenderer cube_r1;
    private final ModelRenderer leaf12;
    private final ModelRenderer bone89;
    private final ModelRenderer bone90;
    private final ModelRenderer bone91;
    private final ModelRenderer bone92;
    private final ModelRenderer bone93;
    private final ModelRenderer bone94;
    private final ModelRenderer bone95;
    private final ModelRenderer bone96;
    private final ModelRenderer cube_r2;
    private final ModelRenderer leaf11;
    private final ModelRenderer bone81;
    private final ModelRenderer bone82;
    private final ModelRenderer bone83;
    private final ModelRenderer bone84;
    private final ModelRenderer bone85;
    private final ModelRenderer bone86;
    private final ModelRenderer bone87;
    private final ModelRenderer bone88;
    private final ModelRenderer cube_r3;
    private final ModelRenderer leaf10;
    private final ModelRenderer bone73;
    private final ModelRenderer bone74;
    private final ModelRenderer bone75;
    private final ModelRenderer bone76;
    private final ModelRenderer bone77;
    private final ModelRenderer bone78;
    private final ModelRenderer bone79;
    private final ModelRenderer bone80;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leaf9;
    private final ModelRenderer bone65;
    private final ModelRenderer bone66;
    private final ModelRenderer bone67;
    private final ModelRenderer bone68;
    private final ModelRenderer bone69;
    private final ModelRenderer bone70;
    private final ModelRenderer bone71;
    private final ModelRenderer bone72;
    private final ModelRenderer cube_r5;
    private final ModelRenderer leaf8;
    private final ModelRenderer bone57;
    private final ModelRenderer bone58;
    private final ModelRenderer bone59;
    private final ModelRenderer bone60;
    private final ModelRenderer bone61;
    private final ModelRenderer bone62;
    private final ModelRenderer bone63;
    private final ModelRenderer bone64;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leaf7;
    private final ModelRenderer bone49;
    private final ModelRenderer bone50;
    private final ModelRenderer bone51;
    private final ModelRenderer bone52;
    private final ModelRenderer bone53;
    private final ModelRenderer bone54;
    private final ModelRenderer bone55;
    private final ModelRenderer bone56;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leaf6;
    private final ModelRenderer bone41;
    private final ModelRenderer bone42;
    private final ModelRenderer bone43;
    private final ModelRenderer bone44;
    private final ModelRenderer bone45;
    private final ModelRenderer bone46;
    private final ModelRenderer bone47;
    private final ModelRenderer bone48;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leaf5;
    private final ModelRenderer bone33;
    private final ModelRenderer bone34;
    private final ModelRenderer bone35;
    private final ModelRenderer bone36;
    private final ModelRenderer bone37;
    private final ModelRenderer bone38;
    private final ModelRenderer bone39;
    private final ModelRenderer bone40;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leaf4;
    private final ModelRenderer bone25;
    private final ModelRenderer bone26;
    private final ModelRenderer bone27;
    private final ModelRenderer bone28;
    private final ModelRenderer bone29;
    private final ModelRenderer bone30;
    private final ModelRenderer bone31;
    private final ModelRenderer bone32;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leaf3;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;
    private final ModelRenderer bone20;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone23;
    private final ModelRenderer bone24;
    private final ModelRenderer cube_r11;
    private final ModelRenderer leaf2;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer cube_r12;
    private final ModelRenderer leaf1;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer cube_r13;
    private final ModelRenderer bb_main;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;

    public ModelAngiopteris() {
        this.textureWidth = 75;
        this.textureHeight = 40;

        this.leaf13 = new ModelRenderer(this);
        this.leaf13.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(leaf13, 0.1745F, 2.4435F, 0.0F);


        this.bone97 = new ModelRenderer(this);
        this.bone97.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf13.addChild(bone97);
        this.setRotateAngle(bone97, -0.6109F, 0.0F, 0.0F);
        this.bone97.cubeList.add(new ModelBox(bone97, 0, 16, -1.0F, -16.0F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone98 = new ModelRenderer(this);
        this.bone98.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone97.addChild(bone98);
        this.setRotateAngle(bone98, -0.0873F, 0.0F, 0.0F);
        this.bone98.cubeList.add(new ModelBox(bone98, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone98.cubeList.add(new ModelBox(bone98, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone98.cubeList.add(new ModelBox(bone98, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone98.cubeList.add(new ModelBox(bone98, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone98.cubeList.add(new ModelBox(bone98, 0, 16, -1.0F, -15.5F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone99 = new ModelRenderer(this);
        this.bone99.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone98.addChild(bone99);
        this.setRotateAngle(bone99, -0.1309F, 0.0F, 0.0F);
        this.bone99.cubeList.add(new ModelBox(bone99, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone99.cubeList.add(new ModelBox(bone99, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone99.cubeList.add(new ModelBox(bone99, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone99.cubeList.add(new ModelBox(bone99, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone99.cubeList.add(new ModelBox(bone99, 0, 16, -1.0F, -15.0F, -0.9F, 2, 16, 2, 0.0F, false));

        this.bone100 = new ModelRenderer(this);
        this.bone100.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone99.addChild(bone100);
        this.setRotateAngle(bone100, -0.0873F, 0.0F, 0.0F);
        this.bone100.cubeList.add(new ModelBox(bone100, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone100.cubeList.add(new ModelBox(bone100, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone100.cubeList.add(new ModelBox(bone100, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone100.cubeList.add(new ModelBox(bone100, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone100.cubeList.add(new ModelBox(bone100, 0, 16, -1.0F, -14.5F, -0.85F, 2, 16, 2, 0.0F, false));

        this.bone101 = new ModelRenderer(this);
        this.bone101.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone100.addChild(bone101);
        this.setRotateAngle(bone101, -0.1309F, 0.0F, 0.0F);
        this.bone101.cubeList.add(new ModelBox(bone101, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone101.cubeList.add(new ModelBox(bone101, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone101.cubeList.add(new ModelBox(bone101, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone101.cubeList.add(new ModelBox(bone101, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone101.cubeList.add(new ModelBox(bone101, 0, 16, -1.0F, -14.0F, -0.6F, 2, 16, 2, 0.0F, false));

        this.bone102 = new ModelRenderer(this);
        this.bone102.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone101.addChild(bone102);
        this.setRotateAngle(bone102, -0.1745F, 0.0F, 0.0F);
        this.bone102.cubeList.add(new ModelBox(bone102, 8, 16, 1.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone102.cubeList.add(new ModelBox(bone102, 8, 16, -16.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone102.cubeList.add(new ModelBox(bone102, 8, 16, -16.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone102.cubeList.add(new ModelBox(bone102, 8, 16, 1.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone102.cubeList.add(new ModelBox(bone102, 0, 16, -1.0F, -13.5F, -0.2F, 2, 16, 2, 0.0F, false));

        this.bone103 = new ModelRenderer(this);
        this.bone103.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone102.addChild(bone103);
        this.setRotateAngle(bone103, -0.1745F, 0.0F, 0.0F);
        this.bone103.cubeList.add(new ModelBox(bone103, 8, 23, 1.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, false));
        this.bone103.cubeList.add(new ModelBox(bone103, 8, 23, -14.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, true));
        this.bone103.cubeList.add(new ModelBox(bone103, 8, 30, -12.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, true));
        this.bone103.cubeList.add(new ModelBox(bone103, 8, 30, 1.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, false));
        this.bone103.cubeList.add(new ModelBox(bone103, 0, 16, -1.0F, -13.0F, 0.3F, 2, 16, 2, 0.0F, false));

        this.bone104 = new ModelRenderer(this);
        this.bone104.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone103.addChild(bone104);
        this.setRotateAngle(bone104, -0.1745F, 0.0F, 0.0F);
        this.bone104.cubeList.add(new ModelBox(bone104, 32, 7, 1.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, false));
        this.bone104.cubeList.add(new ModelBox(bone104, 32, 7, -7.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, true));
        this.bone104.cubeList.add(new ModelBox(bone104, 32, 0, -9.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, true));
        this.bone104.cubeList.add(new ModelBox(bone104, 32, 0, 1.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, false));
        this.bone104.cubeList.add(new ModelBox(bone104, 0, 16, -1.0F, -12.5F, 0.9F, 2, 16, 2, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -13.0F, 2.0F);
        this.bone104.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 0, -2.5F, -11.0F, 0.0F, 5, 12, 0, 0.0F, false));

        this.leaf12 = new ModelRenderer(this);
        this.leaf12.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(leaf12, 0.2182F, -1.3526F, 0.0F);


        this.bone89 = new ModelRenderer(this);
        this.bone89.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf12.addChild(bone89);
        this.setRotateAngle(bone89, -0.6109F, 0.0F, 0.0F);
        this.bone89.cubeList.add(new ModelBox(bone89, 0, 16, -1.0F, -16.0F, -1.0F, 2, 16, 2, 0.0F, true));

        this.bone90 = new ModelRenderer(this);
        this.bone90.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone89.addChild(bone90);
        this.setRotateAngle(bone90, -0.0873F, 0.0F, 0.0F);
        this.bone90.cubeList.add(new ModelBox(bone90, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone90.cubeList.add(new ModelBox(bone90, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone90.cubeList.add(new ModelBox(bone90, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone90.cubeList.add(new ModelBox(bone90, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone90.cubeList.add(new ModelBox(bone90, 0, 16, -1.0F, -15.5F, -1.0F, 2, 16, 2, 0.0F, true));

        this.bone91 = new ModelRenderer(this);
        this.bone91.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone90.addChild(bone91);
        this.setRotateAngle(bone91, -0.1309F, 0.0F, 0.0F);
        this.bone91.cubeList.add(new ModelBox(bone91, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone91.cubeList.add(new ModelBox(bone91, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone91.cubeList.add(new ModelBox(bone91, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone91.cubeList.add(new ModelBox(bone91, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone91.cubeList.add(new ModelBox(bone91, 0, 16, -1.0F, -15.0F, -0.9F, 2, 16, 2, 0.0F, true));

        this.bone92 = new ModelRenderer(this);
        this.bone92.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone91.addChild(bone92);
        this.setRotateAngle(bone92, -0.0873F, 0.0F, 0.0F);
        this.bone92.cubeList.add(new ModelBox(bone92, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone92.cubeList.add(new ModelBox(bone92, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone92.cubeList.add(new ModelBox(bone92, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone92.cubeList.add(new ModelBox(bone92, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone92.cubeList.add(new ModelBox(bone92, 0, 16, -1.0F, -14.5F, -0.85F, 2, 16, 2, 0.0F, true));

        this.bone93 = new ModelRenderer(this);
        this.bone93.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone92.addChild(bone93);
        this.setRotateAngle(bone93, -0.1309F, 0.0F, 0.0F);
        this.bone93.cubeList.add(new ModelBox(bone93, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone93.cubeList.add(new ModelBox(bone93, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone93.cubeList.add(new ModelBox(bone93, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone93.cubeList.add(new ModelBox(bone93, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone93.cubeList.add(new ModelBox(bone93, 0, 16, -1.0F, -14.0F, -0.6F, 2, 16, 2, 0.0F, true));

        this.bone94 = new ModelRenderer(this);
        this.bone94.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone93.addChild(bone94);
        this.setRotateAngle(bone94, -0.1745F, 0.0F, 0.0F);
        this.bone94.cubeList.add(new ModelBox(bone94, 8, 16, -16.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone94.cubeList.add(new ModelBox(bone94, 8, 16, 1.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone94.cubeList.add(new ModelBox(bone94, 8, 16, 1.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone94.cubeList.add(new ModelBox(bone94, 8, 16, -16.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone94.cubeList.add(new ModelBox(bone94, 0, 16, -1.0F, -13.5F, -0.2F, 2, 16, 2, 0.0F, true));

        this.bone95 = new ModelRenderer(this);
        this.bone95.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone94.addChild(bone95);
        this.setRotateAngle(bone95, -0.1745F, 0.0F, 0.0F);
        this.bone95.cubeList.add(new ModelBox(bone95, 8, 23, -14.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, true));
        this.bone95.cubeList.add(new ModelBox(bone95, 8, 23, 1.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, false));
        this.bone95.cubeList.add(new ModelBox(bone95, 8, 30, 1.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, false));
        this.bone95.cubeList.add(new ModelBox(bone95, 8, 30, -12.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, true));
        this.bone95.cubeList.add(new ModelBox(bone95, 0, 16, -1.0F, -13.0F, 0.3F, 2, 16, 2, 0.0F, true));

        this.bone96 = new ModelRenderer(this);
        this.bone96.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone95.addChild(bone96);
        this.setRotateAngle(bone96, -0.1745F, 0.0F, 0.0F);
        this.bone96.cubeList.add(new ModelBox(bone96, 32, 7, -7.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, true));
        this.bone96.cubeList.add(new ModelBox(bone96, 32, 7, 1.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, false));
        this.bone96.cubeList.add(new ModelBox(bone96, 32, 0, 1.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, false));
        this.bone96.cubeList.add(new ModelBox(bone96, 32, 0, -9.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, true));
        this.bone96.cubeList.add(new ModelBox(bone96, 0, 16, -1.0F, -12.5F, 0.9F, 2, 16, 2, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -13.0F, 2.0F);
        this.bone96.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 0, -2.5F, -11.0F, 0.0F, 5, 12, 0, 0.0F, true));

        this.leaf11 = new ModelRenderer(this);
        this.leaf11.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(leaf11, 0.3491F, -2.7489F, 0.0F);


        this.bone81 = new ModelRenderer(this);
        this.bone81.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf11.addChild(bone81);
        this.setRotateAngle(bone81, -0.6109F, 0.0F, 0.0F);
        this.bone81.cubeList.add(new ModelBox(bone81, 0, 16, -1.0F, -16.0F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone82 = new ModelRenderer(this);
        this.bone82.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone81.addChild(bone82);
        this.setRotateAngle(bone82, -0.0873F, 0.0F, 0.0F);
        this.bone82.cubeList.add(new ModelBox(bone82, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone82.cubeList.add(new ModelBox(bone82, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone82.cubeList.add(new ModelBox(bone82, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone82.cubeList.add(new ModelBox(bone82, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone82.cubeList.add(new ModelBox(bone82, 0, 16, -1.0F, -15.5F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone83 = new ModelRenderer(this);
        this.bone83.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone82.addChild(bone83);
        this.setRotateAngle(bone83, -0.1309F, 0.0F, 0.0F);
        this.bone83.cubeList.add(new ModelBox(bone83, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone83.cubeList.add(new ModelBox(bone83, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone83.cubeList.add(new ModelBox(bone83, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone83.cubeList.add(new ModelBox(bone83, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone83.cubeList.add(new ModelBox(bone83, 0, 16, -1.0F, -15.0F, -0.9F, 2, 16, 2, 0.0F, false));

        this.bone84 = new ModelRenderer(this);
        this.bone84.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone83.addChild(bone84);
        this.setRotateAngle(bone84, -0.0873F, 0.0F, 0.0F);
        this.bone84.cubeList.add(new ModelBox(bone84, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone84.cubeList.add(new ModelBox(bone84, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone84.cubeList.add(new ModelBox(bone84, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone84.cubeList.add(new ModelBox(bone84, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone84.cubeList.add(new ModelBox(bone84, 0, 16, -1.0F, -14.5F, -0.85F, 2, 16, 2, 0.0F, false));

        this.bone85 = new ModelRenderer(this);
        this.bone85.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone84.addChild(bone85);
        this.setRotateAngle(bone85, -0.1309F, 0.0F, 0.0F);
        this.bone85.cubeList.add(new ModelBox(bone85, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone85.cubeList.add(new ModelBox(bone85, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone85.cubeList.add(new ModelBox(bone85, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone85.cubeList.add(new ModelBox(bone85, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone85.cubeList.add(new ModelBox(bone85, 0, 16, -1.0F, -14.0F, -0.6F, 2, 16, 2, 0.0F, false));

        this.bone86 = new ModelRenderer(this);
        this.bone86.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone85.addChild(bone86);
        this.setRotateAngle(bone86, -0.1745F, 0.0F, 0.0F);
        this.bone86.cubeList.add(new ModelBox(bone86, 8, 16, 1.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone86.cubeList.add(new ModelBox(bone86, 8, 16, -16.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone86.cubeList.add(new ModelBox(bone86, 8, 16, -16.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone86.cubeList.add(new ModelBox(bone86, 8, 16, 1.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone86.cubeList.add(new ModelBox(bone86, 0, 16, -1.0F, -13.5F, -0.2F, 2, 16, 2, 0.0F, false));

        this.bone87 = new ModelRenderer(this);
        this.bone87.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone86.addChild(bone87);
        this.setRotateAngle(bone87, -0.1745F, 0.0F, 0.0F);
        this.bone87.cubeList.add(new ModelBox(bone87, 8, 23, 1.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, false));
        this.bone87.cubeList.add(new ModelBox(bone87, 8, 23, -14.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, true));
        this.bone87.cubeList.add(new ModelBox(bone87, 8, 30, -12.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, true));
        this.bone87.cubeList.add(new ModelBox(bone87, 8, 30, 1.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, false));
        this.bone87.cubeList.add(new ModelBox(bone87, 0, 16, -1.0F, -13.0F, 0.3F, 2, 16, 2, 0.0F, false));

        this.bone88 = new ModelRenderer(this);
        this.bone88.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone87.addChild(bone88);
        this.setRotateAngle(bone88, -0.1745F, 0.0F, 0.0F);
        this.bone88.cubeList.add(new ModelBox(bone88, 32, 7, 1.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, false));
        this.bone88.cubeList.add(new ModelBox(bone88, 32, 7, -7.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, true));
        this.bone88.cubeList.add(new ModelBox(bone88, 32, 0, -9.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, true));
        this.bone88.cubeList.add(new ModelBox(bone88, 32, 0, 1.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, false));
        this.bone88.cubeList.add(new ModelBox(bone88, 0, 16, -1.0F, -12.5F, 0.9F, 2, 16, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -13.0F, 2.0F);
        this.bone88.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 0, -2.5F, -11.0F, 0.0F, 5, 12, 0, 0.0F, false));

        this.leaf10 = new ModelRenderer(this);
        this.leaf10.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(leaf10, 0.2182F, 0.5236F, 0.0F);


        this.bone73 = new ModelRenderer(this);
        this.bone73.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf10.addChild(bone73);
        this.setRotateAngle(bone73, -0.6109F, 0.0F, 0.0F);
        this.bone73.cubeList.add(new ModelBox(bone73, 0, 16, -1.0F, -16.0F, -1.0F, 2, 16, 2, 0.0F, true));

        this.bone74 = new ModelRenderer(this);
        this.bone74.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone73.addChild(bone74);
        this.setRotateAngle(bone74, -0.0873F, 0.0F, 0.0F);
        this.bone74.cubeList.add(new ModelBox(bone74, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone74.cubeList.add(new ModelBox(bone74, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone74.cubeList.add(new ModelBox(bone74, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone74.cubeList.add(new ModelBox(bone74, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone74.cubeList.add(new ModelBox(bone74, 0, 16, -1.0F, -15.5F, -1.0F, 2, 16, 2, 0.0F, true));

        this.bone75 = new ModelRenderer(this);
        this.bone75.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone74.addChild(bone75);
        this.setRotateAngle(bone75, -0.1309F, 0.0F, 0.0F);
        this.bone75.cubeList.add(new ModelBox(bone75, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone75.cubeList.add(new ModelBox(bone75, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone75.cubeList.add(new ModelBox(bone75, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone75.cubeList.add(new ModelBox(bone75, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone75.cubeList.add(new ModelBox(bone75, 0, 16, -1.0F, -15.0F, -0.9F, 2, 16, 2, 0.0F, true));

        this.bone76 = new ModelRenderer(this);
        this.bone76.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone75.addChild(bone76);
        this.setRotateAngle(bone76, -0.0873F, 0.0F, 0.0F);
        this.bone76.cubeList.add(new ModelBox(bone76, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone76.cubeList.add(new ModelBox(bone76, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone76.cubeList.add(new ModelBox(bone76, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone76.cubeList.add(new ModelBox(bone76, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone76.cubeList.add(new ModelBox(bone76, 0, 16, -1.0F, -14.5F, -0.85F, 2, 16, 2, 0.0F, true));

        this.bone77 = new ModelRenderer(this);
        this.bone77.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone76.addChild(bone77);
        this.setRotateAngle(bone77, -0.1309F, 0.0F, 0.0F);
        this.bone77.cubeList.add(new ModelBox(bone77, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone77.cubeList.add(new ModelBox(bone77, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone77.cubeList.add(new ModelBox(bone77, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone77.cubeList.add(new ModelBox(bone77, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone77.cubeList.add(new ModelBox(bone77, 0, 16, -1.0F, -14.0F, -0.6F, 2, 16, 2, 0.0F, true));

        this.bone78 = new ModelRenderer(this);
        this.bone78.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone77.addChild(bone78);
        this.setRotateAngle(bone78, -0.1745F, 0.0F, 0.0F);
        this.bone78.cubeList.add(new ModelBox(bone78, 8, 16, -16.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone78.cubeList.add(new ModelBox(bone78, 8, 16, 1.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone78.cubeList.add(new ModelBox(bone78, 8, 16, 1.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone78.cubeList.add(new ModelBox(bone78, 8, 16, -16.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone78.cubeList.add(new ModelBox(bone78, 0, 16, -1.0F, -13.5F, -0.2F, 2, 16, 2, 0.0F, true));

        this.bone79 = new ModelRenderer(this);
        this.bone79.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone78.addChild(bone79);
        this.setRotateAngle(bone79, -0.1745F, 0.0F, 0.0F);
        this.bone79.cubeList.add(new ModelBox(bone79, 8, 23, -14.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, true));
        this.bone79.cubeList.add(new ModelBox(bone79, 8, 23, 1.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, false));
        this.bone79.cubeList.add(new ModelBox(bone79, 8, 30, 1.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, false));
        this.bone79.cubeList.add(new ModelBox(bone79, 8, 30, -12.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, true));
        this.bone79.cubeList.add(new ModelBox(bone79, 0, 16, -1.0F, -13.0F, 0.3F, 2, 16, 2, 0.0F, true));

        this.bone80 = new ModelRenderer(this);
        this.bone80.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone79.addChild(bone80);
        this.setRotateAngle(bone80, -0.1745F, 0.0F, 0.0F);
        this.bone80.cubeList.add(new ModelBox(bone80, 32, 7, -7.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, true));
        this.bone80.cubeList.add(new ModelBox(bone80, 32, 7, 1.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, false));
        this.bone80.cubeList.add(new ModelBox(bone80, 32, 0, 1.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, false));
        this.bone80.cubeList.add(new ModelBox(bone80, 32, 0, -9.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, true));
        this.bone80.cubeList.add(new ModelBox(bone80, 0, 16, -1.0F, -12.5F, 0.9F, 2, 16, 2, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -13.0F, 2.0F);
        this.bone80.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 0, -2.5F, -11.0F, 0.0F, 5, 12, 0, 0.0F, true));

        this.leaf9 = new ModelRenderer(this);
        this.leaf9.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(leaf9, 0.3491F, -0.3927F, 0.0F);


        this.bone65 = new ModelRenderer(this);
        this.bone65.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf9.addChild(bone65);
        this.setRotateAngle(bone65, -0.6109F, 0.0F, 0.0F);
        this.bone65.cubeList.add(new ModelBox(bone65, 0, 16, -1.0F, -16.0F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone66 = new ModelRenderer(this);
        this.bone66.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone65.addChild(bone66);
        this.setRotateAngle(bone66, -0.0873F, 0.0F, 0.0F);
        this.bone66.cubeList.add(new ModelBox(bone66, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone66.cubeList.add(new ModelBox(bone66, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone66.cubeList.add(new ModelBox(bone66, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone66.cubeList.add(new ModelBox(bone66, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone66.cubeList.add(new ModelBox(bone66, 0, 16, -1.0F, -15.5F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone67 = new ModelRenderer(this);
        this.bone67.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone66.addChild(bone67);
        this.setRotateAngle(bone67, -0.1309F, 0.0F, 0.0F);
        this.bone67.cubeList.add(new ModelBox(bone67, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone67.cubeList.add(new ModelBox(bone67, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone67.cubeList.add(new ModelBox(bone67, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone67.cubeList.add(new ModelBox(bone67, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone67.cubeList.add(new ModelBox(bone67, 0, 16, -1.0F, -15.0F, -0.9F, 2, 16, 2, 0.0F, false));

        this.bone68 = new ModelRenderer(this);
        this.bone68.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone67.addChild(bone68);
        this.setRotateAngle(bone68, -0.0873F, 0.0F, 0.0F);
        this.bone68.cubeList.add(new ModelBox(bone68, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone68.cubeList.add(new ModelBox(bone68, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone68.cubeList.add(new ModelBox(bone68, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone68.cubeList.add(new ModelBox(bone68, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone68.cubeList.add(new ModelBox(bone68, 0, 16, -1.0F, -14.5F, -0.85F, 2, 16, 2, 0.0F, false));

        this.bone69 = new ModelRenderer(this);
        this.bone69.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone68.addChild(bone69);
        this.setRotateAngle(bone69, -0.1309F, 0.0F, 0.0F);
        this.bone69.cubeList.add(new ModelBox(bone69, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone69.cubeList.add(new ModelBox(bone69, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone69.cubeList.add(new ModelBox(bone69, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone69.cubeList.add(new ModelBox(bone69, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone69.cubeList.add(new ModelBox(bone69, 0, 16, -1.0F, -14.0F, -0.6F, 2, 16, 2, 0.0F, false));

        this.bone70 = new ModelRenderer(this);
        this.bone70.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone69.addChild(bone70);
        this.setRotateAngle(bone70, -0.1745F, 0.0F, 0.0F);
        this.bone70.cubeList.add(new ModelBox(bone70, 8, 16, 1.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone70.cubeList.add(new ModelBox(bone70, 8, 16, -16.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone70.cubeList.add(new ModelBox(bone70, 8, 16, -16.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone70.cubeList.add(new ModelBox(bone70, 8, 16, 1.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone70.cubeList.add(new ModelBox(bone70, 0, 16, -1.0F, -13.5F, -0.2F, 2, 16, 2, 0.0F, false));

        this.bone71 = new ModelRenderer(this);
        this.bone71.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone70.addChild(bone71);
        this.setRotateAngle(bone71, -0.1745F, 0.0F, 0.0F);
        this.bone71.cubeList.add(new ModelBox(bone71, 8, 23, 1.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, false));
        this.bone71.cubeList.add(new ModelBox(bone71, 8, 23, -14.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, true));
        this.bone71.cubeList.add(new ModelBox(bone71, 8, 30, -12.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, true));
        this.bone71.cubeList.add(new ModelBox(bone71, 8, 30, 1.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, false));
        this.bone71.cubeList.add(new ModelBox(bone71, 0, 16, -1.0F, -13.0F, 0.3F, 2, 16, 2, 0.0F, false));

        this.bone72 = new ModelRenderer(this);
        this.bone72.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone71.addChild(bone72);
        this.setRotateAngle(bone72, -0.1745F, 0.0F, 0.0F);
        this.bone72.cubeList.add(new ModelBox(bone72, 32, 7, 1.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, false));
        this.bone72.cubeList.add(new ModelBox(bone72, 32, 7, -7.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, true));
        this.bone72.cubeList.add(new ModelBox(bone72, 32, 0, -9.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, true));
        this.bone72.cubeList.add(new ModelBox(bone72, 32, 0, 1.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, false));
        this.bone72.cubeList.add(new ModelBox(bone72, 0, 16, -1.0F, -12.5F, 0.9F, 2, 16, 2, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -13.0F, 2.0F);
        this.bone72.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 0, -2.5F, -11.0F, 0.0F, 5, 12, 0, 0.0F, false));

        this.leaf8 = new ModelRenderer(this);
        this.leaf8.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(leaf8, 0.0F, 1.5708F, 0.0F);


        this.bone57 = new ModelRenderer(this);
        this.bone57.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf8.addChild(bone57);
        this.setRotateAngle(bone57, -0.6109F, 0.0F, 0.0F);
        this.bone57.cubeList.add(new ModelBox(bone57, 0, 16, -1.0F, -16.0F, -1.0F, 2, 16, 2, 0.0F, true));

        this.bone58 = new ModelRenderer(this);
        this.bone58.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone57.addChild(bone58);
        this.setRotateAngle(bone58, -0.0873F, 0.0F, 0.0F);
        this.bone58.cubeList.add(new ModelBox(bone58, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone58.cubeList.add(new ModelBox(bone58, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone58.cubeList.add(new ModelBox(bone58, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone58.cubeList.add(new ModelBox(bone58, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone58.cubeList.add(new ModelBox(bone58, 0, 16, -1.0F, -15.5F, -1.0F, 2, 16, 2, 0.0F, true));

        this.bone59 = new ModelRenderer(this);
        this.bone59.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone58.addChild(bone59);
        this.setRotateAngle(bone59, -0.1309F, 0.0F, 0.0F);
        this.bone59.cubeList.add(new ModelBox(bone59, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone59.cubeList.add(new ModelBox(bone59, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone59.cubeList.add(new ModelBox(bone59, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone59.cubeList.add(new ModelBox(bone59, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone59.cubeList.add(new ModelBox(bone59, 0, 16, -1.0F, -15.0F, -0.9F, 2, 16, 2, 0.0F, true));

        this.bone60 = new ModelRenderer(this);
        this.bone60.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone59.addChild(bone60);
        this.setRotateAngle(bone60, -0.0873F, 0.0F, 0.0F);
        this.bone60.cubeList.add(new ModelBox(bone60, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone60.cubeList.add(new ModelBox(bone60, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone60.cubeList.add(new ModelBox(bone60, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone60.cubeList.add(new ModelBox(bone60, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone60.cubeList.add(new ModelBox(bone60, 0, 16, -1.0F, -14.5F, -0.85F, 2, 16, 2, 0.0F, true));

        this.bone61 = new ModelRenderer(this);
        this.bone61.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone60.addChild(bone61);
        this.setRotateAngle(bone61, -0.1309F, 0.0F, 0.0F);
        this.bone61.cubeList.add(new ModelBox(bone61, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone61.cubeList.add(new ModelBox(bone61, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone61.cubeList.add(new ModelBox(bone61, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone61.cubeList.add(new ModelBox(bone61, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone61.cubeList.add(new ModelBox(bone61, 0, 16, -1.0F, -14.0F, -0.6F, 2, 16, 2, 0.0F, true));

        this.bone62 = new ModelRenderer(this);
        this.bone62.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone61.addChild(bone62);
        this.setRotateAngle(bone62, -0.1745F, 0.0F, 0.0F);
        this.bone62.cubeList.add(new ModelBox(bone62, 8, 16, -16.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone62.cubeList.add(new ModelBox(bone62, 8, 16, 1.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone62.cubeList.add(new ModelBox(bone62, 8, 16, 1.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone62.cubeList.add(new ModelBox(bone62, 8, 16, -16.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone62.cubeList.add(new ModelBox(bone62, 0, 16, -1.0F, -13.5F, -0.2F, 2, 16, 2, 0.0F, true));

        this.bone63 = new ModelRenderer(this);
        this.bone63.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone62.addChild(bone63);
        this.setRotateAngle(bone63, -0.1745F, 0.0F, 0.0F);
        this.bone63.cubeList.add(new ModelBox(bone63, 8, 23, -14.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, true));
        this.bone63.cubeList.add(new ModelBox(bone63, 8, 23, 1.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, false));
        this.bone63.cubeList.add(new ModelBox(bone63, 8, 30, 1.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, false));
        this.bone63.cubeList.add(new ModelBox(bone63, 8, 30, -12.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, true));
        this.bone63.cubeList.add(new ModelBox(bone63, 0, 16, -1.0F, -13.0F, 0.3F, 2, 16, 2, 0.0F, true));

        this.bone64 = new ModelRenderer(this);
        this.bone64.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone63.addChild(bone64);
        this.setRotateAngle(bone64, -0.1745F, 0.0F, 0.0F);
        this.bone64.cubeList.add(new ModelBox(bone64, 32, 7, -7.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, true));
        this.bone64.cubeList.add(new ModelBox(bone64, 32, 7, 1.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, false));
        this.bone64.cubeList.add(new ModelBox(bone64, 32, 0, 1.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, false));
        this.bone64.cubeList.add(new ModelBox(bone64, 32, 0, -9.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, true));
        this.bone64.cubeList.add(new ModelBox(bone64, 0, 16, -1.0F, -12.5F, 0.9F, 2, 16, 2, 0.0F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -13.0F, 2.0F);
        this.bone64.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 0, -2.5F, -11.0F, 0.0F, 5, 12, 0, 0.0F, true));

        this.leaf7 = new ModelRenderer(this);
        this.leaf7.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(leaf7, 0.0F, -1.5708F, 0.0F);


        this.bone49 = new ModelRenderer(this);
        this.bone49.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf7.addChild(bone49);
        this.setRotateAngle(bone49, -0.6109F, 0.0F, 0.0F);
        this.bone49.cubeList.add(new ModelBox(bone49, 0, 16, -1.0F, -16.0F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone50 = new ModelRenderer(this);
        this.bone50.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone49.addChild(bone50);
        this.setRotateAngle(bone50, -0.0873F, 0.0F, 0.0F);
        this.bone50.cubeList.add(new ModelBox(bone50, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone50.cubeList.add(new ModelBox(bone50, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone50.cubeList.add(new ModelBox(bone50, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone50.cubeList.add(new ModelBox(bone50, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone50.cubeList.add(new ModelBox(bone50, 0, 16, -1.0F, -15.5F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone51 = new ModelRenderer(this);
        this.bone51.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone50.addChild(bone51);
        this.setRotateAngle(bone51, -0.1309F, 0.0F, 0.0F);
        this.bone51.cubeList.add(new ModelBox(bone51, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone51.cubeList.add(new ModelBox(bone51, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone51.cubeList.add(new ModelBox(bone51, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone51.cubeList.add(new ModelBox(bone51, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone51.cubeList.add(new ModelBox(bone51, 0, 16, -1.0F, -15.0F, -0.9F, 2, 16, 2, 0.0F, false));

        this.bone52 = new ModelRenderer(this);
        this.bone52.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone51.addChild(bone52);
        this.setRotateAngle(bone52, -0.0873F, 0.0F, 0.0F);
        this.bone52.cubeList.add(new ModelBox(bone52, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone52.cubeList.add(new ModelBox(bone52, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone52.cubeList.add(new ModelBox(bone52, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone52.cubeList.add(new ModelBox(bone52, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone52.cubeList.add(new ModelBox(bone52, 0, 16, -1.0F, -14.5F, -0.85F, 2, 16, 2, 0.0F, false));

        this.bone53 = new ModelRenderer(this);
        this.bone53.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone52.addChild(bone53);
        this.setRotateAngle(bone53, -0.1309F, 0.0F, 0.0F);
        this.bone53.cubeList.add(new ModelBox(bone53, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone53.cubeList.add(new ModelBox(bone53, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone53.cubeList.add(new ModelBox(bone53, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone53.cubeList.add(new ModelBox(bone53, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone53.cubeList.add(new ModelBox(bone53, 0, 16, -1.0F, -14.0F, -0.6F, 2, 16, 2, 0.0F, false));

        this.bone54 = new ModelRenderer(this);
        this.bone54.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone53.addChild(bone54);
        this.setRotateAngle(bone54, -0.1745F, 0.0F, 0.0F);
        this.bone54.cubeList.add(new ModelBox(bone54, 8, 16, 1.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone54.cubeList.add(new ModelBox(bone54, 8, 16, -16.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone54.cubeList.add(new ModelBox(bone54, 8, 16, -16.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone54.cubeList.add(new ModelBox(bone54, 8, 16, 1.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone54.cubeList.add(new ModelBox(bone54, 0, 16, -1.0F, -13.5F, -0.2F, 2, 16, 2, 0.0F, false));

        this.bone55 = new ModelRenderer(this);
        this.bone55.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone54.addChild(bone55);
        this.setRotateAngle(bone55, -0.1745F, 0.0F, 0.0F);
        this.bone55.cubeList.add(new ModelBox(bone55, 8, 23, 1.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, false));
        this.bone55.cubeList.add(new ModelBox(bone55, 8, 23, -14.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, true));
        this.bone55.cubeList.add(new ModelBox(bone55, 8, 30, -12.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, true));
        this.bone55.cubeList.add(new ModelBox(bone55, 8, 30, 1.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, false));
        this.bone55.cubeList.add(new ModelBox(bone55, 0, 16, -1.0F, -13.0F, 0.3F, 2, 16, 2, 0.0F, false));

        this.bone56 = new ModelRenderer(this);
        this.bone56.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone55.addChild(bone56);
        this.setRotateAngle(bone56, -0.1745F, 0.0F, 0.0F);
        this.bone56.cubeList.add(new ModelBox(bone56, 32, 7, 1.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, false));
        this.bone56.cubeList.add(new ModelBox(bone56, 32, 7, -7.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, true));
        this.bone56.cubeList.add(new ModelBox(bone56, 32, 0, -9.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, true));
        this.bone56.cubeList.add(new ModelBox(bone56, 32, 0, 1.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, false));
        this.bone56.cubeList.add(new ModelBox(bone56, 0, 16, -1.0F, -12.5F, 0.9F, 2, 16, 2, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -13.0F, 2.0F);
        this.bone56.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 48, 0, -2.5F, -11.0F, 0.0F, 5, 12, 0, 0.0F, false));

        this.leaf6 = new ModelRenderer(this);
        this.leaf6.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.bone41 = new ModelRenderer(this);
        this.bone41.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf6.addChild(bone41);
        this.setRotateAngle(bone41, 0.6109F, 0.0F, 0.0F);
        this.bone41.cubeList.add(new ModelBox(bone41, 0, 16, -1.0F, -16.0F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone42 = new ModelRenderer(this);
        this.bone42.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone41.addChild(bone42);
        this.setRotateAngle(bone42, 0.0873F, 0.0F, 0.0F);
        this.bone42.cubeList.add(new ModelBox(bone42, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone42.cubeList.add(new ModelBox(bone42, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone42.cubeList.add(new ModelBox(bone42, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone42.cubeList.add(new ModelBox(bone42, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone42.cubeList.add(new ModelBox(bone42, 0, 16, -1.0F, -15.5F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone43 = new ModelRenderer(this);
        this.bone43.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone42.addChild(bone43);
        this.setRotateAngle(bone43, 0.1309F, 0.0F, 0.0F);
        this.bone43.cubeList.add(new ModelBox(bone43, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone43.cubeList.add(new ModelBox(bone43, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone43.cubeList.add(new ModelBox(bone43, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone43.cubeList.add(new ModelBox(bone43, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone43.cubeList.add(new ModelBox(bone43, 0, 16, -1.0F, -15.0F, -1.1F, 2, 16, 2, 0.0F, false));

        this.bone44 = new ModelRenderer(this);
        this.bone44.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone43.addChild(bone44);
        this.setRotateAngle(bone44, 0.0873F, 0.0F, 0.0F);
        this.bone44.cubeList.add(new ModelBox(bone44, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone44.cubeList.add(new ModelBox(bone44, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone44.cubeList.add(new ModelBox(bone44, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone44.cubeList.add(new ModelBox(bone44, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone44.cubeList.add(new ModelBox(bone44, 0, 16, -1.0F, -14.5F, -1.15F, 2, 16, 2, 0.0F, false));

        this.bone45 = new ModelRenderer(this);
        this.bone45.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone44.addChild(bone45);
        this.setRotateAngle(bone45, 0.1309F, 0.0F, 0.0F);
        this.bone45.cubeList.add(new ModelBox(bone45, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone45.cubeList.add(new ModelBox(bone45, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone45.cubeList.add(new ModelBox(bone45, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone45.cubeList.add(new ModelBox(bone45, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone45.cubeList.add(new ModelBox(bone45, 0, 16, -1.0F, -14.0F, -1.4F, 2, 16, 2, 0.0F, false));

        this.bone46 = new ModelRenderer(this);
        this.bone46.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone45.addChild(bone46);
        this.setRotateAngle(bone46, 0.1745F, 0.0F, 0.0F);
        this.bone46.cubeList.add(new ModelBox(bone46, 8, 16, 1.0F, -15.0F, -0.3F, 15, 7, 0, 0.0F, false));
        this.bone46.cubeList.add(new ModelBox(bone46, 8, 16, -16.0F, -15.0F, -0.3F, 15, 7, 0, 0.0F, true));
        this.bone46.cubeList.add(new ModelBox(bone46, 8, 16, -16.0F, -7.0F, -0.3F, 15, 7, 0, 0.0F, true));
        this.bone46.cubeList.add(new ModelBox(bone46, 8, 16, 1.0F, -7.0F, -0.3F, 15, 7, 0, 0.0F, false));
        this.bone46.cubeList.add(new ModelBox(bone46, 0, 16, -1.0F, -13.5F, -1.8F, 2, 16, 2, 0.0F, false));

        this.bone47 = new ModelRenderer(this);
        this.bone47.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone46.addChild(bone47);
        this.setRotateAngle(bone47, 0.1745F, 0.0F, 0.0F);
        this.bone47.cubeList.add(new ModelBox(bone47, 8, 23, 1.0F, -7.0F, -0.5F, 13, 7, 0, 0.0F, false));
        this.bone47.cubeList.add(new ModelBox(bone47, 8, 23, -14.0F, -7.0F, -0.5F, 13, 7, 0, 0.0F, true));
        this.bone47.cubeList.add(new ModelBox(bone47, 8, 30, -12.0F, -15.0F, -0.5F, 11, 7, 0, 0.0F, true));
        this.bone47.cubeList.add(new ModelBox(bone47, 8, 30, 1.0F, -15.0F, -0.5F, 11, 7, 0, 0.0F, false));
        this.bone47.cubeList.add(new ModelBox(bone47, 0, 16, -1.0F, -13.0F, -2.3F, 2, 16, 2, 0.0F, false));

        this.bone48 = new ModelRenderer(this);
        this.bone48.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone47.addChild(bone48);
        this.setRotateAngle(bone48, 0.1745F, 0.0F, 0.0F);
        this.bone48.cubeList.add(new ModelBox(bone48, 32, 7, 1.0F, -15.0F, -1.2F, 6, 7, 0, 0.0F, false));
        this.bone48.cubeList.add(new ModelBox(bone48, 32, 7, -7.0F, -15.0F, -1.2F, 6, 7, 0, 0.0F, true));
        this.bone48.cubeList.add(new ModelBox(bone48, 32, 0, -9.0F, -7.0F, -1.2F, 8, 7, 0, 0.0F, true));
        this.bone48.cubeList.add(new ModelBox(bone48, 32, 0, 1.0F, -7.0F, -1.2F, 8, 7, 0, 0.0F, false));
        this.bone48.cubeList.add(new ModelBox(bone48, 0, 16, -1.0F, -12.5F, -2.9F, 2, 16, 2, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -13.0F, -2.0F);
        this.bone48.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 0, -2.5F, -11.0F, 0.0F, 5, 12, 0, 0.0F, false));

        this.leaf5 = new ModelRenderer(this);
        this.leaf5.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(leaf5, 0.3054F, 0.7854F, 0.0F);


        this.bone33 = new ModelRenderer(this);
        this.bone33.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf5.addChild(bone33);
        this.setRotateAngle(bone33, 0.6109F, 0.0F, 0.0F);
        this.bone33.cubeList.add(new ModelBox(bone33, 0, 16, -1.0F, -16.0F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone34 = new ModelRenderer(this);
        this.bone34.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone33.addChild(bone34);
        this.setRotateAngle(bone34, 0.0873F, 0.0F, 0.0F);
        this.bone34.cubeList.add(new ModelBox(bone34, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone34.cubeList.add(new ModelBox(bone34, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone34.cubeList.add(new ModelBox(bone34, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone34.cubeList.add(new ModelBox(bone34, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone34.cubeList.add(new ModelBox(bone34, 0, 16, -1.0F, -15.5F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone35 = new ModelRenderer(this);
        this.bone35.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone34.addChild(bone35);
        this.setRotateAngle(bone35, 0.1309F, 0.0F, 0.0F);
        this.bone35.cubeList.add(new ModelBox(bone35, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone35.cubeList.add(new ModelBox(bone35, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone35.cubeList.add(new ModelBox(bone35, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone35.cubeList.add(new ModelBox(bone35, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone35.cubeList.add(new ModelBox(bone35, 0, 16, -1.0F, -15.0F, -1.1F, 2, 16, 2, 0.0F, false));

        this.bone36 = new ModelRenderer(this);
        this.bone36.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone35.addChild(bone36);
        this.setRotateAngle(bone36, 0.0873F, 0.0F, 0.0F);
        this.bone36.cubeList.add(new ModelBox(bone36, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone36.cubeList.add(new ModelBox(bone36, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone36.cubeList.add(new ModelBox(bone36, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone36.cubeList.add(new ModelBox(bone36, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone36.cubeList.add(new ModelBox(bone36, 0, 16, -1.0F, -14.5F, -1.15F, 2, 16, 2, 0.0F, false));

        this.bone37 = new ModelRenderer(this);
        this.bone37.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone36.addChild(bone37);
        this.setRotateAngle(bone37, 0.1309F, 0.0F, 0.0F);
        this.bone37.cubeList.add(new ModelBox(bone37, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone37.cubeList.add(new ModelBox(bone37, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone37.cubeList.add(new ModelBox(bone37, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone37.cubeList.add(new ModelBox(bone37, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone37.cubeList.add(new ModelBox(bone37, 0, 16, -1.0F, -14.0F, -1.4F, 2, 16, 2, 0.0F, false));

        this.bone38 = new ModelRenderer(this);
        this.bone38.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone37.addChild(bone38);
        this.setRotateAngle(bone38, 0.1745F, 0.0F, 0.0F);
        this.bone38.cubeList.add(new ModelBox(bone38, 8, 16, 1.0F, -15.0F, -0.3F, 15, 7, 0, 0.0F, false));
        this.bone38.cubeList.add(new ModelBox(bone38, 8, 16, -16.0F, -15.0F, -0.3F, 15, 7, 0, 0.0F, true));
        this.bone38.cubeList.add(new ModelBox(bone38, 8, 16, -16.0F, -7.0F, -0.3F, 15, 7, 0, 0.0F, true));
        this.bone38.cubeList.add(new ModelBox(bone38, 8, 16, 1.0F, -7.0F, -0.3F, 15, 7, 0, 0.0F, false));
        this.bone38.cubeList.add(new ModelBox(bone38, 0, 16, -1.0F, -13.5F, -1.8F, 2, 16, 2, 0.0F, false));

        this.bone39 = new ModelRenderer(this);
        this.bone39.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone38.addChild(bone39);
        this.setRotateAngle(bone39, 0.1745F, 0.0F, 0.0F);
        this.bone39.cubeList.add(new ModelBox(bone39, 8, 23, 1.0F, -7.0F, -0.5F, 13, 7, 0, 0.0F, false));
        this.bone39.cubeList.add(new ModelBox(bone39, 8, 23, -14.0F, -7.0F, -0.5F, 13, 7, 0, 0.0F, true));
        this.bone39.cubeList.add(new ModelBox(bone39, 8, 30, -12.0F, -15.0F, -0.5F, 11, 7, 0, 0.0F, true));
        this.bone39.cubeList.add(new ModelBox(bone39, 8, 30, 1.0F, -15.0F, -0.5F, 11, 7, 0, 0.0F, false));
        this.bone39.cubeList.add(new ModelBox(bone39, 0, 16, -1.0F, -13.0F, -2.3F, 2, 16, 2, 0.0F, false));

        this.bone40 = new ModelRenderer(this);
        this.bone40.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone39.addChild(bone40);
        this.setRotateAngle(bone40, 0.1745F, 0.0F, 0.0F);
        this.bone40.cubeList.add(new ModelBox(bone40, 32, 7, 1.0F, -15.0F, -1.2F, 6, 7, 0, 0.0F, false));
        this.bone40.cubeList.add(new ModelBox(bone40, 32, 7, -7.0F, -15.0F, -1.2F, 6, 7, 0, 0.0F, true));
        this.bone40.cubeList.add(new ModelBox(bone40, 32, 0, -9.0F, -7.0F, -1.2F, 8, 7, 0, 0.0F, true));
        this.bone40.cubeList.add(new ModelBox(bone40, 32, 0, 1.0F, -7.0F, -1.2F, 8, 7, 0, 0.0F, false));
        this.bone40.cubeList.add(new ModelBox(bone40, 0, 16, -1.0F, -12.5F, -2.9F, 2, 16, 2, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -13.0F, -2.0F);
        this.bone40.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 0, -2.5F, -11.0F, 0.0F, 5, 12, 0, 0.0F, false));

        this.leaf4 = new ModelRenderer(this);
        this.leaf4.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(leaf4, 0.3054F, -0.7854F, 0.0F);


        this.bone25 = new ModelRenderer(this);
        this.bone25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf4.addChild(bone25);
        this.setRotateAngle(bone25, 0.6109F, 0.0F, 0.0F);
        this.bone25.cubeList.add(new ModelBox(bone25, 0, 16, -1.0F, -16.0F, -1.0F, 2, 16, 2, 0.0F, true));

        this.bone26 = new ModelRenderer(this);
        this.bone26.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone25.addChild(bone26);
        this.setRotateAngle(bone26, 0.0873F, 0.0F, 0.0F);
        this.bone26.cubeList.add(new ModelBox(bone26, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone26.cubeList.add(new ModelBox(bone26, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone26.cubeList.add(new ModelBox(bone26, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone26.cubeList.add(new ModelBox(bone26, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone26.cubeList.add(new ModelBox(bone26, 0, 16, -1.0F, -15.5F, -1.0F, 2, 16, 2, 0.0F, true));

        this.bone27 = new ModelRenderer(this);
        this.bone27.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone26.addChild(bone27);
        this.setRotateAngle(bone27, 0.1309F, 0.0F, 0.0F);
        this.bone27.cubeList.add(new ModelBox(bone27, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone27.cubeList.add(new ModelBox(bone27, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone27.cubeList.add(new ModelBox(bone27, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone27.cubeList.add(new ModelBox(bone27, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone27.cubeList.add(new ModelBox(bone27, 0, 16, -1.0F, -15.0F, -1.1F, 2, 16, 2, 0.0F, true));

        this.bone28 = new ModelRenderer(this);
        this.bone28.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone27.addChild(bone28);
        this.setRotateAngle(bone28, 0.0873F, 0.0F, 0.0F);
        this.bone28.cubeList.add(new ModelBox(bone28, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone28.cubeList.add(new ModelBox(bone28, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone28.cubeList.add(new ModelBox(bone28, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone28.cubeList.add(new ModelBox(bone28, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone28.cubeList.add(new ModelBox(bone28, 0, 16, -1.0F, -14.5F, -1.15F, 2, 16, 2, 0.0F, true));

        this.bone29 = new ModelRenderer(this);
        this.bone29.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone28.addChild(bone29);
        this.setRotateAngle(bone29, 0.1309F, 0.0F, 0.0F);
        this.bone29.cubeList.add(new ModelBox(bone29, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone29.cubeList.add(new ModelBox(bone29, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone29.cubeList.add(new ModelBox(bone29, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone29.cubeList.add(new ModelBox(bone29, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone29.cubeList.add(new ModelBox(bone29, 0, 16, -1.0F, -14.0F, -1.4F, 2, 16, 2, 0.0F, true));

        this.bone30 = new ModelRenderer(this);
        this.bone30.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone29.addChild(bone30);
        this.setRotateAngle(bone30, 0.1745F, 0.0F, 0.0F);
        this.bone30.cubeList.add(new ModelBox(bone30, 8, 16, -16.0F, -15.0F, -0.3F, 15, 7, 0, 0.0F, true));
        this.bone30.cubeList.add(new ModelBox(bone30, 8, 16, 1.0F, -15.0F, -0.3F, 15, 7, 0, 0.0F, false));
        this.bone30.cubeList.add(new ModelBox(bone30, 8, 16, 1.0F, -7.0F, -0.3F, 15, 7, 0, 0.0F, false));
        this.bone30.cubeList.add(new ModelBox(bone30, 8, 16, -16.0F, -7.0F, -0.3F, 15, 7, 0, 0.0F, true));
        this.bone30.cubeList.add(new ModelBox(bone30, 0, 16, -1.0F, -13.5F, -1.8F, 2, 16, 2, 0.0F, true));

        this.bone31 = new ModelRenderer(this);
        this.bone31.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone30.addChild(bone31);
        this.setRotateAngle(bone31, 0.1745F, 0.0F, 0.0F);
        this.bone31.cubeList.add(new ModelBox(bone31, 8, 23, -14.0F, -7.0F, -0.5F, 13, 7, 0, 0.0F, true));
        this.bone31.cubeList.add(new ModelBox(bone31, 8, 23, 1.0F, -7.0F, -0.5F, 13, 7, 0, 0.0F, false));
        this.bone31.cubeList.add(new ModelBox(bone31, 8, 30, 1.0F, -15.0F, -0.5F, 11, 7, 0, 0.0F, false));
        this.bone31.cubeList.add(new ModelBox(bone31, 8, 30, -12.0F, -15.0F, -0.5F, 11, 7, 0, 0.0F, true));
        this.bone31.cubeList.add(new ModelBox(bone31, 0, 16, -1.0F, -13.0F, -2.3F, 2, 16, 2, 0.0F, true));

        this.bone32 = new ModelRenderer(this);
        this.bone32.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone31.addChild(bone32);
        this.setRotateAngle(bone32, 0.1745F, 0.0F, 0.0F);
        this.bone32.cubeList.add(new ModelBox(bone32, 32, 7, -7.0F, -15.0F, -1.2F, 6, 7, 0, 0.0F, true));
        this.bone32.cubeList.add(new ModelBox(bone32, 32, 7, 1.0F, -15.0F, -1.2F, 6, 7, 0, 0.0F, false));
        this.bone32.cubeList.add(new ModelBox(bone32, 32, 0, 1.0F, -7.0F, -1.2F, 8, 7, 0, 0.0F, false));
        this.bone32.cubeList.add(new ModelBox(bone32, 32, 0, -9.0F, -7.0F, -1.2F, 8, 7, 0, 0.0F, true));
        this.bone32.cubeList.add(new ModelBox(bone32, 0, 16, -1.0F, -12.5F, -2.9F, 2, 16, 2, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -13.0F, -2.0F);
        this.bone32.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 48, 0, -2.5F, -11.0F, 0.0F, 5, 12, 0, 0.0F, true));

        this.leaf3 = new ModelRenderer(this);
        this.leaf3.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(leaf3, -0.3054F, 0.7854F, 0.0F);


        this.bone17 = new ModelRenderer(this);
        this.bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf3.addChild(bone17);
        this.setRotateAngle(bone17, -0.6109F, 0.0F, 0.0F);
        this.bone17.cubeList.add(new ModelBox(bone17, 0, 16, -1.0F, -16.0F, -1.0F, 2, 16, 2, 0.0F, true));

        this.bone18 = new ModelRenderer(this);
        this.bone18.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone17.addChild(bone18);
        this.setRotateAngle(bone18, -0.0873F, 0.0F, 0.0F);
        this.bone18.cubeList.add(new ModelBox(bone18, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone18.cubeList.add(new ModelBox(bone18, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone18.cubeList.add(new ModelBox(bone18, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone18.cubeList.add(new ModelBox(bone18, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone18.cubeList.add(new ModelBox(bone18, 0, 16, -1.0F, -15.5F, -1.0F, 2, 16, 2, 0.0F, true));

        this.bone19 = new ModelRenderer(this);
        this.bone19.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone18.addChild(bone19);
        this.setRotateAngle(bone19, -0.1309F, 0.0F, 0.0F);
        this.bone19.cubeList.add(new ModelBox(bone19, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone19.cubeList.add(new ModelBox(bone19, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone19.cubeList.add(new ModelBox(bone19, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone19.cubeList.add(new ModelBox(bone19, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone19.cubeList.add(new ModelBox(bone19, 0, 16, -1.0F, -15.0F, -0.9F, 2, 16, 2, 0.0F, true));

        this.bone20 = new ModelRenderer(this);
        this.bone20.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone19.addChild(bone20);
        this.setRotateAngle(bone20, -0.0873F, 0.0F, 0.0F);
        this.bone20.cubeList.add(new ModelBox(bone20, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone20.cubeList.add(new ModelBox(bone20, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone20.cubeList.add(new ModelBox(bone20, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone20.cubeList.add(new ModelBox(bone20, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone20.cubeList.add(new ModelBox(bone20, 0, 16, -1.0F, -14.5F, -0.85F, 2, 16, 2, 0.0F, true));

        this.bone21 = new ModelRenderer(this);
        this.bone21.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone20.addChild(bone21);
        this.setRotateAngle(bone21, -0.1309F, 0.0F, 0.0F);
        this.bone21.cubeList.add(new ModelBox(bone21, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone21.cubeList.add(new ModelBox(bone21, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone21.cubeList.add(new ModelBox(bone21, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone21.cubeList.add(new ModelBox(bone21, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone21.cubeList.add(new ModelBox(bone21, 0, 16, -1.0F, -14.0F, -0.6F, 2, 16, 2, 0.0F, true));

        this.bone22 = new ModelRenderer(this);
        this.bone22.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone21.addChild(bone22);
        this.setRotateAngle(bone22, -0.1745F, 0.0F, 0.0F);
        this.bone22.cubeList.add(new ModelBox(bone22, 8, 16, -16.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone22.cubeList.add(new ModelBox(bone22, 8, 16, 1.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone22.cubeList.add(new ModelBox(bone22, 8, 16, 1.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone22.cubeList.add(new ModelBox(bone22, 8, 16, -16.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone22.cubeList.add(new ModelBox(bone22, 0, 16, -1.0F, -13.5F, -0.2F, 2, 16, 2, 0.0F, true));

        this.bone23 = new ModelRenderer(this);
        this.bone23.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone22.addChild(bone23);
        this.setRotateAngle(bone23, -0.1745F, 0.0F, 0.0F);
        this.bone23.cubeList.add(new ModelBox(bone23, 8, 23, -14.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, true));
        this.bone23.cubeList.add(new ModelBox(bone23, 8, 23, 1.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, false));
        this.bone23.cubeList.add(new ModelBox(bone23, 8, 30, 1.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, false));
        this.bone23.cubeList.add(new ModelBox(bone23, 8, 30, -12.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, true));
        this.bone23.cubeList.add(new ModelBox(bone23, 0, 16, -1.0F, -13.0F, 0.3F, 2, 16, 2, 0.0F, true));

        this.bone24 = new ModelRenderer(this);
        this.bone24.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone23.addChild(bone24);
        this.setRotateAngle(bone24, -0.1745F, 0.0F, 0.0F);
        this.bone24.cubeList.add(new ModelBox(bone24, 32, 7, -7.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, true));
        this.bone24.cubeList.add(new ModelBox(bone24, 32, 7, 1.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, false));
        this.bone24.cubeList.add(new ModelBox(bone24, 32, 0, 1.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, false));
        this.bone24.cubeList.add(new ModelBox(bone24, 32, 0, -9.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, true));
        this.bone24.cubeList.add(new ModelBox(bone24, 0, 16, -1.0F, -12.5F, 0.9F, 2, 16, 2, 0.0F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -13.0F, 2.0F);
        this.bone24.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 0, -2.5F, -11.0F, 0.0F, 5, 12, 0, 0.0F, true));

        this.leaf2 = new ModelRenderer(this);
        this.leaf2.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(leaf2, -0.3054F, -0.7854F, 0.0F);


        this.bone9 = new ModelRenderer(this);
        this.bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf2.addChild(bone9);
        this.setRotateAngle(bone9, -0.6109F, 0.0F, 0.0F);
        this.bone9.cubeList.add(new ModelBox(bone9, 0, 16, -1.0F, -16.0F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone10 = new ModelRenderer(this);
        this.bone10.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone9.addChild(bone10);
        this.setRotateAngle(bone10, -0.0873F, 0.0F, 0.0F);
        this.bone10.cubeList.add(new ModelBox(bone10, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone10.cubeList.add(new ModelBox(bone10, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone10.cubeList.add(new ModelBox(bone10, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone10.cubeList.add(new ModelBox(bone10, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone10.cubeList.add(new ModelBox(bone10, 0, 16, -1.0F, -15.5F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone11 = new ModelRenderer(this);
        this.bone11.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone10.addChild(bone11);
        this.setRotateAngle(bone11, -0.1309F, 0.0F, 0.0F);
        this.bone11.cubeList.add(new ModelBox(bone11, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone11.cubeList.add(new ModelBox(bone11, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone11.cubeList.add(new ModelBox(bone11, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone11.cubeList.add(new ModelBox(bone11, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone11.cubeList.add(new ModelBox(bone11, 0, 16, -1.0F, -15.0F, -0.9F, 2, 16, 2, 0.0F, false));

        this.bone12 = new ModelRenderer(this);
        this.bone12.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone11.addChild(bone12);
        this.setRotateAngle(bone12, -0.0873F, 0.0F, 0.0F);
        this.bone12.cubeList.add(new ModelBox(bone12, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone12.cubeList.add(new ModelBox(bone12, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone12.cubeList.add(new ModelBox(bone12, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone12.cubeList.add(new ModelBox(bone12, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone12.cubeList.add(new ModelBox(bone12, 0, 16, -1.0F, -14.5F, -0.85F, 2, 16, 2, 0.0F, false));

        this.bone13 = new ModelRenderer(this);
        this.bone13.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone12.addChild(bone13);
        this.setRotateAngle(bone13, -0.1309F, 0.0F, 0.0F);
        this.bone13.cubeList.add(new ModelBox(bone13, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone13.cubeList.add(new ModelBox(bone13, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone13.cubeList.add(new ModelBox(bone13, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone13.cubeList.add(new ModelBox(bone13, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone13.cubeList.add(new ModelBox(bone13, 0, 16, -1.0F, -14.0F, -0.6F, 2, 16, 2, 0.0F, false));

        this.bone14 = new ModelRenderer(this);
        this.bone14.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone13.addChild(bone14);
        this.setRotateAngle(bone14, -0.1745F, 0.0F, 0.0F);
        this.bone14.cubeList.add(new ModelBox(bone14, 8, 16, 1.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone14.cubeList.add(new ModelBox(bone14, 8, 16, -16.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone14.cubeList.add(new ModelBox(bone14, 8, 16, -16.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone14.cubeList.add(new ModelBox(bone14, 8, 16, 1.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone14.cubeList.add(new ModelBox(bone14, 0, 16, -1.0F, -13.5F, -0.2F, 2, 16, 2, 0.0F, false));

        this.bone15 = new ModelRenderer(this);
        this.bone15.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone14.addChild(bone15);
        this.setRotateAngle(bone15, -0.1745F, 0.0F, 0.0F);
        this.bone15.cubeList.add(new ModelBox(bone15, 8, 23, 1.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, false));
        this.bone15.cubeList.add(new ModelBox(bone15, 8, 23, -14.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, true));
        this.bone15.cubeList.add(new ModelBox(bone15, 8, 30, -12.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, true));
        this.bone15.cubeList.add(new ModelBox(bone15, 8, 30, 1.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, false));
        this.bone15.cubeList.add(new ModelBox(bone15, 0, 16, -1.0F, -13.0F, 0.3F, 2, 16, 2, 0.0F, false));

        this.bone16 = new ModelRenderer(this);
        this.bone16.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone15.addChild(bone16);
        this.setRotateAngle(bone16, -0.1745F, 0.0F, 0.0F);
        this.bone16.cubeList.add(new ModelBox(bone16, 32, 7, 1.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, false));
        this.bone16.cubeList.add(new ModelBox(bone16, 32, 7, -7.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, true));
        this.bone16.cubeList.add(new ModelBox(bone16, 32, 0, -9.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, true));
        this.bone16.cubeList.add(new ModelBox(bone16, 32, 0, 1.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, false));
        this.bone16.cubeList.add(new ModelBox(bone16, 0, 16, -1.0F, -12.5F, 0.9F, 2, 16, 2, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -13.0F, 2.0F);
        this.bone16.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 0, -2.5F, -11.0F, 0.0F, 5, 12, 0, 0.0F, false));

        this.leaf1 = new ModelRenderer(this);
        this.leaf1.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf1.addChild(bone);
        this.setRotateAngle(bone, -0.6109F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 16, -1.0F, -16.0F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone.addChild(bone2);
        this.setRotateAngle(bone2, -0.0873F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone2.cubeList.add(new ModelBox(bone2, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 16, -1.0F, -15.5F, -1.0F, 2, 16, 2, 0.0F, false));

        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone2.addChild(bone3);
        this.setRotateAngle(bone3, -0.1309F, 0.0F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone3.cubeList.add(new ModelBox(bone3, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone3.cubeList.add(new ModelBox(bone3, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 16, -1.0F, -15.0F, -0.9F, 2, 16, 2, 0.0F, false));

        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, -0.0873F, 0.0F, 0.0F);
        this.bone4.cubeList.add(new ModelBox(bone4, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone4.cubeList.add(new ModelBox(bone4, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone4.cubeList.add(new ModelBox(bone4, 0, 16, -1.0F, -14.5F, -0.85F, 2, 16, 2, 0.0F, false));

        this.bone5 = new ModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone4.addChild(bone5);
        this.setRotateAngle(bone5, -0.1309F, 0.0F, 0.0F);
        this.bone5.cubeList.add(new ModelBox(bone5, 8, 16, -16.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone5.cubeList.add(new ModelBox(bone5, 8, 16, -16.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, true));
        this.bone5.cubeList.add(new ModelBox(bone5, 8, 16, 1.0F, -15.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone5.cubeList.add(new ModelBox(bone5, 8, 16, 1.0F, -7.0F, 0.0F, 15, 7, 0, 0.0F, false));
        this.bone5.cubeList.add(new ModelBox(bone5, 0, 16, -1.0F, -14.0F, -0.6F, 2, 16, 2, 0.0F, false));

        this.bone6 = new ModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, -0.1745F, 0.0F, 0.0F);
        this.bone6.cubeList.add(new ModelBox(bone6, 8, 16, 1.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone6.cubeList.add(new ModelBox(bone6, 8, 16, -16.0F, -15.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone6.cubeList.add(new ModelBox(bone6, 8, 16, -16.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, true));
        this.bone6.cubeList.add(new ModelBox(bone6, 8, 16, 1.0F, -7.0F, 0.3F, 15, 7, 0, 0.0F, false));
        this.bone6.cubeList.add(new ModelBox(bone6, 0, 16, -1.0F, -13.5F, -0.2F, 2, 16, 2, 0.0F, false));

        this.bone7 = new ModelRenderer(this);
        this.bone7.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone6.addChild(bone7);
        this.setRotateAngle(bone7, -0.1745F, 0.0F, 0.0F);
        this.bone7.cubeList.add(new ModelBox(bone7, 8, 23, 1.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, false));
        this.bone7.cubeList.add(new ModelBox(bone7, 8, 23, -14.0F, -7.0F, 0.5F, 13, 7, 0, 0.0F, true));
        this.bone7.cubeList.add(new ModelBox(bone7, 8, 30, -12.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, true));
        this.bone7.cubeList.add(new ModelBox(bone7, 8, 30, 1.0F, -15.0F, 0.5F, 11, 7, 0, 0.0F, false));
        this.bone7.cubeList.add(new ModelBox(bone7, 0, 16, -1.0F, -13.0F, 0.3F, 2, 16, 2, 0.0F, false));

        this.bone8 = new ModelRenderer(this);
        this.bone8.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.bone7.addChild(bone8);
        this.setRotateAngle(bone8, -0.1745F, 0.0F, 0.0F);
        this.bone8.cubeList.add(new ModelBox(bone8, 32, 7, 1.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, false));
        this.bone8.cubeList.add(new ModelBox(bone8, 32, 7, -7.0F, -15.0F, 1.2F, 6, 7, 0, 0.0F, true));
        this.bone8.cubeList.add(new ModelBox(bone8, 32, 0, -9.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, true));
        this.bone8.cubeList.add(new ModelBox(bone8, 32, 0, 1.0F, -7.0F, 1.2F, 8, 7, 0, 0.0F, false));
        this.bone8.cubeList.add(new ModelBox(bone8, 0, 16, -1.0F, -12.5F, 0.9F, 2, 16, 2, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -13.0F, 2.0F);
        this.bone8.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 48, 0, -2.5F, -11.0F, 0.0F, 5, 12, 0, 0.0F, false));

        this.bb_main = new ModelRenderer(this);
        this.bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bb_main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.7854F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 41, 16, -8.0F, -24.0F, -1.0F, 16, 16, 0, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bb_main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.7854F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 16, -8.0F, -24.0F, -1.0F, 16, 16, 0, 0.0F, false));
    }

    public void renderAll(float f) {
        leaf13.render(f);
        leaf12.render(f);
        leaf11.render(f);
        leaf10.render(f);
        leaf9.render(f);
        leaf8.render(f);
        leaf7.render(f);
        leaf6.render(f);
        leaf5.render(f);
        leaf4.render(f);
        leaf3.render(f);
        leaf2.render(f);
        leaf1.render(f);
        bb_main.render(f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
