package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraHomalonotus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHomalonotus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer anntennae;
    private final AdvancedModelRenderer anntennae2;
    private final AdvancedModelRenderer carapace_side;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer carapace_side2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer thorax2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer pygidium;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;

    public ModelHomalonotus() {
        this.textureWidth = 25;
        this.textureHeight = 25;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, -2.0F, -1.0F);
        this.main.addChild(carapace);
        this.carapace.cubeList.add(new ModelBox(carapace, 7, 18, -1.5F, 0.8F, -2.35F, 3, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.3504F, 0.024F, -1.6871F);
        this.carapace.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5136F, 0.0024F, -0.003F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 0, 0.0F, -0.1F, -0.3F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.7855F, 0.5788F, -0.3574F);
        this.carapace.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4163F, 0.0484F, -0.7859F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 0, 0.0F, -0.35F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.9979F, -0.1244F, -0.4444F);
        this.carapace.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4767F, -0.0871F, 0.7849F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 0, 0.0F, -0.2F, -0.65F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0019F, 0.1167F, -2.4298F);
        this.carapace.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4767F, -0.0871F, 0.7849F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 0, 0.0F, -0.15F, -0.475F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.9979F, -0.1244F, -0.4444F);
        this.carapace.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4767F, 0.0871F, -0.7849F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 0, 0.0F, -0.2F, -0.65F, 0, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0019F, 0.1167F, -2.4298F);
        this.carapace.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4767F, 0.0871F, -0.7849F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 0, 0.0F, -0.15F, -0.475F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.7855F, 0.5788F, -0.3574F);
        this.carapace.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4163F, -0.0484F, 0.7859F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 0, 0.0F, -0.35F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.3504F, 0.024F, -1.6871F);
        this.carapace.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5136F, -0.0024F, 0.003F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 0, 0.0F, -0.1F, -0.3F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.2F, 0.05F);
        this.carapace.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 8, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.55F, -4.2F);
        this.carapace.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 0, 0.0F, -0.05F, -0.15F, 1, 1, 3, 0.0F, false));

        this.anntennae = new AdvancedModelRenderer(this);
        this.anntennae.setRotationPoint(1.0F, 1.8F, -2.35F);
        this.carapace.addChild(anntennae);
        this.anntennae.cubeList.add(new ModelBox(anntennae, 1, 0, -0.5F, 0.0F, -4.0F, 4, 0, 4, 0.0F, false));

        this.anntennae2 = new AdvancedModelRenderer(this);
        this.anntennae2.setRotationPoint(-1.0F, 0.85F, -2.35F);
        this.carapace.addChild(anntennae2);
        this.anntennae2.cubeList.add(new ModelBox(anntennae2, 1, 0, -3.5F, 0.95F, -4.0F, 4, 0, 4, 0.0F, true));

        this.carapace_side = new AdvancedModelRenderer(this);
        this.carapace_side.setRotationPoint(0.4991F, 0.6464F, -4.1958F);
        this.carapace.addChild(carapace_side);
        this.setRotateAngle(carapace_side, 0.0843F, -0.0226F, 0.2608F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.95F, 0.0F);
        this.carapace_side.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.6981F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 10, 0.0F, -2.0F, 0.0F, 2, 1, 1, -0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.6082F, -0.3F, 1.6683F);
        this.carapace_side.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -1.5708F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.2F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5321F, 1.95F, 1.2856F);
        this.carapace_side.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -1.1781F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 17, 14, 0.0F, -2.0F, 0.0F, 2, 1, 2, -0.002F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.2975F, 1.95F, 3.1333F);
        this.carapace_side.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -1.5708F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 16, -2.0F, -2.0F, 1.0F, 2, 1, 2, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 13, 0.0F, -2.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.carapace_side2 = new AdvancedModelRenderer(this);
        this.carapace_side2.setRotationPoint(-0.4991F, 0.6464F, -4.1958F);
        this.carapace.addChild(carapace_side2);
        this.setRotateAngle(carapace_side2, 0.0843F, 0.0226F, -0.2608F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.95F, 0.0F);
        this.carapace_side2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.6981F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 10, -2.0F, -2.0F, 0.0F, 2, 1, 1, -0.001F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.6082F, -0.3F, 1.6683F);
        this.carapace_side2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 1.5708F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -1.2F, 0.0F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5321F, 1.95F, 1.2856F);
        this.carapace_side2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 1.1781F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 14, -2.0F, -2.0F, 0.0F, 2, 1, 2, -0.002F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.2975F, 1.95F, 3.1333F);
        this.carapace_side2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 1.5708F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 16, 0.0F, -2.0F, 1.0F, 2, 1, 2, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 8, 13, -1.0F, -2.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.carapace.addChild(thorax);
        this.thorax.cubeList.add(new ModelBox(thorax, 16, 6, -1.0F, 0.0F, -0.2F, 2, 1, 2, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.2F, 0.5F, -0.2F);
        this.thorax.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0706F, 0.1103F, -0.5711F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, -2, 3, -1.65F, 0.0F, 0.0F, 2, 0, 2, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.2F, 0.5F, -0.2F);
        this.thorax.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0706F, -0.1103F, 0.5711F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, -2, 3, -0.35F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, 0.0F, 0.775F);
        this.thorax.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3927F, 0.0F, -0.7854F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 14, 0, 0.0F, 0.0F, -0.075F, 0, 1, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, 0.0F, 0.8F);
        this.thorax.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3927F, 0.0F, 0.7854F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 14, 0, 0.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.3172F, 0.9877F, 0.3872F);
        this.thorax.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.045F, 0.0748F, 0.5427F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 8, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.3672F, 0.9877F, 1.6372F);
        this.thorax.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.045F, -0.0748F, 0.5427F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 8, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.3172F, 0.9877F, 0.3872F);
        this.thorax.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.045F, -0.0748F, -0.5427F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 8, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.3672F, 0.9877F, 1.6372F);
        this.thorax.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.045F, 0.0748F, -0.5427F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 8, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.thorax2 = new AdvancedModelRenderer(this);
        this.thorax2.setRotationPoint(-0.5F, 0.025F, 1.775F);
        this.thorax.addChild(thorax2);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.45F, 0.475F, -0.125F);
        this.thorax2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1186F, 0.1836F, -0.5782F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, -3, 11, -1.65F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.45F, 0.475F, -0.125F);
        this.thorax2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1186F, -0.1836F, 0.5782F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, -3, 11, -0.35F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.4823F, 0.0798F, 0.9697F);
        this.thorax2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3309F, -0.0617F, -0.7835F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 14, 0, 0.0F, -0.025F, -0.075F, 0, 1, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.4823F, 0.0798F, 0.9697F);
        this.thorax2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3309F, 0.0617F, 0.7835F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 14, 0, 0.0F, -0.025F, -0.075F, 0, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.025F, -0.025F);
        this.thorax2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0873F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 6, -0.5F, 0.0F, 0.0F, 2, 1, 3, -0.02F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.6172F, 0.9627F, 1.1122F);
        this.thorax2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.1137F, -0.1866F, 0.5517F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 8, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.3466F, 0.9627F, 2.3325F);
        this.thorax2.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, -0.1137F, -0.1866F, 0.5517F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 8, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.3828F, 0.9627F, 1.1122F);
        this.thorax2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.1137F, 0.1866F, -0.5517F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 8, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.6534F, 0.9627F, 2.3325F);
        this.thorax2.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -0.1137F, 0.1866F, -0.5517F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 8, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.pygidium = new AdvancedModelRenderer(this);
        this.pygidium.setRotationPoint(0.0F, 0.975F, 2.925F);
        this.thorax2.addChild(pygidium);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.1993F, -0.5F, -0.1211F);
        this.pygidium.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.3105F, 0.3353F, -0.592F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 12, 13, -1.625F, 0.075F, -0.3F, 2, 0, 2, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.8007F, -0.5F, -0.1211F);
        this.pygidium.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.3105F, -0.3353F, 0.592F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 12, 13, -0.375F, 0.075F, -0.3F, 2, 0, 2, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.85F, 0.05F);
        this.pygidium.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.3054F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 18, 0, 0.0F, 0.675F, 0.925F, 1, 0, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.6799F, -0.0064F);
        this.pygidium.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.3054F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 18, 18, 0.0F, -0.025F, -0.075F, 1, 1, 2, -0.02F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5 * 0.38F);
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.35F;
        this.main.offsetX = 0.07F;
        this.main.rotateAngleX = (float)Math.toRadians(45);
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleZ = (float)Math.toRadians(-20);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        this.main.offsetY = 0.91F;
        EntityPrehistoricFloraHomalonotus ee = (EntityPrehistoricFloraHomalonotus) e;

        AdvancedModelRenderer[] legsL = {this.leftLeg1, this.leftLeg2, this.leftLeg3, this.leftLeg4};
        AdvancedModelRenderer[] legsR = {this.rightLeg1, this.rightLeg2, this.rightLeg3, this.rightLeg4};

        this.swing(anntennae, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(anntennae2, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        if (ee.isInWater()) {
            if (ee.getIsMoving()) {
                this.flap(leftLeg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(rightLeg1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(leftLeg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);

                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            }
        }
    }
}
