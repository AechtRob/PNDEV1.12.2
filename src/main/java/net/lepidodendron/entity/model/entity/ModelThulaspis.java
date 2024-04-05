package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraEoredlichia;
import net.lepidodendron.entity.EntityPrehistoricFloraThulaspis;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelThulaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer Thulaspis;
    private final AdvancedModelRenderer LEFTPLATE1;
    private final AdvancedModelRenderer RIGHTPLATE1;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftFlap1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightFlap1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFlap2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFlap2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer LEFTPLATE2;
    private final AdvancedModelRenderer RIGHTPLATE2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFlap3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFlap3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftFlap4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightFlap4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer LEFTPLATE3;
    private final AdvancedModelRenderer RIGHTPLATE3;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer leftFlap5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer rightFlap5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer leftFlap6;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer rightFlap6;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer LEFTPLATE4;
    private final AdvancedModelRenderer RIGHTPLATE4;
    private final AdvancedModelRenderer leftLeg7;
    private final AdvancedModelRenderer leftFlap7;
    private final AdvancedModelRenderer rightLeg7;
    private final AdvancedModelRenderer rightFlap7;
    private final AdvancedModelRenderer leftLeg8;
    private final AdvancedModelRenderer leftFlap8;
    private final AdvancedModelRenderer rightLeg8;
    private final AdvancedModelRenderer rightFlap8;

    public ModelThulaspis() {
        this.textureWidth = 24;
        this.textureHeight = 21;

        this.Thulaspis = new AdvancedModelRenderer(this);
        this.Thulaspis.setRotationPoint(0.0F, 22.5F, -2.0F);
        this.setRotateAngle(Thulaspis, 0.1745F, 0.0F, 0.0F);


        this.LEFTPLATE1 = new AdvancedModelRenderer(this);
        this.LEFTPLATE1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Thulaspis.addChild(LEFTPLATE1);
        this.setRotateAngle(LEFTPLATE1, 0.0F, 0.0F, 0.2443F);
        this.LEFTPLATE1.cubeList.add(new ModelBox(LEFTPLATE1, 0, 4, 0.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, false));
        this.LEFTPLATE1.cubeList.add(new ModelBox(LEFTPLATE1, 16, 11, 0.0F, 0.0F, -1.0F, 1, 1, 2, 0.02F, false));

        this.RIGHTPLATE1 = new AdvancedModelRenderer(this);
        this.RIGHTPLATE1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Thulaspis.addChild(RIGHTPLATE1);
        this.setRotateAngle(RIGHTPLATE1, 0.0F, 0.0F, -0.2443F);
        this.RIGHTPLATE1.cubeList.add(new ModelBox(RIGHTPLATE1, 0, 4, -4.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, true));
        this.RIGHTPLATE1.cubeList.add(new ModelBox(RIGHTPLATE1, 16, 11, -1.0F, 0.0F, -1.0F, 1, 1, 2, 0.02F, true));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.5F, 0.75F, -2.0F);
        this.Thulaspis.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, -0.0436F, 0.0F, 0.0F);
        this.leftAntenna.cubeList.add(new ModelBox(leftAntenna, 0, 12, 0.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.5F, 0.75F, -2.0F);
        this.Thulaspis.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, -0.0436F, 0.0F, 0.0F);
        this.rightAntenna.cubeList.add(new ModelBox(rightAntenna, 0, 12, -3.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.0F, 0.95F, -1.5F);
        this.Thulaspis.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.0476F, 0.8356F, 0.0663F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 9, 18, -1.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leftFlap1 = new AdvancedModelRenderer(this);
        this.leftFlap1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg1.addChild(leftFlap1);
        this.setRotateAngle(leftFlap1, 0.0873F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFlap1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 8, -0.5F, -0.01F, 0.0F, 3, 0, 2, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.0F, 0.95F, -1.5F);
        this.Thulaspis.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.0476F, -0.8356F, -0.0663F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 9, 18, -2.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.rightFlap1 = new AdvancedModelRenderer(this);
        this.rightFlap1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg1.addChild(rightFlap1);
        this.setRotateAngle(rightFlap1, 0.0873F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFlap1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 8, -2.5F, -0.01F, 0.0F, 3, 0, 2, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.0F, 1.0F, -0.25F);
        this.Thulaspis.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0142F, 0.6955F, 0.1722F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 9, 18, -1.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leftFlap2 = new AdvancedModelRenderer(this);
        this.leftFlap2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg2.addChild(leftFlap2);
        this.setRotateAngle(leftFlap2, 0.0873F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFlap2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2618F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 8, -0.35F, -0.01F, 0.0F, 3, 0, 2, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.0F, 1.0F, -0.25F);
        this.Thulaspis.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0142F, -0.6955F, -0.1722F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 9, 18, -2.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.rightFlap2 = new AdvancedModelRenderer(this);
        this.rightFlap2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg2.addChild(rightFlap2);
        this.setRotateAngle(rightFlap2, 0.0873F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFlap2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 8, -2.65F, -0.01F, 0.0F, 3, 0, 2, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Thulaspis.addChild(body1);
        this.setRotateAngle(body1, -0.1745F, 0.0F, 0.0F);


        this.LEFTPLATE2 = new AdvancedModelRenderer(this);
        this.LEFTPLATE2.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.body1.addChild(LEFTPLATE2);
        this.setRotateAngle(LEFTPLATE2, 0.0F, 0.0F, 0.2618F);
        this.LEFTPLATE2.cubeList.add(new ModelBox(LEFTPLATE2, 0, 0, 0.15F, 0.0F, -1.5F, 4, 0, 3, 0.0F, false));
        this.LEFTPLATE2.cubeList.add(new ModelBox(LEFTPLATE2, 0, 16, 0.0F, 0.0F, -1.5F, 1, 1, 3, 0.01F, false));

        this.RIGHTPLATE2 = new AdvancedModelRenderer(this);
        this.RIGHTPLATE2.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.body1.addChild(RIGHTPLATE2);
        this.setRotateAngle(RIGHTPLATE2, 0.0F, 0.0F, -0.2618F);
        this.RIGHTPLATE2.cubeList.add(new ModelBox(RIGHTPLATE2, 0, 0, -4.15F, 0.0F, -1.5F, 4, 0, 3, 0.0F, true));
        this.RIGHTPLATE2.cubeList.add(new ModelBox(RIGHTPLATE2, 0, 16, -1.0F, 0.0F, -1.5F, 1, 1, 3, 0.01F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.0F, 1.0F, 1.0F);
        this.body1.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.1786F, 0.5483F, 0.3091F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 9, 18, -1.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leftFlap3 = new AdvancedModelRenderer(this);
        this.leftFlap3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg3.addChild(leftFlap3);
        this.setRotateAngle(leftFlap3, 0.0873F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFlap3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.2618F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 8, -0.35F, -0.01F, 0.0F, 3, 0, 2, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.0F, 1.0F, 1.0F);
        this.body1.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.1786F, -0.5483F, -0.3091F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 9, 18, -2.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.rightFlap3 = new AdvancedModelRenderer(this);
        this.rightFlap3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg3.addChild(rightFlap3);
        this.setRotateAngle(rightFlap3, 0.0873F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFlap3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.2618F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 8, -2.65F, -0.01F, 0.0F, 3, 0, 2, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(1.0F, 1.0F, 2.25F);
        this.body1.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.1677F, 0.5497F, 0.3098F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 9, 18, -1.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leftFlap4 = new AdvancedModelRenderer(this);
        this.leftFlap4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg4.addChild(leftFlap4);
        this.setRotateAngle(leftFlap4, 0.0873F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFlap4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.2618F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 8, -0.5F, -0.01F, 0.0F, 3, 0, 2, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-1.0F, 1.0F, 2.25F);
        this.body1.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.1677F, -0.5497F, -0.3098F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 9, 18, -1.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.rightFlap4 = new AdvancedModelRenderer(this);
        this.rightFlap4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg4.addChild(rightFlap4);
        this.setRotateAngle(rightFlap4, 0.0873F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFlap4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.2618F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 8, -2.5F, -0.01F, 0.0F, 3, 0, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body1.addChild(body2);


        this.LEFTPLATE3 = new AdvancedModelRenderer(this);
        this.LEFTPLATE3.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.body2.addChild(LEFTPLATE3);
        this.setRotateAngle(LEFTPLATE3, 0.0F, 0.0F, 0.2618F);
        this.LEFTPLATE3.cubeList.add(new ModelBox(LEFTPLATE3, 0, 8, 0.05F, 0.0F, -1.5F, 4, 0, 3, 0.0F, false));
        this.LEFTPLATE3.cubeList.add(new ModelBox(LEFTPLATE3, 10, 13, 0.0F, 0.0F, -1.5F, 1, 1, 3, 0.02F, false));

        this.RIGHTPLATE3 = new AdvancedModelRenderer(this);
        this.RIGHTPLATE3.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.body2.addChild(RIGHTPLATE3);
        this.setRotateAngle(RIGHTPLATE3, 0.0F, 0.0F, -0.2618F);
        this.RIGHTPLATE3.cubeList.add(new ModelBox(RIGHTPLATE3, 0, 8, -4.05F, 0.0F, -1.5F, 4, 0, 3, 0.0F, true));
        this.RIGHTPLATE3.cubeList.add(new ModelBox(RIGHTPLATE3, 10, 13, -1.0F, 0.0F, -1.5F, 1, 1, 3, 0.02F, true));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(1.0F, 1.0F, 0.5F);
        this.body2.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.2082F, 0.5354F, 0.4102F);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 8, 20, -0.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftFlap5 = new AdvancedModelRenderer(this);
        this.leftFlap5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg5.addChild(leftFlap5);
        this.setRotateAngle(leftFlap5, 0.112F, -0.3041F, -0.0954F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.25F, 0.0F, 0.0F);
        this.leftFlap5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 8, -0.5F, -0.06F, 0.0F, 3, 0, 2, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(-1.0F, 1.0F, 0.5F);
        this.body2.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.2082F, -0.5354F, -0.4102F);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 8, 20, -1.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.rightFlap5 = new AdvancedModelRenderer(this);
        this.rightFlap5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg5.addChild(rightFlap5);
        this.setRotateAngle(rightFlap5, 0.112F, 0.3041F, 0.0954F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.25F, 0.0F, 0.0F);
        this.rightFlap5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 8, -2.5F, -0.06F, 0.0F, 3, 0, 2, 0.0F, true));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(1.0F, 1.0F, 1.75F);
        this.body2.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.1896F, 0.5258F, 0.4595F);
        this.leftLeg6.cubeList.add(new ModelBox(leftLeg6, 8, 20, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftFlap6 = new AdvancedModelRenderer(this);
        this.leftFlap6.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.leftLeg6.addChild(leftFlap6);
        this.setRotateAngle(leftFlap6, 0.0606F, 0.008F, -0.1307F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFlap6.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.2618F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 8, -1.0F, -0.01F, 0.0F, 3, 0, 2, 0.0F, false));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(-1.0F, 1.0F, 1.75F);
        this.body2.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.1896F, -0.5258F, -0.4595F);
        this.rightLeg6.cubeList.add(new ModelBox(rightLeg6, 8, 20, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.rightFlap6 = new AdvancedModelRenderer(this);
        this.rightFlap6.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.rightLeg6.addChild(rightFlap6);
        this.setRotateAngle(rightFlap6, 0.0606F, -0.008F, 0.1307F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFlap6.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2618F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 8, -2.0F, -0.01F, 0.0F, 3, 0, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 16, 18, -0.5F, 0.15F, -0.3F, 1, 1, 2, -0.01F, false));

        this.LEFTPLATE4 = new AdvancedModelRenderer(this);
        this.LEFTPLATE4.setRotationPoint(0.5F, 0.1F, 1.5F);
        this.tail.addChild(LEFTPLATE4);
        this.setRotateAngle(LEFTPLATE4, 0.0F, 0.0F, 0.2618F);
        this.LEFTPLATE4.cubeList.add(new ModelBox(LEFTPLATE4, 12, 1, -0.55F, 0.05F, -1.5F, 3, 0, 3, 0.0F, false));

        this.RIGHTPLATE4 = new AdvancedModelRenderer(this);
        this.RIGHTPLATE4.setRotationPoint(-0.5F, 0.1F, 1.5F);
        this.tail.addChild(RIGHTPLATE4);
        this.setRotateAngle(RIGHTPLATE4, 0.0F, 0.0F, -0.2618F);
        this.RIGHTPLATE4.cubeList.add(new ModelBox(RIGHTPLATE4, 12, 1, -2.45F, 0.05F, -1.5F, 3, 0, 3, 0.0F, true));

        this.leftLeg7 = new AdvancedModelRenderer(this);
        this.leftLeg7.setRotationPoint(0.5F, 1.0F, 0.0F);
        this.tail.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, 0.208F, 0.1135F, 0.369F);
        this.leftLeg7.cubeList.add(new ModelBox(leftLeg7, 8, 20, -0.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftFlap7 = new AdvancedModelRenderer(this);
        this.leftFlap7.setRotationPoint(0.15F, 0.0F, 0.0F);
        this.leftLeg7.addChild(leftFlap7);
        this.setRotateAngle(leftFlap7, 0.1309F, -0.0873F, -0.0873F);
        this.leftFlap7.cubeList.add(new ModelBox(leftFlap7, 19, 15, 0.0F, -0.01F, 0.0F, 2, 0, 1, 0.0F, false));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(-0.5F, 1.0F, 0.0F);
        this.tail.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, 0.208F, -0.1135F, -0.369F);
        this.rightLeg7.cubeList.add(new ModelBox(rightLeg7, 8, 20, -1.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.rightFlap7 = new AdvancedModelRenderer(this);
        this.rightFlap7.setRotationPoint(-0.15F, 0.0F, 0.0F);
        this.rightLeg7.addChild(rightFlap7);
        this.setRotateAngle(rightFlap7, 0.1309F, 0.0873F, 0.0873F);
        this.rightFlap7.cubeList.add(new ModelBox(rightFlap7, 19, 15, -2.0F, -0.01F, 0.0F, 2, 0, 1, 0.0F, true));

        this.leftLeg8 = new AdvancedModelRenderer(this);
        this.leftLeg8.setRotationPoint(0.5F, 0.85F, 1.0F);
        this.tail.addChild(leftLeg8);
        this.setRotateAngle(leftLeg8, 0.2184F, 0.0426F, 0.4021F);
        this.leftLeg8.cubeList.add(new ModelBox(leftLeg8, 8, 20, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftFlap8 = new AdvancedModelRenderer(this);
        this.leftFlap8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg8.addChild(leftFlap8);
        this.setRotateAngle(leftFlap8, 0.0611F, -0.1151F, -0.0823F);
        this.leftFlap8.cubeList.add(new ModelBox(leftFlap8, 19, 15, -0.25F, -0.01F, 0.0F, 2, 0, 1, 0.0F, false));

        this.rightLeg8 = new AdvancedModelRenderer(this);
        this.rightLeg8.setRotationPoint(-0.5F, 0.85F, 1.0F);
        this.tail.addChild(rightLeg8);
        this.setRotateAngle(rightLeg8, 0.2184F, -0.0426F, -0.4021F);
        this.rightLeg8.cubeList.add(new ModelBox(rightLeg8, 8, 20, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.rightFlap8 = new AdvancedModelRenderer(this);
        this.rightFlap8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg8.addChild(rightFlap8);
        this.setRotateAngle(rightFlap8, 0.0611F, 0.1151F, 0.0823F);
        this.rightFlap8.cubeList.add(new ModelBox(rightFlap8, 19, 15, -1.75F, -0.01F, 0.0F, 2, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Thulaspis.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Thulaspis.render(0.022F);
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
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.bone.offsetY = 0.975F;

        AdvancedModelRenderer[] legsL = {this.leftLeg1, this.leftLeg2, this.leftLeg3, this.leftLeg4, this.leftLeg5, this.leftLeg6, this.leftLeg7, this.leftLeg8};
        AdvancedModelRenderer[] legsR = {this.rightLeg1, this.rightLeg2, this.rightLeg3, this.rightLeg4, this.rightLeg5, this.rightLeg6, this.rightLeg7, this.rightLeg8};
        AdvancedModelRenderer[] frillL = {this.leftFlap1, this.leftFlap2, this.leftFlap3, this.leftFlap4, this.leftFlap5, this.leftFlap6, this.leftFlap7, this.leftFlap8};
        AdvancedModelRenderer[] frillR = {this.rightFlap1, this.rightFlap2, this.rightFlap3, this.rightFlap4, this.rightFlap5, this.rightFlap6, this.rightFlap7, this.rightFlap8};
        AdvancedModelRenderer[] bodyF = {this.body1, this.body2, this.tail};


            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(frillL, 0.2F, -0.2F, -3, f2, 1);
            this.chainWave(frillR, 0.2F, -0.2F, -3, f2, 1);

            this.flap(leftLeg1, 0.5F, -0.4F, true, 0, -0.5F, f2, 0.3F);
            this.flap(rightLeg1, 0.5F, 0.4F, true, 0, 0.5F, f2, 0.3F);
            this.flap(leftLeg2, 0.5F, -0.4F, true, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg2, 0.5F, 0.4F, true, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg3, 0.5F, -0.4F, true, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg3, 0.5F, 0.4F, true, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg4, 0.5F, -0.4F, true, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg4, 0.5F, 0.4F, true, 3.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg5, 0.5F, -0.4F, true, 4.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg5, 0.5F, 0.4F, true, 4.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg6, 0.5F, -0.4F, true, 5.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg6, 0.5F, 0.4F, true, 5.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg7, 0.5F, -0.4F, true, 6.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg7, 0.5F, 0.4F, true, 6.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg8, 0.5F, -0.4F, true, 7.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg8, 0.5F, 0.4F, true, 7.0F, 0.5F, f2, 0.3F);

            this.chainSwing(bodyF, 0.1F, 0.1F, -3, f2, 1.0F);
            this.chainWave(bodyF, 0.1F, 0.05f, -3, f2, 0.1F);
        

        this.swing(leftAntenna, 0.4F, -0.22F, false, 0, -0.1F, f2, 0.8F);
        this.swing(rightAntenna, 0.4F, 0.22F, false, 0, 0.1F, f2, 0.8F);

    }
}
