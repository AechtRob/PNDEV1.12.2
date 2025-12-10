package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSarcoprion;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSarcoprion extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer leftpectoral;
    private final AdvancedModelRenderer rightpectoral;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer whorl;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;

    public ModelSarcoprion() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, 10.0F, -1.75F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 35, 0, -6.0F, -23.5F, -4.0F, 11, 13, 15, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 80, -0.5F, -35.5F, -2.75F, 0, 12, 10, 0.0F, false));

        this.leftpectoral = new AdvancedModelRenderer(this);
        this.leftpectoral.setRotationPoint(4.75F, -13.5F, -1.0F);
        this.body.addChild(leftpectoral);
        this.setRotateAngle(leftpectoral, 0.0F, 0.0F, 0.1309F);
        this.leftpectoral.cubeList.add(new ModelBox(leftpectoral, 35, 29, 0.75F, 0.5F, -0.25F, 16, 0, 14, 0.0F, false));
        this.leftpectoral.cubeList.add(new ModelBox(leftpectoral, 88, 14, 0.25F, 0.0F, -0.25F, 3, 1, 4, 0.0F, false));

        this.rightpectoral = new AdvancedModelRenderer(this);
        this.rightpectoral.setRotationPoint(-5.75F, -13.5F, -1.0F);
        this.body.addChild(rightpectoral);
        this.setRotateAngle(rightpectoral, 0.0F, 0.0F, -0.1309F);
        this.rightpectoral.cubeList.add(new ModelBox(rightpectoral, 35, 29, -16.75F, 0.5F, -0.25F, 16, 0, 14, 0.0F, true));
        this.rightpectoral.cubeList.add(new ModelBox(rightpectoral, 88, 14, -3.25F, 0.0F, -0.25F, 3, 1, 4, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -11.0F, 0.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 29, 74, -5.0F, -11.0F, -10.0F, 9, 10, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.0F, 0.0F, -13.5F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 107, -0.1636F, -8.7F, -1.0071F, 2, 2, 2, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 108, -0.2386F, -8.2F, -0.5071F, 2, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -6.0F, -23.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.0036F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 113, -1.0F, 1.05F, 1.5F, 1, 1, 1, 0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 113, -1.0F, 0.7F, 1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 113, -1.0F, 0.25F, 0.5F, 1, 1, 1, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -6.2874F, -22.5205F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.1781F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 113, -0.5F, -0.5F, -0.475F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-5.0F, -7.4261F, -9.9981F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2531F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 90, 42, 0.0F, -1.65F, -8.0F, 2, 3, 8, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.0F, 0.0F, -13.5F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2618F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 107, -1.8364F, -8.7F, -1.0071F, 2, 2, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 108, -1.7614F, -8.2F, -0.5071F, 2, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(4.0F, -7.4261F, -9.9981F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.2531F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 90, 42, -2.0F, -1.65F, -8.0F, 2, 3, 8, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -12.4486F, -3.9893F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2356F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 79, 92, -3.0F, 2.0225F, -11.8338F, 5, 2, 5, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 29, -1.5F, 0.0225F, -22.8338F, 2, 2, 4, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 95, 0, -2.0F, 0.0225F, -18.8338F, 3, 2, 4, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 52, 89, -3.0F, 0.0225F, -14.8338F, 5, 2, 8, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 80, 56, -4.0F, -0.0275F, -6.9338F, 7, 2, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -7.5F, -13.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 36, -1.5F, 1.7F, -6.5F, 3, 1, 2, -0.001F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 82, 20, -2.5F, -0.3F, -5.0F, 5, 3, 9, 0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.5F, -4.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 82, 33, -3.5F, -2.0F, -6.0F, 7, 2, 6, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -4.439F, -9.6291F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.2182F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 54, 44, -2.5F, 0.0F, -4.0083F, 5, 3, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 9, -2.0F, 0.0F, -8.0083F, 4, 2, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 95, 95, -1.0F, 0.0F, -13.0083F, 2, 1, 5, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.0F, -4.2583F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1702F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 5, -1.0F, -1.9711F, -5.9086F, 2, 1, 2, -0.02F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 91, -1.0F, -1.0211F, -9.0086F, 2, 1, 5, -0.002F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 98, -1.5F, -1.0211F, -4.0086F, 3, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.0F, -2.0083F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0567F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 25, 67, -2.0F, -0.825F, -2.25F, 4, 1, 5, 0.0F, false));

        this.whorl = new AdvancedModelRenderer(this);
        this.whorl.setRotationPoint(0.5F, 1.0F, -1.0083F);
        this.jaw.addChild(whorl);
        this.whorl.cubeList.add(new ModelBox(whorl, 0, 0, -1.0F, -1.775F, -10.075F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -0.8799F, -8.2426F);
        this.whorl.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3491F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 0, -0.5F, -0.55F, -1.1F, 1, 1, 3, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.9217F, -7.9384F);
        this.whorl.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.5272F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 3, 0.025F, -0.275F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -1.0144F, -8.5585F);
        this.whorl.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 3, 3, 0.0F, -0.5F, -0.575F, 0, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -1.2574F, -8.9875F);
        this.whorl.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.2217F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 9, -0.025F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -1.0584F, -11.1133F);
        this.whorl.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 3, -0.025F, -0.425F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -1.2479F, -10.6561F);
        this.whorl.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3927F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 13, 9, 0.0F, -0.5F, -0.375F, 0, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -1.3978F, -10.1944F);
        this.whorl.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6545F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 14, 0, 0.025F, -0.55F, -0.4F, 0, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -2.275F, -9.575F);
        this.whorl.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -1.0472F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 11, 0, 0.0F, -0.15F, 0.25F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -1.5F, -10.0F);
        this.whorl.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3927F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 38, 0, -0.5F, -0.275F, -1.95F, 1, 1, 2, -0.001F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, -17.1627F, 10.7662F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 24, 44, -4.5F, -5.3373F, -0.7662F, 9, 11, 11, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -6.3373F, 1.2338F);
        this.body2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0829F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 65, 44, -3.5F, 0.125F, -1.0F, 7, 1, 10, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 6.6627F, 1.2338F);
        this.body2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 67, -3.5F, -2.1F, -1.025F, 7, 2, 10, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.23F, 10.2894F);
        this.body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 54, 56, -3.5F, -3.5673F, -0.5555F, 7, 7, 11, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -5.5673F, -0.5555F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 73, 0, -2.5F, -0.05F, 0.325F, 5, 2, 11, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 5.4327F, -0.5555F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1309F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 60, 75, -2.5F, -2.0F, 0.275F, 5, 2, 11, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0832F, 9.9137F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 18, 0, -2.5F, -2.1505F, -0.4693F, 5, 4, 9, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -2.6505F, 3.5307F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1745F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 84, 80, -2.0F, -0.35F, -4.0F, 4, 2, 9, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 2.8495F, 3.5307F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1309F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 82, 66, -2.0F, -1.7F, -3.875F, 4, 2, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.75F, 0.0995F, 8.7807F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 50, -2.25F, -2.0F, -1.25F, 3, 4, 8, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 21, 91, -1.25F, 0.0F, -0.25F, 4, 0, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 21, 91, -4.25F, 0.0F, -0.25F, 4, 0, 7, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.3333F, -0.3333F, 6.75F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -1.4167F, -0.9167F, -1.0F, 2, 2, 6, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 11, 80, -0.6667F, 0.3333F, 0.0F, 3, 0, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 11, 80, -3.1667F, 0.3333F, 0.0F, 3, 0, 5, 0.0F, true));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.4167F, -17.9167F, -1.0F, 0, 32, 17, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.25F;
        this.root.offsetX = 0.25F;
        this.root.rotateAngleY = (float)Math.toRadians(125);
        this.root.rotateAngleX = (float)Math.toRadians(2);
        this.root.rotateAngleZ = (float)Math.toRadians(-2);
        this.root.scaleChildren = true;
        float scaler = 0.25F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(tail4, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(rightpectoral, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(leftpectoral, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0873F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(tail4, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(root, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(rightpectoral, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(leftpectoral, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r9, -0.1702F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, 0.2531F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, -0.2531F, 0.0F);
        this.setRotateAngle(cube_r25, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.0829F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, -1.0472F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -1.2217F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -1.309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -1.5272F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.0567F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0873F, 0.0F);
        this.root.offsetY = -0.147F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(tail4, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(root, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(rightpectoral, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(leftpectoral, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r9, -0.1702F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, 0.2531F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, -0.2531F, 0.0F);
        this.setRotateAngle(cube_r25, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.0829F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, -1.0472F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -1.2217F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -1.309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -1.5272F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.0567F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0873F, 0.0F);
        this.root.offsetY = -0.147F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(tail4, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(root, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(rightpectoral, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(leftpectoral, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r9, -0.1702F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, 0.2531F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, -0.2531F, 0.0F);
        this.setRotateAngle(cube_r25, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.0829F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, -1.0472F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -1.2217F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -1.309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -1.5272F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.0567F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0873F, 0.0F);
        this.root.offsetY = -0.147F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();


        this.setRotateAngle(rightpectoral, 0.0F, 0.0F, -0.40F);
        this.setRotateAngle(leftpectoral, 0.0F, 0.0F, 0.40F);

        //this.root.offsetY = 1.0F;
        //this.root.offsetZ = 0.6F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.tail, this.tail2, this.tail3, this.tail4};
        ((EntityPrehistoricFloraSarcoprion)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.21F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.5F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still * 0.8F, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still * 0.8F, 0.25F * still, -0.55, f2, 0.6F * still);
            this.swing(root, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }

        this.walk(jaw, (float) (speed * 0.2), 0.05F, true, 0.0f, -0.05f, f2, 1);
        this.flap(leftpectoral, (float) (speed * 0.85), 0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(leftpectoral, (float) (speed * 0.85), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(rightpectoral, (float) (speed * 0.85), -0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(rightpectoral, (float) (speed * 0.85), -0.1F, true, 0, 0, f2, 0.5F);


        if (!e.isInWater()) {
            //this.body.rotateAngleZ = (float) Math.toRadians(90);
            //this.body.offsetY = 0.55F;
            this.bob(root, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //duration 25
        animator.startKeyframe(5);
        //animator.rotate(this.Headback, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        //animator.rotate(this.Headback, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        //animator.rotate(this.Headback, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.resetKeyframe(2);


    }
}

