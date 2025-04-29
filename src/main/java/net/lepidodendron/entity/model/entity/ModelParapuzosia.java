package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAmmonite_Parapuzosia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelParapuzosia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer shell8;
    private final AdvancedModelRenderer shell9;
    private final AdvancedModelRenderer shell10;
    private final AdvancedModelRenderer shell11;
    private final AdvancedModelRenderer Mantle;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer eyeLeft;
    private final AdvancedModelRenderer eyeRight;
    private final AdvancedModelRenderer Tentacle1a;
    private final AdvancedModelRenderer Tentacle1b;
    private final AdvancedModelRenderer Tentacle1c;
    private final AdvancedModelRenderer Tentacle2a;
    private final AdvancedModelRenderer Tentacle2b;
    private final AdvancedModelRenderer Tentacle2c;
    private final AdvancedModelRenderer Tentacle3a;
    private final AdvancedModelRenderer Tentacle3b;
    private final AdvancedModelRenderer Tentacle3c;
    private final AdvancedModelRenderer Tentacle4a;
    private final AdvancedModelRenderer Tentacle1a_r1;
    private final AdvancedModelRenderer Tentacle4b;
    private final AdvancedModelRenderer Tentacle1b_r1;
    private final AdvancedModelRenderer Tentacle4c;
    private final AdvancedModelRenderer Tentacle1b_r2;
    private final AdvancedModelRenderer Tentacle5a;
    private final AdvancedModelRenderer Tentacle5b;
    private final AdvancedModelRenderer Tentacle5c;
    private final AdvancedModelRenderer Tentacle6a;
    private final AdvancedModelRenderer Tentacle6b;
    private final AdvancedModelRenderer Tentacle6c;
    private final AdvancedModelRenderer Tentacle7a;
    private final AdvancedModelRenderer Tentacle7b;
    private final AdvancedModelRenderer Tentacle7c;
    private final AdvancedModelRenderer Tentacle8a;
    private final AdvancedModelRenderer Tentacle8b;
    private final AdvancedModelRenderer Tentacle8c;
    private final AdvancedModelRenderer Tentacle9a;
    private final AdvancedModelRenderer Tentacle1a_r2;
    private final AdvancedModelRenderer Tentacle9b;
    private final AdvancedModelRenderer Tentacle1b_r3;
    private final AdvancedModelRenderer Tentacle9c;
    private final AdvancedModelRenderer Tentacle1b_r4;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;
    private final AdvancedModelRenderer Tentacle10c;

    private ModelAnimator animator;

    public ModelParapuzosia() {
        this.textureWidth = 170;
        this.textureHeight = 170;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.setRotateAngle(root, -0.0873F, 0.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.root.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 0, 36, -6.0F, -18.0F, -8.0F, 12, 18, 16, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 105, -3.5F, -33.0F, -10.0F, 7, 15, 13, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.694F, 0.9039F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -6.5F, -20.0F, 8.0F, 13, 20, 16, 0.0F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.6109F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 40, 54, -5.5F, -18.0F, -16.0F, 11, 18, 16, 0.0F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, -16.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.6545F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 56, 20, -5.0F, -17.0F, -16.0F, 10, 17, 16, 0.0F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, -16.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.637F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 0, 72, -4.5F, -15.0F, -16.0F, 9, 15, 16, 0.0F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, -16.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.7636F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 34, 88, -4.0F, -14.0F, -16.0F, 8, 14, 16, 0.0F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, -16.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.7199F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 92, 0, -4.0F, -13.0F, -14.0F, 8, 13, 14, -0.01F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, -0.7199F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 94, 39, -4.0F, -12.0F, -14.0F, 8, 12, 14, -0.02F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, -0.8072F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 77, 71, -4.0F, -12.0F, -17.0F, 8, 12, 17, -0.03F, false));

        this.shell9 = new AdvancedModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, 0.0F, -13.0F);
        this.shell8.addChild(shell9);
        this.setRotateAngle(shell9, -0.8945F, 0.0F, 0.0F);


        this.shell10 = new AdvancedModelRenderer(this);
        this.shell10.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.shell9.addChild(shell10);
        this.setRotateAngle(shell10, -0.8945F, 0.0F, 0.0F);


        this.shell11 = new AdvancedModelRenderer(this);
        this.shell11.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.shell10.addChild(shell11);
        this.setRotateAngle(shell11, -0.8945F, 0.0F, 0.0F);


        this.Mantle = new AdvancedModelRenderer(this);
        this.Mantle.setRotationPoint(0.0F, -23.4F, 13.8F);
        this.shell.addChild(Mantle);
        this.setRotateAngle(Mantle, 0.0944F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 82, 100, -5.5F, -1.0F, -1.0F, 11, 14, 11, 0.0F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.0F, 11.9F, 6.0F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.2995F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 109, 140, -2.5F, -1.0F, -2.0F, 5, 4, 7, 0.0F, false));

        this.eyeLeft = new AdvancedModelRenderer(this);
        this.eyeLeft.setRotationPoint(-5.5F, 0.675F, 6.5F);
        this.Mantle.addChild(eyeLeft);
        this.setRotateAngle(eyeLeft, -0.0999F, 0.5148F, -0.2009F);
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 141, 98, -3.0F, -0.4F, -3.5F, 5, 5, 5, 0.0F, false));

        this.eyeRight = new AdvancedModelRenderer(this);
        this.eyeRight.setRotationPoint(5.5F, 0.675F, 6.5F);
        this.Mantle.addChild(eyeRight);
        this.setRotateAngle(eyeRight, -0.0999F, -0.5148F, 0.2009F);
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 110, 77, -2.0F, -0.4F, -3.5F, 5, 5, 5, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(-2.4F, 10.75F, 9.125F);
        this.Mantle.addChild(Tentacle1a);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 85, 140, -1.4898F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 138, 42, -1.4898F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle1c = new AdvancedModelRenderer(this);
        this.Tentacle1c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle1b.addChild(Tentacle1c);
        this.Tentacle1c.cubeList.add(new ModelBox(Tentacle1c, 70, 137, -1.4898F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(-3.4F, 8.25F, 9.125F);
        this.Mantle.addChild(Tentacle2a);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 137, 3, -1.4898F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 15, 136, -1.4898F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle2c = new AdvancedModelRenderer(this);
        this.Tentacle2c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle2b.addChild(Tentacle2c);
        this.Tentacle2c.cubeList.add(new ModelBox(Tentacle2c, 133, 131, -1.4898F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(-3.65F, 5.75F, 9.125F);
        this.Mantle.addChild(Tentacle3a);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 133, 119, -1.4898F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 133, 80, -1.4898F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle3c = new AdvancedModelRenderer(this);
        this.Tentacle3c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle3b.addChild(Tentacle3c);
        this.Tentacle3c.cubeList.add(new ModelBox(Tentacle3c, 0, 133, -1.4898F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(-3.4F, 3.25F, 9.125F);
        this.Mantle.addChild(Tentacle4a);


        this.Tentacle1a_r1 = new AdvancedModelRenderer(this);
        this.Tentacle1a_r1.setRotationPoint(0.0102F, 0.048F, 4.5443F);
        this.Tentacle4a.addChild(Tentacle1a_r1);
        this.setRotateAngle(Tentacle1a_r1, 0.0F, 0.0F, -1.5708F);
        this.Tentacle1a_r1.cubeList.add(new ModelBox(Tentacle1a_r1, 55, 130, -1.5F, -1.5F, -4.5F, 3, 3, 9, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle4a.addChild(Tentacle4b);


        this.Tentacle1b_r1 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r1.setRotationPoint(0.0102F, 0.048F, 4.5443F);
        this.Tentacle4b.addChild(Tentacle1b_r1);
        this.setRotateAngle(Tentacle1b_r1, 0.0F, 0.0F, -1.5708F);
        this.Tentacle1b_r1.cubeList.add(new ModelBox(Tentacle1b_r1, 31, 130, -1.4986F, -1.5F, -4.7F, 3, 3, 9, -0.2F, false));

        this.Tentacle4c = new AdvancedModelRenderer(this);
        this.Tentacle4c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle4b.addChild(Tentacle4c);


        this.Tentacle1b_r2 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r2.setRotationPoint(0.0102F, 0.048F, 4.5443F);
        this.Tentacle4c.addChild(Tentacle1b_r2);
        this.setRotateAngle(Tentacle1b_r2, 0.0F, 0.0F, -1.5708F);
        this.Tentacle1b_r2.cubeList.add(new ModelBox(Tentacle1b_r2, 129, 56, -1.4971F, -1.5F, -4.9F, 3, 3, 9, -0.4F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(-2.4F, 0.75F, 9.125F);
        this.Mantle.addChild(Tentacle5a);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 118, 128, -1.4898F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 94, 128, -1.4898F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle5c = new AdvancedModelRenderer(this);
        this.Tentacle5c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle5b.addChild(Tentacle5c);
        this.Tentacle5c.cubeList.add(new ModelBox(Tentacle5c, 127, 18, -1.4898F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(2.4F, 10.75F, 9.125F);
        this.Mantle.addChild(Tentacle6a);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 110, 65, -1.5102F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 108, 27, -1.5102F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle6c = new AdvancedModelRenderer(this);
        this.Tentacle6c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle6b.addChild(Tentacle6c);
        this.Tentacle6c.cubeList.add(new ModelBox(Tentacle6c, 78, 56, -1.5102F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(3.4F, 8.25F, 9.125F);
        this.Mantle.addChild(Tentacle7a);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 64, 118, -1.5102F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 40, 118, -1.5102F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle7c = new AdvancedModelRenderer(this);
        this.Tentacle7c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle7b.addChild(Tentacle7c);
        this.Tentacle7c.cubeList.add(new ModelBox(Tentacle7c, 117, 116, -1.5102F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(3.65F, 5.75F, 9.125F);
        this.Mantle.addChild(Tentacle8a);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 72, 0, -1.5102F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 57, 3, -1.5102F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle8c = new AdvancedModelRenderer(this);
        this.Tentacle8c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle8b.addChild(Tentacle8c);
        this.Tentacle8c.cubeList.add(new ModelBox(Tentacle8c, 42, 0, -1.5102F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(3.4F, 3.25F, 9.125F);
        this.Mantle.addChild(Tentacle9a);


        this.Tentacle1a_r2 = new AdvancedModelRenderer(this);
        this.Tentacle1a_r2.setRotationPoint(-0.0102F, 0.048F, 4.5443F);
        this.Tentacle9a.addChild(Tentacle1a_r2);
        this.setRotateAngle(Tentacle1a_r2, 0.0F, 0.0F, 1.5708F);
        this.Tentacle1a_r2.cubeList.add(new ModelBox(Tentacle1a_r2, 124, 30, -1.5F, -1.5F, -4.5F, 3, 3, 9, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle9a.addChild(Tentacle9b);


        this.Tentacle1b_r3 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r3.setRotationPoint(-0.0102F, 0.048F, 4.5443F);
        this.Tentacle9b.addChild(Tentacle1b_r3);
        this.setRotateAngle(Tentacle1b_r3, 0.0F, 0.0F, 1.5708F);
        this.Tentacle1b_r3.cubeList.add(new ModelBox(Tentacle1b_r3, 122, 0, -1.5014F, -1.5F, -4.7F, 3, 3, 9, -0.2F, false));

        this.Tentacle9c = new AdvancedModelRenderer(this);
        this.Tentacle9c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle9b.addChild(Tentacle9c);


        this.Tentacle1b_r4 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r4.setRotationPoint(-0.0102F, 0.048F, 4.5443F);
        this.Tentacle9c.addChild(Tentacle1b_r4);
        this.setRotateAngle(Tentacle1b_r4, 0.0F, 0.0F, 1.5708F);
        this.Tentacle1b_r4.cubeList.add(new ModelBox(Tentacle1b_r4, 118, 91, -1.5029F, -1.5F, -4.9F, 3, 3, 9, -0.4F, false));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(2.4F, 0.75F, 9.125F);
        this.Mantle.addChild(Tentacle10a);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 126, 103, -1.5102F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 79, 125, -1.5102F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle10c = new AdvancedModelRenderer(this);
        this.Tentacle10c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle10b.addChild(Tentacle10c);
        this.Tentacle10c.cubeList.add(new ModelBox(Tentacle10c, 125, 68, -1.5102F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetY = -0.2F;
        this.root.offsetX = -0.15F;
        this.root.offsetZ = -0.4F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetZ = -0.1F;
        this.root.offsetY = -0.03F;
        this.root.offsetX = -0.02F;
        this.root.render(0.01F);
        resetToDefaultPose();

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.4F;
        this.root.offsetX = -0.35F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 0.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, -0.2F, 0.8F, -0.2F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAmmonite_Parapuzosia ee = (EntityPrehistoricFloraAmmonite_Parapuzosia) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAmmonite_Parapuzosia entity = (EntityPrehistoricFloraAmmonite_Parapuzosia) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(shell, shell.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), shell.rotateAngleY + (float) Math.toRadians(0), shell.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*5));
        this.shell.rotationPointX = this.shell.rotationPointX + (float)(0);
        this.shell.rotationPointY = this.shell.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1);
        this.shell.rotationPointZ = this.shell.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*3);


        this.setRotateAngle(Mantle, Mantle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5), Mantle.rotateAngleY + (float) Math.toRadians(0), Mantle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-2.5));
        this.Mantle.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.01));


        this.setRotateAngle(Siphon, Siphon.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-5), Siphon.rotateAngleY + (float) Math.toRadians(0), Siphon.rotateAngleZ + (float) Math.toRadians(0));
        this.Siphon.rotationPointX = this.Siphon.rotationPointX + (float)(0);
        this.Siphon.rotationPointY = this.Siphon.rotationPointY - (float)(0);
        this.Siphon.rotationPointZ = this.Siphon.rotationPointZ + (float)(-2.875);
        this.Siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.05),(float)(0.8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.2),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-0.2));


        this.setRotateAngle(eyeLeft, eyeLeft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*5), eyeLeft.rotateAngleY + (float) Math.toRadians(-50), eyeLeft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(eyeRight, eyeRight.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*5), eyeRight.rotateAngleY + (float) Math.toRadians(50), eyeRight.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle1a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle1a.rotateAngleZ + (float) Math.toRadians(5));
        this.Tentacle1a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle1b, Tentacle1b.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle1b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), Tentacle1b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle1c, Tentacle1c.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle1c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), Tentacle1c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle2a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle2a.rotateAngleZ + (float) Math.toRadians(-15));
        this.Tentacle2a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle2b, Tentacle2b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), Tentacle2b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle2b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle2c, Tentacle2c.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), Tentacle2c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle2c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(5), Tentacle3a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle3a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle3a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle3b, Tentacle3b.rotateAngleX + (float) Math.toRadians(-5), Tentacle3b.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle3b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle3c, Tentacle3c.rotateAngleX + (float) Math.toRadians(-2.5), Tentacle3c.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle3c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle4a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle4a.rotateAngleZ + (float) Math.toRadians(15));
        this.Tentacle4a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle4b, Tentacle4b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle4b.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle4b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle4c, Tentacle4c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle4c.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle4c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle5a.rotateAngleY + (float) Math.toRadians(2.5), Tentacle5a.rotateAngleZ + (float) Math.toRadians(-5));
        this.Tentacle5a.rotationPointX = this.Tentacle5a.rotationPointX + (float)(0.5);
        this.Tentacle5a.rotationPointY = this.Tentacle5a.rotationPointY - (float)(0);
        this.Tentacle5a.rotationPointZ = this.Tentacle5a.rotationPointZ + (float)(0);
        this.Tentacle5a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle5b, Tentacle5b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle5b.rotateAngleY + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), Tentacle5b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle5c, Tentacle5c.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle5c.rotateAngleY + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), Tentacle5c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle6a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle6a.rotateAngleZ + (float) Math.toRadians(-5));
        this.Tentacle6a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle6b, Tentacle6b.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle6b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle6b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle6c, Tentacle6c.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle6c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle6c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle7a, Tentacle7a.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle7a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle7a.rotateAngleZ + (float) Math.toRadians(15));
        this.Tentacle7a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle7b, Tentacle7b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), Tentacle7b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle7b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle7c, Tentacle7c.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), Tentacle7c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle7c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle8a, Tentacle8a.rotateAngleX + (float) Math.toRadians(5), Tentacle8a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle8a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle8a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle8b, Tentacle8b.rotateAngleX + (float) Math.toRadians(-5), Tentacle8b.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle8b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle8c, Tentacle8c.rotateAngleX + (float) Math.toRadians(-2.5), Tentacle8c.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle8c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle9a, Tentacle9a.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle9a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle9a.rotateAngleZ + (float) Math.toRadians(-15));
        this.Tentacle9a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle9b, Tentacle9b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle9b.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle9b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle9c, Tentacle9c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle9c.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle9c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle10a, Tentacle10a.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle10a.rotateAngleY + (float) Math.toRadians(-2.5), Tentacle10a.rotateAngleZ + (float) Math.toRadians(5));
        this.Tentacle10a.rotationPointX = this.Tentacle10a.rotationPointX + (float)(-0.5);
        this.Tentacle10a.rotationPointY = this.Tentacle10a.rotationPointY - (float)(0);
        this.Tentacle10a.rotationPointZ = this.Tentacle10a.rotationPointZ + (float)(0);
        this.Tentacle10a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle10b, Tentacle10b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle10b.rotateAngleY + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle10b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle10c, Tentacle10c.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle10c.rotateAngleY + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle10c.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAmmonite_Parapuzosia entity = (EntityPrehistoricFloraAmmonite_Parapuzosia) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(shell, shell.rotateAngleX + (float) Math.toRadians(xx), shell.rotateAngleY + (float) Math.toRadians(yy), shell.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-7.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-7.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-7.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-7.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-7.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-7.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-7.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-7.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-7.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-7.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-7.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.shell.rotationPointX = this.shell.rotationPointX + (float)(xx);
        this.shell.rotationPointY = this.shell.rotationPointY - (float)(yy);
        this.shell.rotationPointZ = this.shell.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Mantle, Mantle.rotateAngleX + (float) Math.toRadians(xx), Mantle.rotateAngleY + (float) Math.toRadians(yy), Mantle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01)));
            zz = 1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01 + (((tickAnim - 0) / 30) * (1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01-(1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01)));
            zz = 1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01 + (((tickAnim - 30) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01-(1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01 + (((tickAnim - 40) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01 + (((tickAnim - 70) / 10) * (1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.01-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Mantle.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Siphon, Siphon.rotateAngleX + (float) Math.toRadians(xx), Siphon.rotateAngleY + (float) Math.toRadians(yy), Siphon.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2 + (((tickAnim - 0) / 30) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2 + (((tickAnim - 30) / 10) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.2-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.2-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.2 + (((tickAnim - 40) / 30) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.2-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.2)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.2 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.2-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.2)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.2 + (((tickAnim - 70) / 10) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.2)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.2 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.2)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Siphon.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = -50 + (((tickAnim - 0) / 30) * (-50-(-50)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = -50 + (((tickAnim - 30) / 10) * (-50-(-50)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
            yy = -50 + (((tickAnim - 40) / 30) * (-50-(-50)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
            yy = -50 + (((tickAnim - 70) / 10) * (-50-(-50)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyeLeft, eyeLeft.rotateAngleX + (float) Math.toRadians(xx), eyeLeft.rotateAngleY + (float) Math.toRadians(yy), eyeLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 50 + (((tickAnim - 0) / 30) * (50-(50)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 50 + (((tickAnim - 30) / 10) * (50-(50)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
            yy = 50 + (((tickAnim - 40) / 30) * (50-(50)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
            yy = 50 + (((tickAnim - 70) / 10) * (50-(50)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyeRight, eyeRight.rotateAngleX + (float) Math.toRadians(xx), eyeRight.rotateAngleY + (float) Math.toRadians(yy), eyeRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5)));
            zz = 30 + (((tickAnim - 0) / 30) * (30-(30)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 30) / 10) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5)));
            zz = 30 + (((tickAnim - 30) / 10) * (5-(30)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            zz = 5 + (((tickAnim - 40) / 30) * (5-(5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            zz = 5 + (((tickAnim - 70) / 10) * (30-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(xx), Tentacle1a.rotateAngleY + (float) Math.toRadians(yy), Tentacle1a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle1a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 30) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            yy = 0 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 40) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle1b, Tentacle1b.rotateAngleX + (float) Math.toRadians(xx), Tentacle1b.rotateAngleY + (float) Math.toRadians(yy), Tentacle1b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 30) / 10) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            yy = 0 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 40) / 30) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle1c, Tentacle1c.rotateAngleX + (float) Math.toRadians(xx), Tentacle1c.rotateAngleY + (float) Math.toRadians(yy), Tentacle1c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            zz = -20 + (((tickAnim - 0) / 30) * (-20-(-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            zz = -20 + (((tickAnim - 30) / 10) * (-15-(-20)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 40) / 30) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = -15 + (((tickAnim - 40) / 30) * (-15-(-15)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = -15 + (((tickAnim - 70) / 10) * (-20-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(xx), Tentacle2a.rotateAngleY + (float) Math.toRadians(yy), Tentacle2a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle2a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 70) / 10) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle2b, Tentacle2b.rotateAngleX + (float) Math.toRadians(xx), Tentacle2b.rotateAngleY + (float) Math.toRadians(yy), Tentacle2b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25 + (((tickAnim - 70) / 10) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle2c, Tentacle2c.rotateAngleX + (float) Math.toRadians(xx), Tentacle2c.rotateAngleY + (float) Math.toRadians(yy), Tentacle2c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (5-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 5 + (((tickAnim - 40) / 30) * (5-(5)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 70) / 10) * (0-(5)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(xx), Tentacle3a.rotateAngleY + (float) Math.toRadians(yy), Tentacle3a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle3a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 70) / 10) * (0-(-5)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle3b, Tentacle3b.rotateAngleX + (float) Math.toRadians(xx), Tentacle3b.rotateAngleY + (float) Math.toRadians(yy), Tentacle3b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-2.5-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5 + (((tickAnim - 40) / 30) * (-2.5-(-2.5)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 70) / 10) * (0-(-2.5)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle3c, Tentacle3c.rotateAngleX + (float) Math.toRadians(xx), Tentacle3c.rotateAngleY + (float) Math.toRadians(yy), Tentacle3c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            zz = 20 + (((tickAnim - 0) / 30) * (20-(20)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            zz = 20 + (((tickAnim - 30) / 10) * (15-(20)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 15 + (((tickAnim - 40) / 30) * (15-(15)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 15 + (((tickAnim - 70) / 10) * (20-(15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(xx), Tentacle4a.rotateAngleY + (float) Math.toRadians(yy), Tentacle4a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle4a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 70) / 10) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle4b, Tentacle4b.rotateAngleX + (float) Math.toRadians(xx), Tentacle4b.rotateAngleY + (float) Math.toRadians(yy), Tentacle4b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle4c, Tentacle4c.rotateAngleX + (float) Math.toRadians(xx), Tentacle4c.rotateAngleY + (float) Math.toRadians(yy), Tentacle4c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5)));
            zz = -30 + (((tickAnim - 0) / 30) * (-30-(-30)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5 + (((tickAnim - 30) / 10) * (2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5)));
            zz = -30 + (((tickAnim - 30) / 10) * (-5-(-30)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 2.5 + (((tickAnim - 40) / 30) * (2.5-(2.5)));
            zz = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5-(2.5)));
            zz = -5 + (((tickAnim - 70) / 10) * (-30-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(xx), Tentacle5a.rotateAngleY + (float) Math.toRadians(yy), Tentacle5a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0.5 + (((tickAnim - 0) / 30) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.5 + (((tickAnim - 30) / 10) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0.5 + (((tickAnim - 40) / 30) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.5 + (((tickAnim - 70) / 10) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tentacle5a.rotationPointX = this.Tentacle5a.rotationPointX + (float)(xx);
        this.Tentacle5a.rotationPointY = this.Tentacle5a.rotationPointY - (float)(yy);
        this.Tentacle5a.rotationPointZ = this.Tentacle5a.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle5a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            yy = 0 + (((tickAnim - 30) / 10) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 40) / 30) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 70) / 10) * (0-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle5b, Tentacle5b.rotateAngleX + (float) Math.toRadians(xx), Tentacle5b.rotateAngleY + (float) Math.toRadians(yy), Tentacle5b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            yy = 0 + (((tickAnim - 30) / 10) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25 + (((tickAnim - 40) / 30) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25 + (((tickAnim - 70) / 10) * (0-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle5c, Tentacle5c.rotateAngleX + (float) Math.toRadians(xx), Tentacle5c.rotateAngleY + (float) Math.toRadians(yy), Tentacle5c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            zz = -30 + (((tickAnim - 0) / 30) * (-30-(-30)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 30) / 10) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            zz = -30 + (((tickAnim - 30) / 10) * (-5-(-30)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = -5 + (((tickAnim - 70) / 10) * (-30-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(xx), Tentacle6a.rotateAngleY + (float) Math.toRadians(yy), Tentacle6a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle6a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 30) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            yy = 0 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 40) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle6b, Tentacle6b.rotateAngleX + (float) Math.toRadians(xx), Tentacle6b.rotateAngleY + (float) Math.toRadians(yy), Tentacle6b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 30) / 10) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            yy = 0 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 40) / 30) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle6c, Tentacle6c.rotateAngleX + (float) Math.toRadians(xx), Tentacle6c.rotateAngleY + (float) Math.toRadians(yy), Tentacle6c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            zz = 20 + (((tickAnim - 0) / 30) * (20-(20)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            zz = 20 + (((tickAnim - 30) / 10) * (15-(20)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 40) / 30) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 15 + (((tickAnim - 40) / 30) * (15-(15)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 15 + (((tickAnim - 70) / 10) * (20-(15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle7a, Tentacle7a.rotateAngleX + (float) Math.toRadians(xx), Tentacle7a.rotateAngleY + (float) Math.toRadians(yy), Tentacle7a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle7a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 70) / 10) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle7b, Tentacle7b.rotateAngleX + (float) Math.toRadians(xx), Tentacle7b.rotateAngleY + (float) Math.toRadians(yy), Tentacle7b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25 + (((tickAnim - 70) / 10) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle7c, Tentacle7c.rotateAngleX + (float) Math.toRadians(xx), Tentacle7c.rotateAngleY + (float) Math.toRadians(yy), Tentacle7c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (5-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 5 + (((tickAnim - 40) / 30) * (5-(5)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 70) / 10) * (0-(5)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle8a, Tentacle8a.rotateAngleX + (float) Math.toRadians(xx), Tentacle8a.rotateAngleY + (float) Math.toRadians(yy), Tentacle8a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle8a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 70) / 10) * (0-(-5)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle8b, Tentacle8b.rotateAngleX + (float) Math.toRadians(xx), Tentacle8b.rotateAngleY + (float) Math.toRadians(yy), Tentacle8b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-2.5-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5 + (((tickAnim - 40) / 30) * (-2.5-(-2.5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 70) / 10) * (0-(-2.5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle8c, Tentacle8c.rotateAngleX + (float) Math.toRadians(xx), Tentacle8c.rotateAngleY + (float) Math.toRadians(yy), Tentacle8c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            zz = -20 + (((tickAnim - 0) / 30) * (-20-(-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            zz = -20 + (((tickAnim - 30) / 10) * (-15-(-20)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = -15 + (((tickAnim - 40) / 30) * (-15-(-15)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = -15 + (((tickAnim - 70) / 10) * (-20-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle9a, Tentacle9a.rotateAngleX + (float) Math.toRadians(xx), Tentacle9a.rotateAngleY + (float) Math.toRadians(yy), Tentacle9a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle9a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 70) / 10) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle9b, Tentacle9b.rotateAngleX + (float) Math.toRadians(xx), Tentacle9b.rotateAngleY + (float) Math.toRadians(yy), Tentacle9b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle9c, Tentacle9c.rotateAngleX + (float) Math.toRadians(xx), Tentacle9c.rotateAngleY + (float) Math.toRadians(yy), Tentacle9c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            zz = 30 + (((tickAnim - 0) / 30) * (30-(30)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 30) / 10) * (-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            zz = 30 + (((tickAnim - 30) / 10) * (5-(30)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = -2.5 + (((tickAnim - 40) / 30) * (-2.5-(-2.5)));
            zz = 5 + (((tickAnim - 40) / 30) * (5-(5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = -2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(-2.5)));
            zz = 5 + (((tickAnim - 70) / 10) * (30-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle10a, Tentacle10a.rotateAngleX + (float) Math.toRadians(xx), Tentacle10a.rotateAngleY + (float) Math.toRadians(yy), Tentacle10a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.5 + (((tickAnim - 0) / 30) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -0.5 + (((tickAnim - 30) / 10) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -0.5 + (((tickAnim - 40) / 30) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -0.5 + (((tickAnim - 70) / 10) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tentacle10a.rotationPointX = this.Tentacle10a.rotationPointX + (float)(xx);
        this.Tentacle10a.rotationPointY = this.Tentacle10a.rotationPointY - (float)(yy);
        this.Tentacle10a.rotationPointZ = this.Tentacle10a.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle10a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            yy = 0 + (((tickAnim - 30) / 10) * (1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 40) / 30) * (1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 70) / 10) * (0-(1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle10b, Tentacle10b.rotateAngleX + (float) Math.toRadians(xx), Tentacle10b.rotateAngleY + (float) Math.toRadians(yy), Tentacle10b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            yy = 0 + (((tickAnim - 30) / 10) * (1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 40) / 30) * (1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 70) / 10) * (0-(1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle10c, Tentacle10c.rotateAngleX + (float) Math.toRadians(xx), Tentacle10c.rotateAngleY + (float) Math.toRadians(yy), Tentacle10c.rotateAngleZ + (float) Math.toRadians(zz));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraAmmonite_Parapuzosia ee = (EntityPrehistoricFloraAmmonite_Parapuzosia) e;

        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = 1.1F;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

