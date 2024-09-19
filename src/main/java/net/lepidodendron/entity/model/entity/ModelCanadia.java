package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraCanadia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelCanadia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Canadia;
    private final AdvancedModelRenderer LAntenna;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer RAntenna;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer LBristle1;
    private final AdvancedModelRenderer LBristle28;
    private final AdvancedModelRenderer LBristle2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer LBristle25;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer LBristle3;
    private final AdvancedModelRenderer LBristle26;
    private final AdvancedModelRenderer LBristle4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer LBristle27;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer LBristle5;
    private final AdvancedModelRenderer LBristle30;
    private final AdvancedModelRenderer LBristle6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer LBristle29;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer LBristle7;
    private final AdvancedModelRenderer LBristle31;
    private final AdvancedModelRenderer LBristle8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer LBristle32;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer LBristle9;
    private final AdvancedModelRenderer LBristle33;
    private final AdvancedModelRenderer LBristle10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer LBristle34;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer LBristle11;
    private final AdvancedModelRenderer LBristle35;
    private final AdvancedModelRenderer LBristle12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer LBristle36;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Body7;
    private final AdvancedModelRenderer LBristle13;
    private final AdvancedModelRenderer LBristle37;
    private final AdvancedModelRenderer LBristle14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer LBristle38;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Body8;
    private final AdvancedModelRenderer LBristle15;
    private final AdvancedModelRenderer LBristle39;
    private final AdvancedModelRenderer LBristle16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer LBristle40;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer Body9;
    private final AdvancedModelRenderer LBristle17;
    private final AdvancedModelRenderer LBristle41;
    private final AdvancedModelRenderer LBristle18;
    private final AdvancedModelRenderer LBristle42;
    private final AdvancedModelRenderer Body10;
    private final AdvancedModelRenderer LBristle19;
    private final AdvancedModelRenderer LBristle43;
    private final AdvancedModelRenderer LBristle20;
    private final AdvancedModelRenderer LBristle44;
    private final AdvancedModelRenderer Body11;
    private final AdvancedModelRenderer LBristle21;
    private final AdvancedModelRenderer LBristle45;
    private final AdvancedModelRenderer LBristle22;
    private final AdvancedModelRenderer LBristle46;
    private final AdvancedModelRenderer Body12;
    private final AdvancedModelRenderer LBristle23;
    private final AdvancedModelRenderer LBristle47;
    private final AdvancedModelRenderer LBristle24;
    private final AdvancedModelRenderer LBristle48;

    public ModelCanadia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Canadia = new AdvancedModelRenderer(this);
        this.Canadia.setRotationPoint(0.0F, 22.0F, -4.0F);
        this.Canadia.cubeList.add(new ModelBox(Canadia, 0, 8, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.LAntenna = new AdvancedModelRenderer(this);
        this.LAntenna.setRotationPoint(1.0F, 0.5F, -2.0F);
        this.Canadia.addChild(LAntenna);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LAntenna.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, -0.48F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -1.0F, -6.0F, 1, 1, 6, 0.0F, false));

        this.RAntenna = new AdvancedModelRenderer(this);
        this.RAntenna.setRotationPoint(-1.0F, 0.5F, -2.0F);
        this.Canadia.addChild(RAntenna);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RAntenna.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.48F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, -1.0F, -6.0F, 1, 1, 6, 0.0F, true));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Canadia.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 20, 17, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.LBristle1 = new AdvancedModelRenderer(this);
        this.LBristle1.setRotationPoint(1.5F, 1.0F, 1.0F);
        this.Body1.addChild(LBristle1);
        this.setRotateAngle(LBristle1, 0.0F, 0.0F, 0.4363F);
        this.LBristle1.cubeList.add(new ModelBox(LBristle1, 0, 33, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle28 = new AdvancedModelRenderer(this);
        this.LBristle28.setRotationPoint(-1.5F, 1.0F, 1.0F);
        this.Body1.addChild(LBristle28);
        this.setRotateAngle(LBristle28, 0.0F, 0.0F, -0.4363F);
        this.LBristle28.cubeList.add(new ModelBox(LBristle28, 0, 33, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.LBristle2 = new AdvancedModelRenderer(this);
        this.LBristle2.setRotationPoint(1.5F, -1.0F, 1.0F);
        this.Body1.addChild(LBristle2);
        this.setRotateAngle(LBristle2, 0.0F, 0.0F, 0.4363F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.0036F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 19, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle25 = new AdvancedModelRenderer(this);
        this.LBristle25.setRotationPoint(-1.5F, -1.0F, 1.0F);
        this.Body1.addChild(LBristle25);
        this.setRotateAngle(LBristle25, 0.0F, 0.0F, -0.4363F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle25.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 1.0036F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 19, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 9, 17, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.LBristle3 = new AdvancedModelRenderer(this);
        this.LBristle3.setRotationPoint(1.5F, 1.0F, 1.0F);
        this.Body2.addChild(LBristle3);
        this.setRotateAngle(LBristle3, 0.0F, 0.0F, 0.4363F);
        this.LBristle3.cubeList.add(new ModelBox(LBristle3, 0, 33, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle26 = new AdvancedModelRenderer(this);
        this.LBristle26.setRotationPoint(-1.5F, 1.0F, 1.0F);
        this.Body2.addChild(LBristle26);
        this.setRotateAngle(LBristle26, 0.0F, 0.0F, -0.4363F);
        this.LBristle26.cubeList.add(new ModelBox(LBristle26, 0, 33, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.LBristle4 = new AdvancedModelRenderer(this);
        this.LBristle4.setRotationPoint(1.5F, -1.0F, 1.0F);
        this.Body2.addChild(LBristle4);
        this.setRotateAngle(LBristle4, 0.0F, 0.0F, 0.4363F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -1.0036F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 30, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle27 = new AdvancedModelRenderer(this);
        this.LBristle27.setRotationPoint(-1.5F, -1.0F, 1.0F);
        this.Body2.addChild(LBristle27);
        this.setRotateAngle(LBristle27, 0.0F, 0.0F, -0.4363F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle27.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 1.0036F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 30, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 9, 17, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.LBristle5 = new AdvancedModelRenderer(this);
        this.LBristle5.setRotationPoint(1.5F, 1.0F, 1.0F);
        this.Body3.addChild(LBristle5);
        this.setRotateAngle(LBristle5, 0.0F, 0.0F, 0.4363F);
        this.LBristle5.cubeList.add(new ModelBox(LBristle5, 35, 11, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle30 = new AdvancedModelRenderer(this);
        this.LBristle30.setRotationPoint(-1.5F, 1.0F, 1.0F);
        this.Body3.addChild(LBristle30);
        this.setRotateAngle(LBristle30, 0.0F, 0.0F, -0.4363F);
        this.LBristle30.cubeList.add(new ModelBox(LBristle30, 35, 11, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.LBristle6 = new AdvancedModelRenderer(this);
        this.LBristle6.setRotationPoint(1.5F, -1.0F, 1.0F);
        this.Body3.addChild(LBristle6);
        this.setRotateAngle(LBristle6, 0.0F, 0.0F, 0.4363F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle6.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -1.0036F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 16, 0.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F, false));

        this.LBristle29 = new AdvancedModelRenderer(this);
        this.LBristle29.setRotationPoint(-1.5F, -1.0F, 1.0F);
        this.Body3.addChild(LBristle29);
        this.setRotateAngle(LBristle29, 0.0F, 0.0F, -0.4363F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle29.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 1.0036F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 29, 16, -4.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F, true));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 20, 0, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.LBristle7 = new AdvancedModelRenderer(this);
        this.LBristle7.setRotationPoint(1.5F, 1.0F, 1.0F);
        this.Body4.addChild(LBristle7);
        this.setRotateAngle(LBristle7, 0.0F, 0.0F, 0.4363F);
        this.LBristle7.cubeList.add(new ModelBox(LBristle7, 7, 32, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle31 = new AdvancedModelRenderer(this);
        this.LBristle31.setRotationPoint(-1.5F, 1.0F, 1.0F);
        this.Body4.addChild(LBristle31);
        this.setRotateAngle(LBristle31, 0.0F, 0.0F, -0.4363F);
        this.LBristle31.cubeList.add(new ModelBox(LBristle31, 7, 32, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.LBristle8 = new AdvancedModelRenderer(this);
        this.LBristle8.setRotationPoint(1.5F, -1.0F, 1.0F);
        this.Body4.addChild(LBristle8);
        this.setRotateAngle(LBristle8, 0.0F, 0.0F, 0.4363F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle8.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -1.0036F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 27, 27, 0.0F, -1.0F, 0.0F, 5, 2, 0, 0.0F, false));

        this.LBristle32 = new AdvancedModelRenderer(this);
        this.LBristle32.setRotationPoint(-1.5F, -1.0F, 1.0F);
        this.Body4.addChild(LBristle32);
        this.setRotateAngle(LBristle32, 0.0F, 0.0F, -0.4363F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle32.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 1.0036F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 27, 27, -5.0F, -1.0F, 0.0F, 5, 2, 0, 0.0F, true));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 20, 0, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.LBristle9 = new AdvancedModelRenderer(this);
        this.LBristle9.setRotationPoint(1.5F, 1.0F, 1.0F);
        this.Body5.addChild(LBristle9);
        this.setRotateAngle(LBristle9, 0.0F, 0.0F, 0.4363F);
        this.LBristle9.cubeList.add(new ModelBox(LBristle9, 35, 11, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle33 = new AdvancedModelRenderer(this);
        this.LBristle33.setRotationPoint(-1.5F, 1.0F, 1.0F);
        this.Body5.addChild(LBristle33);
        this.setRotateAngle(LBristle33, 0.0F, 0.0F, -0.4363F);
        this.LBristle33.cubeList.add(new ModelBox(LBristle33, 35, 11, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.LBristle10 = new AdvancedModelRenderer(this);
        this.LBristle10.setRotationPoint(1.5F, -1.0F, 1.0F);
        this.Body5.addChild(LBristle10);
        this.setRotateAngle(LBristle10, 0.0F, 0.0F, 0.4363F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle10.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -1.0036F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 11, 0.0F, -1.0F, 0.0F, 6, 2, 0, 0.0F, false));

        this.LBristle34 = new AdvancedModelRenderer(this);
        this.LBristle34.setRotationPoint(-1.5F, -1.0F, 1.0F);
        this.Body5.addChild(LBristle34);
        this.setRotateAngle(LBristle34, 0.0F, 0.0F, -0.4363F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle34.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 1.0036F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 11, -6.0F, -1.0F, 0.0F, 6, 2, 0, 0.0F, true));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 9, 17, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.LBristle11 = new AdvancedModelRenderer(this);
        this.LBristle11.setRotationPoint(1.5F, 1.0F, 1.0F);
        this.Body6.addChild(LBristle11);
        this.setRotateAngle(LBristle11, 0.0F, 0.0F, 0.4363F);
        this.LBristle11.cubeList.add(new ModelBox(LBristle11, 14, 32, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle35 = new AdvancedModelRenderer(this);
        this.LBristle35.setRotationPoint(-1.5F, 1.0F, 1.0F);
        this.Body6.addChild(LBristle35);
        this.setRotateAngle(LBristle35, 0.0F, 0.0F, -0.4363F);
        this.LBristle35.cubeList.add(new ModelBox(LBristle35, 14, 32, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.LBristle12 = new AdvancedModelRenderer(this);
        this.LBristle12.setRotationPoint(1.5F, -1.0F, 1.0F);
        this.Body6.addChild(LBristle12);
        this.setRotateAngle(LBristle12, 0.0F, 0.0F, 0.4363F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle12.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -1.0036F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 14, 0.0F, -1.0F, 0.0F, 6, 2, 0, 0.0F, false));

        this.LBristle36 = new AdvancedModelRenderer(this);
        this.LBristle36.setRotationPoint(-1.5F, -1.0F, 1.0F);
        this.Body6.addChild(LBristle36);
        this.setRotateAngle(LBristle36, 0.0F, 0.0F, -0.4363F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle36.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 1.0036F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 14, -6.0F, -1.0F, 0.0F, 6, 2, 0, 0.0F, true));

        this.Body7 = new AdvancedModelRenderer(this);
        this.Body7.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body5.addChild(Body7);
        this.Body7.cubeList.add(new ModelBox(Body7, 9, 17, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.LBristle13 = new AdvancedModelRenderer(this);
        this.LBristle13.setRotationPoint(1.5F, 1.0F, 1.0F);
        this.Body7.addChild(LBristle13);
        this.setRotateAngle(LBristle13, 0.0F, 0.0F, 0.4363F);
        this.LBristle13.cubeList.add(new ModelBox(LBristle13, 33, 8, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle37 = new AdvancedModelRenderer(this);
        this.LBristle37.setRotationPoint(-1.5F, 1.0F, 1.0F);
        this.Body7.addChild(LBristle37);
        this.setRotateAngle(LBristle37, 0.0F, 0.0F, -0.4363F);
        this.LBristle37.cubeList.add(new ModelBox(LBristle37, 33, 8, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.LBristle14 = new AdvancedModelRenderer(this);
        this.LBristle14.setRotationPoint(1.5F, -1.0F, 1.0F);
        this.Body7.addChild(LBristle14);
        this.setRotateAngle(LBristle14, 0.0F, 0.0F, 0.4363F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle14.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -1.0036F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 8, 0.0F, -1.0F, 0.0F, 6, 2, 0, 0.0F, false));

        this.LBristle38 = new AdvancedModelRenderer(this);
        this.LBristle38.setRotationPoint(-1.5F, -1.0F, 1.0F);
        this.Body7.addChild(LBristle38);
        this.setRotateAngle(LBristle38, 0.0F, 0.0F, -0.4363F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle38.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 1.0036F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 8, 8, -6.0F, -1.0F, 0.0F, 6, 2, 0, 0.0F, true));

        this.Body8 = new AdvancedModelRenderer(this);
        this.Body8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body7.addChild(Body8);
        this.Body8.cubeList.add(new ModelBox(Body8, 9, 0, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.LBristle15 = new AdvancedModelRenderer(this);
        this.LBristle15.setRotationPoint(1.5F, 1.0F, 1.0F);
        this.Body8.addChild(LBristle15);
        this.setRotateAngle(LBristle15, 0.0F, 0.0F, 0.4363F);
        this.LBristle15.cubeList.add(new ModelBox(LBristle15, 0, 33, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle39 = new AdvancedModelRenderer(this);
        this.LBristle39.setRotationPoint(-1.5F, 1.0F, 1.0F);
        this.Body8.addChild(LBristle39);
        this.setRotateAngle(LBristle39, 0.0F, 0.0F, -0.4363F);
        this.LBristle39.cubeList.add(new ModelBox(LBristle39, 0, 33, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.LBristle16 = new AdvancedModelRenderer(this);
        this.LBristle16.setRotationPoint(1.5F, -1.0F, 1.0F);
        this.Body8.addChild(LBristle16);
        this.setRotateAngle(LBristle16, 0.0F, 0.0F, 0.4363F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle16.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -1.0036F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 5, 0.0F, -1.0F, 0.0F, 6, 2, 0, 0.0F, false));

        this.LBristle40 = new AdvancedModelRenderer(this);
        this.LBristle40.setRotationPoint(-1.5F, -1.0F, 1.0F);
        this.Body8.addChild(LBristle40);
        this.setRotateAngle(LBristle40, 0.0F, 0.0F, -0.4363F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LBristle40.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 1.0036F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 15, 5, -6.0F, -1.0F, 0.0F, 6, 2, 0, 0.0F, true));

        this.Body9 = new AdvancedModelRenderer(this);
        this.Body9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body8.addChild(Body9);
        this.Body9.cubeList.add(new ModelBox(Body9, 9, 27, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.LBristle17 = new AdvancedModelRenderer(this);
        this.LBristle17.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.Body9.addChild(LBristle17);
        this.setRotateAngle(LBristle17, 0.0F, 0.0F, -0.48F);
        this.LBristle17.cubeList.add(new ModelBox(LBristle17, 24, 13, 0.0F, -1.0F, 0.0F, 5, 2, 0, 0.0F, false));

        this.LBristle41 = new AdvancedModelRenderer(this);
        this.LBristle41.setRotationPoint(-1.0F, -1.0F, 1.0F);
        this.Body9.addChild(LBristle41);
        this.setRotateAngle(LBristle41, 0.0F, 0.0F, 0.48F);
        this.LBristle41.cubeList.add(new ModelBox(LBristle41, 24, 13, -5.0F, -1.0F, 0.0F, 5, 2, 0, 0.0F, true));

        this.LBristle18 = new AdvancedModelRenderer(this);
        this.LBristle18.setRotationPoint(1.0F, 1.0F, 1.0F);
        this.Body9.addChild(LBristle18);
        this.setRotateAngle(LBristle18, 0.0F, 0.0F, 0.3927F);
        this.LBristle18.cubeList.add(new ModelBox(LBristle18, 31, 0, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle42 = new AdvancedModelRenderer(this);
        this.LBristle42.setRotationPoint(-1.0F, 1.0F, 1.0F);
        this.Body9.addChild(LBristle42);
        this.setRotateAngle(LBristle42, 0.0F, 0.0F, -0.3927F);
        this.LBristle42.cubeList.add(new ModelBox(LBristle42, 31, 0, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.Body10 = new AdvancedModelRenderer(this);
        this.Body10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body9.addChild(Body10);
        this.Body10.cubeList.add(new ModelBox(Body10, 18, 27, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.LBristle19 = new AdvancedModelRenderer(this);
        this.LBristle19.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.Body10.addChild(LBristle19);
        this.setRotateAngle(LBristle19, 0.0F, 0.0F, -0.48F);
        this.LBristle19.cubeList.add(new ModelBox(LBristle19, 29, 16, 0.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F, false));

        this.LBristle43 = new AdvancedModelRenderer(this);
        this.LBristle43.setRotationPoint(-1.0F, -1.0F, 1.0F);
        this.Body10.addChild(LBristle43);
        this.setRotateAngle(LBristle43, 0.0F, 0.0F, 0.48F);
        this.LBristle43.cubeList.add(new ModelBox(LBristle43, 29, 16, -4.0F, -1.0F, 0.0F, 4, 2, 0, 0.0F, true));

        this.LBristle20 = new AdvancedModelRenderer(this);
        this.LBristle20.setRotationPoint(1.0F, 1.0F, 1.0F);
        this.Body10.addChild(LBristle20);
        this.setRotateAngle(LBristle20, 0.0F, 0.0F, 0.3927F);
        this.LBristle20.cubeList.add(new ModelBox(LBristle20, 35, 33, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle44 = new AdvancedModelRenderer(this);
        this.LBristle44.setRotationPoint(-1.0F, 1.0F, 1.0F);
        this.Body10.addChild(LBristle44);
        this.setRotateAngle(LBristle44, 0.0F, 0.0F, -0.3927F);
        this.LBristle44.cubeList.add(new ModelBox(LBristle44, 35, 33, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.Body11 = new AdvancedModelRenderer(this);
        this.Body11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body10.addChild(Body11);
        this.Body11.cubeList.add(new ModelBox(Body11, 24, 8, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.LBristle21 = new AdvancedModelRenderer(this);
        this.LBristle21.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.Body11.addChild(LBristle21);
        this.setRotateAngle(LBristle21, 0.0F, 0.0F, -0.48F);
        this.LBristle21.cubeList.add(new ModelBox(LBristle21, 31, 19, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle45 = new AdvancedModelRenderer(this);
        this.LBristle45.setRotationPoint(-1.0F, -1.0F, 1.0F);
        this.Body11.addChild(LBristle45);
        this.setRotateAngle(LBristle45, 0.0F, 0.0F, 0.48F);
        this.LBristle45.cubeList.add(new ModelBox(LBristle45, 31, 19, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.LBristle22 = new AdvancedModelRenderer(this);
        this.LBristle22.setRotationPoint(1.0F, 1.0F, 1.0F);
        this.Body11.addChild(LBristle22);
        this.setRotateAngle(LBristle22, 0.0F, 0.0F, 0.3927F);
        this.LBristle22.cubeList.add(new ModelBox(LBristle22, 0, 30, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle46 = new AdvancedModelRenderer(this);
        this.LBristle46.setRotationPoint(-1.0F, 1.0F, 1.0F);
        this.Body11.addChild(LBristle46);
        this.setRotateAngle(LBristle46, 0.0F, 0.0F, -0.3927F);
        this.LBristle46.cubeList.add(new ModelBox(LBristle46, 0, 30, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.Body12 = new AdvancedModelRenderer(this);
        this.Body12.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body11.addChild(Body12);
        this.Body12.cubeList.add(new ModelBox(Body12, 0, 25, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.LBristle23 = new AdvancedModelRenderer(this);
        this.LBristle23.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.Body12.addChild(LBristle23);
        this.setRotateAngle(LBristle23, 0.0F, 0.0F, -0.48F);
        this.LBristle23.cubeList.add(new ModelBox(LBristle23, 31, 19, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle47 = new AdvancedModelRenderer(this);
        this.LBristle47.setRotationPoint(-1.0F, -1.0F, 1.0F);
        this.Body12.addChild(LBristle47);
        this.setRotateAngle(LBristle47, 0.0F, 0.0F, 0.48F);
        this.LBristle47.cubeList.add(new ModelBox(LBristle47, 31, 19, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.LBristle24 = new AdvancedModelRenderer(this);
        this.LBristle24.setRotationPoint(1.0F, 1.0F, 1.0F);
        this.Body12.addChild(LBristle24);
        this.setRotateAngle(LBristle24, 0.0F, 0.0F, 0.3927F);
        this.LBristle24.cubeList.add(new ModelBox(LBristle24, 0, 30, 0.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.LBristle48 = new AdvancedModelRenderer(this);
        this.LBristle48.setRotationPoint(-1.0F, 1.0F, 1.0F);
        this.Body12.addChild(LBristle48);
        this.setRotateAngle(LBristle48, 0.0F, 0.0F, -0.3927F);
        this.LBristle48.cubeList.add(new ModelBox(LBristle48, 0, 30, -3.0F, -1.0F, 0.0F, 3, 2, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Canadia.render(f5 * 0.09F);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Canadia.offsetY = -0.40F;
        this.Canadia.offsetX = -0.25F;
        this.Canadia.rotateAngleY = (float)Math.toRadians(45);
        this.Canadia.rotateAngleX = (float)Math.toRadians(-35);
        this.Canadia.rotateAngleZ = (float)Math.toRadians(-20);
        this.Canadia.scaleChildren = true;
        float scaler = 0.65F;
        this.Canadia.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Canadia.render(f);
        //Reset rotations, positions and sizing:
        this.Canadia.setScale(1.0F, 1.0F, 1.0F);
        this.Canadia.scaleChildren = false;
        resetToDefaultPose();
    }
    
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Canadia.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        //super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Canadia.offsetY = 1.32F;

        AdvancedModelRenderer[] BodyF = {this.Body1, this.Body2, this.Body3, this.Body4, this.Body5, this.Body6};
        AdvancedModelRenderer[] BodyB = {this.Body7, this.Body8, this.Body9, this.Body10, this.Body11, this.Body12};
        AdvancedModelRenderer[] BodyFull = {this.Body1, this.Body2, this.Body3, this.Body4, this.Body5, this.Body6, this.Body7, this.Body8, this.Body9, this.Body10, this.Body11, this.Body12};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            //Antennae:
            this.LAntenna.swing(0.3F, 0.3F, false, 0, 0.15F, f2, 1f);
            this.RAntenna.swing(0.3F, -0.3F, false, 0, -0.15F, f2, 1f);
            this.LAntenna.flap(0.2F, 0.1F, false, 0, 0.05F, f2, 1f);
            this.RAntenna.flap(0.2F, -0.1F, false, 0, -0.05F, f2, 1f);

            EntityPrehistoricFloraCanadia ee = (EntityPrehistoricFloraCanadia) e;

            if (!ee.isAtBottom()) {
                this.chainWave(BodyFull, 0.2F, -0.015F, -3, f2, 0.4F);
                this.chainWave(BodyF, 0.2F, 0.08F, 3, f2, 0.5F);
            }
            this.chainSwing(BodyFull, 0.2F, -0.015F, -3, f2, 0.4F);
            this.chainSwing(BodyF, 0.2F, 0.08F, 3, f2, 0.5F);
            this.chainSwing(BodyB, 0.2F, -0.08F, -3, f2, 0.5F);

            this.LBristle1.swing(0.15F, (float)Math.toRadians(45), false, 0, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle2.swing(0.15F, (float)Math.toRadians(45), false, 0, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle25.swing(0.15F, -(float)Math.toRadians(45), false, 0, (float)Math.toRadians(12.5), f2, 1F);
            this.LBristle26.swing(0.15F, -(float)Math.toRadians(45), false, 0, (float)Math.toRadians(12.5), f2, 1F);

            this.LBristle3.swing(0.15F, (float)Math.toRadians(45), false, 0.2F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle4.swing(0.15F, (float)Math.toRadians(45), false, 0.3F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle27.swing(0.15F, -(float)Math.toRadians(45), false, 0.2F, (float)Math.toRadians(12.5), f2, 1F);
            this.LBristle28.swing(0.15F, -(float)Math.toRadians(45), false, 0.3F, (float)Math.toRadians(12.5), f2, 1F);

            this.LBristle5.swing(0.15F, (float)Math.toRadians(45), false, 0.4F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle6.swing(0.15F, (float)Math.toRadians(45), false, 0.4F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle29.swing(0.15F, -(float)Math.toRadians(45), false, 0.4F, (float)Math.toRadians(12.5), f2, 1F);
            this.LBristle30.swing(0.15F, -(float)Math.toRadians(45), false, 0.4F, (float)Math.toRadians(12.5), f2, 1F);

            this.LBristle7.swing(0.15F, (float)Math.toRadians(45), false, 0.6F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle8.swing(0.15F, (float)Math.toRadians(45), false, 0.6F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle31.swing(0.15F, -(float)Math.toRadians(45), false, 0.6F, (float)Math.toRadians(12.5), f2, 1F);
            this.LBristle32.swing(0.15F, -(float)Math.toRadians(45), false, 0.6F, (float)Math.toRadians(12.5), f2, 1F);

            this.LBristle9.swing(0.15F, (float)Math.toRadians(45), false, 0.8F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle10.swing(0.15F, (float)Math.toRadians(45), false, 0.8F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle33.swing(0.15F, -(float)Math.toRadians(45), false, 0.8F, (float)Math.toRadians(12.5), f2, 1F);
            this.LBristle34.swing(0.15F, -(float)Math.toRadians(45), false, 0.8F, (float)Math.toRadians(12.5), f2, 1F);

            this.LBristle11.swing(0.15F, (float)Math.toRadians(45), false, 1.0F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle12.swing(0.15F, (float)Math.toRadians(45), false, 1.0F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle35.swing(0.15F, -(float)Math.toRadians(45), false, 1.0F, (float)Math.toRadians(12.5), f2, 1F);
            this.LBristle36.swing(0.15F, -(float)Math.toRadians(45), false, 1.0F, (float)Math.toRadians(12.5), f2, 1F);

            this.LBristle13.swing(0.15F, (float)Math.toRadians(45), false, 1.2F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle14.swing(0.15F, (float)Math.toRadians(45), false, 1.2F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle37.swing(0.15F, -(float)Math.toRadians(45), false, 1.2F, (float)Math.toRadians(12.5), f2, 1F);
            this.LBristle38.swing(0.15F, -(float)Math.toRadians(45), false, 1.2F, (float)Math.toRadians(12.5), f2, 1F);

            this.LBristle15.swing(0.15F, (float)Math.toRadians(45), false, 1.4F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle16.swing(0.15F, (float)Math.toRadians(45), false, 1.4F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle39.swing(0.15F, -(float)Math.toRadians(45), false, 1.4F, (float)Math.toRadians(12.5), f2, 1F);
            this.LBristle40.swing(0.15F, -(float)Math.toRadians(45), false, 1.4F, (float)Math.toRadians(12.5), f2, 1F);

            this.LBristle17.swing(0.15F, (float)Math.toRadians(45), false, 1.6F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle18.swing(0.15F, (float)Math.toRadians(45), false, 1.6F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle41.swing(0.15F, -(float)Math.toRadians(45), false, 1.6F, (float)Math.toRadians(12.5), f2, 1F);
            this.LBristle42.swing(0.15F, -(float)Math.toRadians(45), false, 1.6F, (float)Math.toRadians(12.5), f2, 1F);

            this.LBristle19.swing(0.15F, (float)Math.toRadians(45), false, 1.8F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle20.swing(0.15F, (float)Math.toRadians(45), false, 1.8F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle43.swing(0.15F, -(float)Math.toRadians(45), false, 1.8F, (float)Math.toRadians(12.5), f2, 1F);
            this.LBristle44.swing(0.15F, -(float)Math.toRadians(45), false, 1.8F, (float)Math.toRadians(12.5), f2, 1F);

            this.LBristle21.swing(0.15F, (float)Math.toRadians(45), false, 2F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle22.swing(0.15F, (float)Math.toRadians(45), false, 2F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle45.swing(0.15F, -(float)Math.toRadians(45), false, 2F, (float)Math.toRadians(12.5), f2, 1F);
            this.LBristle46.swing(0.15F, -(float)Math.toRadians(45), false, 2F, (float)Math.toRadians(12.5), f2, 1F);

            this.LBristle23.swing(0.15F, (float)Math.toRadians(45), false, 2.2F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle24.swing(0.15F, (float)Math.toRadians(45), false, 2.2F, (float)-Math.toRadians(12.5), f2, 1F);
            this.LBristle47.swing(0.15F, -(float)Math.toRadians(45), false, 2.2F, (float)Math.toRadians(12.5), f2, 1F);
            this.LBristle48.swing(0.15F, -(float)Math.toRadians(45), false, 2.2F, (float)Math.toRadians(12.5), f2, 1F);

            this.Body1.scaleChildren = true;
            float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.08F) + 1F;
            this.Body1.setScaleZ(scaler);
        }
    }
}
