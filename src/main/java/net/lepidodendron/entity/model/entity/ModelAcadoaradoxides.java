package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraAcadoaradoxides;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelAcadoaradoxides extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Acadoparadoxides;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer CEPHALONSIDE;
    private final AdvancedModelRenderer ANGLECEPHALON1;
    private final AdvancedModelRenderer ANGLECEPHALON2;
    private final AdvancedModelRenderer CEPHALONSIDE2;
    private final AdvancedModelRenderer ANGLECEPHALON3;
    private final AdvancedModelRenderer ANGLECEPHALON4;
    private final AdvancedModelRenderer CEPHALONSPINE;
    private final AdvancedModelRenderer CEPHALONSPINE2;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer leftAntenna1;
    private final AdvancedModelRenderer rightAntenna1;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer RIDGE1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer RIDGE7;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer RIDGE2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer RIDGE8;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer RIDGE3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer RIDGE9;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer RIDGE4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer RIDGE10;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer leftLeg7;
    private final AdvancedModelRenderer rightLeg7;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer RIDGE5;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer RIDGE11;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer leftLeg8;
    private final AdvancedModelRenderer rightLeg8;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer RIDGE6;
    private final AdvancedModelRenderer RIDGE12;
    private final AdvancedModelRenderer leftAntenna2;
    private final AdvancedModelRenderer rightAntenna2;

    public ModelAcadoaradoxides() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Acadoparadoxides = new AdvancedModelRenderer(this);
        this.Acadoparadoxides.setRotationPoint(0.0F, 22.0F, -4.25F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.Acadoparadoxides.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 15, 10, -2.0F, 0.0F, -5.9F, 4, 1, 6, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 28, -1.0F, 0.2F, -3.65F, 2, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 20, 0, -4.0F, -0.3F, -3.4F, 8, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -5.9F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1658F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 8, -2.0F, -0.017F, -0.0099F, 4, 1, 6, 0.0F, false));

        this.CEPHALONSIDE = new AdvancedModelRenderer(this);
        this.CEPHALONSIDE.setRotationPoint(2.0F, 0.0F, -3.9F);
        this.head.addChild(CEPHALONSIDE);
        this.setRotateAngle(CEPHALONSIDE, 0.0F, 0.0F, 0.0873F);
        this.CEPHALONSIDE.cubeList.add(new ModelBox(CEPHALONSIDE, 16, 19, -0.5F, 0.0F, -1.0F, 5, 1, 5, 0.01F, false));

        this.ANGLECEPHALON1 = new AdvancedModelRenderer(this);
        this.ANGLECEPHALON1.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.CEPHALONSIDE.addChild(ANGLECEPHALON1);
        this.setRotateAngle(ANGLECEPHALON1, 0.0F, -0.5236F, 0.0F);
        this.ANGLECEPHALON1.cubeList.add(new ModelBox(ANGLECEPHALON1, 0, 40, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.ANGLECEPHALON2 = new AdvancedModelRenderer(this);
        this.ANGLECEPHALON2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.ANGLECEPHALON1.addChild(ANGLECEPHALON2);
        this.setRotateAngle(ANGLECEPHALON2, 0.0F, -0.5411F, 0.0F);
        this.ANGLECEPHALON2.cubeList.add(new ModelBox(ANGLECEPHALON2, 13, 32, 0.0F, -1.0F, 0.0F, 4, 1, 2, -0.01F, false));

        this.CEPHALONSIDE2 = new AdvancedModelRenderer(this);
        this.CEPHALONSIDE2.setRotationPoint(-2.0F, 0.0F, -3.9F);
        this.head.addChild(CEPHALONSIDE2);
        this.setRotateAngle(CEPHALONSIDE2, 0.0F, 0.0F, -0.0873F);
        this.CEPHALONSIDE2.cubeList.add(new ModelBox(CEPHALONSIDE2, 16, 19, -4.5F, 0.0F, -1.0F, 5, 1, 5, 0.01F, true));

        this.ANGLECEPHALON3 = new AdvancedModelRenderer(this);
        this.ANGLECEPHALON3.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.CEPHALONSIDE2.addChild(ANGLECEPHALON3);
        this.setRotateAngle(ANGLECEPHALON3, 0.0F, 0.5236F, 0.0F);
        this.ANGLECEPHALON3.cubeList.add(new ModelBox(ANGLECEPHALON3, 0, 40, -3.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, true));

        this.ANGLECEPHALON4 = new AdvancedModelRenderer(this);
        this.ANGLECEPHALON4.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.ANGLECEPHALON3.addChild(ANGLECEPHALON4);
        this.setRotateAngle(ANGLECEPHALON4, 0.0F, 0.5411F, 0.0F);
        this.ANGLECEPHALON4.cubeList.add(new ModelBox(ANGLECEPHALON4, 13, 32, -4.0F, -1.0F, 0.0F, 4, 1, 2, -0.01F, true));

        this.CEPHALONSPINE = new AdvancedModelRenderer(this);
        this.CEPHALONSPINE.setRotationPoint(6.45F, 0.751F, -0.7782F);
        this.head.addChild(CEPHALONSPINE);
        this.setRotateAngle(CEPHALONSPINE, -0.0944F, 0.3911F, -0.0361F);
        this.CEPHALONSPINE.cubeList.add(new ModelBox(CEPHALONSPINE, 0, 16, -2.95F, 0.25F, -0.1F, 3, 0, 7, 0.0F, false));

        this.CEPHALONSPINE2 = new AdvancedModelRenderer(this);
        this.CEPHALONSPINE2.setRotationPoint(-6.45F, 0.751F, -0.7782F);
        this.head.addChild(CEPHALONSPINE2);
        this.setRotateAngle(CEPHALONSPINE2, -0.0944F, -0.3911F, 0.0361F);
        this.CEPHALONSPINE2.cubeList.add(new ModelBox(CEPHALONSPINE2, 0, 16, -0.05F, 0.25F, -0.1F, 3, 0, 7, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.0F, 1.2F, -2.75F);
        this.head.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.0F, 0.1396F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 36, 15, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(0.0F, 1.2F, -2.75F);
        this.head.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, 0.0F, -0.1396F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 36, 15, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 1.2F, -0.75F);
        this.head.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 0.1396F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 28, 26, 0.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 1.2F, -0.75F);
        this.head.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -0.1396F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 28, 26, -5.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.leftAntenna1 = new AdvancedModelRenderer(this);
        this.leftAntenna1.setRotationPoint(1.0F, 1.25F, -3.5F);
        this.head.addChild(leftAntenna1);
        this.setRotateAngle(leftAntenna1, 0.0F, -0.829F, 0.0F);
        this.leftAntenna1.cubeList.add(new ModelBox(leftAntenna1, 0, 0, -1.0F, 0.0F, -7.0F, 6, 0, 7, 0.0F, false));

        this.rightAntenna1 = new AdvancedModelRenderer(this);
        this.rightAntenna1.setRotationPoint(-1.0F, 1.25F, -3.5F);
        this.head.addChild(rightAntenna1);
        this.setRotateAngle(rightAntenna1, 0.0F, 0.829F, 0.0F);
        this.rightAntenna1.cubeList.add(new ModelBox(rightAntenna1, 0, 0, -5.0F, 0.0F, -7.0F, 6, 0, 7, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.2F, 0.35F);
        this.head.addChild(body1);
        this.setRotateAngle(body1, -0.1309F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.8F, 4.0F);
        this.body1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 34, -1.0F, -1.0005F, -3.9782F, 2, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.1943F, 3.7383F);
        this.body1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0175F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 26, -1.5F, 4.2909F, -4.679F, 3, 1, 4, 0.0F, false));

        this.RIDGE1 = new AdvancedModelRenderer(this);
        this.RIDGE1.setRotationPoint(1.5F, -0.2F, 2.0F);
        this.body1.addChild(RIDGE1);
        this.setRotateAngle(RIDGE1, 0.0F, 0.0F, 0.3491F);
        this.RIDGE1.cubeList.add(new ModelBox(RIDGE1, 23, 5, -0.5F, 0.0F, -3.0F, 3, 0, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.5F, 0.0F, -2.0F);
        this.RIDGE1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.6981F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 0, -1.05F, 0.05F, 0.0F, 3, 0, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.5F, 0.0F, -0.5F);
        this.RIDGE1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.6981F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 17, -0.65F, 0.05F, 0.0F, 3, 0, 1, 0.0F, false));

        this.RIDGE7 = new AdvancedModelRenderer(this);
        this.RIDGE7.setRotationPoint(-1.5F, -0.2F, 2.0F);
        this.body1.addChild(RIDGE7);
        this.setRotateAngle(RIDGE7, 0.0F, 0.0F, -0.3491F);
        this.RIDGE7.cubeList.add(new ModelBox(RIDGE7, 23, 5, -2.5F, 0.0F, -3.0F, 3, 0, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.5F, 0.0F, -2.0F);
        this.RIDGE7.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.6981F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 0, -1.95F, 0.05F, 0.0F, 3, 0, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.5F, 0.0F, -0.5F);
        this.RIDGE7.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.6981F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 17, -2.35F, 0.05F, 0.0F, 3, 0, 1, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 0.95F, 0.9F);
        this.body1.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0431F, -0.0068F, 0.1569F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 28, 26, 0.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 0.95F, 0.9F);
        this.body1.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0431F, 0.0068F, -0.1569F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 28, 26, -5.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 0.85F, 2.9F);
        this.body1.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0431F, -0.0068F, 0.1569F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 28, 26, 0.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 0.85F, 2.9F);
        this.body1.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0431F, 0.0068F, -0.1569F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 28, 26, -5.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.2F, 3.0F);
        this.body1.addChild(body2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 18, -1.0F, -1.0005F, -0.9782F, 2, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -4.9943F, 0.7383F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0175F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 31, -1.5F, 4.2909F, -0.679F, 3, 1, 3, 0.0F, false));

        this.RIDGE2 = new AdvancedModelRenderer(this);
        this.RIDGE2.setRotationPoint(1.5F, 0.05F, 1.5F);
        this.body2.addChild(RIDGE2);
        this.setRotateAngle(RIDGE2, 0.0F, 0.0F, 0.3491F);
        this.RIDGE2.cubeList.add(new ModelBox(RIDGE2, 30, 10, 0.0F, 0.0F, -2.5F, 2, 0, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.0F, 0.0F, -0.15F);
        this.RIDGE2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.6981F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 23, -1.0F, 0.05F, 0.0F, 4, 0, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.0F, 0.0F, -1.5F);
        this.RIDGE2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.6981F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 37, 28, -1.0F, 0.05F, -0.25F, 4, 0, 1, 0.0F, false));

        this.RIDGE8 = new AdvancedModelRenderer(this);
        this.RIDGE8.setRotationPoint(-1.5F, 0.05F, 1.5F);
        this.body2.addChild(RIDGE8);
        this.setRotateAngle(RIDGE8, 0.0F, 0.0F, -0.3491F);
        this.RIDGE8.cubeList.add(new ModelBox(RIDGE8, 30, 10, -2.0F, 0.0F, -2.5F, 2, 0, 4, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.0F, 0.0F, -0.15F);
        this.RIDGE8.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.6981F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 37, 23, -3.0F, 0.05F, 0.0F, 4, 0, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.0F, 0.0F, -1.5F);
        this.RIDGE8.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.6981F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 28, -3.0F, 0.05F, -0.25F, 4, 0, 1, 0.0F, true));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 1.0F, 1.9F);
        this.body2.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.0431F, -0.0068F, 0.1569F);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 28, 26, 0.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 1.0F, 1.9F);
        this.body2.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.0431F, 0.0068F, -0.1569F);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 28, 26, -5.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body2.addChild(body3);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 11, -0.5F, -1.0005F, 4.0218F, 1, 1, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 38, -1.0F, -1.0005F, 2.0218F, 2, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -4.9943F, -2.2617F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0175F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 4, -1.0F, 4.2909F, 4.321F, 2, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 36, -1.5F, 4.2909F, 2.321F, 3, 1, 2, 0.0F, false));

        this.RIDGE3 = new AdvancedModelRenderer(this);
        this.RIDGE3.setRotationPoint(1.5F, 0.1F, 1.25F);
        this.body3.addChild(RIDGE3);
        this.setRotateAngle(RIDGE3, 0.0F, 0.0F, 0.3491F);
        this.RIDGE3.cubeList.add(new ModelBox(RIDGE3, 34, 34, -0.5F, 0.0F, -2.25F, 2, 0, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.5F, 0.0F, -1.65F);
        this.RIDGE3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.6981F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 37, 30, -0.55F, 0.05F, 0.0F, 4, 0, 1, 0.0F, false));

        this.RIDGE9 = new AdvancedModelRenderer(this);
        this.RIDGE9.setRotationPoint(-1.5F, 0.1F, 1.25F);
        this.body3.addChild(RIDGE9);
        this.setRotateAngle(RIDGE9, 0.0F, 0.0F, -0.3491F);
        this.RIDGE9.cubeList.add(new ModelBox(RIDGE9, 34, 34, -1.5F, 0.0F, -2.25F, 2, 0, 3, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, 0.0F, -1.65F);
        this.RIDGE9.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.6981F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 37, 30, -3.45F, 0.05F, 0.0F, 4, 0, 1, 0.0F, true));

        this.RIDGE4 = new AdvancedModelRenderer(this);
        this.RIDGE4.setRotationPoint(1.0F, 0.0F, 2.5F);
        this.body3.addChild(RIDGE4);
        this.setRotateAngle(RIDGE4, 0.0F, 0.0F, 0.3491F);
        this.RIDGE4.cubeList.add(new ModelBox(RIDGE4, 18, 39, 0.0F, 0.0F, -1.5F, 2, 0, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.0F, 0.0F, -1.25F);
        this.RIDGE4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.7418F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 33, 38, -0.7663F, 0.0478F, 0.0368F, 4, 0, 1, 0.0F, false));

        this.RIDGE10 = new AdvancedModelRenderer(this);
        this.RIDGE10.setRotationPoint(-1.0F, 0.0F, 2.5F);
        this.body3.addChild(RIDGE10);
        this.setRotateAngle(RIDGE10, 0.0F, 0.0F, -0.3491F);
        this.RIDGE10.cubeList.add(new ModelBox(RIDGE10, 18, 39, -2.0F, 0.0F, -1.5F, 2, 0, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.0F, 0.0F, -1.25F);
        this.RIDGE10.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.7418F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 33, 38, -3.2337F, 0.0478F, 0.0368F, 4, 0, 1, 0.0F, true));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(0.0F, 0.9F, 0.9F);
        this.body3.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.0431F, -0.0068F, 0.1569F);
        this.leftLeg6.cubeList.add(new ModelBox(leftLeg6, 28, 26, 0.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(0.0F, 0.9F, 0.9F);
        this.body3.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.0431F, 0.0068F, -0.1569F);
        this.rightLeg6.cubeList.add(new ModelBox(rightLeg6, 28, 26, -5.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.leftLeg7 = new AdvancedModelRenderer(this);
        this.leftLeg7.setRotationPoint(0.0F, 0.8F, 2.9F);
        this.body3.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, 0.0427F, -0.0091F, 0.2092F);
        this.leftLeg7.cubeList.add(new ModelBox(leftLeg7, 36, 15, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(0.0F, 0.8F, 2.9F);
        this.body3.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, 0.0427F, 0.0091F, -0.2092F);
        this.rightLeg7.cubeList.add(new ModelBox(rightLeg7, 36, 15, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, -0.5F, -1.0005F, 5.0218F, 1, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -4.9943F, -5.2617F);
        this.body4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0175F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 11, 26, -1.0F, 4.2909F, 5.321F, 2, 1, 2, 0.0F, false));

        this.RIDGE5 = new AdvancedModelRenderer(this);
        this.RIDGE5.setRotationPoint(1.0F, 0.05F, 1.0F);
        this.body4.addChild(RIDGE5);
        this.setRotateAngle(RIDGE5, 0.0F, 0.0F, 0.3491F);
        this.RIDGE5.cubeList.add(new ModelBox(RIDGE5, 34, 5, -0.5F, 0.0F, -2.0F, 2, 0, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.5F, 0.0F, 0.15F);
        this.RIDGE5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -1.0908F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 25, 39, -0.25F, 0.05F, 0.0F, 3, 0, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5F, 0.0F, -1.45F);
        this.RIDGE5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.829F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 9, 36, -0.6F, 0.05F, 0.0F, 4, 0, 1, 0.0F, false));

        this.RIDGE11 = new AdvancedModelRenderer(this);
        this.RIDGE11.setRotationPoint(-1.0F, 0.05F, 1.0F);
        this.body4.addChild(RIDGE11);
        this.setRotateAngle(RIDGE11, 0.0F, 0.0F, -0.3491F);
        this.RIDGE11.cubeList.add(new ModelBox(RIDGE11, 34, 5, -1.5F, 0.0F, -2.0F, 2, 0, 3, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.5F, 0.0F, 0.15F);
        this.RIDGE11.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 1.0908F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 25, 39, -2.75F, 0.05F, 0.0F, 3, 0, 1, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.5F, 0.0F, -1.45F);
        this.RIDGE11.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.829F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 9, 36, -3.4F, 0.05F, 0.0F, 4, 0, 1, 0.0F, true));

        this.leftLeg8 = new AdvancedModelRenderer(this);
        this.leftLeg8.setRotationPoint(0.0F, 0.7F, 1.9F);
        this.body4.addChild(leftLeg8);
        this.setRotateAngle(leftLeg8, 0.0419F, -0.012F, 0.279F);
        this.leftLeg8.cubeList.add(new ModelBox(leftLeg8, 39, 12, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg8 = new AdvancedModelRenderer(this);
        this.rightLeg8.setRotationPoint(0.0F, 0.7F, 1.9F);
        this.body4.addChild(rightLeg8);
        this.setRotateAngle(rightLeg8, 0.0419F, 0.012F, -0.279F);
        this.rightLeg8.cubeList.add(new ModelBox(rightLeg8, 39, 12, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.body5.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0436F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 8, -0.5F, -1.0005F, 7.0218F, 1, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.75F, -11.3F);
        this.body5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0175F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 15, 8, -0.5F, 0.0F, 11.25F, 1, 1, 1, 0.01F, false));

        this.RIDGE6 = new AdvancedModelRenderer(this);
        this.RIDGE6.setRotationPoint(0.5F, -0.05F, 0.0F);
        this.body5.addChild(RIDGE6);
        this.setRotateAngle(RIDGE6, -0.1745F, 0.0F, 0.3491F);
        this.RIDGE6.cubeList.add(new ModelBox(RIDGE6, 39, 9, -0.5F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.RIDGE12 = new AdvancedModelRenderer(this);
        this.RIDGE12.setRotationPoint(-0.5F, -0.05F, 0.0F);
        this.body5.addChild(RIDGE12);
        this.setRotateAngle(RIDGE12, -0.1745F, 0.0F, -0.3491F);
        this.RIDGE12.cubeList.add(new ModelBox(RIDGE12, 39, 9, -1.5F, 0.0F, 0.0F, 2, 0, 2, 0.0F, true));

        this.leftAntenna2 = new AdvancedModelRenderer(this);
        this.leftAntenna2.setRotationPoint(0.0F, 0.6F, 1.0F);
        this.body5.addChild(leftAntenna2);
        this.setRotateAngle(leftAntenna2, 0.0464F, 0.3847F, 0.1921F);
        this.leftAntenna2.cubeList.add(new ModelBox(leftAntenna2, 0, 24, 0.0F, 0.0F, 0.0F, 2, 0, 6, 0.0F, false));

        this.rightAntenna2 = new AdvancedModelRenderer(this);
        this.rightAntenna2.setRotationPoint(0.0F, 0.6F, 1.0F);
        this.body5.addChild(rightAntenna2);
        this.setRotateAngle(rightAntenna2, 0.0464F, -0.3847F, -0.1921F);
        this.rightAntenna2.cubeList.add(new ModelBox(rightAntenna2, 0, 24, -2.0F, 0.0F, 0.0F, 2, 0, 6, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -0.50F;
        this.head.offsetX = 0.0F;
        this.head.rotateAngleY = (float)Math.toRadians(0);
        this.head.rotateAngleX = (float)Math.toRadians(-88);
        this.head.rotateAngleZ = (float)Math.toRadians(0);
        this.head.scaleChildren = true;
        float scaler = 0.6F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.head.render(0.022F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
        resetToDefaultPose();
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
        this.head.offsetY = 1.35F;

        if (e instanceof EntityLiving) {
            if (((EntityLiving)e).isAIDisabled()) {
                return;
            }
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.leftLeg1, this.leftLeg2, this.leftLeg3, this.leftLeg4, this.leftLeg5, this.leftLeg6, this.leftLeg7, this.leftLeg8};
        AdvancedModelRenderer[] legsR = {this.rightLeg1, this.rightLeg2, this.rightLeg3, this.rightLeg4, this.rightLeg5, this.rightLeg6, this.rightLeg7, this.rightLeg8};
        AdvancedModelRenderer[] bodyF = {this.body1,this.body2,this.body3,this.body4,this.body5};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraAcadoaradoxides)e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(leftLeg1, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
                this.flap(rightLeg1, 0.5F, 0.5F, true, 0, 0.5F, f2, 0.3F);
                this.flap(leftLeg2, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg2, 0.5F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg3, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg3, 0.5F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg4, 0.5F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg4, 0.5F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg5, 0.5F, -0.5F, true, 4.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg5, 0.5F, 0.5F, true, 4.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg6, 0.5F, -0.5F, true, 5.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg6, 0.5F, 0.5F, true, 5.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg7, 0.5F, -0.5F, true, 6.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg7, 0.5F, 0.5F, true, 6.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg8, 0.5F, -0.5F, true, 7.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg8, 0.5F, 0.5F, true, 7.0F, 0.5F, f2, 0.3F);
                this.chainSwing(bodyF, 0.1F, 0.02F, -3, f2, 0.5F);
                this.chainWave(bodyF, 0.1F, 0.02f, -3, f2, 0F);
            }
            this.bob(head, 0.0F, 0.0F, false, f2, 1);
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(leftLeg1, 0.2F, -0.5F, true, 0, -0.5F, f2, 0.3F);
            this.flap(rightLeg1, 0.2F, 0.5F, true, 0, 0.5F, f2, 0.3F);
            this.flap(leftLeg2, 0.2F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg2, 0.2F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg3, 0.2F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg3, 0.2F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg4, 0.2F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg4, 0.2F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg5, 0.2F, -0.5F, true, 4.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg5, 0.2F, 0.5F, true, 4.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg6, 0.2F, -0.5F, true, 5.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg6, 0.2F, 0.5F, true, 5.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg7, 0.2F, -0.5F, true, 6.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg7, 0.2F, 0.5F, true, 6.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg8, 0.2F, -0.5F, true, 7.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg8, 0.2F, 0.5F, true, 7.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.2F, 0.01F, -3, f2, 0.2F);
            this.chainWave(bodyF, 0.5F, 0.02f, -3, f2, 0.3F);
            this.bob(head, 0.2F, 0.2F, false, f2, 1);
        }

        this.swing(leftAntenna1, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(rightAntenna1, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);


        if (f3 != 0.0F) {
            this.swing(leftAntenna2, 0.4F, -0.38F, false, 0, -0.1F, f2, 0.8F);
            this.swing(rightAntenna2, 0.4F, 0.38F, false, 0, 0.1F, f2, 0.8F);
        }
    }
}
