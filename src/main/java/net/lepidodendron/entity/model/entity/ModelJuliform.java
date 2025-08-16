package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraJinyunpelta;
import net.lepidodendron.entity.EntityPrehistoricFloraMyriapod;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelJuliform extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer millipede;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer head_r1;
    private final AdvancedModelRenderer head_r2;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer bone_r1;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer bone_r2;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer rightLeg7;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftLeg7;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer rightLeg8;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftLeg8;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer rightLeg9;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftLeg9;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer rightLeg10;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer leftLeg10;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer rightLeg11;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer leftLeg11;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer rightLeg12;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer leftLeg12;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer rightLeg13;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer leftLeg13;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer rightLeg14;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer leftLeg14;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer rightLeg15;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer leftLeg15;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer rightLeg16;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer leftLeg16;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer rightLeg17;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer leftLeg17;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer rightLeg18;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer leftLeg18;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer rightLeg19;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer leftLeg19;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer rightLeg20;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer leftLeg20;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer rightLeg21;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer leftLeg21;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer rightLeg22;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer leftLeg22;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer body12;
    private final AdvancedModelRenderer rightLeg23;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer leftLeg23;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer bodyEnd;

    public ModelJuliform() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.millipede = new AdvancedModelRenderer(this);
        this.millipede.setRotationPoint(0.0F, 22.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0142F, -11.0454F);
        this.millipede.addChild(head);


        this.head_r1 = new AdvancedModelRenderer(this);
        this.head_r1.setRotationPoint(0.0F, -0.2411F, -0.6834F);
        this.head.addChild(head_r1);
        this.setRotateAngle(head_r1, 1.309F, 0.0F, 0.0F);
        this.head_r1.cubeList.add(new ModelBox(head_r1, 0, 20, -1.0F, -1.0F, -2.3F, 2, 1, 2, 0.0F, false));

        this.head_r2 = new AdvancedModelRenderer(this);
        this.head_r2.setRotationPoint(-0.01F, 0.7142F, -0.536F);
        this.head.addChild(head_r2);
        this.setRotateAngle(head_r2, 0.3927F, 0.0F, 0.0F);
        this.head_r2.cubeList.add(new ModelBox(head_r2, 0, 0, -0.99F, -1.401F, -0.85F, 2, 2, 2, 0.01F, false));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.4F, 0.5142F, -1.936F);
        this.head.addChild(leftAntenna);


        this.bone_r1 = new AdvancedModelRenderer(this);
        this.bone_r1.setRotationPoint(0.1F, 0.2F, 0.4F);
        this.leftAntenna.addChild(bone_r1);
        this.setRotateAngle(bone_r1, 0.1273F, -0.2397F, -0.967F);
        this.bone_r1.cubeList.add(new ModelBox(bone_r1, 16, 20, 0.0F, -0.3F, -2.3F, 0, 2, 2, 0.0F, true));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.4F, 0.5142F, -1.936F);
        this.head.addChild(rightAntenna);


        this.bone_r2 = new AdvancedModelRenderer(this);
        this.bone_r2.setRotationPoint(-0.1F, 0.2F, 0.4F);
        this.rightAntenna.addChild(bone_r2);
        this.setRotateAngle(bone_r2, 0.1273F, 0.2397F, 0.967F);
        this.bone_r2.cubeList.add(new ModelBox(bone_r2, 16, 20, 0.0F, -0.3F, -2.3F, 0, 2, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.5F, -11.0815F);
        this.millipede.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 5, -1.0F, -1.5F, 0.0F, 2, 2, 2, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.4783F, 0.5F, 0.7687F);
        this.body1.addChild(rightLeg1);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.5672F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.4783F, 0.5F, 0.7687F);
        this.body1.addChild(leftLeg1);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.5672F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.4783F, 0.5F, 1.7687F);
        this.body1.addChild(rightLeg2);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.5672F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.4783F, 0.5F, 1.7687F);
        this.body1.addChild(leftLeg2);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.5672F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 9, 0, -1.0F, -1.501F, 0.0F, 2, 2, 2, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 27, 0, -0.5F, -1.501F, -0.9F, 1, 2, 1, -0.01F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.4783F, 0.5F, 0.7687F);
        this.body2.addChild(rightLeg3);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.5672F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.4783F, 0.5F, 0.7687F);
        this.body2.addChild(leftLeg3);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.5672F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.4783F, 0.5F, 1.7687F);
        this.body2.addChild(rightLeg4);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.5672F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.4783F, 0.5F, 1.7687F);
        this.body2.addChild(leftLeg4);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.5672F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 9, 5, -1.0F, -1.5F, 0.0F, 2, 2, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 27, 0, -0.5F, -1.501F, -0.9F, 1, 2, 1, -0.01F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(-0.4783F, 0.5F, 0.7687F);
        this.body3.addChild(rightLeg5);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.5672F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.4783F, 0.5F, 0.7687F);
        this.body3.addChild(leftLeg5);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.5672F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(-0.4783F, 0.5F, 1.7687F);
        this.body3.addChild(rightLeg6);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg6.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.5672F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(0.4783F, 0.5F, 1.7687F);
        this.body3.addChild(leftLeg6);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg6.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.5672F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 10, -1.0F, -1.501F, 0.0F, 2, 2, 2, 0.01F, false));
        this.body4.cubeList.add(new ModelBox(body4, 27, 0, -0.5F, -1.501F, -1.0F, 1, 2, 1, -0.01F, false));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(-0.4783F, 0.5F, 0.7687F);
        this.body4.addChild(rightLeg7);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg7.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.5672F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg7 = new AdvancedModelRenderer(this);
        this.leftLeg7.setRotationPoint(0.4783F, 0.5F, 0.7687F);
        this.body4.addChild(leftLeg7);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.5672F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.rightLeg8 = new AdvancedModelRenderer(this);
        this.rightLeg8.setRotationPoint(-0.4783F, 0.5F, 1.7687F);
        this.body4.addChild(rightLeg8);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg8.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.5672F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg8 = new AdvancedModelRenderer(this);
        this.leftLeg8.setRotationPoint(0.4783F, 0.5F, 1.7687F);
        this.body4.addChild(leftLeg8);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg8.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.5672F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 9, 10, -1.0F, -1.5F, 0.0F, 2, 2, 2, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 27, 0, -0.5F, -1.501F, -1.0F, 1, 2, 1, -0.01F, false));

        this.rightLeg9 = new AdvancedModelRenderer(this);
        this.rightLeg9.setRotationPoint(-0.4783F, 0.5F, 0.7687F);
        this.body5.addChild(rightLeg9);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg9.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.5672F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg9 = new AdvancedModelRenderer(this);
        this.leftLeg9.setRotationPoint(0.4783F, 0.5F, 0.7687F);
        this.body5.addChild(leftLeg9);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg9.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.5672F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.rightLeg10 = new AdvancedModelRenderer(this);
        this.rightLeg10.setRotationPoint(-0.4783F, 0.5F, 1.7687F);
        this.body5.addChild(rightLeg10);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg10.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.5672F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg10 = new AdvancedModelRenderer(this);
        this.leftLeg10.setRotationPoint(0.4783F, 0.5F, 1.7687F);
        this.body5.addChild(leftLeg10);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg10.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.5672F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 27, 0, -0.5F, -1.501F, -1.0F, 1, 2, 1, -0.01F, false));
        this.body6.cubeList.add(new ModelBox(body6, 18, 5, -1.0F, -1.501F, 0.0F, 2, 2, 2, 0.01F, false));

        this.rightLeg11 = new AdvancedModelRenderer(this);
        this.rightLeg11.setRotationPoint(-0.4783F, 0.5F, 0.7687F);
        this.body6.addChild(rightLeg11);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg11.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.5672F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg11 = new AdvancedModelRenderer(this);
        this.leftLeg11.setRotationPoint(0.4783F, 0.5F, 0.7687F);
        this.body6.addChild(leftLeg11);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg11.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.5672F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.rightLeg12 = new AdvancedModelRenderer(this);
        this.rightLeg12.setRotationPoint(-0.4783F, 0.5F, 1.7687F);
        this.body6.addChild(rightLeg12);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg12.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.5672F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg12 = new AdvancedModelRenderer(this);
        this.leftLeg12.setRotationPoint(0.4783F, 0.5F, 1.7687F);
        this.body6.addChild(leftLeg12);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg12.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.5672F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 27, 0, -0.5F, -1.501F, -1.0F, 1, 2, 1, -0.01F, false));
        this.body7.cubeList.add(new ModelBox(body7, 18, 10, -1.0F, -1.5F, 0.0F, 2, 2, 2, 0.0F, false));

        this.rightLeg13 = new AdvancedModelRenderer(this);
        this.rightLeg13.setRotationPoint(-0.4783F, 0.5F, 0.7687F);
        this.body7.addChild(rightLeg13);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg13.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.5672F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg13 = new AdvancedModelRenderer(this);
        this.leftLeg13.setRotationPoint(0.4783F, 0.5F, 0.7687F);
        this.body7.addChild(leftLeg13);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg13.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.5672F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.rightLeg14 = new AdvancedModelRenderer(this);
        this.rightLeg14.setRotationPoint(-0.4783F, 0.5F, 1.7687F);
        this.body7.addChild(rightLeg14);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg14.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.5672F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg14 = new AdvancedModelRenderer(this);
        this.leftLeg14.setRotationPoint(0.4783F, 0.5F, 1.7687F);
        this.body7.addChild(leftLeg14);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg14.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.5672F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 0, 15, -1.0F, -1.501F, 0.0F, 2, 2, 2, 0.01F, false));
        this.body8.cubeList.add(new ModelBox(body8, 27, 0, -0.5F, -1.501F, -1.0F, 1, 2, 1, -0.01F, false));

        this.rightLeg15 = new AdvancedModelRenderer(this);
        this.rightLeg15.setRotationPoint(-0.4783F, 0.5F, 0.7687F);
        this.body8.addChild(rightLeg15);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg15.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.5672F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg15 = new AdvancedModelRenderer(this);
        this.leftLeg15.setRotationPoint(0.4783F, 0.5F, 0.7687F);
        this.body8.addChild(leftLeg15);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg15.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.5672F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.rightLeg16 = new AdvancedModelRenderer(this);
        this.rightLeg16.setRotationPoint(-0.4783F, 0.5F, 1.7687F);
        this.body8.addChild(rightLeg16);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg16.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.5672F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg16 = new AdvancedModelRenderer(this);
        this.leftLeg16.setRotationPoint(0.4783F, 0.5F, 1.7687F);
        this.body8.addChild(leftLeg16);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg16.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.5672F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 9, 15, -1.0F, -1.5F, 0.0F, 2, 2, 2, 0.0F, false));
        this.body9.cubeList.add(new ModelBox(body9, 27, 0, -0.5F, -1.501F, -1.0F, 1, 2, 1, -0.01F, false));

        this.rightLeg17 = new AdvancedModelRenderer(this);
        this.rightLeg17.setRotationPoint(-0.4783F, 0.5F, 0.7687F);
        this.body9.addChild(rightLeg17);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg17.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.5672F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg17 = new AdvancedModelRenderer(this);
        this.leftLeg17.setRotationPoint(0.4783F, 0.5F, 0.7687F);
        this.body9.addChild(leftLeg17);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg17.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.5672F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.rightLeg18 = new AdvancedModelRenderer(this);
        this.rightLeg18.setRotationPoint(-0.4783F, 0.5F, 1.7687F);
        this.body9.addChild(rightLeg18);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg18.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.5672F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg18 = new AdvancedModelRenderer(this);
        this.leftLeg18.setRotationPoint(0.4783F, 0.5F, 1.7687F);
        this.body9.addChild(leftLeg18);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg18.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.5672F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 18, 15, -1.0F, -1.501F, 0.0F, 2, 2, 2, 0.01F, false));
        this.body10.cubeList.add(new ModelBox(body10, 27, 0, -0.5F, -1.501F, -1.0F, 1, 2, 1, -0.01F, false));

        this.rightLeg19 = new AdvancedModelRenderer(this);
        this.rightLeg19.setRotationPoint(-0.4783F, 0.5F, 0.7687F);
        this.body10.addChild(rightLeg19);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg19.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.5672F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg19 = new AdvancedModelRenderer(this);
        this.leftLeg19.setRotationPoint(0.4783F, 0.5F, 0.7687F);
        this.body10.addChild(leftLeg19);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg19.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.5672F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.rightLeg20 = new AdvancedModelRenderer(this);
        this.rightLeg20.setRotationPoint(-0.4783F, 0.5F, 1.7687F);
        this.body10.addChild(rightLeg20);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg20.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.5672F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg20 = new AdvancedModelRenderer(this);
        this.leftLeg20.setRotationPoint(0.4783F, 0.5F, 1.7687F);
        this.body10.addChild(leftLeg20);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg20.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.5672F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 18, 0, -1.0F, -1.5F, 0.0F, 2, 2, 2, 0.0F, false));
        this.body11.cubeList.add(new ModelBox(body11, 27, 0, -0.5F, -1.501F, -1.0F, 1, 2, 1, -0.01F, false));

        this.rightLeg21 = new AdvancedModelRenderer(this);
        this.rightLeg21.setRotationPoint(-0.4783F, 0.5F, 0.7687F);
        this.body11.addChild(rightLeg21);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg21.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, -0.5672F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg21 = new AdvancedModelRenderer(this);
        this.leftLeg21.setRotationPoint(0.4783F, 0.5F, 0.7687F);
        this.body11.addChild(leftLeg21);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg21.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.5672F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.rightLeg22 = new AdvancedModelRenderer(this);
        this.rightLeg22.setRotationPoint(-0.4783F, 0.5F, 1.7687F);
        this.body11.addChild(rightLeg22);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg22.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, -0.5672F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg22 = new AdvancedModelRenderer(this);
        this.leftLeg22.setRotationPoint(0.4783F, 0.5F, 1.7687F);
        this.body11.addChild(leftLeg22);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg22.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.5672F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.body12 = new AdvancedModelRenderer(this);
        this.body12.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body11.addChild(body12);
        this.body12.cubeList.add(new ModelBox(body12, 27, 0, -0.5F, -1.501F, -1.0F, 1, 2, 1, -0.01F, false));
        this.body12.cubeList.add(new ModelBox(body12, 9, 20, -1.0F, -1.501F, 0.0F, 2, 2, 1, -0.01F, false));

        this.rightLeg23 = new AdvancedModelRenderer(this);
        this.rightLeg23.setRotationPoint(-0.4783F, 0.5F, 0.7687F);
        this.body12.addChild(rightLeg23);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.4217F, 0.5F, -0.2687F);
        this.rightLeg23.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, -0.5672F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg23 = new AdvancedModelRenderer(this);
        this.leftLeg23.setRotationPoint(0.4783F, 0.5F, 0.7687F);
        this.body12.addChild(leftLeg23);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.4217F, 0.5F, -0.2687F);
        this.leftLeg23.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.5672F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 16, 20, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.bodyEnd = new AdvancedModelRenderer(this);
        this.bodyEnd.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.body12.addChild(bodyEnd);
        this.bodyEnd.cubeList.add(new ModelBox(bodyEnd, 21, 23, -1.0F, -1.201F, -1.0F, 2, 1, 1, 0.01F, false));
        this.bodyEnd.cubeList.add(new ModelBox(bodyEnd, 21, 20, -1.0F, -0.801F, -1.0F, 2, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.millipede.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        this.millipede.offsetZ = -0.080F;
        this.millipede.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

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
        //this.millipede.offsetY = 1.3F;

        AdvancedModelRenderer[] legsL = {this.leftLeg1, this.leftLeg2, this.leftLeg3, this.leftLeg4, this.leftLeg5, this.leftLeg6, this.leftLeg7, this.leftLeg8, this.leftLeg9, this.leftLeg10, this.leftLeg11, this.leftLeg12, this.leftLeg13, this.leftLeg14, this.leftLeg15, this.leftLeg16, this.leftLeg17, this.leftLeg18, this.leftLeg19, this.leftLeg20, this.leftLeg21, this.leftLeg22, this.leftLeg23};
        AdvancedModelRenderer[] legsR = {this.rightLeg1, this.rightLeg2, this.rightLeg3, this.rightLeg4, this.rightLeg5, this.rightLeg6, this.rightLeg7, this.rightLeg8, this.rightLeg9, this.rightLeg10, this.rightLeg11, this.rightLeg12, this.rightLeg13, this.rightLeg14, this.rightLeg15, this.rightLeg16, this.rightLeg17, this.rightLeg18, this.rightLeg19, this.rightLeg20, this.rightLeg21, this.rightLeg22, this.rightLeg23};
        AdvancedModelRenderer[] BodyFull = {this.body1, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12};

        AdvancedModelRenderer[] Body1 = {this.body1, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body2 = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body3 = {this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body4 = {this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body5 = {this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body6 = {this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body7 = {this.body7, this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body8 = {this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body9 = {this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body10 = {this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body11 = {this.body11, this.body12};
        AdvancedModelRenderer[] Body12 = {this.body12};


        EntityPrehistoricFloraMyriapod Pneumodesmus = (EntityPrehistoricFloraMyriapod) e;
        if (f3 == 0.0F || !Pneumodesmus.getIsMoving()) { //Not moving
            this.head.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.4;
            this.body4.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.3;
            return;
        }

        AdvancedModelRenderer[] bodySegments = new AdvancedModelRenderer[]{
                body1, body2, body3, body4, body5, body6, body7, body8, body9, body10, body11, body12};
        Pneumodesmus.myriapodBuffer.applyChainSwingBuffer(false, bodySegments);

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.head.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.4;
            this.body4.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.3;
            if (((EntityPrehistoricFloraMyriapod) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                //this.chainSwing(BodyHead, 0.2F, 0.3F, -3, f2, 1);
                //this.walk(head, 0.2F, 0.3F, false,0.3F, 0.5F, f2, 1);

                this.chainSwing(Body1, 0.3F, -0.015F, -3, f2, 0.5F);
                this.chainSwing(Body2, 0.3F, 0.015F, -3, f2, 0.5F);
                this.chainSwing(Body3, 0.3F, -0.015F, -3, f2, 0.5F);
                this.chainSwing(Body4, 0.3F, 0.015F, -3, f2, 0.5F);
                this.chainSwing(Body5, 0.2F, -0.015F, -3, f2, 0.5F);
                this.chainSwing(Body6, 0.2F, 0.015F, -3, f2, 0.5F);
                this.chainSwing(Body7, 0.15F, -0.015F, -3, f2, 0.5F);
                this.chainSwing(Body8, 0.15F, 0.016F, -3, f2, 0.5F);
                this.chainSwing(Body9, 0.15F, -0.016F, -3, f2, 0.5F);
                this.chainSwing(Body10, 0.10F, -0.016F, -3, f2, 0.5F);
                this.chainSwing(Body11, 0.10F, -0.016F, -3, f2, 0.5F);
                this.chainSwing(Body12, 0.10F, -0.016F, -3, f2, 0.5F);

                this.flap(leftLeg1, 0.7F, -0.5F, false, 0.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg1, 0.7F, 0.5F, false, 0.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg2, 0.7F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg2, 0.7F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg3, 0.7F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg3, 0.7F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg4, 0.7F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg4, 0.7F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg5, 0.7F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg5, 0.7F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg6, 0.7F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg6, 0.7F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg7, 0.7F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg7, 0.7F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg8, 0.7F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg8, 0.7F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg9, 0.7F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg9, 0.7F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg10, 0.7F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg10, 0.7F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg11, 0.7F, -0.5F, false, 0.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg11, 0.7F, 0.5F, false, 0.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg12, 0.7F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg12, 0.7F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg13, 0.7F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg13, 0.7F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg14, 0.7F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg14, 0.7F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg15, 0.7F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg15, 0.7F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg16, 0.7F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg16, 0.7F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg17, 0.7F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg17, 0.7F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg18, 0.7F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg18, 0.7F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg19, 0.7F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg19, 0.7F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg20, 0.7F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg20, 0.7F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg21, 0.7F, -0.5F, false, 0.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg21, 0.7F, 0.5F, false, 0.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg22, 0.7F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg22, 0.7F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg23, 0.7F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg23, 0.7F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();

        EntityPrehistoricFloraMyriapod ee = (EntityPrehistoricFloraMyriapod) entitylivingbaseIn;

        if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMyriapod entity = (EntityPrehistoricFloraMyriapod) entitylivingbaseIn;

        int animCycle = 257;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = -Math.abs((tickAnim /20))*300 + (((tickAnim - 0) / 19) * (-Math.abs(((double)tickAnim/20)))*300-(-Math.abs(((double)tickAnim/20)))*300);
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 19) / 200) * (0-(0)));
            yy = -Math.abs((tickAnim /20))*300 + (((tickAnim - 19) / 200) * (-288-(-Math.abs(((double)tickAnim/20)))*300));
            zz = 0 + (((tickAnim - 19) / 200) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(millipede, millipede.rotateAngleX + (float) Math.toRadians(xx), millipede.rotateAngleY + (float) Math.toRadians(yy), millipede.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-80-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 5) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 14) * (0-(0)));
            zz = -80 + (((tickAnim - 5) / 14) * (-80-(-80)));
        }
        else if (tickAnim >= 19 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 19) / 200) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 200) * (0-(0)));
            zz = -80 + (((tickAnim - 19) / 200) * (-80-(-80)));
        }
        else if (tickAnim >= 219 && tickAnim < 248) {
            xx = 0 + (((tickAnim - 219) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 219) / 29) * (0-(0)));
            zz = -80 + (((tickAnim - 219) / 29) * (-80-(-80)));
        }
        else if (tickAnim >= 248 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 248) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 248) / 10) * (0-(0)));
            zz = -80 + (((tickAnim - 248) / 10) * (0-(-80)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-2.91394-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.66529-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-60.09971-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -2.91394 + (((tickAnim - 7) / 3) * (-3.78888-(-2.91394)));
            yy = 1.66529 + (((tickAnim - 7) / 3) * (-4.27081-(1.66529)));
            zz = -60.09971 + (((tickAnim - 7) / 3) * (-76.47205-(-60.09971)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -3.78888 + (((tickAnim - 10) / 9) * (-7.22737-(-3.78888)));
            yy = -4.27081 + (((tickAnim - 10) / 9) * (-3.31164-(-4.27081)));
            zz = -76.47205 + (((tickAnim - 10) / 9) * (-73.82695-(-76.47205)));
        }
        else if (tickAnim >= 19 && tickAnim < 219) {
            xx = -7.22737 + (((tickAnim - 19) / 200) * (-7.22737-(-7.22737)));
            yy = -3.31164 + (((tickAnim - 19) / 200) * (-3.31164-(-3.31164)));
            zz = -73.82695 + (((tickAnim - 19) / 200) * (-73.82695-(-73.82695)));
        }
        else if (tickAnim >= 219 && tickAnim < 238) {
            xx = -7.22737 + (((tickAnim - 219) / 19) * (-3.78888-(-7.22737)));
            yy = -3.31164 + (((tickAnim - 219) / 19) * (-4.27081-(-3.31164)));
            zz = -73.82695 + (((tickAnim - 219) / 19) * (-76.47205-(-73.82695)));
        }
        else if (tickAnim >= 238 && tickAnim < 243) {
            xx = -3.78888 + (((tickAnim - 238) / 5) * (-2.91394-(-3.78888)));
            yy = -4.27081 + (((tickAnim - 238) / 5) * (1.66529-(-4.27081)));
            zz = -76.47205 + (((tickAnim - 238) / 5) * (-60.09971-(-76.47205)));
        }
        else if (tickAnim >= 243 && tickAnim < 258) {
            xx = -2.91394 + (((tickAnim - 243) / 15) * (0-(-2.91394)));
            yy = 1.66529 + (((tickAnim - 243) / 15) * (0-(1.66529)));
            zz = -60.09971 + (((tickAnim - 243) / 15) * (0-(-60.09971)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-58.39341-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (7.99365-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-12.73415-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 219) {
            xx = -58.39341 + (((tickAnim - 19) / 200) * (-58.39341-(-58.39341)));
            yy = 7.99365 + (((tickAnim - 19) / 200) * (7.99365-(7.99365)));
            zz = -12.73415 + (((tickAnim - 19) / 200) * (-12.73415-(-12.73415)));
        }
        else if (tickAnim >= 219 && tickAnim < 258) {
            xx = -58.39341 + (((tickAnim - 219) / 39) * (0-(-58.39341)));
            yy = 7.99365 + (((tickAnim - 219) / 39) * (0-(7.99365)));
            zz = -12.73415 + (((tickAnim - 219) / 39) * (0-(-12.73415)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.15922-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (12.47281-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.8307-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 19) {
            xx = 1.15922 + (((tickAnim - 5) / 14) * (-45-(1.15922)));
            yy = 12.47281 + (((tickAnim - 5) / 14) * (0-(12.47281)));
            zz = -0.8307 + (((tickAnim - 5) / 14) * (0-(-0.8307)));
        }
        else if (tickAnim >= 19 && tickAnim < 219) {
            xx = -45 + (((tickAnim - 19) / 200) * (-45-(-45)));
            yy = 0 + (((tickAnim - 19) / 200) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 200) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 248) {
            xx = -45 + (((tickAnim - 219) / 29) * (1.15922-(-45)));
            yy = 0 + (((tickAnim - 219) / 29) * (12.47281-(0)));
            zz = 0 + (((tickAnim - 219) / 29) * (-0.8307-(0)));
        }
        else if (tickAnim >= 248 && tickAnim < 258) {
            xx = 1.15922 + (((tickAnim - 248) / 10) * (0-(1.15922)));
            yy = 12.47281 + (((tickAnim - 248) / 10) * (0-(12.47281)));
            zz = -0.8307 + (((tickAnim - 248) / 10) * (0-(-0.8307)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.84336-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (9.3567-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (25.27494-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -13.84336 + (((tickAnim - 10) / 9) * (-39.56167-(-13.84336)));
            yy = 9.3567 + (((tickAnim - 10) / 9) * (8.89428-(9.3567)));
            zz = 25.27494 + (((tickAnim - 10) / 9) * (1.41947-(25.27494)));
        }
        else if (tickAnim >= 19 && tickAnim < 219) {
            xx = -39.56167 + (((tickAnim - 19) / 200) * (-39.56167-(-39.56167)));
            yy = 8.89428 + (((tickAnim - 19) / 200) * (8.89428-(8.89428)));
            zz = 1.41947 + (((tickAnim - 19) / 200) * (1.41947-(1.41947)));
        }
        else if (tickAnim >= 219 && tickAnim < 238) {
            xx = -39.56167 + (((tickAnim - 219) / 19) * (-13.84336-(-39.56167)));
            yy = 8.89428 + (((tickAnim - 219) / 19) * (9.3567-(8.89428)));
            zz = 1.41947 + (((tickAnim - 219) / 19) * (25.27494-(1.41947)));
        }
        else if (tickAnim >= 238 && tickAnim < 258) {
            xx = -13.84336 + (((tickAnim - 238) / 20) * (0-(-13.84336)));
            yy = 9.3567 + (((tickAnim - 238) / 20) * (0-(9.3567)));
            zz = 25.27494 + (((tickAnim - 238) / 20) * (0-(25.27494)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(xx), body4.rotateAngleY + (float) Math.toRadians(yy), body4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.34411-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (5.16283-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.42487-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.34411 + (((tickAnim - 5) / 5) * (-19.17977-(3.34411)));
            yy = 5.16283 + (((tickAnim - 5) / 5) * (9.5627-(5.16283)));
            zz = -0.42487 + (((tickAnim - 5) / 5) * (-10.85829-(-0.42487)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -19.17977 + (((tickAnim - 10) / 9) * (-31.65209-(-19.17977)));
            yy = 9.5627 + (((tickAnim - 10) / 9) * (7.07292-(9.5627)));
            zz = -10.85829 + (((tickAnim - 10) / 9) * (7.3014-(-10.85829)));
        }
        else if (tickAnim >= 19 && tickAnim < 219) {
            xx = -31.65209 + (((tickAnim - 19) / 200) * (-31.65209-(-31.65209)));
            yy = 7.07292 + (((tickAnim - 19) / 200) * (7.07292-(7.07292)));
            zz = 7.3014 + (((tickAnim - 19) / 200) * (7.3014-(7.3014)));
        }
        else if (tickAnim >= 219 && tickAnim < 238) {
            xx = -31.65209 + (((tickAnim - 219) / 19) * (-19.17977-(-31.65209)));
            yy = 7.07292 + (((tickAnim - 219) / 19) * (9.5627-(7.07292)));
            zz = 7.3014 + (((tickAnim - 219) / 19) * (-10.85829-(7.3014)));
        }
        else if (tickAnim >= 238 && tickAnim < 248) {
            xx = -19.17977 + (((tickAnim - 238) / 10) * (3.34411-(-19.17977)));
            yy = 9.5627 + (((tickAnim - 238) / 10) * (5.16283-(9.5627)));
            zz = -10.85829 + (((tickAnim - 238) / 10) * (-0.42487-(-10.85829)));
        }
        else if (tickAnim >= 248 && tickAnim < 258) {
            xx = 3.34411 + (((tickAnim - 248) / 10) * (0-(3.34411)));
            yy = 5.16283 + (((tickAnim - 248) / 10) * (0-(5.16283)));
            zz = -0.42487 + (((tickAnim - 248) / 10) * (0-(-0.42487)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(xx), body5.rotateAngleY + (float) Math.toRadians(yy), body5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11.58254-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (9.87542-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (35.37479-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -11.58254 + (((tickAnim - 10) / 9) * (-25.06271-(-11.58254)));
            yy = 9.87542 + (((tickAnim - 10) / 9) * (7.0625-(9.87542)));
            zz = 35.37479 + (((tickAnim - 10) / 9) * (18.60022-(35.37479)));
        }
        else if (tickAnim >= 19 && tickAnim < 219) {
            xx = -25.06271 + (((tickAnim - 19) / 200) * (-25.06271-(-25.06271)));
            yy = 7.0625 + (((tickAnim - 19) / 200) * (7.0625-(7.0625)));
            zz = 18.60022 + (((tickAnim - 19) / 200) * (18.60022-(18.60022)));
        }
        else if (tickAnim >= 219 && tickAnim < 238) {
            xx = -25.06271 + (((tickAnim - 219) / 19) * (-11.58254-(-25.06271)));
            yy = 7.0625 + (((tickAnim - 219) / 19) * (9.87542-(7.0625)));
            zz = 18.60022 + (((tickAnim - 219) / 19) * (35.37479-(18.60022)));
        }
        else if (tickAnim >= 238 && tickAnim < 258) {
            xx = -11.58254 + (((tickAnim - 238) / 20) * (0-(-11.58254)));
            yy = 9.87542 + (((tickAnim - 238) / 20) * (0-(9.87542)));
            zz = 35.37479 + (((tickAnim - 238) / 20) * (0-(35.37479)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(xx), body6.rotateAngleY + (float) Math.toRadians(yy), body6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.83211-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (26.20514-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (21.0319-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 3.83211 + (((tickAnim - 10) / 9) * (-37.94513-(3.83211)));
            yy = 26.20514 + (((tickAnim - 10) / 9) * (31.10856-(26.20514)));
            zz = 21.0319 + (((tickAnim - 10) / 9) * (-12.75293-(21.0319)));
        }
        else if (tickAnim >= 19 && tickAnim < 219) {
            xx = -37.94513 + (((tickAnim - 19) / 200) * (-37.94513-(-37.94513)));
            yy = 31.10856 + (((tickAnim - 19) / 200) * (31.10856-(31.10856)));
            zz = -12.75293 + (((tickAnim - 19) / 200) * (-12.75293-(-12.75293)));
        }
        else if (tickAnim >= 219 && tickAnim < 238) {
            xx = -37.94513 + (((tickAnim - 219) / 19) * (3.83211-(-37.94513)));
            yy = 31.10856 + (((tickAnim - 219) / 19) * (26.20514-(31.10856)));
            zz = -12.75293 + (((tickAnim - 219) / 19) * (21.0319-(-12.75293)));
        }
        else if (tickAnim >= 238 && tickAnim < 258) {
            xx = 3.83211 + (((tickAnim - 238) / 20) * (0-(3.83211)));
            yy = 26.20514 + (((tickAnim - 238) / 20) * (0-(26.20514)));
            zz = 21.0319 + (((tickAnim - 238) / 20) * (0-(21.0319)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body7, body7.rotateAngleX + (float) Math.toRadians(xx), body7.rotateAngleY + (float) Math.toRadians(yy), body7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-0.04265-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (4.95698-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (14.34368-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -0.04265 + (((tickAnim - 13) / 6) * (-7.56397-(-0.04265)));
            yy = 4.95698 + (((tickAnim - 13) / 6) * (7.43547-(4.95698)));
            zz = 14.34368 + (((tickAnim - 13) / 6) * (21.51552-(14.34368)));
        }
        else if (tickAnim >= 19 && tickAnim < 219) {
            xx = -7.56397 + (((tickAnim - 19) / 200) * (-7.56397-(-7.56397)));
            yy = 7.43547 + (((tickAnim - 19) / 200) * (7.43547-(7.43547)));
            zz = 21.51552 + (((tickAnim - 19) / 200) * (21.51552-(21.51552)));
        }
        else if (tickAnim >= 219 && tickAnim < 232) {
            xx = -7.56397 + (((tickAnim - 219) / 13) * (-0.04265-(-7.56397)));
            yy = 7.43547 + (((tickAnim - 219) / 13) * (4.95698-(7.43547)));
            zz = 21.51552 + (((tickAnim - 219) / 13) * (14.34368-(21.51552)));
        }
        else if (tickAnim >= 232 && tickAnim < 258) {
            xx = -0.04265 + (((tickAnim - 232) / 26) * (0-(-0.04265)));
            yy = 4.95698 + (((tickAnim - 232) / 26) * (0-(4.95698)));
            zz = 14.34368 + (((tickAnim - 232) / 26) * (0-(14.34368)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body8, body8.rotateAngleX + (float) Math.toRadians(xx), body8.rotateAngleY + (float) Math.toRadians(yy), body8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.61848-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (18.72919-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.20233-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -4.61848 + (((tickAnim - 10) / 3) * (1.40566-(-4.61848)));
            yy = 18.72919 + (((tickAnim - 10) / 3) * (23.95646-(18.72919)));
            zz = 0.20233 + (((tickAnim - 10) / 3) * (10.82832-(0.20233)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 1.40566 + (((tickAnim - 13) / 6) * (-1.54604-(1.40566)));
            yy = 23.95646 + (((tickAnim - 13) / 6) * (34.41101-(23.95646)));
            zz = 10.82832 + (((tickAnim - 13) / 6) * (32.0803-(10.82832)));
        }
        else if (tickAnim >= 19 && tickAnim < 219) {
            xx = -1.54604 + (((tickAnim - 19) / 200) * (-1.54604-(-1.54604)));
            yy = 34.41101 + (((tickAnim - 19) / 200) * (34.41101-(34.41101)));
            zz = 32.0803 + (((tickAnim - 19) / 200) * (32.0803-(32.0803)));
        }
        else if (tickAnim >= 219 && tickAnim < 232) {
            xx = -1.54604 + (((tickAnim - 219) / 13) * (1.40566-(-1.54604)));
            yy = 34.41101 + (((tickAnim - 219) / 13) * (23.95646-(34.41101)));
            zz = 32.0803 + (((tickAnim - 219) / 13) * (10.82832-(32.0803)));
        }
        else if (tickAnim >= 232 && tickAnim < 238) {
            xx = 1.40566 + (((tickAnim - 232) / 6) * (-4.61848-(1.40566)));
            yy = 23.95646 + (((tickAnim - 232) / 6) * (18.72919-(23.95646)));
            zz = 10.82832 + (((tickAnim - 232) / 6) * (0.20233-(10.82832)));
        }
        else if (tickAnim >= 238 && tickAnim < 258) {
            xx = -4.61848 + (((tickAnim - 238) / 20) * (0-(-4.61848)));
            yy = 18.72919 + (((tickAnim - 238) / 20) * (0-(18.72919)));
            zz = 0.20233 + (((tickAnim - 238) / 20) * (0-(0.20233)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body9, body9.rotateAngleX + (float) Math.toRadians(xx), body9.rotateAngleY + (float) Math.toRadians(yy), body9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (25-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 19) / 200) * (0-(0)));
            yy = 25 + (((tickAnim - 19) / 200) * (25-(25)));
            zz = 0 + (((tickAnim - 19) / 200) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 219) / 39) * (0-(0)));
            yy = 25 + (((tickAnim - 219) / 39) * (0-(25)));
            zz = 0 + (((tickAnim - 219) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body10, body10.rotateAngleX + (float) Math.toRadians(xx), body10.rotateAngleY + (float) Math.toRadians(yy), body10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (32.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 19) / 200) * (0-(0)));
            yy = 32.5 + (((tickAnim - 19) / 200) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 19) / 200) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 219) / 39) * (0-(0)));
            yy = 32.5 + (((tickAnim - 219) / 39) * (0-(32.5)));
            zz = 0 + (((tickAnim - 219) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body11, body11.rotateAngleX + (float) Math.toRadians(xx), body11.rotateAngleY + (float) Math.toRadians(yy), body11.rotateAngleZ + (float) Math.toRadians(zz));

    }
}
