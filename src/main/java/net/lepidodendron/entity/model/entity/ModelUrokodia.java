package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraIsotelus;
import net.lepidodendron.entity.EntityPrehistoricFloraUrokodia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelUrokodia extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer gill;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer gill16;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer gill14;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer gill15;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer antennaeleft;
    private final AdvancedModelRenderer antennaeright;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer gill2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer gill17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer gill3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer gill18;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftleg5;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer rightleg5;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer gill4;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer gill19;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer gill5;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer gill20;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer leftleg7;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer rightleg7;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer gill6;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer gill21;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer gill7;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer gill22;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer leftleg9;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer rightleg9;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer gill8;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer gill23;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer gill9;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer gill24;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer leftleg11;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer rightleg11;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer gill10;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer gill25;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer gill11;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer gill26;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer leftleg13;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer rightleg13;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer gill12;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer gill27;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer gill13;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer gill28;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;

    public ModelUrokodia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(1.0F, 1.825F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 20, 0, -2.0F, -3.25F, -5.0F, 2, 1, 1, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, -3.25F, -4.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.7418F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 26, 0.05F, 0.025F, -0.475F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.25F, -4.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, -0.7418F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 26, -0.05F, 0.025F, -0.475F, 0, 1, 1, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(0.0F, -2.55F, -4.5F);
        this.body.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.0F, 0.0F, 0.2618F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftleg.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.5672F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 23, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-2.0F, -2.55F, -4.5F);
        this.body.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.0F, 0.0F, -0.2618F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightleg.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.5672F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 23, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.gill = new AdvancedModelRenderer(this);
        this.gill.setRotationPoint(0.0F, -3.25F, -4.5F);
        this.body.addChild(gill);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.48F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 7, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.gill16 = new AdvancedModelRenderer(this);
        this.gill16.setRotationPoint(-2.0F, -3.25F, -4.5F);
        this.body.addChild(gill16);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill16.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.48F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 7, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-1.0F, -3.0F, -5.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 5, -1.0F, -0.25F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -0.25F, -1.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.7418F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 19, 0.05F, -0.05F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -0.25F, -1.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, -0.7418F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 19, -0.05F, -0.05F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0378F, 0.2045F, -0.192F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 9, -1.9097F, -0.219F, -2.2805F, 2, 0, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0378F, -0.2045F, 0.192F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 9, -0.0903F, -0.219F, -2.2805F, 2, 0, 2, 0.0F, false));

        this.gill14 = new AdvancedModelRenderer(this);
        this.gill14.setRotationPoint(1.0F, -0.25F, -0.5F);
        this.head.addChild(gill14);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill14.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.48F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.gill15 = new AdvancedModelRenderer(this);
        this.gill15.setRotationPoint(-1.0F, -0.25F, -0.5F);
        this.head.addChild(gill15);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill15.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.48F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.antennaeleft = new AdvancedModelRenderer(this);
        this.antennaeleft.setRotationPoint(0.5F, 0.25F, -2.0F);
        this.head.addChild(antennaeleft);
        this.setRotateAngle(antennaeleft, 0.3054F, -0.0873F, 0.0F);
        this.antennaeleft.cubeList.add(new ModelBox(antennaeleft, 19, 12, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.antennaeright = new AdvancedModelRenderer(this);
        this.antennaeright.setRotationPoint(-0.5F, 0.25F, -2.0F);
        this.head.addChild(antennaeright);
        this.setRotateAngle(antennaeright, 0.3054F, 0.0873F, 0.0F);
        this.antennaeright.cubeList.add(new ModelBox(antennaeright, 19, 12, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-1.0F, -2.8153F, -4.0145F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 14, 4, -1.0F, -0.4347F, 0.0145F, 2, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -0.4347F, 1.0145F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0436F, 0.0F, 0.7418F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 20, 0.05F, 0.0F, -1.0F, 0, 1, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -0.4347F, 1.0145F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, -0.7418F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 20, -0.05F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(1.0F, 0.2653F, 1.5145F);
        this.tail.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.0F, 0.0F, 0.2618F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftleg3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.5672F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 5, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-1.0F, 0.2653F, 1.5145F);
        this.tail.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.0F, 0.0F, -0.2618F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightleg3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.5672F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 5, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.gill2 = new AdvancedModelRenderer(this);
        this.gill2.setRotationPoint(1.0F, -0.4347F, 0.5145F);
        this.tail.addChild(gill2);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.48F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 6, 26, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.gill17 = new AdvancedModelRenderer(this);
        this.gill17.setRotationPoint(-1.0F, -0.4347F, 0.5145F);
        this.tail.addChild(gill17);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill17.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.48F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 6, 26, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.gill3 = new AdvancedModelRenderer(this);
        this.gill3.setRotationPoint(1.0F, -0.4347F, 1.5145F);
        this.tail.addChild(gill3);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.48F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 2, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.gill18 = new AdvancedModelRenderer(this);
        this.gill18.setRotationPoint(-1.0F, -0.4347F, 1.5145F);
        this.tail.addChild(gill18);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill18.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.48F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 26, 2, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 13, -1.0F, -0.4347F, 0.0145F, 2, 1, 2, 0.001F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, -0.4347F, 1.0145F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.0436F, -0.829F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 17, 18, -1.0F, 0.05F, -1.0F, 1, 0, 2, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, -0.4347F, 1.0145F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0436F, 0.829F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 17, 18, 0.0F, 0.05F, -1.0F, 1, 0, 2, 0.0F, false));

        this.leftleg5 = new AdvancedModelRenderer(this);
        this.leftleg5.setRotationPoint(1.0F, 0.2653F, 1.5145F);
        this.tail2.addChild(leftleg5);
        this.setRotateAngle(leftleg5, 0.0F, 0.0F, 0.2618F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftleg5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.5672F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 22, 18, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightleg5 = new AdvancedModelRenderer(this);
        this.rightleg5.setRotationPoint(-1.0F, 0.2653F, 1.5145F);
        this.tail2.addChild(rightleg5);
        this.setRotateAngle(rightleg5, 0.0F, 0.0F, -0.2618F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightleg5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.5672F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 22, 18, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.gill4 = new AdvancedModelRenderer(this);
        this.gill4.setRotationPoint(1.0F, -0.4347F, 0.5145F);
        this.tail2.addChild(gill4);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -0.48F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 23, 25, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.gill19 = new AdvancedModelRenderer(this);
        this.gill19.setRotationPoint(-1.0F, -0.4347F, 0.5145F);
        this.tail2.addChild(gill19);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill19.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.48F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 23, 25, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.gill5 = new AdvancedModelRenderer(this);
        this.gill5.setRotationPoint(1.0F, -0.4347F, 1.5145F);
        this.tail2.addChild(gill5);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.48F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 25, 14, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.gill20 = new AdvancedModelRenderer(this);
        this.gill20.setRotationPoint(-1.0F, -0.4347F, 1.5145F);
        this.tail2.addChild(gill20);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill20.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, 0.48F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 25, 14, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 7, 11, -1.0F, -0.4347F, 0.0145F, 2, 1, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0F, -0.4347F, 1.0145F);
        this.tail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.0436F, -0.829F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 5, 18, -1.0F, 0.05F, -1.0F, 1, 0, 2, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.0F, -0.4347F, 1.0145F);
        this.tail3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0436F, 0.829F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 5, 18, 0.0F, 0.05F, -1.0F, 1, 0, 2, 0.0F, false));

        this.leftleg7 = new AdvancedModelRenderer(this);
        this.leftleg7.setRotationPoint(1.0F, 0.2653F, 1.5145F);
        this.tail3.addChild(leftleg7);
        this.setRotateAngle(leftleg7, 0.0F, 0.0F, 0.2618F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftleg7.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, 0.5672F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 20, 21, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightleg7 = new AdvancedModelRenderer(this);
        this.rightleg7.setRotationPoint(-1.0F, 0.2653F, 1.5145F);
        this.tail3.addChild(rightleg7);
        this.setRotateAngle(rightleg7, 0.0F, 0.0F, -0.2618F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightleg7.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, -0.5672F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 20, 21, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.gill6 = new AdvancedModelRenderer(this);
        this.gill6.setRotationPoint(1.0F, -0.4347F, 0.5145F);
        this.tail3.addChild(gill6);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill6.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, -0.48F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 14, 25, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.gill21 = new AdvancedModelRenderer(this);
        this.gill21.setRotationPoint(-1.0F, -0.4347F, 0.5145F);
        this.tail3.addChild(gill21);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill21.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, 0.48F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 14, 25, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.gill7 = new AdvancedModelRenderer(this);
        this.gill7.setRotationPoint(1.0F, -0.4347F, 1.5145F);
        this.tail3.addChild(gill7);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill7.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, -0.48F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 3, 25, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.gill22 = new AdvancedModelRenderer(this);
        this.gill22.setRotationPoint(-1.0F, -0.4347F, 1.5145F);
        this.tail3.addChild(gill22);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill22.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, 0.48F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 3, 25, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 11, 0, -1.0F, -0.4347F, 0.0145F, 2, 1, 2, 0.001F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.0F, -0.4347F, 1.0145F);
        this.tail4.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.0436F, -0.829F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 12, 17, -1.0F, 0.05F, -1.0F, 1, 0, 2, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(1.0F, -0.4347F, 1.0145F);
        this.tail4.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0436F, 0.829F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 12, 17, 0.0F, 0.05F, -1.0F, 1, 0, 2, 0.0F, false));

        this.leftleg9 = new AdvancedModelRenderer(this);
        this.leftleg9.setRotationPoint(1.0F, 0.2653F, 1.5145F);
        this.tail4.addChild(leftleg9);
        this.setRotateAngle(leftleg9, 0.0F, 0.0F, 0.2618F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftleg9.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, 0.5672F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 21, 8, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightleg9 = new AdvancedModelRenderer(this);
        this.rightleg9.setRotationPoint(-1.0F, 0.2653F, 1.5145F);
        this.tail4.addChild(rightleg9);
        this.setRotateAngle(rightleg9, 0.0F, 0.0F, -0.2618F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightleg9.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, -0.5672F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 21, 8, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.gill8 = new AdvancedModelRenderer(this);
        this.gill8.setRotationPoint(1.0F, -0.4347F, 0.5145F);
        this.tail4.addChild(gill8);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill8.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, -0.48F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 24, 22, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.gill23 = new AdvancedModelRenderer(this);
        this.gill23.setRotationPoint(-1.0F, -0.4347F, 0.5145F);
        this.tail4.addChild(gill23);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill23.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, 0.48F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 24, 22, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.gill9 = new AdvancedModelRenderer(this);
        this.gill9.setRotationPoint(1.0F, -0.4347F, 1.5145F);
        this.tail4.addChild(gill9);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill9.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, -0.48F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 11, 24, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.gill24 = new AdvancedModelRenderer(this);
        this.gill24.setRotationPoint(-1.0F, -0.4347F, 1.5145F);
        this.tail4.addChild(gill24);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill24.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, 0.48F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 11, 24, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 9, -1.0F, -0.4347F, 0.0145F, 2, 1, 2, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-1.0F, -0.4347F, 1.0145F);
        this.tail5.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, -0.0436F, -0.829F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 17, -1.0F, 0.05F, -1.0F, 1, 0, 2, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(1.0F, -0.4347F, 1.0145F);
        this.tail5.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.0436F, 0.829F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 17, 0.0F, 0.05F, -1.0F, 1, 0, 2, 0.0F, false));

        this.leftleg11 = new AdvancedModelRenderer(this);
        this.leftleg11.setRotationPoint(1.0F, 0.2653F, 1.5145F);
        this.tail5.addChild(leftleg11);
        this.setRotateAngle(leftleg11, 0.0F, 0.0F, 0.2618F);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftleg11.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.0F, 0.5672F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 21, 3, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightleg11 = new AdvancedModelRenderer(this);
        this.rightleg11.setRotationPoint(-1.0F, 0.2653F, 1.5145F);
        this.tail5.addChild(rightleg11);
        this.setRotateAngle(rightleg11, 0.0F, 0.0F, -0.2618F);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightleg11.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.0F, -0.5672F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 21, 3, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.gill10 = new AdvancedModelRenderer(this);
        this.gill10.setRotationPoint(1.0F, -0.4347F, 0.5145F);
        this.tail5.addChild(gill10);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill10.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.0F, -0.48F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 8, 24, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.gill25 = new AdvancedModelRenderer(this);
        this.gill25.setRotationPoint(-1.0F, -0.4347F, 0.5145F);
        this.tail5.addChild(gill25);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill25.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.0F, 0.48F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 8, 24, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.gill11 = new AdvancedModelRenderer(this);
        this.gill11.setRotationPoint(1.0F, -0.4347F, 1.5145F);
        this.tail5.addChild(gill11);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill11.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.0F, -0.48F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 24, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.gill26 = new AdvancedModelRenderer(this);
        this.gill26.setRotationPoint(-1.0F, -0.4347F, 1.5145F);
        this.tail5.addChild(gill26);


        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill26.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, 0.0F, 0.48F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 24, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 7, 7, -1.0F, -0.4347F, 0.0145F, 2, 1, 2, 0.001F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-1.0F, -0.4347F, 1.0145F);
        this.tail6.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, -0.0436F, -0.829F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 7, 15, -1.0F, 0.05F, -1.0F, 1, 0, 2, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(1.0F, -0.4347F, 1.0145F);
        this.tail6.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.0436F, 0.829F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 7, 15, 0.0F, 0.05F, -1.0F, 1, 0, 2, 0.0F, false));

        this.leftleg13 = new AdvancedModelRenderer(this);
        this.leftleg13.setRotationPoint(1.0F, 0.2653F, 1.5145F);
        this.tail6.addChild(leftleg13);
        this.setRotateAngle(leftleg13, 0.0F, 0.0F, 0.2618F);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftleg13.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, 0.0F, 0.5672F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 11, 20, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightleg13 = new AdvancedModelRenderer(this);
        this.rightleg13.setRotationPoint(-1.0F, 0.2653F, 1.5145F);
        this.tail6.addChild(rightleg13);
        this.setRotateAngle(rightleg13, 0.0F, 0.0F, -0.2618F);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightleg13.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, 0.0F, -0.5672F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 11, 20, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.gill12 = new AdvancedModelRenderer(this);
        this.gill12.setRotationPoint(1.0F, -0.4347F, 0.5145F);
        this.tail6.addChild(gill12);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill12.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, 0.0F, -0.48F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 21, 23, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.gill27 = new AdvancedModelRenderer(this);
        this.gill27.setRotationPoint(-1.0F, -0.4347F, 0.5145F);
        this.tail6.addChild(gill27);


        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill27.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.0F, 0.48F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 21, 23, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.gill13 = new AdvancedModelRenderer(this);
        this.gill13.setRotationPoint(1.0F, -0.4347F, 1.5145F);
        this.tail6.addChild(gill13);


        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill13.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, 0.0F, -0.48F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 18, 23, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.gill28 = new AdvancedModelRenderer(this);
        this.gill28.setRotationPoint(-1.0F, -0.4347F, 1.5145F);
        this.tail6.addChild(gill28);


        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.gill28.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, 0.0F, 0.48F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 18, 23, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.0645F, 1.9312F);
        this.tail6.addChild(tail7);
        this.tail7.cubeList.add(new ModelBox(tail7, 14, 13, -0.5F, -0.4992F, 0.0833F, 1, 1, 2, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, -0.4992F, 0.0833F);
        this.tail7.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, 0.0F, -0.3054F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 0, -3.0F, 0.05F, 0.0F, 3, 0, 4, 0.0F, true));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, -0.4992F, 0.0833F);
        this.tail7.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, 0.0F, 0.3054F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 0, 0, 0.0F, 0.05F, 0.0F, 3, 0, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(tail6, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(tail7, 0.0F, -0.3F, 0.0F);
        this.root.offsetZ = -0.03F;
        this.root.offsetY = 0.2F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.root.offsetZ = 0.030F;
        this.root.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.4F;
        this.root.offsetX = 0.55F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 0.5F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        //this.root.offsetY = 0.65F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.leftleg, this.leftleg3, this.leftleg5, this.leftleg7, this.leftleg9, this.leftleg11, this.leftleg13};
        AdvancedModelRenderer[] legsR = {this.rightleg, this.rightleg3, this.rightleg5, this.rightleg7, this.rightleg9, this.rightleg11, this.rightleg13};
        AdvancedModelRenderer[] bodyF = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};

        if (((EntityPrehistoricFloraUrokodia) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(leftleg, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
                this.flap(rightleg, 0.5F, 0.5F, true, 0, 0.5F, f2, 0.3F);
                this.flap(leftleg3, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg3, 0.5F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg5, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg5, 0.5F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg7, 0.5F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg7, 0.5F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg9, 0.5F, -0.5F, true, 4.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg9, 0.5F, 0.5F, true, 4.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg11, 0.5F, -0.5F, true, 5.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg11, 0.5F, 0.5F, true, 5.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg13, 0.5F, -0.5F, true, 6.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg13, 0.5F, 0.5F, true, 6.0F, 0.5F, f2, 0.3F);
                this.chainSwing(bodyF, 0.1F, 0.1F, -3, f2, 1.0F);
                this.chainWave(bodyF, 0.1F, 0.0f, -3, f2, 0F);
            }
            this.bob(root, 0.0F, 0.0F, true, f2, 1);


        this.swing(antennaeleft, 0.3F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaeright, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);

    }
}
