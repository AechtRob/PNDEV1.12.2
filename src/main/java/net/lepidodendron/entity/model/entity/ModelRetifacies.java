package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRetifacies extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Retifacies;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer RLeg4;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer RLeg3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer LLeg4;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer LLeg3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer RLeg1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer LLeg1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer RAntennae;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer LAntennae;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer LLeg5;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer LLeg6;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer Lleg7;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer RLeg5;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer RLeg6;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer RLeg7;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer Lleg8;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer LLeg9;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer RLeg8;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer RLeg9;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r29;

    public ModelRetifacies() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Retifacies = new AdvancedModelRenderer(this);
        this.Retifacies.setRotationPoint(0.0F, 23.0F, -3.5F);
        this.Retifacies.cubeList.add(new ModelBox(Retifacies, 0, 0, -2.0F, -0.5F, -2.5F, 4, 1, 5, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.75F, 3.5F);
        this.Retifacies.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.3927F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 0, -3.0F, -1.5F, -6.0F, 2, 0, 5, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.75F, 3.5F);
        this.Retifacies.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3927F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 0, 1.0F, -1.5F, -6.0F, 2, 0, 5, 0.0F, false));

        this.RLeg4 = new AdvancedModelRenderer(this);
        this.RLeg4.setRotationPoint(-0.9F, 0.5F, 1.5F);
        this.Retifacies.addChild(RLeg4);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.4F, -0.15F, 3.5F);
        this.RLeg4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.1309F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -3.4F, 0.0F, -4.0F, 2, 0, 1, 0.0F, true));

        this.RLeg3 = new AdvancedModelRenderer(this);
        this.RLeg3.setRotationPoint(-0.9F, 0.5F, 0.0F);
        this.Retifacies.addChild(RLeg3);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.4F, -0.15F, 3.5F);
        this.RLeg3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.1309F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -3.4F, 0.0F, -4.0F, 2, 0, 1, 0.0F, true));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-0.9F, 0.5F, -1.5F);
        this.Retifacies.addChild(RLeg2);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.4F, -0.15F, 5.0F);
        this.RLeg2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.1309F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -3.4F, 0.0F, -5.5F, 2, 0, 1, 0.0F, true));

        this.LLeg4 = new AdvancedModelRenderer(this);
        this.LLeg4.setRotationPoint(0.9F, 0.5F, 1.5F);
        this.Retifacies.addChild(LLeg4);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.4F, -0.15F, 3.5F);
        this.LLeg4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.1309F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 1.4F, 0.0F, -4.0F, 2, 0, 1, 0.0F, false));

        this.LLeg3 = new AdvancedModelRenderer(this);
        this.LLeg3.setRotationPoint(0.9F, 0.5F, 0.0F);
        this.Retifacies.addChild(LLeg3);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.4F, -0.15F, 3.5F);
        this.LLeg3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.1309F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 1.4F, 0.0F, -4.0F, 2, 0, 1, 0.0F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(0.9F, 0.5F, -1.5F);
        this.Retifacies.addChild(LLeg2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.4F, -0.15F, 5.0F);
        this.LLeg2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.1309F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 1.4F, 0.0F, -5.5F, 2, 0, 1, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Retifacies.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 14, -2.0F, -0.5F, -2.0F, 4, 1, 2, 0.002F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.5F, 6.0F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.3927F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 9, -3.0F, -1.5F, -8.0F, 2, 0, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.5F, 6.0F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.3927F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 9, 1.0F, -1.5F, -8.0F, 2, 0, 2, 0.0F, false));

        this.RLeg1 = new AdvancedModelRenderer(this);
        this.RLeg1.setRotationPoint(-0.9F, 0.5F, -0.5F);
        this.Head.addChild(RLeg1);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.4F, -0.15F, 6.5F);
        this.RLeg1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.1309F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -3.4F, 0.0F, -7.0F, 2, 0, 1, 0.0F, true));

        this.LLeg1 = new AdvancedModelRenderer(this);
        this.LLeg1.setRotationPoint(0.9F, 0.5F, -0.5F);
        this.Head.addChild(LLeg1);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.4F, -0.15F, 6.5F);
        this.LLeg1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.1309F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 1.4F, 0.0F, -7.0F, 2, 0, 1, 0.0F, false));

        this.RAntennae = new AdvancedModelRenderer(this);
        this.RAntennae.setRotationPoint(-0.65F, 0.5F, -0.25F);
        this.Head.addChild(RAntennae);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.65F, 0.95F, 6.25F);
        this.RAntennae.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.3927F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 0, 1.25F, -0.9F, -12.0F, 1, 0, 6, 0.0F, true));

        this.LAntennae = new AdvancedModelRenderer(this);
        this.LAntennae.setRotationPoint(0.65F, 0.5F, -0.25F);
        this.Head.addChild(LAntennae);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.65F, 0.95F, 6.25F);
        this.LAntennae.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.3927F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 0, -2.25F, -0.9F, -12.0F, 1, 0, 6, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Retifacies.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 8, 8, -1.5F, -0.5F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.75F, 1.0F);
        this.Body1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.3927F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 3, 6, -3.0F, -1.5F, -2.0F, 2, 0, 6, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.75F, 1.0F);
        this.Body1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.3927F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 3, 6, 1.0F, -1.5F, -2.0F, 2, 0, 6, 0.0F, false));

        this.LLeg5 = new AdvancedModelRenderer(this);
        this.LLeg5.setRotationPoint(0.5F, 0.5F, 0.5F);
        this.Body1.addChild(LLeg5);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.4F, -0.15F, 0.5F);
        this.LLeg5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.1309F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 1.4F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.LLeg6 = new AdvancedModelRenderer(this);
        this.LLeg6.setRotationPoint(0.5F, 0.5F, 2.0F);
        this.Body1.addChild(LLeg6);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.4F, -0.15F, -1.5F);
        this.LLeg6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.1309F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 1.4F, 0.0F, 1.0F, 2, 0, 1, 0.0F, false));

        this.Lleg7 = new AdvancedModelRenderer(this);
        this.Lleg7.setRotationPoint(0.5F, 0.5F, 3.5F);
        this.Body1.addChild(Lleg7);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.4F, -0.15F, -3.5F);
        this.Lleg7.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.1309F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 1.4F, 0.0F, 3.0F, 2, 0, 1, 0.0F, false));

        this.RLeg5 = new AdvancedModelRenderer(this);
        this.RLeg5.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.Body1.addChild(RLeg5);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.4F, -0.15F, 0.5F);
        this.RLeg5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.1309F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, -3.4F, 0.0F, -1.0F, 2, 0, 1, 0.0F, true));

        this.RLeg6 = new AdvancedModelRenderer(this);
        this.RLeg6.setRotationPoint(-0.5F, 0.5F, 2.0F);
        this.Body1.addChild(RLeg6);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.4F, -0.15F, -1.5F);
        this.RLeg6.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.1309F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -3.4F, 0.0F, 1.0F, 2, 0, 1, 0.0F, true));

        this.RLeg7 = new AdvancedModelRenderer(this);
        this.RLeg7.setRotationPoint(-0.5F, 0.5F, 3.5F);
        this.Body1.addChild(RLeg7);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.4F, -0.15F, -3.5F);
        this.RLeg7.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.1309F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, -3.4F, 0.0F, 3.0F, 2, 0, 1, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 12, 14, -1.5F, -0.5F, 0.0F, 3, 1, 2, -0.001F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 1, -1.0F, -0.4F, 1.5F, 2, 0, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.4F, 1.0F, -4.0F);
        this.Body2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.3927F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 6, -2.0F, -1.5F, 3.5F, 2, 0, 3, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.4F, 1.0F, -4.0F);
        this.Body2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.3927F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 6, 0.0F, -1.5F, 3.5F, 2, 0, 3, 0.0F, false));

        this.Lleg8 = new AdvancedModelRenderer(this);
        this.Lleg8.setRotationPoint(0.5F, 0.5F, 0.0F);
        this.Body2.addChild(Lleg8);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.4F, -0.15F, -3.5F);
        this.Lleg8.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.1309F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, 1.4F, 0.0F, 3.0F, 2, 0, 1, 0.0F, false));

        this.LLeg9 = new AdvancedModelRenderer(this);
        this.LLeg9.setRotationPoint(0.5F, 0.5F, 1.5F);
        this.Body2.addChild(LLeg9);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.4F, -0.15F, -5.5F);
        this.LLeg9.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.1309F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, 1.4F, 0.0F, 5.0F, 2, 0, 1, 0.0F, false));

        this.RLeg8 = new AdvancedModelRenderer(this);
        this.RLeg8.setRotationPoint(-0.5F, 0.5F, 0.0F);
        this.Body2.addChild(RLeg8);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.4F, -0.15F, -3.5F);
        this.RLeg8.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.1309F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, -3.4F, 0.0F, 3.0F, 2, 0, 1, 0.0F, true));

        this.RLeg9 = new AdvancedModelRenderer(this);
        this.RLeg9.setRotationPoint(-0.5F, 0.5F, 1.5F);
        this.Body2.addChild(RLeg9);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.4F, -0.15F, -5.5F);
        this.RLeg9.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -0.1309F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, -3.4F, 0.0F, 5.0F, 2, 0, 1, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.2F, 2.0F);
        this.Body2.addChild(Tail);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.4F, 0.7F, -6.0F);
        this.Tail.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0873F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 6, -0.1F, -1.2F, 5.9F, 1, 0, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Retifacies.render(f5 * 0.402F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //this.body.offsetZ = 0.1F;
        this.Retifacies.render(0.022f);
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Retifacies.offsetY = -0.3F;
        this.Retifacies.offsetX = 0.1F;
        this.Retifacies.offsetZ = 2.0F;
        this.Retifacies.rotateAngleY = (float)Math.toRadians(120);
        this.Retifacies.rotateAngleX = (float)Math.toRadians(0);
        this.Retifacies.rotateAngleZ = (float)Math.toRadians(0);
        this.Retifacies.scaleChildren = true;
        float scaler = 1.0F;
        this.Retifacies.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Retifacies, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.Retifacies.render(f);
        //Reset rotations, positions and sizing:
        this.Retifacies.setScale(1.0F, 1.0F, 1.0F);
        this.Retifacies.scaleChildren = false;
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
        this.Retifacies.offsetY = 0.9F;

        AdvancedModelRenderer[] legsL = {this.LLeg1, this.LLeg2, this.LLeg3, this.LLeg4, this.LLeg5, this.LLeg6, this.Lleg7, this.Lleg8, this.LLeg9};
        AdvancedModelRenderer[] legsR = {this.RLeg1, this.RLeg2, this.RLeg3, this.RLeg4, this.RLeg5, this.RLeg6, this.RLeg7, this.RLeg8, this.RLeg9};
        AdvancedModelRenderer[] Thorax = {this.Body1, this.Body2, this.Tail};

        this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

        this.swing(LAntennae, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(RAntennae, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        if (f3 != 0) {
            this.chainSwing(Thorax, 0.2F, 0.032F, 2.5, f2, 0.8F);
        }

        this.flap(LLeg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
        this.flap(RLeg1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
        this.flap(LLeg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
        this.flap(Lleg7, 0.5F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg7, 0.5F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
        this.flap(Lleg8, 0.5F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg8, 0.5F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg9, 0.5F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg9, 0.5F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);

    }
}
