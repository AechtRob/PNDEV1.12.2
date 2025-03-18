package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.EntityPrehistoricFloraArthropleura;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelArthropleura extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Arthropleura;
    private final AdvancedModelRendererExtended FrontSegment3;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended Leg9;
    private final AdvancedModelRendererExtended Leg10;
    private final AdvancedModelRendererExtended Leg11;
    private final AdvancedModelRendererExtended Leg12;
    private final AdvancedModelRendererExtended Leg13;
    private final AdvancedModelRendererExtended Leg14;
    private final AdvancedModelRendererExtended Leg98;
    private final AdvancedModelRendererExtended Leg97;
    private final AdvancedModelRendererExtended Leg96;
    private final AdvancedModelRendererExtended Leg95;
    private final AdvancedModelRendererExtended Leg94;
    private final AdvancedModelRendererExtended Leg93;
    private final AdvancedModelRendererExtended FrontSegment4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended Leg3;
    private final AdvancedModelRendererExtended Leg4;
    private final AdvancedModelRendererExtended Leg5;
    private final AdvancedModelRendererExtended Leg6;
    private final AdvancedModelRendererExtended Leg7;
    private final AdvancedModelRendererExtended Leg8;
    private final AdvancedModelRendererExtended Leg104;
    private final AdvancedModelRendererExtended Leg103;
    private final AdvancedModelRendererExtended Leg102;
    private final AdvancedModelRendererExtended Leg101;
    private final AdvancedModelRendererExtended Leg100;
    private final AdvancedModelRendererExtended Leg99;
    private final AdvancedModelRendererExtended HeadSegment;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended jawright2;
    private final AdvancedModelRendererExtended jawleft2;
    private final AdvancedModelRendererExtended jawright;
    private final AdvancedModelRendererExtended jawleft;
    private final AdvancedModelRendererExtended Antennae1;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended Antennae2;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended Leg1;
    private final AdvancedModelRendererExtended Leg106;
    private final AdvancedModelRendererExtended Leg2;
    private final AdvancedModelRendererExtended Leg105;
    private final AdvancedModelRendererExtended FrontSegment2;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended Leg15;
    private final AdvancedModelRendererExtended Leg16;
    private final AdvancedModelRendererExtended Leg17;
    private final AdvancedModelRendererExtended Leg18;
    private final AdvancedModelRendererExtended Leg19;
    private final AdvancedModelRendererExtended Leg20;
    private final AdvancedModelRendererExtended Leg92;
    private final AdvancedModelRendererExtended Leg91;
    private final AdvancedModelRendererExtended Leg90;
    private final AdvancedModelRendererExtended Leg89;
    private final AdvancedModelRendererExtended Leg88;
    private final AdvancedModelRendererExtended Leg87;
    private final AdvancedModelRendererExtended Back2;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended Leg21;
    private final AdvancedModelRendererExtended Leg22;
    private final AdvancedModelRendererExtended Leg23;
    private final AdvancedModelRendererExtended Leg24;
    private final AdvancedModelRendererExtended Leg25;
    private final AdvancedModelRendererExtended Leg26;
    private final AdvancedModelRendererExtended Leg86;
    private final AdvancedModelRendererExtended Leg85;
    private final AdvancedModelRendererExtended Leg84;
    private final AdvancedModelRendererExtended Leg83;
    private final AdvancedModelRendererExtended Leg82;
    private final AdvancedModelRendererExtended Leg81;
    private final AdvancedModelRendererExtended Back;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended Leg27;
    private final AdvancedModelRendererExtended Leg28;
    private final AdvancedModelRendererExtended Leg29;
    private final AdvancedModelRendererExtended Leg30;
    private final AdvancedModelRendererExtended Leg31;
    private final AdvancedModelRendererExtended Leg32;
    private final AdvancedModelRendererExtended Leg80;
    private final AdvancedModelRendererExtended Leg79;
    private final AdvancedModelRendererExtended Leg78;
    private final AdvancedModelRendererExtended Leg77;
    private final AdvancedModelRendererExtended Leg76;
    private final AdvancedModelRendererExtended Leg75;
    private final AdvancedModelRendererExtended BackSegment1;
    private final AdvancedModelRendererExtended cube_r28;
    private final AdvancedModelRendererExtended cube_r29;
    private final AdvancedModelRendererExtended cube_r30;
    private final AdvancedModelRendererExtended cube_r31;
    private final AdvancedModelRendererExtended Leg33;
    private final AdvancedModelRendererExtended Leg34;
    private final AdvancedModelRendererExtended Leg35;
    private final AdvancedModelRendererExtended Leg36;
    private final AdvancedModelRendererExtended Leg37;
    private final AdvancedModelRendererExtended Leg38;
    private final AdvancedModelRendererExtended Leg74;
    private final AdvancedModelRendererExtended Leg73;
    private final AdvancedModelRendererExtended Leg72;
    private final AdvancedModelRendererExtended Leg71;
    private final AdvancedModelRendererExtended Leg70;
    private final AdvancedModelRendererExtended Leg69;
    private final AdvancedModelRendererExtended BackSegment2;
    private final AdvancedModelRendererExtended cube_r32;
    private final AdvancedModelRendererExtended cube_r33;
    private final AdvancedModelRendererExtended cube_r34;
    private final AdvancedModelRendererExtended cube_r35;
    private final AdvancedModelRendererExtended Leg39;
    private final AdvancedModelRendererExtended Leg40;
    private final AdvancedModelRendererExtended Leg41;
    private final AdvancedModelRendererExtended Leg42;
    private final AdvancedModelRendererExtended Leg43;
    private final AdvancedModelRendererExtended Leg44;
    private final AdvancedModelRendererExtended Leg68;
    private final AdvancedModelRendererExtended Leg67;
    private final AdvancedModelRendererExtended Leg66;
    private final AdvancedModelRendererExtended Leg65;
    private final AdvancedModelRendererExtended Leg64;
    private final AdvancedModelRendererExtended Leg63;
    private final AdvancedModelRendererExtended BackSegment3;
    private final AdvancedModelRendererExtended cube_r36;
    private final AdvancedModelRendererExtended cube_r37;
    private final AdvancedModelRendererExtended cube_r38;
    private final AdvancedModelRendererExtended cube_r39;
    private final AdvancedModelRendererExtended Leg45;
    private final AdvancedModelRendererExtended Leg46;
    private final AdvancedModelRendererExtended Leg47;
    private final AdvancedModelRendererExtended Leg48;
    private final AdvancedModelRendererExtended Leg49;
    private final AdvancedModelRendererExtended Leg50;
    private final AdvancedModelRendererExtended Leg62;
    private final AdvancedModelRendererExtended Leg61;
    private final AdvancedModelRendererExtended Leg60;
    private final AdvancedModelRendererExtended Leg59;
    private final AdvancedModelRendererExtended Leg58;
    private final AdvancedModelRendererExtended Leg57;
    private final AdvancedModelRendererExtended AnalSegment;
    private final AdvancedModelRendererExtended cube_r40;
    private final AdvancedModelRendererExtended cube_r41;
    private final AdvancedModelRendererExtended cube_r42;
    private final AdvancedModelRendererExtended cube_r43;
    private final AdvancedModelRendererExtended Leg51;
    private final AdvancedModelRendererExtended Leg52;
    private final AdvancedModelRendererExtended Leg53;
    private final AdvancedModelRendererExtended Leg56;
    private final AdvancedModelRendererExtended Leg55;
    private final AdvancedModelRendererExtended Leg54;

    public ModelArthropleura() {
        textureWidth = 64;
        textureHeight = 64;

        Arthropleura = new AdvancedModelRendererExtended(this);
        Arthropleura.setRotationPoint(0.5F, 21.5F, -31.25F);


        FrontSegment3 = new AdvancedModelRendererExtended(this);
        FrontSegment3.setRotationPoint(0.0F, 0.0F, 13.25F);
        Arthropleura.addChild(FrontSegment3);
        FrontSegment3.cubeList.add(new ModelBox(FrontSegment3, 44, 21, -4.0F, -1.5F, -10.0F, 7, 3, 1, -0.02F, false));
        FrontSegment3.cubeList.add(new ModelBox(FrontSegment3, 0, 12, -5.0F, -1.5F, -9.0F, 9, 3, 9, 0.001F, false));

        cube_r1 = new AdvancedModelRendererExtended(this);
        cube_r1.setRotationPoint(-1.0F, 2.5F, -4.4F);
        FrontSegment3.addChild(cube_r1);
        setRotateAngle(cube_r1, 0.0344F, 0.0061F, -0.1744F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 0, -7.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, true));

        cube_r2 = new AdvancedModelRendererExtended(this);
        cube_r2.setRotationPoint(-1.0F, 2.5F, -4.4F);
        FrontSegment3.addChild(cube_r2);
        setRotateAngle(cube_r2, 0.0323F, 0.0134F, -0.3925F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 0, -9.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, true));

        cube_r3 = new AdvancedModelRendererExtended(this);
        cube_r3.setRotationPoint(0.0F, 2.5F, -4.4F);
        FrontSegment3.addChild(cube_r3);
        setRotateAngle(cube_r3, 0.0344F, -0.0061F, 0.1744F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 0, 2.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, false));

        cube_r4 = new AdvancedModelRendererExtended(this);
        cube_r4.setRotationPoint(0.0F, 2.5F, -4.4F);
        FrontSegment3.addChild(cube_r4);
        setRotateAngle(cube_r4, 0.0323F, -0.0134F, 0.3925F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 0, 6.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, false));

        Leg9 = new AdvancedModelRendererExtended(this);
        Leg9.setRotationPoint(3.5F, 0.0F, -8.25F);
        FrontSegment3.addChild(Leg9);
        Leg9.cubeList.add(new ModelBox(Leg9, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg10 = new AdvancedModelRendererExtended(this);
        Leg10.setRotationPoint(4.0F, 0.0F, -6.75F);
        FrontSegment3.addChild(Leg10);
        Leg10.cubeList.add(new ModelBox(Leg10, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg11 = new AdvancedModelRendererExtended(this);
        Leg11.setRotationPoint(4.0F, 0.0F, -5.25F);
        FrontSegment3.addChild(Leg11);
        Leg11.cubeList.add(new ModelBox(Leg11, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg12 = new AdvancedModelRendererExtended(this);
        Leg12.setRotationPoint(4.0F, 0.0F, -3.75F);
        FrontSegment3.addChild(Leg12);
        Leg12.cubeList.add(new ModelBox(Leg12, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg13 = new AdvancedModelRendererExtended(this);
        Leg13.setRotationPoint(4.0F, 0.0F, -2.25F);
        FrontSegment3.addChild(Leg13);
        Leg13.cubeList.add(new ModelBox(Leg13, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg14 = new AdvancedModelRendererExtended(this);
        Leg14.setRotationPoint(4.0F, 0.0F, -0.75F);
        FrontSegment3.addChild(Leg14);
        Leg14.cubeList.add(new ModelBox(Leg14, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg98 = new AdvancedModelRendererExtended(this);
        Leg98.setRotationPoint(-4.5F, 0.0F, -8.25F);
        FrontSegment3.addChild(Leg98);
        Leg98.cubeList.add(new ModelBox(Leg98, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg97 = new AdvancedModelRendererExtended(this);
        Leg97.setRotationPoint(-5.0F, 0.0F, -6.75F);
        FrontSegment3.addChild(Leg97);
        Leg97.cubeList.add(new ModelBox(Leg97, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg96 = new AdvancedModelRendererExtended(this);
        Leg96.setRotationPoint(-5.0F, 0.0F, -5.25F);
        FrontSegment3.addChild(Leg96);
        Leg96.cubeList.add(new ModelBox(Leg96, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg95 = new AdvancedModelRendererExtended(this);
        Leg95.setRotationPoint(-5.0F, 0.0F, -3.75F);
        FrontSegment3.addChild(Leg95);
        Leg95.cubeList.add(new ModelBox(Leg95, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg94 = new AdvancedModelRendererExtended(this);
        Leg94.setRotationPoint(-5.0F, 0.0F, -2.25F);
        FrontSegment3.addChild(Leg94);
        Leg94.cubeList.add(new ModelBox(Leg94, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg93 = new AdvancedModelRendererExtended(this);
        Leg93.setRotationPoint(-5.0F, 0.0F, -0.75F);
        FrontSegment3.addChild(Leg93);
        Leg93.cubeList.add(new ModelBox(Leg93, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        FrontSegment4 = new AdvancedModelRendererExtended(this);
        FrontSegment4.setRotationPoint(0.0F, 0.0F, -9.0F);
        FrontSegment3.addChild(FrontSegment4);
        FrontSegment4.cubeList.add(new ModelBox(FrontSegment4, 0, 24, -4.5F, -1.5F, -9.0F, 8, 3, 9, 0.0F, false));

        cube_r5 = new AdvancedModelRendererExtended(this);
        cube_r5.setRotationPoint(-0.5F, 2.6F, -4.35F);
        FrontSegment4.addChild(cube_r5);
        setRotateAngle(cube_r5, 0.0645F, 0.0267F, -0.3918F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 0, -9.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, true));

        cube_r6 = new AdvancedModelRendererExtended(this);
        cube_r6.setRotationPoint(-0.5F, 2.6F, -4.35F);
        FrontSegment4.addChild(cube_r6);
        setRotateAngle(cube_r6, 0.0688F, 0.0121F, -0.1741F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 0, -7.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, true));

        cube_r7 = new AdvancedModelRendererExtended(this);
        cube_r7.setRotationPoint(-0.5F, 2.6F, -4.35F);
        FrontSegment4.addChild(cube_r7);
        setRotateAngle(cube_r7, 0.0645F, -0.0267F, 0.3918F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 0, 6.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, false));

        cube_r8 = new AdvancedModelRendererExtended(this);
        cube_r8.setRotationPoint(-0.5F, 2.6F, -4.35F);
        FrontSegment4.addChild(cube_r8);
        setRotateAngle(cube_r8, 0.0688F, -0.0121F, 0.1741F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 0, 2.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, false));

        Leg3 = new AdvancedModelRendererExtended(this);
        Leg3.setRotationPoint(3.5F, 0.0F, -8.25F);
        FrontSegment4.addChild(Leg3);
        Leg3.cubeList.add(new ModelBox(Leg3, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg4 = new AdvancedModelRendererExtended(this);
        Leg4.setRotationPoint(3.5F, 0.0F, -6.75F);
        FrontSegment4.addChild(Leg4);
        Leg4.cubeList.add(new ModelBox(Leg4, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg5 = new AdvancedModelRendererExtended(this);
        Leg5.setRotationPoint(3.5F, 0.0F, -5.25F);
        FrontSegment4.addChild(Leg5);
        Leg5.cubeList.add(new ModelBox(Leg5, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg6 = new AdvancedModelRendererExtended(this);
        Leg6.setRotationPoint(3.5F, 0.0F, -3.75F);
        FrontSegment4.addChild(Leg6);
        Leg6.cubeList.add(new ModelBox(Leg6, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg7 = new AdvancedModelRendererExtended(this);
        Leg7.setRotationPoint(3.5F, 0.0F, -2.25F);
        FrontSegment4.addChild(Leg7);
        Leg7.cubeList.add(new ModelBox(Leg7, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg8 = new AdvancedModelRendererExtended(this);
        Leg8.setRotationPoint(3.5F, 0.0F, -0.75F);
        FrontSegment4.addChild(Leg8);
        Leg8.cubeList.add(new ModelBox(Leg8, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg104 = new AdvancedModelRendererExtended(this);
        Leg104.setRotationPoint(-4.5F, 0.0F, -8.25F);
        FrontSegment4.addChild(Leg104);
        Leg104.cubeList.add(new ModelBox(Leg104, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg103 = new AdvancedModelRendererExtended(this);
        Leg103.setRotationPoint(-4.5F, 0.0F, -6.75F);
        FrontSegment4.addChild(Leg103);
        Leg103.cubeList.add(new ModelBox(Leg103, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg102 = new AdvancedModelRendererExtended(this);
        Leg102.setRotationPoint(-4.5F, 0.0F, -5.25F);
        FrontSegment4.addChild(Leg102);
        Leg102.cubeList.add(new ModelBox(Leg102, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg101 = new AdvancedModelRendererExtended(this);
        Leg101.setRotationPoint(-4.5F, 0.0F, -3.75F);
        FrontSegment4.addChild(Leg101);
        Leg101.cubeList.add(new ModelBox(Leg101, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg100 = new AdvancedModelRendererExtended(this);
        Leg100.setRotationPoint(-4.5F, 0.0F, -2.25F);
        FrontSegment4.addChild(Leg100);
        Leg100.cubeList.add(new ModelBox(Leg100, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg99 = new AdvancedModelRendererExtended(this);
        Leg99.setRotationPoint(-4.5F, 0.0F, -0.75F);
        FrontSegment4.addChild(Leg99);
        Leg99.cubeList.add(new ModelBox(Leg99, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        HeadSegment = new AdvancedModelRendererExtended(this);
        HeadSegment.setRotationPoint(0.0F, -0.5F, -9.0F);
        FrontSegment4.addChild(HeadSegment);
        HeadSegment.cubeList.add(new ModelBox(HeadSegment, 19, 42, -3.5F, -1.0F, -5.0F, 6, 2, 5, -0.001F, false));

        cube_r9 = new AdvancedModelRendererExtended(this);
        cube_r9.setRotationPoint(0.0F, 1.5F, 13.5F);
        HeadSegment.addChild(cube_r9);
        setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 27, -4.0F, -7.15F, -18.5F, 7, 1, 1, 0.0F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 41, 42, -3.5F, -7.15F, -22.0F, 6, 1, 5, 0.001F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 27, -4.0F, -7.15F, -21.0F, 7, 1, 1, 0.0F, false));

        cube_r10 = new AdvancedModelRendererExtended(this);
        cube_r10.setRotationPoint(1.0F, 1.0F, 13.75F);
        HeadSegment.addChild(cube_r10);
        setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 49, 25, 1.0F, -3.85F, -20.75F, 2, 1, 1, 0.0F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 49, 25, -6.0F, -3.85F, -20.75F, 2, 1, 1, 0.0F, true));

        cube_r11 = new AdvancedModelRendererExtended(this);
        cube_r11.setRotationPoint(0.5F, 3.25F, -4.25F);
        HeadSegment.addChild(cube_r11);
        setRotateAngle(cube_r11, 0.0849F, 0.0187F, -0.2093F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 27, 35, -10.15F, -4.45F, -2.0F, 7, 0, 7, 0.0F, true));

        cube_r12 = new AdvancedModelRendererExtended(this);
        cube_r12.setRotationPoint(0.0F, 1.5F, 13.5F);
        HeadSegment.addChild(cube_r12);
        setRotateAngle(cube_r12, 0.1309F, 0.0F, 0.0F);
        cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 11, -3.0F, -3.85F, -21.5F, 5, 1, 9, 0.001F, false));

        cube_r13 = new AdvancedModelRendererExtended(this);
        cube_r13.setRotationPoint(-1.5F, 3.25F, -4.25F);
        HeadSegment.addChild(cube_r13);
        setRotateAngle(cube_r13, 0.0849F, -0.0187F, 0.2093F);
        cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 35, 3.15F, -4.45F, -2.0F, 7, 0, 7, 0.0F, false));

        jawright2 = new AdvancedModelRendererExtended(this);
        jawright2.setRotationPoint(-1.85F, 1.275F, -6.45F);
        HeadSegment.addChild(jawright2);
        setRotateAngle(jawright2, 0.3491F, 0.6109F, 0.0F);
        jawright2.cubeList.add(new ModelBox(jawright2, -3, 54, -0.4119F, -0.0087F, -2.5F, 2, 0, 3, 0.001F, true));

        jawleft2 = new AdvancedModelRendererExtended(this);
        jawleft2.setRotationPoint(0.85F, 1.275F, -6.45F);
        HeadSegment.addChild(jawleft2);
        setRotateAngle(jawleft2, 0.3491F, -0.6109F, 0.0F);
        jawleft2.cubeList.add(new ModelBox(jawleft2, -3, 54, -1.5881F, -0.0087F, -2.5F, 2, 0, 3, 0.001F, false));

        jawright = new AdvancedModelRendererExtended(this);
        jawright.setRotationPoint(-1.6F, 1.275F, -6.7F);
        HeadSegment.addChild(jawright);
        setRotateAngle(jawright, 0.3054F, -0.3054F, 0.0F);
        jawright.cubeList.add(new ModelBox(jawright, -2, 49, -0.4119F, -0.0087F, -1.75F, 1, 0, 2, 0.001F, true));

        jawleft = new AdvancedModelRendererExtended(this);
        jawleft.setRotationPoint(0.6F, 1.275F, -6.7F);
        HeadSegment.addChild(jawleft);
        setRotateAngle(jawleft, 0.3054F, 0.3054F, 0.0F);
        jawleft.cubeList.add(new ModelBox(jawleft, -2, 49, -0.5881F, -0.0087F, -1.75F, 1, 0, 2, 0.001F, false));

        Antennae1 = new AdvancedModelRendererExtended(this);
        Antennae1.setRotationPoint(2.0F, 1.75F, -7.25F);
        HeadSegment.addChild(Antennae1);
        setRotateAngle(Antennae1, 0.0F, -0.3491F, 0.0F);


        cube_r14 = new AdvancedModelRendererExtended(this);
        cube_r14.setRotationPoint(-1.5F, -0.25F, 20.0F);
        Antennae1.addChild(cube_r14);
        setRotateAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
        cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 1.0F, -4.55F, -24.5F, 3, 0, 5, 0.0F, true));

        Antennae2 = new AdvancedModelRendererExtended(this);
        Antennae2.setRotationPoint(-3.0F, 1.75F, -7.25F);
        HeadSegment.addChild(Antennae2);
        setRotateAngle(Antennae2, 0.0F, 0.3491F, 0.0F);


        cube_r15 = new AdvancedModelRendererExtended(this);
        cube_r15.setRotationPoint(1.5F, -0.25F, 20.0F);
        Antennae2.addChild(cube_r15);
        setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -4.0F, -4.55F, -24.5F, 3, 0, 5, 0.0F, false));

        Leg1 = new AdvancedModelRendererExtended(this);
        Leg1.setRotationPoint(2.5F, 0.5F, -4.25F);
        HeadSegment.addChild(Leg1);
        Leg1.cubeList.add(new ModelBox(Leg1, 0, 5, 0.0F, -0.5F, 0.75F, 5, 3, 0, 0.0F, false));
        Leg1.cubeList.add(new ModelBox(Leg1, 0, 5, 0.0F, -0.5F, -1.0F, 5, 3, 0, 0.0F, false));

        Leg106 = new AdvancedModelRendererExtended(this);
        Leg106.setRotationPoint(-3.5F, 0.5F, -4.25F);
        HeadSegment.addChild(Leg106);
        Leg106.cubeList.add(new ModelBox(Leg106, 0, 5, -5.0F, -0.5F, 0.75F, 5, 3, 0, 0.0F, true));
        Leg106.cubeList.add(new ModelBox(Leg106, 0, 5, -5.0F, -0.5F, -1.0F, 5, 3, 0, 0.0F, true));

        Leg2 = new AdvancedModelRendererExtended(this);
        Leg2.setRotationPoint(2.5F, 0.5F, -1.25F);
        HeadSegment.addChild(Leg2);
        Leg2.cubeList.add(new ModelBox(Leg2, 0, 5, 0.0F, -0.5F, -0.75F, 5, 3, 0, 0.0F, false));
        Leg2.cubeList.add(new ModelBox(Leg2, 0, 5, 0.0F, -0.5F, 0.75F, 5, 3, 0, 0.0F, false));

        Leg105 = new AdvancedModelRendererExtended(this);
        Leg105.setRotationPoint(-3.5F, 0.5F, -1.25F);
        HeadSegment.addChild(Leg105);
        Leg105.cubeList.add(new ModelBox(Leg105, 0, 5, -5.0F, -0.5F, -0.75F, 5, 3, 0, 0.0F, true));
        Leg105.cubeList.add(new ModelBox(Leg105, 0, 5, -5.0F, -0.5F, 0.75F, 5, 3, 0, 0.0F, true));

        FrontSegment2 = new AdvancedModelRendererExtended(this);
        FrontSegment2.setRotationPoint(0.0F, 0.0F, 0.0F);
        FrontSegment3.addChild(FrontSegment2);
        FrontSegment2.cubeList.add(new ModelBox(FrontSegment2, 0, 44, -4.5F, -1.5F, -1.0F, 8, 3, 1, -0.02F, false));
        FrontSegment2.cubeList.add(new ModelBox(FrontSegment2, 0, 12, -5.0F, -1.5F, 0.0F, 9, 3, 9, 0.0F, false));

        cube_r16 = new AdvancedModelRendererExtended(this);
        cube_r16.setRotationPoint(-1.0F, 2.5F, 4.6F);
        FrontSegment2.addChild(cube_r16);
        setRotateAngle(cube_r16, 0.0323F, 0.0134F, -0.3925F);
        cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 0, -9.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, true));

        cube_r17 = new AdvancedModelRendererExtended(this);
        cube_r17.setRotationPoint(-1.0F, 2.5F, 4.6F);
        FrontSegment2.addChild(cube_r17);
        setRotateAngle(cube_r17, 0.0344F, 0.0061F, -0.1744F);
        cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 0, -7.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, true));

        cube_r18 = new AdvancedModelRendererExtended(this);
        cube_r18.setRotationPoint(0.0F, 2.5F, 4.6F);
        FrontSegment2.addChild(cube_r18);
        setRotateAngle(cube_r18, 0.0323F, -0.0134F, 0.3925F);
        cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 0, 6.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, false));

        cube_r19 = new AdvancedModelRendererExtended(this);
        cube_r19.setRotationPoint(0.0F, 2.5F, 4.6F);
        FrontSegment2.addChild(cube_r19);
        setRotateAngle(cube_r19, 0.0344F, -0.0061F, 0.1744F);
        cube_r19.cubeList.add(new ModelBox(cube_r19, 17, 0, 2.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, false));

        Leg15 = new AdvancedModelRendererExtended(this);
        Leg15.setRotationPoint(4.0F, 0.0F, 0.75F);
        FrontSegment2.addChild(Leg15);
        Leg15.cubeList.add(new ModelBox(Leg15, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg16 = new AdvancedModelRendererExtended(this);
        Leg16.setRotationPoint(4.0F, 0.0F, 2.25F);
        FrontSegment2.addChild(Leg16);
        Leg16.cubeList.add(new ModelBox(Leg16, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg17 = new AdvancedModelRendererExtended(this);
        Leg17.setRotationPoint(4.0F, 0.0F, 3.75F);
        FrontSegment2.addChild(Leg17);
        Leg17.cubeList.add(new ModelBox(Leg17, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg18 = new AdvancedModelRendererExtended(this);
        Leg18.setRotationPoint(4.0F, 0.0F, 5.25F);
        FrontSegment2.addChild(Leg18);
        Leg18.cubeList.add(new ModelBox(Leg18, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg19 = new AdvancedModelRendererExtended(this);
        Leg19.setRotationPoint(4.0F, 0.0F, 6.75F);
        FrontSegment2.addChild(Leg19);
        Leg19.cubeList.add(new ModelBox(Leg19, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg20 = new AdvancedModelRendererExtended(this);
        Leg20.setRotationPoint(4.0F, 0.0F, 8.25F);
        FrontSegment2.addChild(Leg20);
        Leg20.cubeList.add(new ModelBox(Leg20, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg92 = new AdvancedModelRendererExtended(this);
        Leg92.setRotationPoint(-5.0F, 0.0F, 0.75F);
        FrontSegment2.addChild(Leg92);
        Leg92.cubeList.add(new ModelBox(Leg92, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg91 = new AdvancedModelRendererExtended(this);
        Leg91.setRotationPoint(-5.0F, 0.0F, 2.25F);
        FrontSegment2.addChild(Leg91);
        Leg91.cubeList.add(new ModelBox(Leg91, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg90 = new AdvancedModelRendererExtended(this);
        Leg90.setRotationPoint(-5.0F, 0.0F, 3.75F);
        FrontSegment2.addChild(Leg90);
        Leg90.cubeList.add(new ModelBox(Leg90, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg89 = new AdvancedModelRendererExtended(this);
        Leg89.setRotationPoint(-5.0F, 0.0F, 5.25F);
        FrontSegment2.addChild(Leg89);
        Leg89.cubeList.add(new ModelBox(Leg89, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg88 = new AdvancedModelRendererExtended(this);
        Leg88.setRotationPoint(-5.0F, 0.0F, 6.75F);
        FrontSegment2.addChild(Leg88);
        Leg88.cubeList.add(new ModelBox(Leg88, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg87 = new AdvancedModelRendererExtended(this);
        Leg87.setRotationPoint(-5.0F, 0.0F, 8.25F);
        FrontSegment2.addChild(Leg87);
        Leg87.cubeList.add(new ModelBox(Leg87, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Back2 = new AdvancedModelRendererExtended(this);
        Back2.setRotationPoint(0.0F, 0.0F, 9.0F);
        FrontSegment2.addChild(Back2);
        Back2.cubeList.add(new ModelBox(Back2, 0, 12, -5.0F, -1.5F, 0.0F, 9, 3, 9, 0.001F, false));
        Back2.cubeList.add(new ModelBox(Back2, 0, 44, -4.5F, -1.5F, -1.0F, 8, 3, 1, -0.02F, false));

        cube_r20 = new AdvancedModelRendererExtended(this);
        cube_r20.setRotationPoint(-1.0F, 2.5F, 4.6F);
        Back2.addChild(cube_r20);
        setRotateAngle(cube_r20, 0.0344F, 0.0061F, -0.1744F);
        cube_r20.cubeList.add(new ModelBox(cube_r20, 17, 0, -7.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, true));

        cube_r21 = new AdvancedModelRendererExtended(this);
        cube_r21.setRotationPoint(-1.0F, 2.5F, 4.6F);
        Back2.addChild(cube_r21);
        setRotateAngle(cube_r21, 0.0323F, 0.0134F, -0.3925F);
        cube_r21.cubeList.add(new ModelBox(cube_r21, 28, 0, -9.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, true));

        cube_r22 = new AdvancedModelRendererExtended(this);
        cube_r22.setRotationPoint(0.0F, 2.5F, 4.6F);
        Back2.addChild(cube_r22);
        setRotateAngle(cube_r22, 0.0344F, -0.0061F, 0.1744F);
        cube_r22.cubeList.add(new ModelBox(cube_r22, 17, 0, 2.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, false));

        cube_r23 = new AdvancedModelRendererExtended(this);
        cube_r23.setRotationPoint(0.0F, 2.5F, 4.6F);
        Back2.addChild(cube_r23);
        setRotateAngle(cube_r23, 0.0323F, -0.0134F, 0.3925F);
        cube_r23.cubeList.add(new ModelBox(cube_r23, 28, 0, 6.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, false));

        Leg21 = new AdvancedModelRendererExtended(this);
        Leg21.setRotationPoint(4.0F, 0.0F, 0.75F);
        Back2.addChild(Leg21);
        Leg21.cubeList.add(new ModelBox(Leg21, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg22 = new AdvancedModelRendererExtended(this);
        Leg22.setRotationPoint(4.0F, 0.0F, 2.25F);
        Back2.addChild(Leg22);
        Leg22.cubeList.add(new ModelBox(Leg22, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg23 = new AdvancedModelRendererExtended(this);
        Leg23.setRotationPoint(4.0F, 0.0F, 3.75F);
        Back2.addChild(Leg23);
        Leg23.cubeList.add(new ModelBox(Leg23, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg24 = new AdvancedModelRendererExtended(this);
        Leg24.setRotationPoint(4.0F, 0.0F, 5.25F);
        Back2.addChild(Leg24);
        Leg24.cubeList.add(new ModelBox(Leg24, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg25 = new AdvancedModelRendererExtended(this);
        Leg25.setRotationPoint(4.0F, 0.0F, 6.75F);
        Back2.addChild(Leg25);
        Leg25.cubeList.add(new ModelBox(Leg25, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg26 = new AdvancedModelRendererExtended(this);
        Leg26.setRotationPoint(4.0F, 0.0F, 8.25F);
        Back2.addChild(Leg26);
        Leg26.cubeList.add(new ModelBox(Leg26, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg86 = new AdvancedModelRendererExtended(this);
        Leg86.setRotationPoint(-5.0F, 0.0F, 0.75F);
        Back2.addChild(Leg86);
        Leg86.cubeList.add(new ModelBox(Leg86, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg85 = new AdvancedModelRendererExtended(this);
        Leg85.setRotationPoint(-5.0F, 0.0F, 2.25F);
        Back2.addChild(Leg85);
        Leg85.cubeList.add(new ModelBox(Leg85, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg84 = new AdvancedModelRendererExtended(this);
        Leg84.setRotationPoint(-5.0F, 0.0F, 3.75F);
        Back2.addChild(Leg84);
        Leg84.cubeList.add(new ModelBox(Leg84, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg83 = new AdvancedModelRendererExtended(this);
        Leg83.setRotationPoint(-5.0F, 0.0F, 5.25F);
        Back2.addChild(Leg83);
        Leg83.cubeList.add(new ModelBox(Leg83, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg82 = new AdvancedModelRendererExtended(this);
        Leg82.setRotationPoint(-5.0F, 0.0F, 6.75F);
        Back2.addChild(Leg82);
        Leg82.cubeList.add(new ModelBox(Leg82, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg81 = new AdvancedModelRendererExtended(this);
        Leg81.setRotationPoint(-5.0F, 0.0F, 8.25F);
        Back2.addChild(Leg81);
        Leg81.cubeList.add(new ModelBox(Leg81, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Back = new AdvancedModelRendererExtended(this);
        Back.setRotationPoint(0.0F, 0.0F, 9.0F);
        Back2.addChild(Back);
        Back.cubeList.add(new ModelBox(Back, 0, 44, -4.5F, -1.5F, -1.0F, 8, 3, 1, -0.02F, false));
        Back.cubeList.add(new ModelBox(Back, 0, 12, -5.0F, -1.5F, 0.0F, 9, 3, 9, 0.0F, false));

        cube_r24 = new AdvancedModelRendererExtended(this);
        cube_r24.setRotationPoint(-1.0F, 2.5F, 4.6F);
        Back.addChild(cube_r24);
        setRotateAngle(cube_r24, 0.0323F, 0.0134F, -0.3925F);
        cube_r24.cubeList.add(new ModelBox(cube_r24, 28, 0, -9.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, true));

        cube_r25 = new AdvancedModelRendererExtended(this);
        cube_r25.setRotationPoint(-1.0F, 2.5F, 4.6F);
        Back.addChild(cube_r25);
        setRotateAngle(cube_r25, 0.0344F, 0.0061F, -0.1744F);
        cube_r25.cubeList.add(new ModelBox(cube_r25, 17, 0, -7.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, true));

        cube_r26 = new AdvancedModelRendererExtended(this);
        cube_r26.setRotationPoint(0.0F, 2.5F, 4.6F);
        Back.addChild(cube_r26);
        setRotateAngle(cube_r26, 0.0344F, -0.0061F, 0.1744F);
        cube_r26.cubeList.add(new ModelBox(cube_r26, 17, 0, 2.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, false));

        cube_r27 = new AdvancedModelRendererExtended(this);
        cube_r27.setRotationPoint(0.0F, 2.5F, 4.6F);
        Back.addChild(cube_r27);
        setRotateAngle(cube_r27, 0.0323F, -0.0134F, 0.3925F);
        cube_r27.cubeList.add(new ModelBox(cube_r27, 28, 0, 6.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, false));

        Leg27 = new AdvancedModelRendererExtended(this);
        Leg27.setRotationPoint(4.0F, 0.0F, 0.75F);
        Back.addChild(Leg27);
        Leg27.cubeList.add(new ModelBox(Leg27, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg28 = new AdvancedModelRendererExtended(this);
        Leg28.setRotationPoint(4.0F, 0.0F, 2.25F);
        Back.addChild(Leg28);
        Leg28.cubeList.add(new ModelBox(Leg28, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg29 = new AdvancedModelRendererExtended(this);
        Leg29.setRotationPoint(4.0F, 0.0F, 3.75F);
        Back.addChild(Leg29);
        Leg29.cubeList.add(new ModelBox(Leg29, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg30 = new AdvancedModelRendererExtended(this);
        Leg30.setRotationPoint(4.0F, 0.0F, 5.25F);
        Back.addChild(Leg30);
        Leg30.cubeList.add(new ModelBox(Leg30, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg31 = new AdvancedModelRendererExtended(this);
        Leg31.setRotationPoint(4.0F, 0.0F, 6.75F);
        Back.addChild(Leg31);
        Leg31.cubeList.add(new ModelBox(Leg31, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg32 = new AdvancedModelRendererExtended(this);
        Leg32.setRotationPoint(4.0F, 0.0F, 8.25F);
        Back.addChild(Leg32);
        Leg32.cubeList.add(new ModelBox(Leg32, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg80 = new AdvancedModelRendererExtended(this);
        Leg80.setRotationPoint(-5.0F, 0.0F, 0.75F);
        Back.addChild(Leg80);
        Leg80.cubeList.add(new ModelBox(Leg80, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg79 = new AdvancedModelRendererExtended(this);
        Leg79.setRotationPoint(-5.0F, 0.0F, 2.25F);
        Back.addChild(Leg79);
        Leg79.cubeList.add(new ModelBox(Leg79, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg78 = new AdvancedModelRendererExtended(this);
        Leg78.setRotationPoint(-5.0F, 0.0F, 3.75F);
        Back.addChild(Leg78);
        Leg78.cubeList.add(new ModelBox(Leg78, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg77 = new AdvancedModelRendererExtended(this);
        Leg77.setRotationPoint(-5.0F, 0.0F, 5.25F);
        Back.addChild(Leg77);
        Leg77.cubeList.add(new ModelBox(Leg77, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg76 = new AdvancedModelRendererExtended(this);
        Leg76.setRotationPoint(-5.0F, 0.0F, 6.75F);
        Back.addChild(Leg76);
        Leg76.cubeList.add(new ModelBox(Leg76, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg75 = new AdvancedModelRendererExtended(this);
        Leg75.setRotationPoint(-5.0F, 0.0F, 8.25F);
        Back.addChild(Leg75);
        Leg75.cubeList.add(new ModelBox(Leg75, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        BackSegment1 = new AdvancedModelRendererExtended(this);
        BackSegment1.setRotationPoint(0.0F, 0.0F, 9.0F);
        Back.addChild(BackSegment1);
        BackSegment1.cubeList.add(new ModelBox(BackSegment1, 0, 44, -4.5F, -1.5F, -1.0F, 8, 3, 1, -0.02F, false));
        BackSegment1.cubeList.add(new ModelBox(BackSegment1, 0, 12, -5.0F, -1.5F, 0.0F, 9, 3, 9, 0.001F, false));

        cube_r28 = new AdvancedModelRendererExtended(this);
        cube_r28.setRotationPoint(-1.0F, 2.5F, 4.6F);
        BackSegment1.addChild(cube_r28);
        setRotateAngle(cube_r28, 0.0344F, 0.0061F, -0.1744F);
        cube_r28.cubeList.add(new ModelBox(cube_r28, 17, 0, -7.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, true));

        cube_r29 = new AdvancedModelRendererExtended(this);
        cube_r29.setRotationPoint(-1.0F, 2.5F, 4.6F);
        BackSegment1.addChild(cube_r29);
        setRotateAngle(cube_r29, 0.0323F, 0.0134F, -0.3925F);
        cube_r29.cubeList.add(new ModelBox(cube_r29, 28, 0, -9.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, true));

        cube_r30 = new AdvancedModelRendererExtended(this);
        cube_r30.setRotationPoint(0.0F, 2.5F, 4.6F);
        BackSegment1.addChild(cube_r30);
        setRotateAngle(cube_r30, 0.0344F, -0.0061F, 0.1744F);
        cube_r30.cubeList.add(new ModelBox(cube_r30, 17, 0, 2.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, false));

        cube_r31 = new AdvancedModelRendererExtended(this);
        cube_r31.setRotationPoint(0.0F, 2.5F, 4.6F);
        BackSegment1.addChild(cube_r31);
        setRotateAngle(cube_r31, 0.0323F, -0.0134F, 0.3925F);
        cube_r31.cubeList.add(new ModelBox(cube_r31, 28, 0, 6.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, false));

        Leg33 = new AdvancedModelRendererExtended(this);
        Leg33.setRotationPoint(4.0F, 0.0F, 0.75F);
        BackSegment1.addChild(Leg33);
        Leg33.cubeList.add(new ModelBox(Leg33, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg34 = new AdvancedModelRendererExtended(this);
        Leg34.setRotationPoint(4.0F, 0.0F, 2.25F);
        BackSegment1.addChild(Leg34);
        Leg34.cubeList.add(new ModelBox(Leg34, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg35 = new AdvancedModelRendererExtended(this);
        Leg35.setRotationPoint(4.0F, 0.0F, 3.75F);
        BackSegment1.addChild(Leg35);
        Leg35.cubeList.add(new ModelBox(Leg35, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg36 = new AdvancedModelRendererExtended(this);
        Leg36.setRotationPoint(4.0F, 0.0F, 5.25F);
        BackSegment1.addChild(Leg36);
        Leg36.cubeList.add(new ModelBox(Leg36, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg37 = new AdvancedModelRendererExtended(this);
        Leg37.setRotationPoint(4.0F, 0.0F, 6.75F);
        BackSegment1.addChild(Leg37);
        Leg37.cubeList.add(new ModelBox(Leg37, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg38 = new AdvancedModelRendererExtended(this);
        Leg38.setRotationPoint(4.0F, 0.0F, 8.25F);
        BackSegment1.addChild(Leg38);
        Leg38.cubeList.add(new ModelBox(Leg38, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg74 = new AdvancedModelRendererExtended(this);
        Leg74.setRotationPoint(-5.0F, 0.0F, 0.75F);
        BackSegment1.addChild(Leg74);
        Leg74.cubeList.add(new ModelBox(Leg74, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg73 = new AdvancedModelRendererExtended(this);
        Leg73.setRotationPoint(-5.0F, 0.0F, 2.25F);
        BackSegment1.addChild(Leg73);
        Leg73.cubeList.add(new ModelBox(Leg73, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg72 = new AdvancedModelRendererExtended(this);
        Leg72.setRotationPoint(-5.0F, 0.0F, 3.75F);
        BackSegment1.addChild(Leg72);
        Leg72.cubeList.add(new ModelBox(Leg72, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg71 = new AdvancedModelRendererExtended(this);
        Leg71.setRotationPoint(-5.0F, 0.0F, 5.25F);
        BackSegment1.addChild(Leg71);
        Leg71.cubeList.add(new ModelBox(Leg71, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg70 = new AdvancedModelRendererExtended(this);
        Leg70.setRotationPoint(-5.0F, 0.0F, 6.75F);
        BackSegment1.addChild(Leg70);
        Leg70.cubeList.add(new ModelBox(Leg70, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg69 = new AdvancedModelRendererExtended(this);
        Leg69.setRotationPoint(-5.0F, 0.0F, 8.25F);
        BackSegment1.addChild(Leg69);
        Leg69.cubeList.add(new ModelBox(Leg69, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        BackSegment2 = new AdvancedModelRendererExtended(this);
        BackSegment2.setRotationPoint(0.0F, 0.0F, 9.0F);
        BackSegment1.addChild(BackSegment2);
        BackSegment2.cubeList.add(new ModelBox(BackSegment2, 0, 44, -4.5F, -1.5F, -1.0F, 8, 3, 1, -0.02F, false));
        BackSegment2.cubeList.add(new ModelBox(BackSegment2, 0, 12, -5.0F, -1.5F, 0.0F, 9, 3, 9, 0.0F, false));

        cube_r32 = new AdvancedModelRendererExtended(this);
        cube_r32.setRotationPoint(-1.0F, 2.5F, 4.6F);
        BackSegment2.addChild(cube_r32);
        setRotateAngle(cube_r32, 0.0323F, 0.0134F, -0.3925F);
        cube_r32.cubeList.add(new ModelBox(cube_r32, 28, 0, -9.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, true));

        cube_r33 = new AdvancedModelRendererExtended(this);
        cube_r33.setRotationPoint(-1.0F, 2.5F, 4.6F);
        BackSegment2.addChild(cube_r33);
        setRotateAngle(cube_r33, 0.0344F, 0.0061F, -0.1744F);
        cube_r33.cubeList.add(new ModelBox(cube_r33, 17, 0, -7.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, true));

        cube_r34 = new AdvancedModelRendererExtended(this);
        cube_r34.setRotationPoint(0.0F, 2.5F, 4.6F);
        BackSegment2.addChild(cube_r34);
        setRotateAngle(cube_r34, 0.0323F, -0.0134F, 0.3925F);
        cube_r34.cubeList.add(new ModelBox(cube_r34, 28, 0, 6.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, false));

        cube_r35 = new AdvancedModelRendererExtended(this);
        cube_r35.setRotationPoint(0.0F, 2.5F, 4.6F);
        BackSegment2.addChild(cube_r35);
        setRotateAngle(cube_r35, 0.0344F, -0.0061F, 0.1744F);
        cube_r35.cubeList.add(new ModelBox(cube_r35, 17, 0, 2.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, false));

        Leg39 = new AdvancedModelRendererExtended(this);
        Leg39.setRotationPoint(4.0F, 0.0F, 0.75F);
        BackSegment2.addChild(Leg39);
        Leg39.cubeList.add(new ModelBox(Leg39, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg40 = new AdvancedModelRendererExtended(this);
        Leg40.setRotationPoint(4.0F, 0.0F, 2.25F);
        BackSegment2.addChild(Leg40);
        Leg40.cubeList.add(new ModelBox(Leg40, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg41 = new AdvancedModelRendererExtended(this);
        Leg41.setRotationPoint(4.0F, 0.0F, 3.75F);
        BackSegment2.addChild(Leg41);
        Leg41.cubeList.add(new ModelBox(Leg41, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg42 = new AdvancedModelRendererExtended(this);
        Leg42.setRotationPoint(4.0F, 0.0F, 5.25F);
        BackSegment2.addChild(Leg42);
        Leg42.cubeList.add(new ModelBox(Leg42, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg43 = new AdvancedModelRendererExtended(this);
        Leg43.setRotationPoint(4.0F, 0.0F, 6.75F);
        BackSegment2.addChild(Leg43);
        Leg43.cubeList.add(new ModelBox(Leg43, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg44 = new AdvancedModelRendererExtended(this);
        Leg44.setRotationPoint(4.0F, 0.0F, 8.25F);
        BackSegment2.addChild(Leg44);
        Leg44.cubeList.add(new ModelBox(Leg44, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg68 = new AdvancedModelRendererExtended(this);
        Leg68.setRotationPoint(-5.0F, 0.0F, 0.75F);
        BackSegment2.addChild(Leg68);
        Leg68.cubeList.add(new ModelBox(Leg68, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg67 = new AdvancedModelRendererExtended(this);
        Leg67.setRotationPoint(-5.0F, 0.0F, 2.25F);
        BackSegment2.addChild(Leg67);
        Leg67.cubeList.add(new ModelBox(Leg67, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg66 = new AdvancedModelRendererExtended(this);
        Leg66.setRotationPoint(-5.0F, 0.0F, 3.75F);
        BackSegment2.addChild(Leg66);
        Leg66.cubeList.add(new ModelBox(Leg66, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg65 = new AdvancedModelRendererExtended(this);
        Leg65.setRotationPoint(-5.0F, 0.0F, 5.25F);
        BackSegment2.addChild(Leg65);
        Leg65.cubeList.add(new ModelBox(Leg65, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg64 = new AdvancedModelRendererExtended(this);
        Leg64.setRotationPoint(-5.0F, 0.0F, 6.75F);
        BackSegment2.addChild(Leg64);
        Leg64.cubeList.add(new ModelBox(Leg64, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg63 = new AdvancedModelRendererExtended(this);
        Leg63.setRotationPoint(-5.0F, 0.0F, 8.25F);
        BackSegment2.addChild(Leg63);
        Leg63.cubeList.add(new ModelBox(Leg63, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        BackSegment3 = new AdvancedModelRendererExtended(this);
        BackSegment3.setRotationPoint(0.0F, 0.0F, 9.0F);
        BackSegment2.addChild(BackSegment3);
        BackSegment3.cubeList.add(new ModelBox(BackSegment3, 44, 21, -4.0F, -1.5F, -1.0F, 7, 3, 1, -0.02F, false));
        BackSegment3.cubeList.add(new ModelBox(BackSegment3, 0, 24, -4.5F, -1.5F, 0.0F, 8, 3, 9, 0.001F, false));

        cube_r36 = new AdvancedModelRendererExtended(this);
        cube_r36.setRotationPoint(0.0F, 2.5F, 4.5F);
        BackSegment3.addChild(cube_r36);
        setRotateAngle(cube_r36, 0.0F, 0.0F, -0.1745F);
        cube_r36.cubeList.add(new ModelBox(cube_r36, 17, 0, -7.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, true));

        cube_r37 = new AdvancedModelRendererExtended(this);
        cube_r37.setRotationPoint(0.0F, 2.5F, 4.5F);
        BackSegment3.addChild(cube_r37);
        setRotateAngle(cube_r37, 0.0F, 0.0F, -0.3927F);
        cube_r37.cubeList.add(new ModelBox(cube_r37, 34, 0, -9.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, true));

        cube_r38 = new AdvancedModelRendererExtended(this);
        cube_r38.setRotationPoint(-1.0F, 2.5F, 4.5F);
        BackSegment3.addChild(cube_r38);
        setRotateAngle(cube_r38, 0.0F, 0.0F, 0.1745F);
        cube_r38.cubeList.add(new ModelBox(cube_r38, 17, 0, 2.25F, -4.25F, -6.5F, 5, 0, 11, 0.0F, false));

        cube_r39 = new AdvancedModelRendererExtended(this);
        cube_r39.setRotationPoint(-1.0F, 2.5F, 4.5F);
        BackSegment3.addChild(cube_r39);
        setRotateAngle(cube_r39, 0.0F, 0.0F, 0.3927F);
        cube_r39.cubeList.add(new ModelBox(cube_r39, 34, 0, 6.1F, -5.7F, -4.5F, 3, 0, 10, 0.0F, false));

        Leg45 = new AdvancedModelRendererExtended(this);
        Leg45.setRotationPoint(3.5F, 0.0F, 0.75F);
        BackSegment3.addChild(Leg45);
        Leg45.cubeList.add(new ModelBox(Leg45, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg46 = new AdvancedModelRendererExtended(this);
        Leg46.setRotationPoint(3.5F, 0.0F, 2.25F);
        BackSegment3.addChild(Leg46);
        Leg46.cubeList.add(new ModelBox(Leg46, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg47 = new AdvancedModelRendererExtended(this);
        Leg47.setRotationPoint(3.5F, 0.0F, 3.75F);
        BackSegment3.addChild(Leg47);
        Leg47.cubeList.add(new ModelBox(Leg47, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg48 = new AdvancedModelRendererExtended(this);
        Leg48.setRotationPoint(3.5F, 0.0F, 5.25F);
        BackSegment3.addChild(Leg48);
        Leg48.cubeList.add(new ModelBox(Leg48, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg49 = new AdvancedModelRendererExtended(this);
        Leg49.setRotationPoint(3.5F, 0.0F, 6.75F);
        BackSegment3.addChild(Leg49);
        Leg49.cubeList.add(new ModelBox(Leg49, 0, 5, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        Leg50 = new AdvancedModelRendererExtended(this);
        Leg50.setRotationPoint(3.5F, 1.0F, 8.25F);
        BackSegment3.addChild(Leg50);
        Leg50.cubeList.add(new ModelBox(Leg50, 0, 8, 0.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        Leg62 = new AdvancedModelRendererExtended(this);
        Leg62.setRotationPoint(-4.5F, 0.0F, 0.75F);
        BackSegment3.addChild(Leg62);
        Leg62.cubeList.add(new ModelBox(Leg62, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg61 = new AdvancedModelRendererExtended(this);
        Leg61.setRotationPoint(-4.5F, 0.0F, 2.25F);
        BackSegment3.addChild(Leg61);
        Leg61.cubeList.add(new ModelBox(Leg61, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg60 = new AdvancedModelRendererExtended(this);
        Leg60.setRotationPoint(-4.5F, 0.0F, 3.75F);
        BackSegment3.addChild(Leg60);
        Leg60.cubeList.add(new ModelBox(Leg60, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg59 = new AdvancedModelRendererExtended(this);
        Leg59.setRotationPoint(-4.5F, 0.0F, 5.25F);
        BackSegment3.addChild(Leg59);
        Leg59.cubeList.add(new ModelBox(Leg59, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg58 = new AdvancedModelRendererExtended(this);
        Leg58.setRotationPoint(-4.5F, 0.0F, 6.75F);
        BackSegment3.addChild(Leg58);
        Leg58.cubeList.add(new ModelBox(Leg58, 0, 5, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        Leg57 = new AdvancedModelRendererExtended(this);
        Leg57.setRotationPoint(-4.5F, 1.0F, 8.25F);
        BackSegment3.addChild(Leg57);
        Leg57.cubeList.add(new ModelBox(Leg57, 0, 8, -4.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, true));

        AnalSegment = new AdvancedModelRendererExtended(this);
        AnalSegment.setRotationPoint(0.0F, -0.5F, 9.0F);
        BackSegment3.addChild(AnalSegment);


        cube_r40 = new AdvancedModelRendererExtended(this);
        cube_r40.setRotationPoint(-2.0F, 4.5F, -58.5F);
        AnalSegment.addChild(cube_r40);
        setRotateAngle(cube_r40, -0.171F, -0.0227F, -0.1728F);
        cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 0, -5.8F, -14.75F, 54.25F, 8, 0, 12, 0.0F, true));

        cube_r41 = new AdvancedModelRendererExtended(this);
        cube_r41.setRotationPoint(1.0F, 4.5F, -58.5F);
        AnalSegment.addChild(cube_r41);
        setRotateAngle(cube_r41, -0.171F, 0.0227F, 0.1728F);
        cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 0, -2.2F, -14.75F, 54.25F, 8, 0, 12, 0.0F, false));

        cube_r42 = new AdvancedModelRendererExtended(this);
        cube_r42.setRotationPoint(1.0F, 4.6F, -58.5F);
        AnalSegment.addChild(cube_r42);
        setRotateAngle(cube_r42, -0.2182F, 0.0F, 0.0F);
        cube_r42.cubeList.add(new ModelBox(cube_r42, 18, 36, -3.0F, -18.25F, 60.5F, 3, 1, 5, 0.0F, false));

        cube_r43 = new AdvancedModelRendererExtended(this);
        cube_r43.setRotationPoint(1.0F, 4.6F, -58.5F);
        AnalSegment.addChild(cube_r43);
        setRotateAngle(cube_r43, -0.1309F, 0.0F, 0.0F);
        cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 36, -4.5F, -13.0F, 56.0F, 6, 2, 6, 0.0F, false));

        Leg51 = new AdvancedModelRendererExtended(this);
        Leg51.setRotationPoint(2.5F, 1.5F, 0.75F);
        AnalSegment.addChild(Leg51);
        Leg51.cubeList.add(new ModelBox(Leg51, 0, 8, 0.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        Leg52 = new AdvancedModelRendererExtended(this);
        Leg52.setRotationPoint(2.5F, 1.5F, 2.25F);
        AnalSegment.addChild(Leg52);
        Leg52.cubeList.add(new ModelBox(Leg52, 0, 8, 0.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        Leg53 = new AdvancedModelRendererExtended(this);
        Leg53.setRotationPoint(2.5F, 1.5F, 3.75F);
        AnalSegment.addChild(Leg53);
        Leg53.cubeList.add(new ModelBox(Leg53, 0, 10, 0.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        Leg56 = new AdvancedModelRendererExtended(this);
        Leg56.setRotationPoint(-3.5F, 1.5F, 0.75F);
        AnalSegment.addChild(Leg56);
        Leg56.cubeList.add(new ModelBox(Leg56, 0, 8, -4.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, true));

        Leg55 = new AdvancedModelRendererExtended(this);
        Leg55.setRotationPoint(-3.5F, 1.5F, 2.25F);
        AnalSegment.addChild(Leg55);
        Leg55.cubeList.add(new ModelBox(Leg55, 0, 8, -4.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, true));

        Leg54 = new AdvancedModelRendererExtended(this);
        Leg54.setRotationPoint(-3.5F, 1.5F, 3.75F);
        AnalSegment.addChild(Leg54);
        Leg54.cubeList.add(new ModelBox(Leg54, 0, 10, -3.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Arthropleura.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(FrontSegment3, -0.2182F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(FrontSegment4, -0.0873F, -0.1309F, 0.0F);
        this.setRotateAngle(HeadSegment, 0.1745F, -0.1309F, 0.0F);
        this.setRotateAngle(FrontSegment2, 0.0873F, 0.0873F, 0.0F);
        this.setRotateAngle(Back2, 0.0873F, 0.1309F, 0.0F);
        this.setRotateAngle(Back, 0.0437F, 0.0897F, 0.0017F);
        this.setRotateAngle(BackSegment1, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(BackSegment2, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(BackSegment3, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(AnalSegment, 0.0F, 0.2182F, 0.0F);
        this.Arthropleura.offsetY = -0.06F;
        this.Arthropleura.offsetX = -0.14F;
        this.Arthropleura.offsetZ = 0.2F;
        this.Arthropleura.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Arthropleura.offsetY = -0.5F;
        this.Arthropleura.offsetX = 0.9F;
        this.Arthropleura.offsetZ = 1.8F;
        this.Arthropleura.rotateAngleY = (float)Math.toRadians(120);
        this.Arthropleura.rotateAngleX = (float)Math.toRadians(1);
        this.Arthropleura.rotateAngleZ = (float)Math.toRadians(0);
        this.Arthropleura.scaleChildren = true;
        float scaler = 0.525F;
        this.Arthropleura.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Arthropleura, 0.8F, -8.4F, -0.4F);
        this.setRotateAngle(FrontSegment3, -0.2182F, -0.1309F, 0.0F);
        this.setRotateAngle(FrontSegment4, -0.0873F, -0.1309F, 0.0F);
        this.setRotateAngle(HeadSegment, 0.1745F, -0.1309F, 0.0F);
        this.setRotateAngle(FrontSegment2, 0.0873F, 0.0873F, 0.0F);
        this.setRotateAngle(Back2, 0.0873F, 0.1309F, 0.0F);
        this.setRotateAngle(Back, 0.0437F, 0.0897F, 0.0017F);
        this.setRotateAngle(BackSegment1, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(BackSegment2, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(BackSegment3, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(AnalSegment, 0.0F, 0.2182F, 0.0F);
        //End of pose, now render the model:
        this.Arthropleura.render(f);
        //Reset rotations, positions and sizing:
        this.Arthropleura.setScale(1.0F, 1.0F, 1.0F);
        this.Arthropleura.scaleChildren = false;
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

        AdvancedModelRendererExtended[] legsL = {this.Leg1, this.Leg2, this.Leg3, this.Leg4, this.Leg5, this.Leg6, this.Leg7, this.Leg8, this.Leg9, this.Leg10, this.Leg11, this.Leg12, this.Leg13, this.Leg14, this.Leg15, this.Leg16, this.Leg17, this.Leg18, this.Leg19, this.Leg20, this.Leg21, this.Leg22, this.Leg23, this.Leg24, this.Leg25, this.Leg26, this.Leg27, this.Leg28, this.Leg29, this.Leg30, this.Leg31, this.Leg32, this.Leg33, this.Leg34, this.Leg35, this.Leg36, this.Leg37, this.Leg38, this.Leg39, this.Leg40, this.Leg41, this.Leg42, this.Leg43, this.Leg44, this.Leg45, this.Leg46, this.Leg47, this.Leg48, this.Leg49, this.Leg50, this.Leg51, this.Leg52, this.Leg53};
        AdvancedModelRendererExtended[] legsR = {this.Leg106, this.Leg105, this.Leg104, this.Leg103, this.Leg102, this.Leg101, this.Leg100, this.Leg99, this.Leg98, this.Leg97, this.Leg96, this.Leg95, this.Leg94, this.Leg93, this.Leg92, this.Leg91, this.Leg90, this.Leg89, this.Leg88, this.Leg87, this.Leg86, this.Leg85, this.Leg84, this.Leg83, this.Leg82, this.Leg81, this.Leg80, this.Leg79, this.Leg78, this.Leg77, this.Leg76, this.Leg75, this.Leg74, this.Leg73, this.Leg72, this.Leg71, this.Leg70, this.Leg69, this.Leg68, this.Leg67, this.Leg66, this.Leg65, this.Leg64, this.Leg63, this.Leg62, this.Leg61, this.Leg60, this.Leg59, this.Leg58, this.Leg57, this.Leg56, this.Leg55, this.Leg54};

        AdvancedModelRendererExtended[] Body1 = {this.FrontSegment2, this.Back2, this.Back, this.BackSegment1, this.BackSegment2, this.BackSegment3, this.AnalSegment};
        AdvancedModelRendererExtended[] Body2 = {this.Back2, this.Back, this.BackSegment1, this.BackSegment2, this.BackSegment3, this.AnalSegment};
        AdvancedModelRendererExtended[] Body3 = {this.Back, this.BackSegment1, this.BackSegment2, this.BackSegment3, this.AnalSegment};
        AdvancedModelRendererExtended[] Body4 = {this.BackSegment1, this.BackSegment2, this.BackSegment3, this.AnalSegment};
        AdvancedModelRendererExtended[] Body5 = {this.BackSegment2, this.BackSegment3, this.AnalSegment};
        AdvancedModelRendererExtended[] Body6 = {this.BackSegment3, this.AnalSegment};

        EntityPrehistoricFloraArthropleura Arthropleura = (EntityPrehistoricFloraArthropleura) e;

        this.faceTarget(f3, f4, 5, HeadSegment);
        this.faceTarget(f3, f4, 5, FrontSegment4);

        this.Antennae1.swing(0.65F, (float)Math.toRadians(-16), false, 0, 0F, f2, 0.70F);
        this.Antennae2.swing(0.65F, (float)Math.toRadians(16), false, 0, 0F, f2, 0.70F);

        if (f3 == 0.0F || !Arthropleura.getIsMoving()) { //Not moving
            //this.faceTarget(f3, f4, 12, HeadSegment);
            //this.faceTarget(f3, f4, 12, FrontSegment4);
            //this.head.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.4;
            //this.body4.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.3;
            return;
        }

        AdvancedModelRendererExtended[] bodySegments = new AdvancedModelRendererExtended[]{
                FrontSegment2, Back2, Back, BackSegment1, BackSegment2, BackSegment3, AnalSegment};
        Arthropleura.arthropleuraBuffer.applyChainSwingBuffer(false, bodySegments);

        AdvancedModelRendererExtended[] bodySegments2 = new AdvancedModelRendererExtended[]{
                Back, BackSegment1, BackSegment2, BackSegment3, AnalSegment};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            /*
            this.head.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.4;
            this.body4.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.3;
            */

            this.bob(this.Arthropleura, 1.2F, 0.133F, false, f2, 1F);
            this.chainWaveExtended(bodySegments, 1.6F, 0.001F, 0.02F, 0, f2, 1f);
            this.chainWaveExtended(bodySegments2, 1.6F, -0.001F, 0.04F, 3, f2, 1f);

            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.2F, -0.2F, -3, f2, 1);
            //this.chainSwing(BodyHead, 0.2F, 0.3F, -3, f2, 1);

            float swingBodySpeed = 0.3F;
            float degreeBodySwing = 0.025F;
            this.chainSwing(Body1, swingBodySpeed, -degreeBodySwing * 0.66F, -3, f2, 1);
            this.chainSwing(Body2, swingBodySpeed, degreeBodySwing * 0.66F, -3, f2, 1);
            this.chainSwing(Body3, swingBodySpeed, -degreeBodySwing, -3, f2, 1);
            this.chainSwing(Body4, swingBodySpeed, degreeBodySwing, -3, f2, 1);
            this.chainSwing(Body5, swingBodySpeed, -degreeBodySwing * 2F, -3, f2, 1);
            this.chainSwing(Body6, swingBodySpeed, degreeBodySwing * 2F, -3, f2, 1);

            float legSpeed = 0.7F;
            float legDegree = 0.5F;

            this.flap(Leg1, legSpeed, -legDegree, false, 0.0F, -legDegree, f2, 0.3F);
            this.flap(Leg2, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg3, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg4, legSpeed, -legDegree, false, 3.0F, -legDegree, f2, 0.3F);
            this.flap(Leg5, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg6, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg7, legSpeed, -legDegree, false, 0.0F, -legDegree, f2, 0.3F);
            this.flap(Leg8, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg9, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg10, legSpeed, -legDegree, false, 3.0F, -legDegree, f2, 0.3F);
            this.flap(Leg11, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg12, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg13, legSpeed, -legDegree, false, 0.0F, -legDegree, f2, 0.3F);
            this.flap(Leg14, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg15, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg16, legSpeed, -legDegree, false, 3.0F, -legDegree, f2, 0.3F);
            this.flap(Leg17, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg18, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg19, legSpeed, -legDegree, false, 0.0F, -legDegree, f2, 0.3F);
            this.flap(Leg20, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg21, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg22, legSpeed, -legDegree, false, 3.0F, -legDegree, f2, 0.3F);
            this.flap(Leg23, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg24, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg25, legSpeed, -legDegree, false, 0.0F, -legDegree, f2, 0.3F);
            this.flap(Leg26, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg27, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg28, legSpeed, -legDegree, false, 3.0F, -legDegree, f2, 0.3F);
            this.flap(Leg29, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg30, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg31, legSpeed, -legDegree, false, 0.0F, -legDegree, f2, 0.3F);
            this.flap(Leg32, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg33, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg34, legSpeed, -legDegree, false, 3.0F, -legDegree, f2, 0.3F);
            this.flap(Leg35, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg36, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg37, legSpeed, -legDegree, false, 0.0F, -legDegree, f2, 0.3F);
            this.flap(Leg38, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg39, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg40, legSpeed, -legDegree, false, 3.0F, -legDegree, f2, 0.3F);
            this.flap(Leg41, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg42, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg43, legSpeed, -legDegree, false, 0.0F, -legDegree, f2, 0.3F);
            this.flap(Leg44, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg45, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg46, legSpeed, -legDegree, false, 3.0F, -legDegree, f2, 0.3F);
            this.flap(Leg47, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg48, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg49, legSpeed, -legDegree, false, 0.0F, -legDegree, f2, 0.3F);
            this.flap(Leg50, legSpeed, -legDegree, false, 1.0F, -legDegree, f2, 0.3F);
            this.flap(Leg51, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);
            this.flap(Leg52, legSpeed, -legDegree, false, 3.0F, -legDegree, f2, 0.3F);
            this.flap(Leg53, legSpeed, -legDegree, false, 2.0F, -legDegree, f2, 0.3F);

            this.flap(Leg106, legSpeed, legDegree, false, 0.0F, legDegree, f2, 0.3F);
            this.flap(Leg105, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg104, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg103, legSpeed, legDegree, false, 3.0F, legDegree, f2, 0.3F);
            this.flap(Leg102, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg101, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg100, legSpeed, legDegree, false, 0.0F, legDegree, f2, 0.3F);
            this.flap(Leg99, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg98, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg97, legSpeed, legDegree, false, 3.0F, legDegree, f2, 0.3F);
            this.flap(Leg96, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg95, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg94, legSpeed, legDegree, false, 0.0F, legDegree, f2, 0.3F);
            this.flap(Leg93, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg92, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg91, legSpeed, legDegree, false, 3.0F, legDegree, f2, 0.3F);
            this.flap(Leg90, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg89, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg88, legSpeed, legDegree, false, 0.0F, legDegree, f2, 0.3F);
            this.flap(Leg87, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg86, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg85, legSpeed, legDegree, false, 3.0F, legDegree, f2, 0.3F);
            this.flap(Leg84, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg83, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg82, legSpeed, legDegree, false, 0.0F, legDegree, f2, 0.3F);
            this.flap(Leg81, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg80, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg79, legSpeed, legDegree, false, 3.0F, legDegree, f2, 0.3F);
            this.flap(Leg78, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg77, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg76, legSpeed, legDegree, false, 0.0F, legDegree, f2, 0.3F);
            this.flap(Leg75, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg74, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg73, legSpeed, legDegree, false, 3.0F, legDegree, f2, 0.3F);
            this.flap(Leg72, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg71, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg70, legSpeed, legDegree, false, 0.0F, legDegree, f2, 0.3F);
            this.flap(Leg69, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg68, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg67, legSpeed, legDegree, false, 3.0F, legDegree, f2, 0.3F);
            this.flap(Leg66, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg65, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg64, legSpeed, legDegree, false, 0.0F, legDegree, f2, 0.3F);
            this.flap(Leg63, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg62, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg61, legSpeed, legDegree, false, 3.0F, legDegree, f2, 0.3F);
            this.flap(Leg60, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg59, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg58, legSpeed, legDegree, false, 0.0F, legDegree, f2, 0.3F);
            this.flap(Leg57, legSpeed, legDegree, false, 1.0F, legDegree, f2, 0.3F);
            this.flap(Leg56, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);
            this.flap(Leg55, legSpeed, legDegree, false, 3.0F, legDegree, f2, 0.3F);
            this.flap(Leg54, legSpeed, legDegree, false, 2.0F, legDegree, f2, 0.3F);

        }
    }
}
