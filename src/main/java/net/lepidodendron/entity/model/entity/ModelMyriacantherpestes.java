package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.EntityPrehistoricFloraMyriacantherpestes;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMyriacantherpestes extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended main;
    private final AdvancedModelRendererExtended Frontbody3;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended legR3;
    private final AdvancedModelRendererExtended legL3;
    private final AdvancedModelRendererExtended Body2;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended legR2;
    private final AdvancedModelRendererExtended legL2;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended legR;
    private final AdvancedModelRendererExtended legL;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended antennaR;
    private final AdvancedModelRendererExtended antennaL;
    private final AdvancedModelRendererExtended Backbody4;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended legR4;
    private final AdvancedModelRendererExtended legL4;
    private final AdvancedModelRendererExtended Body5;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended legR5;
    private final AdvancedModelRendererExtended legL5;
    private final AdvancedModelRendererExtended Body6;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended legR6;
    private final AdvancedModelRendererExtended legL6;
    private final AdvancedModelRendererExtended Body7;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended legR7;
    private final AdvancedModelRendererExtended legL7;
    private final AdvancedModelRendererExtended Body8;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended legR8;
    private final AdvancedModelRendererExtended legL8;
    private final AdvancedModelRendererExtended Body9;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended legR9;
    private final AdvancedModelRendererExtended legL9;
    private final AdvancedModelRendererExtended Body10;
    private final AdvancedModelRendererExtended cube_r28;
    private final AdvancedModelRendererExtended cube_r29;
    private final AdvancedModelRendererExtended cube_r30;
    private final AdvancedModelRendererExtended legR10;
    private final AdvancedModelRendererExtended legL10;
    private final AdvancedModelRendererExtended Body11;
    private final AdvancedModelRendererExtended cube_r31;
    private final AdvancedModelRendererExtended cube_r32;
    private final AdvancedModelRendererExtended cube_r33;
    private final AdvancedModelRendererExtended legR11;
    private final AdvancedModelRendererExtended legL11;
    private final AdvancedModelRendererExtended Backbody12;
    private final AdvancedModelRendererExtended cube_r34;
    private final AdvancedModelRendererExtended cube_r35;
    private final AdvancedModelRendererExtended cube_r36;
    private final AdvancedModelRendererExtended legR12;
    private final AdvancedModelRendererExtended legL12;
    private final AdvancedModelRendererExtended Body13;
    private final AdvancedModelRendererExtended cube_r37;
    private final AdvancedModelRendererExtended cube_r38;
    private final AdvancedModelRendererExtended cube_r39;
    private final AdvancedModelRendererExtended legR13;
    private final AdvancedModelRendererExtended legL13;
    private final AdvancedModelRendererExtended Body14;
    private final AdvancedModelRendererExtended cube_r40;
    private final AdvancedModelRendererExtended cube_r41;
    private final AdvancedModelRendererExtended cube_r42;
    private final AdvancedModelRendererExtended legR14;
    private final AdvancedModelRendererExtended legL14;
    private final AdvancedModelRendererExtended Body15;
    private final AdvancedModelRendererExtended cube_r43;
    private final AdvancedModelRendererExtended cube_r44;
    private final AdvancedModelRendererExtended cube_r45;
    private final AdvancedModelRendererExtended legR15;
    private final AdvancedModelRendererExtended legL15;
    private final AdvancedModelRendererExtended Body16;
    private final AdvancedModelRendererExtended cube_r46;
    private final AdvancedModelRendererExtended cube_r47;
    private final AdvancedModelRendererExtended cube_r48;
    private final AdvancedModelRendererExtended legR16;
    private final AdvancedModelRendererExtended legL16;
    private final AdvancedModelRendererExtended Body17;
    private final AdvancedModelRendererExtended cube_r49;
    private final AdvancedModelRendererExtended cube_r50;
    private final AdvancedModelRendererExtended cube_r51;
    private final AdvancedModelRendererExtended legR17;
    private final AdvancedModelRendererExtended legL17;
    private final AdvancedModelRendererExtended Body18;
    private final AdvancedModelRendererExtended cube_r52;
    private final AdvancedModelRendererExtended cube_r53;
    private final AdvancedModelRendererExtended cube_r54;
    private final AdvancedModelRendererExtended legR18;
    private final AdvancedModelRendererExtended legL18;
    private final AdvancedModelRendererExtended Body19;
    private final AdvancedModelRendererExtended cube_r55;
    private final AdvancedModelRendererExtended cube_r56;
    private final AdvancedModelRendererExtended cube_r57;
    private final AdvancedModelRendererExtended legR19;
    private final AdvancedModelRendererExtended legL19;
    private final AdvancedModelRendererExtended Body20;
    private final AdvancedModelRendererExtended cube_r58;
    private final AdvancedModelRendererExtended cube_r59;
    private final AdvancedModelRendererExtended cube_r60;
    private final AdvancedModelRendererExtended legR20;
    private final AdvancedModelRendererExtended legL20;
    private final AdvancedModelRendererExtended Body21;
    private final AdvancedModelRendererExtended cube_r61;
    private final AdvancedModelRendererExtended cube_r62;
    private final AdvancedModelRendererExtended cube_r63;
    private final AdvancedModelRendererExtended legR21;
    private final AdvancedModelRendererExtended legL21;
    private final AdvancedModelRendererExtended Body22;
    private final AdvancedModelRendererExtended cube_r64;
    private final AdvancedModelRendererExtended cube_r65;
    private final AdvancedModelRendererExtended cube_r66;
    private final AdvancedModelRendererExtended legR22;
    private final AdvancedModelRendererExtended legL22;
    private final AdvancedModelRendererExtended telson;
    private final AdvancedModelRendererExtended cube_r67;
    private final AdvancedModelRendererExtended cube_r68;
    private final AdvancedModelRendererExtended cube_r69;
    private final AdvancedModelRendererExtended legR23;
    private final AdvancedModelRendererExtended legL24;

    public ModelMyriacantherpestes() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRendererExtended(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Frontbody3 = new AdvancedModelRendererExtended(this);
        this.Frontbody3.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.main.addChild(Frontbody3);
        this.Frontbody3.cubeList.add(new ModelBox(Frontbody3, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Frontbody3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, -0.75F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, -6.25F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Frontbody3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3491F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Frontbody3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.3491F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRendererExtended(this);
        this.legR3.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Frontbody3.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.2618F);
        this.legR3.cubeList.add(new ModelBox(legR3, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRendererExtended(this);
        this.legL3.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Frontbody3.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.2618F);
        this.legL3.cubeList.add(new ModelBox(legL3, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body2 = new AdvancedModelRendererExtended(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Frontbody3.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 5, -0.25F, 0.0F, -0.5F, 3, 0, 2, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 5, -5.75F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.3491F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.3491F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRendererExtended(this);
        this.legR2.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body2.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.2618F);
        this.legR2.cubeList.add(new ModelBox(legR2, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRendererExtended(this);
        this.legL2.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body2.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.2618F);
        this.legL2.cubeList.add(new ModelBox(legL2, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Body2.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5236F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 2, 0.0F, 0.0F, -0.5F, 2, 0, 2, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 2, -5.0F, 0.0F, -0.5F, 2, 0, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.3491F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.3491F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR = new AdvancedModelRendererExtended(this);
        this.legR.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, -0.2618F);
        this.legR.cubeList.add(new ModelBox(legR, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL = new AdvancedModelRendererExtended(this);
        this.legL.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.2618F);
        this.legL.cubeList.add(new ModelBox(legL, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Body.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 8, -2.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 0, -1.5F, 0.0F, -2.0F, 3, 1, 1, 0.0F, false));

        this.antennaR = new AdvancedModelRendererExtended(this);
        this.antennaR.setRotationPoint(-0.5F, 0.5F, -2.0F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.6109F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 8, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.antennaL = new AdvancedModelRendererExtended(this);
        this.antennaL.setRotationPoint(0.5F, 0.5F, -2.0F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.6109F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 8, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, true));

        this.Backbody4 = new AdvancedModelRendererExtended(this);
        this.Backbody4.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.main.addChild(Backbody4);
        this.Backbody4.cubeList.add(new ModelBox(Backbody4, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Backbody4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5236F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Backbody4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3491F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Backbody4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.3491F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRendererExtended(this);
        this.legR4.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Backbody4.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.2618F);
        this.legR4.cubeList.add(new ModelBox(legR4, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRendererExtended(this);
        this.legL4.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Backbody4.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.2618F);
        this.legL4.cubeList.add(new ModelBox(legL4, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body5 = new AdvancedModelRendererExtended(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Backbody4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5236F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.3491F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.3491F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR5 = new AdvancedModelRendererExtended(this);
        this.legR5.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body5.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.2618F);
        this.legR5.cubeList.add(new ModelBox(legR5, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRendererExtended(this);
        this.legL5.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body5.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.2618F);
        this.legL5.cubeList.add(new ModelBox(legL5, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body6 = new AdvancedModelRendererExtended(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body6.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5236F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.3491F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.3491F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR6 = new AdvancedModelRendererExtended(this);
        this.legR6.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body6.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0F, -0.2618F);
        this.legR6.cubeList.add(new ModelBox(legR6, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRendererExtended(this);
        this.legL6.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body6.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0F, 0.2618F);
        this.legL6.cubeList.add(new ModelBox(legL6, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body7 = new AdvancedModelRendererExtended(this);
        this.Body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body6.addChild(Body7);
        this.Body7.cubeList.add(new ModelBox(Body7, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body7.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5236F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body7.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.3491F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body7.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.3491F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR7 = new AdvancedModelRendererExtended(this);
        this.legR7.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body7.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, 0.0F, -0.2618F);
        this.legR7.cubeList.add(new ModelBox(legR7, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL7 = new AdvancedModelRendererExtended(this);
        this.legL7.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body7.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0F, 0.2618F);
        this.legL7.cubeList.add(new ModelBox(legL7, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body8 = new AdvancedModelRendererExtended(this);
        this.Body8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body7.addChild(Body8);
        this.Body8.cubeList.add(new ModelBox(Body8, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body8.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.5236F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body8.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.3491F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body8.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.3491F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR8 = new AdvancedModelRendererExtended(this);
        this.legR8.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body8.addChild(legR8);
        this.setRotateAngle(legR8, 0.0F, 0.0F, -0.2618F);
        this.legR8.cubeList.add(new ModelBox(legR8, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL8 = new AdvancedModelRendererExtended(this);
        this.legL8.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body8.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.0F, 0.2618F);
        this.legL8.cubeList.add(new ModelBox(legL8, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body9 = new AdvancedModelRendererExtended(this);
        this.Body9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body8.addChild(Body9);
        this.Body9.cubeList.add(new ModelBox(Body9, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body9.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5236F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body9.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.3491F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body9.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.3491F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR9 = new AdvancedModelRendererExtended(this);
        this.legR9.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body9.addChild(legR9);
        this.setRotateAngle(legR9, 0.0F, 0.0F, -0.2618F);
        this.legR9.cubeList.add(new ModelBox(legR9, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL9 = new AdvancedModelRendererExtended(this);
        this.legL9.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body9.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, 0.0F, 0.2618F);
        this.legL9.cubeList.add(new ModelBox(legL9, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body10 = new AdvancedModelRendererExtended(this);
        this.Body10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body9.addChild(Body10);
        this.Body10.cubeList.add(new ModelBox(Body10, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r28 = new AdvancedModelRendererExtended(this);
        this.cube_r28.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body10.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.5236F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRendererExtended(this);
        this.cube_r29.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body10.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 0.3491F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r30 = new AdvancedModelRendererExtended(this);
        this.cube_r30.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body10.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -0.3491F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR10 = new AdvancedModelRendererExtended(this);
        this.legR10.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body10.addChild(legR10);
        this.setRotateAngle(legR10, 0.0F, 0.0F, -0.2618F);
        this.legR10.cubeList.add(new ModelBox(legR10, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL10 = new AdvancedModelRendererExtended(this);
        this.legL10.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body10.addChild(legL10);
        this.setRotateAngle(legL10, 0.0F, 0.0F, 0.2618F);
        this.legL10.cubeList.add(new ModelBox(legL10, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body11 = new AdvancedModelRendererExtended(this);
        this.Body11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body10.addChild(Body11);
        this.Body11.cubeList.add(new ModelBox(Body11, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRendererExtended(this);
        this.cube_r31.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body11.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.5236F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRendererExtended(this);
        this.cube_r32.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body11.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, 0.3491F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r33 = new AdvancedModelRendererExtended(this);
        this.cube_r33.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body11.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, -0.3491F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR11 = new AdvancedModelRendererExtended(this);
        this.legR11.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body11.addChild(legR11);
        this.setRotateAngle(legR11, 0.0F, 0.0F, -0.2618F);
        this.legR11.cubeList.add(new ModelBox(legR11, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL11 = new AdvancedModelRendererExtended(this);
        this.legL11.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body11.addChild(legL11);
        this.setRotateAngle(legL11, 0.0F, 0.0F, 0.2618F);
        this.legL11.cubeList.add(new ModelBox(legL11, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Backbody12 = new AdvancedModelRendererExtended(this);
        this.Backbody12.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body11.addChild(Backbody12);
        this.Backbody12.cubeList.add(new ModelBox(Backbody12, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r34 = new AdvancedModelRendererExtended(this);
        this.cube_r34.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Backbody12.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.5236F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRendererExtended(this);
        this.cube_r35.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Backbody12.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 0.3491F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r36 = new AdvancedModelRendererExtended(this);
        this.cube_r36.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Backbody12.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -0.3491F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR12 = new AdvancedModelRendererExtended(this);
        this.legR12.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Backbody12.addChild(legR12);
        this.setRotateAngle(legR12, 0.0F, 0.0F, -0.2618F);
        this.legR12.cubeList.add(new ModelBox(legR12, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL12 = new AdvancedModelRendererExtended(this);
        this.legL12.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Backbody12.addChild(legL12);
        this.setRotateAngle(legL12, 0.0F, 0.0F, 0.2618F);
        this.legL12.cubeList.add(new ModelBox(legL12, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body13 = new AdvancedModelRendererExtended(this);
        this.Body13.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Backbody12.addChild(Body13);
        this.Body13.cubeList.add(new ModelBox(Body13, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRendererExtended(this);
        this.cube_r37.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body13.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.5236F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r38 = new AdvancedModelRendererExtended(this);
        this.cube_r38.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body13.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, 0.3491F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r39 = new AdvancedModelRendererExtended(this);
        this.cube_r39.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body13.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, -0.3491F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR13 = new AdvancedModelRendererExtended(this);
        this.legR13.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body13.addChild(legR13);
        this.setRotateAngle(legR13, 0.0F, 0.0F, -0.2618F);
        this.legR13.cubeList.add(new ModelBox(legR13, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL13 = new AdvancedModelRendererExtended(this);
        this.legL13.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body13.addChild(legL13);
        this.setRotateAngle(legL13, 0.0F, 0.0F, 0.2618F);
        this.legL13.cubeList.add(new ModelBox(legL13, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body14 = new AdvancedModelRendererExtended(this);
        this.Body14.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body13.addChild(Body14);
        this.Body14.cubeList.add(new ModelBox(Body14, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r40 = new AdvancedModelRendererExtended(this);
        this.cube_r40.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body14.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.5236F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRendererExtended(this);
        this.cube_r41.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body14.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, 0.3491F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r42 = new AdvancedModelRendererExtended(this);
        this.cube_r42.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body14.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, -0.3491F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR14 = new AdvancedModelRendererExtended(this);
        this.legR14.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body14.addChild(legR14);
        this.setRotateAngle(legR14, 0.0F, 0.0F, -0.2618F);
        this.legR14.cubeList.add(new ModelBox(legR14, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL14 = new AdvancedModelRendererExtended(this);
        this.legL14.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body14.addChild(legL14);
        this.setRotateAngle(legL14, 0.0F, 0.0F, 0.2618F);
        this.legL14.cubeList.add(new ModelBox(legL14, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body15 = new AdvancedModelRendererExtended(this);
        this.Body15.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body14.addChild(Body15);
        this.Body15.cubeList.add(new ModelBox(Body15, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r43 = new AdvancedModelRendererExtended(this);
        this.cube_r43.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body15.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.5236F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r44 = new AdvancedModelRendererExtended(this);
        this.cube_r44.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body15.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, 0.3491F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r45 = new AdvancedModelRendererExtended(this);
        this.cube_r45.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body15.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, -0.3491F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR15 = new AdvancedModelRendererExtended(this);
        this.legR15.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body15.addChild(legR15);
        this.setRotateAngle(legR15, 0.0F, 0.0F, -0.2618F);
        this.legR15.cubeList.add(new ModelBox(legR15, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL15 = new AdvancedModelRendererExtended(this);
        this.legL15.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body15.addChild(legL15);
        this.setRotateAngle(legL15, 0.0F, 0.0F, 0.2618F);
        this.legL15.cubeList.add(new ModelBox(legL15, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body16 = new AdvancedModelRendererExtended(this);
        this.Body16.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body15.addChild(Body16);
        this.Body16.cubeList.add(new ModelBox(Body16, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r46 = new AdvancedModelRendererExtended(this);
        this.cube_r46.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body16.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.5236F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r47 = new AdvancedModelRendererExtended(this);
        this.cube_r47.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body16.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.0F, 0.3491F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r48 = new AdvancedModelRendererExtended(this);
        this.cube_r48.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body16.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.0F, -0.3491F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR16 = new AdvancedModelRendererExtended(this);
        this.legR16.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body16.addChild(legR16);
        this.setRotateAngle(legR16, 0.0F, 0.0F, -0.2618F);
        this.legR16.cubeList.add(new ModelBox(legR16, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL16 = new AdvancedModelRendererExtended(this);
        this.legL16.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body16.addChild(legL16);
        this.setRotateAngle(legL16, 0.0F, 0.0F, 0.2618F);
        this.legL16.cubeList.add(new ModelBox(legL16, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body17 = new AdvancedModelRendererExtended(this);
        this.Body17.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body16.addChild(Body17);
        this.Body17.cubeList.add(new ModelBox(Body17, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r49 = new AdvancedModelRendererExtended(this);
        this.cube_r49.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body17.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.5236F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r50 = new AdvancedModelRendererExtended(this);
        this.cube_r50.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body17.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.0F, 0.3491F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r51 = new AdvancedModelRendererExtended(this);
        this.cube_r51.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body17.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.0F, -0.3491F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR17 = new AdvancedModelRendererExtended(this);
        this.legR17.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body17.addChild(legR17);
        this.setRotateAngle(legR17, 0.0F, 0.0F, -0.2618F);
        this.legR17.cubeList.add(new ModelBox(legR17, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL17 = new AdvancedModelRendererExtended(this);
        this.legL17.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body17.addChild(legL17);
        this.setRotateAngle(legL17, 0.0F, 0.0F, 0.2618F);
        this.legL17.cubeList.add(new ModelBox(legL17, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body18 = new AdvancedModelRendererExtended(this);
        this.Body18.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body17.addChild(Body18);
        this.Body18.cubeList.add(new ModelBox(Body18, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r52 = new AdvancedModelRendererExtended(this);
        this.cube_r52.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body18.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.5236F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r53 = new AdvancedModelRendererExtended(this);
        this.cube_r53.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body18.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.0F, 0.3491F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r54 = new AdvancedModelRendererExtended(this);
        this.cube_r54.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body18.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.0F, -0.3491F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR18 = new AdvancedModelRendererExtended(this);
        this.legR18.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body18.addChild(legR18);
        this.setRotateAngle(legR18, 0.0F, 0.0F, -0.2618F);
        this.legR18.cubeList.add(new ModelBox(legR18, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL18 = new AdvancedModelRendererExtended(this);
        this.legL18.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body18.addChild(legL18);
        this.setRotateAngle(legL18, 0.0F, 0.0F, 0.2618F);
        this.legL18.cubeList.add(new ModelBox(legL18, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body19 = new AdvancedModelRendererExtended(this);
        this.Body19.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body18.addChild(Body19);
        this.Body19.cubeList.add(new ModelBox(Body19, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r55 = new AdvancedModelRendererExtended(this);
        this.cube_r55.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body19.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.5236F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r56 = new AdvancedModelRendererExtended(this);
        this.cube_r56.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body19.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, 0.0F, 0.3491F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r57 = new AdvancedModelRendererExtended(this);
        this.cube_r57.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body19.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, 0.0F, -0.3491F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR19 = new AdvancedModelRendererExtended(this);
        this.legR19.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body19.addChild(legR19);
        this.setRotateAngle(legR19, 0.0F, 0.0F, -0.2618F);
        this.legR19.cubeList.add(new ModelBox(legR19, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL19 = new AdvancedModelRendererExtended(this);
        this.legL19.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body19.addChild(legL19);
        this.setRotateAngle(legL19, 0.0F, 0.0F, 0.2618F);
        this.legL19.cubeList.add(new ModelBox(legL19, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body20 = new AdvancedModelRendererExtended(this);
        this.Body20.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body19.addChild(Body20);
        this.Body20.cubeList.add(new ModelBox(Body20, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r58 = new AdvancedModelRendererExtended(this);
        this.cube_r58.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body20.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.5236F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 3, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 3, -7.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r59 = new AdvancedModelRendererExtended(this);
        this.cube_r59.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body20.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, 0.0F, 0.3491F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r60 = new AdvancedModelRendererExtended(this);
        this.cube_r60.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body20.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, 0.0F, -0.3491F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR20 = new AdvancedModelRendererExtended(this);
        this.legR20.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body20.addChild(legR20);
        this.setRotateAngle(legR20, 0.0F, 0.0F, -0.2618F);
        this.legR20.cubeList.add(new ModelBox(legR20, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL20 = new AdvancedModelRendererExtended(this);
        this.legL20.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body20.addChild(legL20);
        this.setRotateAngle(legL20, 0.0F, 0.0F, 0.2618F);
        this.legL20.cubeList.add(new ModelBox(legL20, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body21 = new AdvancedModelRendererExtended(this);
        this.Body21.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body20.addChild(Body21);
        this.Body21.cubeList.add(new ModelBox(Body21, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r61 = new AdvancedModelRendererExtended(this);
        this.cube_r61.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body21.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.5236F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 3, -0.25F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 3, -6.75F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r62 = new AdvancedModelRendererExtended(this);
        this.cube_r62.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body21.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, 0.0F, 0.3491F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r63 = new AdvancedModelRendererExtended(this);
        this.cube_r63.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body21.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0F, 0.0F, -0.3491F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR21 = new AdvancedModelRendererExtended(this);
        this.legR21.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body21.addChild(legR21);
        this.setRotateAngle(legR21, 0.0F, 0.0F, -0.2618F);
        this.legR21.cubeList.add(new ModelBox(legR21, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL21 = new AdvancedModelRendererExtended(this);
        this.legL21.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body21.addChild(legL21);
        this.setRotateAngle(legL21, 0.0F, 0.0F, 0.2618F);
        this.legL21.cubeList.add(new ModelBox(legL21, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body22 = new AdvancedModelRendererExtended(this);
        this.Body22.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body21.addChild(Body22);
        this.Body22.cubeList.add(new ModelBox(Body22, 0, 5, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r64 = new AdvancedModelRendererExtended(this);
        this.cube_r64.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Body22.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.5236F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 3, -0.75F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 3, -6.25F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r65 = new AdvancedModelRendererExtended(this);
        this.cube_r65.setRotationPoint(0.25F, -0.5F, 0.5F);
        this.Body22.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, 0.0F, 0.3491F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r66 = new AdvancedModelRendererExtended(this);
        this.cube_r66.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.Body22.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, 0.0F, -0.3491F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR22 = new AdvancedModelRendererExtended(this);
        this.legR22.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body22.addChild(legR22);
        this.setRotateAngle(legR22, 0.0F, 0.0F, -0.2618F);
        this.legR22.cubeList.add(new ModelBox(legR22, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL22 = new AdvancedModelRendererExtended(this);
        this.legL22.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body22.addChild(legL22);
        this.setRotateAngle(legL22, 0.0F, 0.0F, 0.2618F);
        this.legL22.cubeList.add(new ModelBox(legL22, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.telson = new AdvancedModelRendererExtended(this);
        this.telson.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.Body22.addChild(telson);
        this.telson.cubeList.add(new ModelBox(telson, 8, 8, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));
        this.telson.cubeList.add(new ModelBox(telson, 0, 0, -1.5F, -0.5F, 2.0F, 3, 0, 3, 0.0F, false));

        this.cube_r67 = new AdvancedModelRendererExtended(this);
        this.cube_r67.setRotationPoint(-1.5F, -0.5F, 0.5F);
        this.telson.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.5236F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 6, 5, -2.0F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 6, 5, 2.0F, 0.0F, -0.5F, 3, 0, 2, 0.0F, true));

        this.cube_r68 = new AdvancedModelRendererExtended(this);
        this.cube_r68.setRotationPoint(0.25F, -1.0F, 0.5F);
        this.telson.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0F, 0.0F, 0.3491F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r69 = new AdvancedModelRendererExtended(this);
        this.cube_r69.setRotationPoint(-0.25F, -1.0F, 0.5F);
        this.telson.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0F, 0.0F, -0.3491F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legR23 = new AdvancedModelRendererExtended(this);
        this.legR23.setRotationPoint(-0.5F, 0.0F, 1.0F);
        this.telson.addChild(legR23);
        this.setRotateAngle(legR23, 0.0F, 0.0F, -0.2618F);
        this.legR23.cubeList.add(new ModelBox(legR23, 9, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL24 = new AdvancedModelRendererExtended(this);
        this.legL24.setRotationPoint(0.5F, 0.0F, 1.0F);
        this.telson.addChild(legL24);
        this.setRotateAngle(legL24, 0.0F, 0.0F, 0.2618F);
        this.legL24.cubeList.add(new ModelBox(legL24, 9, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        renderStaticFloor(f);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(antennaL, 0.0F, -0.6109F, 0.0F);
        this.setRotateAngle(antennaR, 0.0F, 0.6109F, 0.0F);
        this.setRotateAngle(Body10, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Body11, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Backbody12, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Body13, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Body14, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Body15, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Body16, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Body17, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(Body18, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(Body19, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(Body20, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(Body21, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Body22, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(Frontbody3, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(Backbody12, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Body7, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(Body8, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(Body9, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r13, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r16, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r19, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r22, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r25, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r28, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r31, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r34, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r37, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r40, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r43, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r46, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r47, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r48, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r49, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r50, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r51, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r52, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r53, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r54, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r55, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r56, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r57, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r58, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r59, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r60, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r61, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r62, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r63, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r64, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r65, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r66, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r67, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r68, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r69, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r7, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(head, 0.1309F, 0.1309F, 0.0F);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL10, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL11, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL12, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL13, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL14, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL15, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL16, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL17, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL18, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL19, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL20, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL21, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL22, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL24, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL6, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL7, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL8, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL9, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legR, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR10, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR11, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR12, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR13, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR14, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR15, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR16, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR17, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR18, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR19, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR20, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR21, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR22, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR23, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR6, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR7, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR8, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR9, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(telson, 0.0F, -0.1745F, 0.0F);
        this.main.offsetZ = -0.15F;
        this.main.offsetY = 0.2F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 1.4F;
        this.main.offsetZ = 4.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(antennaL, 0.0F, -0.6109F, 0.0F);
        this.setRotateAngle(antennaR, 0.0F, 0.6109F, 0.0F);
        this.setRotateAngle(Body10, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Body11, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Backbody12, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Body13, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Body14, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Body15, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Body16, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Body17, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(Body18, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(Body19, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(Body20, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(Body21, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Body22, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(Frontbody3, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(Backbody12, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Body7, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(Body8, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(Body9, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r13, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r16, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r19, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r22, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r25, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r28, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r31, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r34, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r37, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r40, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r43, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r46, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r47, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r48, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r49, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r50, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r51, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r52, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r53, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r54, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r55, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r56, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r57, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r58, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r59, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r60, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r61, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r62, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r63, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r64, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r65, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r66, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r67, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r68, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r69, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(cube_r7, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(head, 0.1309F, 0.1309F, 0.0F);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL10, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL11, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL12, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL13, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL14, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL15, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL16, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL17, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL18, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL19, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL20, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL21, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL22, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL24, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL6, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL7, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL8, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legL9, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(legR, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR10, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR11, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR12, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR13, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR14, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR15, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR16, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR17, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR18, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR19, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR20, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR21, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR22, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR23, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR6, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR7, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR8, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(legR9, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(telson, 0.0F, -0.1745F, 0.0F);
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
        this.main.offsetZ = -0.3F;

        AdvancedModelRendererExtended[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6, this.legL7, this.legL8, this.legL9, this.legL10, this.legL11, this.legL12, this.legL13, this.legL14, this.legL15, this.legL16, this.legL17, this.legL18, this.legL19, this.legL20, this.legL21, this.legL22, this.legL24};
        AdvancedModelRendererExtended[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6, this.legR7, this.legR8, this.legR9, this.legR10, this.legR11, this.legR12, this.legR13, this.legR14, this.legR15, this.legR16, this.legR17, this.legR18, this.legR19, this.legR20, this.legR21, this.legR22, this.legR23};

        //body3 is the front connector
        //body4 is the back connector
        AdvancedModelRendererExtended[] body1 = {this.Backbody4, this.Body5, this.Body6, this.Body7, this.Body8, this.Body9, this.Body10, this.Body11, this.Backbody12, this.Body13, this.Body14, this.Body15, this.Body16, this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body2 = {this.Body5, this.Body6, this.Body7, this.Body8, this.Body9, this.Body10, this.Body11, this.Backbody12, this.Body13, this.Body14, this.Body15, this.Body16, this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body3 = {this.Body6, this.Body7, this.Body8, this.Body9, this.Body10, this.Body11, this.Backbody12, this.Body13, this.Body14, this.Body15, this.Body16, this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body4 = {this.Body7, this.Body8, this.Body9, this.Body10, this.Body11, this.Backbody12, this.Body13, this.Body14, this.Body15, this.Body16, this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body5 = {this.Body8, this.Body9, this.Body10, this.Body11, this.Backbody12, this.Body13, this.Body14, this.Body15, this.Body16, this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body6 = {this.Body9, this.Body10, this.Body11, this.Backbody12, this.Body13, this.Body14, this.Body15, this.Body16, this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body7 = {this.Body10, this.Body11, this.Backbody12, this.Body13, this.Body14, this.Body15, this.Body16, this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body8 = {this.Body11, this.Backbody12, this.Body13, this.Body14, this.Body15, this.Body16, this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body9 = {this.Backbody12, this.Body13, this.Body14, this.Body15, this.Body16, this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body10 = {this.Body13, this.Body14, this.Body15, this.Body16, this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body11 = {this.Body14, this.Body15, this.Body16, this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body12 = {this.Body15, this.Body16, this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body13 = {this.Body16, this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body14 = {this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body15 = {this.Body18, this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body16 = {this.Body19, this.Body20, this.Body21};
        AdvancedModelRendererExtended[] body17 = {this.Body20, this.Body21};




        EntityPrehistoricFloraMyriacantherpestes myria = (EntityPrehistoricFloraMyriacantherpestes) e;
        this.faceTarget(f3, f4, 5, Body2);
        this.faceTarget(f3, f4, 5, Body);
        this.faceTarget(f3, f4, 5, head);

        this.antennaL.swing(0.65F, (float)Math.toRadians(-16), false, 0, 0F, f2, 0.70F);
        this.antennaR.swing(0.65F, (float)Math.toRadians(16), false, 0, 0F, f2, 0.70F);

        if (f3 == 0.0F || !myria.getIsMoving()) { //Not moving
            //this.faceTarget(f3, f4, 12, HeadSegment);
            //this.faceTarget(f3, f4, 12, FrontSegment4);
            //this.head.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.4;
            //this.body4.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.3;
            return;
        }

        AdvancedModelRendererExtended[] bodySegments = new AdvancedModelRendererExtended[]{
                this.Backbody4, this.Body5, this.Body6, this.Body7, this.Body8, this.Body9, this.Body10, this.Body11, this.Backbody12, this.Body13, this.Body14, this.Body15, this.Body16, this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};
        myria.arthropleuraBuffer.applyChainSwingBuffer(false, bodySegments);

        AdvancedModelRendererExtended[] bodySegments2 = new AdvancedModelRendererExtended[]{
                this.Body5, this.Body6, this.Body7, this.Body8, this.Body9, this.Body10, this.Body11, this.Backbody12, this.Body13, this.Body14, this.Body15, this.Body16, this.Body17, this.Body18, this.Body19, this.Body20, this.Body21};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            /*
            this.head.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.4;
            this.body4.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.3;
            */

            this.bob(this.main, 0.5F, 0.001F, false, f2, 1F);
            //this.chainWaveExtended(bodySegments, 1.6F, 0.001F, 0.02F, 0, f2, 1f);
            //this.chainWaveExtended(bodySegments2, 1.6F, -0.001F, 0.04F, 3, f2, 1f);

            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.2F, -0.2F, -3, f2, 1);
            //this.chainSwing(BodyHead, 0.2F, 0.3F, -3, f2, 1);

            float swingBodySpeed = 0.3F;
            float degreeBodySwing = 0.001F;
            this.chainSwing(body1, swingBodySpeed, -degreeBodySwing * 0.66F, -3, f2, 1);
            this.chainSwing(body2, swingBodySpeed, degreeBodySwing * 0.66F, -3, f2, 1);
            this.chainSwing(body3, swingBodySpeed, -degreeBodySwing, -3, f2, 1);
            this.chainSwing(body4, swingBodySpeed, degreeBodySwing, -3, f2, 1);
            this.chainSwing(body5, swingBodySpeed, -degreeBodySwing * 1.33F, -3, f2, 1);
            this.chainSwing(body6, swingBodySpeed, degreeBodySwing * 1.33F, -3, f2, 1);
            this.chainSwing(body7, swingBodySpeed, -degreeBodySwing * 1.66F, -3, f2, 1);
            this.chainSwing(body8, swingBodySpeed, degreeBodySwing * 1.66F, -3, f2, 1);
            this.chainSwing(body9, swingBodySpeed, -degreeBodySwing * 2F, -3, f2, 1);
            this.chainSwing(body10, swingBodySpeed, degreeBodySwing * 2F, -3, f2, 1);
            this.chainSwing(body11, swingBodySpeed, -degreeBodySwing * 2.33F, -3, f2, 1);
            this.chainSwing(body12, swingBodySpeed, degreeBodySwing * 2.33F, -3, f2, 1);
            this.chainSwing(body13, swingBodySpeed, -degreeBodySwing * 2.66F, -3, f2, 1);
            this.chainSwing(body14, swingBodySpeed, degreeBodySwing * 2.66F, -3, f2, 1);
            this.chainSwing(body15, swingBodySpeed, -degreeBodySwing * 3F, -3, f2, 1);
            this.chainSwing(body16, swingBodySpeed, degreeBodySwing * 3F, -3, f2, 1);
            this.chainSwing(body17, swingBodySpeed, -degreeBodySwing * 3.33F, -3, f2, 1);

            float legSpeed = 0.7F;
            float legDegree = 0.5F;

            this.flap(legL, legSpeed, -legDegree, false, 0.0F, -legDegree, f2, 0.3F);
            this.flap(legL2, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(legL3, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(legL4, legSpeed, -legDegree, false, 3.0F, -legDegree, f2, 0.3F);
            this.flap(legL5, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(legL6, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(legL7, legSpeed, -legDegree, false, 0.0F, -legDegree, f2, 0.3F);
            this.flap(legL8, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(legL9, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(legL10, legSpeed, -legDegree, false, 3.0F, -legDegree, f2, 0.3F);
            this.flap(legL11, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(legL12, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(legL13, legSpeed, -legDegree, false, 0.0F, -legDegree, f2, 0.3F);
            this.flap(legL14, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(legL15, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(legL16, legSpeed, -legDegree, false, 3.0F, -legDegree, f2, 0.3F);
            this.flap(legL17, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(legL18, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(legL19, legSpeed, -legDegree, false, 0.0F, -legDegree, f2, 0.3F);
            this.flap(legL20, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(legL21, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(legL22, legSpeed, -legDegree, false, 3.0F, -legDegree, f2, 0.3F);
            this.flap(legL24, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);

            this.flap(legR, legSpeed, legDegree, false, 0.0F, legDegree, f2, 0.3F);
            this.flap(legR2, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(legR3, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(legR4, legSpeed, legDegree, false, 3.0F, legDegree, f2, 0.3F);
            this.flap(legR5, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(legR6, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(legR7, legSpeed, legDegree, false, 0.0F, legDegree, f2, 0.3F);
            this.flap(legR8, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(legR9, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(legR10, legSpeed, legDegree, false, 3.0F, legDegree, f2, 0.3F);
            this.flap(legR11, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(legR12, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(legR13, legSpeed, legDegree, false, 0.0F, legDegree, f2, 0.3F);
            this.flap(legR14, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(legR15, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(legR16, legSpeed, legDegree, false, 3.0F, legDegree, f2, 0.3F);
            this.flap(legR17, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(legR18, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(legR19, legSpeed, legDegree, false, 0.0F, legDegree, f2, 0.3F);
            this.flap(legR20, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(legR21, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(legR22, legSpeed, legDegree, false, 3.0F, legDegree, f2, 0.3F);
            this.flap(legR23, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);


        }
    }
}
