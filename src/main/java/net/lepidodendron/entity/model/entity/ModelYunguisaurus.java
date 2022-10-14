package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraYunguisaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelYunguisaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended Yunguisaurus;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended neck4;
    private final AdvancedModelRendererExtended neck5;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended rightarm;
    private final AdvancedModelRendererExtended flipper;
    private final AdvancedModelRendererExtended leftarm;
    private final AdvancedModelRendererExtended flipper3;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended rightbackflipper;
    private final AdvancedModelRendererExtended flipper2;
    private final AdvancedModelRendererExtended leftbackflipper;
    private final AdvancedModelRendererExtended flipper4;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended tail6;
    private final AdvancedModelRendererExtended tail7;

    private ModelAnimator animator;

    public ModelYunguisaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Yunguisaurus = new AdvancedModelRendererExtended(this);
        this.Yunguisaurus.setRotationPoint(0.5F, 24.0F, 7.0F);


        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Yunguisaurus.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -8.0F, -16.0F, 11, 8, 17, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(-0.5F, -4.0F, -15.5F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 43, 67, -4.5F, -3.5F, -3.0F, 9, 7, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 76, 1, -4.0F, -2.5F, -3.0F, 8, 5, 4, 0.0F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 17, 44, -2.5F, -2.0F, -7.0F, 5, 4, 7, 0.0F, false));

        this.neck4 = new AdvancedModelRendererExtended(this);
        this.neck4.setRotationPoint(0.0F, 0.0F, -5.75F);
        this.neck3.addChild(neck4);
        this.neck4.cubeList.add(new ModelBox(neck4, 39, 0, -2.0444F, -2.0029F, -8.249F, 4, 4, 8, -0.01F, false));

        this.neck5 = new AdvancedModelRendererExtended(this);
        this.neck5.setRotationPoint(-0.0444F, -0.7529F, -6.999F);
        this.neck4.addChild(neck5);
        this.neck5.cubeList.add(new ModelBox(neck5, 0, 39, -2.0F, -1.25F, -8.25F, 4, 4, 8, -0.011F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(-0.25F, 0.1985F, -7.6826F);
        this.neck5.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 61, 36, -1.75F, -1.6221F, -2.8022F, 4, 3, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 62, 42, -1.75F, -0.6221F, -5.8022F, 4, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 2.0F, 1.3779F, -6.0522F, 0, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.5F, 1.3779F, -6.0522F, 0, 1, 2, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 57, 21, -1.25F, -0.6221F, -9.8022F, 3, 2, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 2, 1.5F, 1.3779F, -9.8022F, 0, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 2, -1.0F, 1.3779F, -9.8022F, 0, 1, 3, 0.0F, true));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-0.25F, -0.1221F, -5.8022F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 56, 27, -1.0F, -1.0F, -3.75F, 3, 2, 7, -0.01F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-1.25F, 1.3779F, -9.3022F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3054F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 4, 10, 0.0F, -0.5F, 2.5F, 0, 2, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(1.75F, 1.3779F, -9.3022F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.3054F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 4, 10, 0.0F, -0.5F, 2.5F, 0, 2, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-1.25F, 1.3779F, -8.3022F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.0873F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 8, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(1.75F, 1.3779F, -8.3022F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.0873F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 8, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.25F, 1.3779F, -9.8022F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 9, -1.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-1.75F, 1.3779F, -3.3022F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.3054F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 2, 10, 0.0F, -1.25F, -0.75F, 0, 2, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(2.25F, 1.3779F, -3.3022F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.3054F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 2, 10, 0.0F, -1.25F, -0.75F, 0, 2, 1, 0.0F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(-0.25F, 1.8779F, -0.5522F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 34, 56, -1.5F, -0.5F, -5.25F, 4, 1, 6, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 0, 2.25F, -1.5F, -4.5F, 0, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 0, -1.25F, -1.5F, -4.5F, 0, 1, 3, 0.0F, true));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 31, 63, -1.0F, -3.0F, -1.5F, 3, 3, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 39, 12, -1.0F, -0.5F, -9.25F, 3, 1, 4, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 1, 1.75F, -1.5F, -8.25F, 0, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 1, -0.75F, -1.5F, -8.25F, 0, 1, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-1.0F, -0.5F, -5.75F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.1745F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 0, 0.0F, -2.5F, -3.5F, 0, 3, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(2.0F, -0.5F, -5.75F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.1745F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 0, 0.0F, -2.5F, -3.5F, 0, 3, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(-1.0F, -0.5F, -6.75F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.2182F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 10, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(2.0F, -0.5F, -6.75F);
        this.lowerjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.2182F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 10, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.5F, -0.5F, -9.25F);
        this.lowerjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.5F, -2.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(-1.5F, -0.5F, -4.75F);
        this.lowerjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.2618F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 3, 0.0F, -1.5F, -0.25F, 0, 2, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(2.5F, -0.5F, -4.75F);
        this.lowerjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.2618F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 9, 3, 0.0F, -1.5F, -0.25F, 0, 2, 1, 0.0F, false));

        this.rightarm = new AdvancedModelRendererExtended(this);
        this.rightarm.setRotationPoint(-4.5F, 2.0F, -1.0F);
        this.neck.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.0F, 0.0F, 0.0F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 16, 39, -2.5F, -1.0F, -1.5F, 4, 2, 3, 0.0F, true));

        this.flipper = new AdvancedModelRendererExtended(this);
        this.flipper.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.rightarm.addChild(flipper);
        this.flipper.cubeList.add(new ModelBox(flipper, 0, 32, -14.0F, -0.5F, -1.5F, 14, 1, 6, 0.0F, true));

        this.leftarm = new AdvancedModelRendererExtended(this);
        this.leftarm.setRotationPoint(4.5F, 2.0F, -1.0F);
        this.neck.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.0F, 0.0F, 0.0F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 16, 39, -1.5F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.flipper3 = new AdvancedModelRendererExtended(this);
        this.flipper3.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.leftarm.addChild(flipper3);
        this.flipper3.cubeList.add(new ModelBox(flipper3, 0, 32, 0.0F, -0.5F, -1.5F, 14, 1, 6, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(-0.5F, -4.0F, -0.5F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 35, 34, -4.0F, -3.5F, 0.0F, 8, 7, 5, 0.0F, false));

        this.rightbackflipper = new AdvancedModelRendererExtended(this);
        this.rightbackflipper.setRotationPoint(-3.75F, 2.0F, 1.5F);
        this.tail.addChild(rightbackflipper);
        this.rightbackflipper.cubeList.add(new ModelBox(rightbackflipper, 16, 39, -2.25F, -1.0F, -1.0F, 4, 2, 3, 0.0F, true));

        this.flipper2 = new AdvancedModelRendererExtended(this);
        this.flipper2.setRotationPoint(-2.25F, 0.0F, 0.5F);
        this.rightbackflipper.addChild(flipper2);
        this.setRotateAngle(flipper2, 0.3927F, 0.0F, 0.0F);
        this.flipper2.cubeList.add(new ModelBox(flipper2, 0, 32, -14.0F, -0.5F, -1.5F, 14, 1, 6, 0.0F, true));

        this.leftbackflipper = new AdvancedModelRendererExtended(this);
        this.leftbackflipper.setRotationPoint(3.75F, 2.0F, 1.5F);
        this.tail.addChild(leftbackflipper);
        this.leftbackflipper.cubeList.add(new ModelBox(leftbackflipper, 16, 39, -1.75F, -1.0F, -1.0F, 4, 2, 3, 0.0F, false));

        this.flipper4 = new AdvancedModelRendererExtended(this);
        this.flipper4.setRotationPoint(2.25F, 0.0F, 0.5F);
        this.leftbackflipper.addChild(flipper4);
        this.setRotateAngle(flipper4, 0.3927F, 0.0F, 0.0F);
        this.flipper4.cubeList.add(new ModelBox(flipper4, 0, 32, 0.0F, -0.5F, -1.5F, 14, 1, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.3504F, 4.4591F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 73, 23, -3.0F, -2.3504F, -0.9591F, 6, 4, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(-0.5F, -2.6004F, 2.5409F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 57, 11, -2.0F, -0.25F, -3.75F, 5, 4, 6, 0.0F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(-0.5F, 1.5261F, 0.8271F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3112F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 54, 56, -1.5F, -1.0F, -1.75F, 4, 2, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.3504F, 4.7909F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 14, 55, -2.0F, -1.5F, -1.0F, 4, 3, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 51, -1.4564F, -1.5F, -0.999F, 3, 3, 7, -0.01F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.5436F, 0.0F, 6.001F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 61, -1.5436F, -1.5F, 0.0F, 2, 3, 6, 0.0F, false));

        this.tail6 = new AdvancedModelRendererExtended(this);
        this.tail6.setRotationPoint(-0.5F, 0.0F, 5.75F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 9, -0.5436F, -1.0F, -1.0F, 1, 2, 6, 0.0F, false));

        this.tail7 = new AdvancedModelRendererExtended(this);
        this.tail7.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail6.addChild(tail7);
        this.tail7.cubeList.add(new ModelBox(tail7, 0, 0, -0.5436F, -1.0F, 0.0F, 1, 2, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 1.0F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.neck2.offsetZ = -0.3F;
        this.head.rotateAngleY = (float)Math.toRadians(20);
        this.neck3.rotateAngleY = (float)Math.toRadians(-10);
        this.neck4.rotateAngleY = (float)Math.toRadians(-12.5);
        this.neck5.rotateAngleY = (float)Math.toRadians(-7.5);
        this.lowerjaw.rotateAngleX = (float)Math.toRadians(37.5);
        this.neck2.render(0.1F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        EntityPrehistoricFloraYunguisaurus ee = (EntityPrehistoricFloraYunguisaurus) entitylivingbaseIn;
        if (ee.isInWater()) {
            if (ee.getIsFast()) {
                animSwimming(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            else {
                animSwimming(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
    }

    public void animSwimming(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYunguisaurus entity = (EntityPrehistoricFloraYunguisaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * 0D);
            yy = -15D + (((tickAnim - 0D) / 20D) * 37.5D);
            zz = 0D + (((tickAnim - 0D) / 20D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 20D) / 10D) * 0.6521D);
            yy = 22.5D + (((tickAnim - 20D) / 10D) * -18.8071D);
            zz = 0D + (((tickAnim - 20D) / 10D) * 10.021D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.6521D + (((tickAnim - 30D) / 10D) * -0.6521D);
            yy = 3.6929D + (((tickAnim - 30D) / 10D) * -18.6929D);
            zz = 10.021D + (((tickAnim - 30D) / 10D) * -10.021D);
        }


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * 21.6797D);
            yy = 0D + (((tickAnim - 0D) / 8D) * 6.3372D);
            zz = 0D + (((tickAnim - 0D) / 8D) * -26.7836D);
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 21.6797D + (((tickAnim - 8D) / 9D) * 0.823799999999999D);
            yy = 6.3372D + (((tickAnim - 8D) / 9D) * 17.2663D);
            zz = -26.7836D + (((tickAnim - 8D) / 9D) * -27.6425D);
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 22.5035D + (((tickAnim - 17D) / 8D) * -39.1046D);
            yy = 23.6035D + (((tickAnim - 17D) / 8D) * -9.7846D);
            zz = -54.4261D + (((tickAnim - 17D) / 8D) * 57.6748D);
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -16.6011D + (((tickAnim - 25D) / 5D) * -3.3617D);
            yy = 13.8189D + (((tickAnim - 25D) / 5D) * -5.9836D);
            zz = 3.2487D + (((tickAnim - 25D) / 5D) * 4.2514D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -19.9628D + (((tickAnim - 30D) / 10D) * 19.9628D);
            yy = 7.8353D + (((tickAnim - 30D) / 10D) * -7.8353D);
            zz = 7.5001D + (((tickAnim - 30D) / 10D) * -7.5001D);
        }


        this.setRotateAngle(flipper, flipper.rotateAngleX + (float) Math.toRadians(xx), flipper.rotateAngleY + (float) Math.toRadians(yy), flipper.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * 0D);
            yy = 15D + (((tickAnim - 0D) / 20D) * -37.5D);
            zz = 0D + (((tickAnim - 0D) / 20D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 20D) / 10D) * 0.65208D);
            yy = -22.5D + (((tickAnim - 20D) / 10D) * 18.80705D);
            zz = 0D + (((tickAnim - 20D) / 10D) * -10.02102D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.65208D + (((tickAnim - 30D) / 10D) * -0.65208D);
            yy = -3.69295D + (((tickAnim - 30D) / 10D) * 18.69295D);
            zz = -10.02102D + (((tickAnim - 30D) / 10D) * 10.02102D);
        }


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * 21.67973D);
            yy = 0D + (((tickAnim - 0D) / 8D) * -6.33715D);
            zz = 0D + (((tickAnim - 0D) / 8D) * 26.78356D);
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 21.67973D + (((tickAnim - 8D) / 9D) * 0.823820000000001D);
            yy = -6.33715D + (((tickAnim - 8D) / 9D) * -17.26638D);
            zz = 26.78356D + (((tickAnim - 8D) / 9D) * 27.64257D);
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 22.50355D + (((tickAnim - 17D) / 8D) * -39.10466D);
            yy = -23.60353D + (((tickAnim - 17D) / 8D) * 9.78461D);
            zz = 54.42613D + (((tickAnim - 17D) / 8D) * -57.67479D);
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -16.60111D + (((tickAnim - 25D) / 5D) * -3.36166D);
            yy = -13.81892D + (((tickAnim - 25D) / 5D) * 5.98357D);
            zz = -3.24866D + (((tickAnim - 25D) / 5D) * -4.25144D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -19.96277D + (((tickAnim - 30D) / 10D) * 19.96277D);
            yy = -7.83535D + (((tickAnim - 30D) / 10D) * 7.83535D);
            zz = -7.5001D + (((tickAnim - 30D) / 10D) * 7.5001D);
        }


        this.setRotateAngle(flipper3, flipper3.rotateAngleX + (float) Math.toRadians(xx), flipper3.rotateAngleY + (float) Math.toRadians(yy), flipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 26.8304D + (((tickAnim - 0D) / 10D) * -24.8188D);
            yy = 42.3386D + (((tickAnim - 0D) / 10D) * -33.7549D);
            zz = -10.0033D + (((tickAnim - 0D) / 10D) * 15.3662D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.0116D + (((tickAnim - 10D) / 10D) * -2.0116D);
            yy = 8.5837D + (((tickAnim - 10D) / 10D) * -21.0837D);
            zz = 5.3629D + (((tickAnim - 10D) / 10D) * -5.3629D);
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 20D) / 20D) * 26.8304D);
            yy = -12.5D + (((tickAnim - 20D) / 20D) * 54.8386D);
            zz = 0D + (((tickAnim - 20D) / 20D) * -10.0033D);
        }


        this.setRotateAngle(rightbackflipper, rightbackflipper.rotateAngleX + (float) Math.toRadians(xx), rightbackflipper.rotateAngleY + (float) Math.toRadians(yy), rightbackflipper.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -2.765D + (((tickAnim - 0D) / 8D) * -48.8361D);
            yy = -4.7221D + (((tickAnim - 0D) / 8D) * 18.541D);
            zz = -13.1212D + (((tickAnim - 0D) / 8D) * 16.3699D);
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -51.6011D + (((tickAnim - 8D) / 8D) * 17.23559D);
            yy = 13.8189D + (((tickAnim - 8D) / 8D) * -17.5517D);
            zz = 3.2487D + (((tickAnim - 8D) / 8D) * 5.9654D);
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -34.36551D + (((tickAnim - 16D) / 9D) * 6.86551D);
            yy = -3.7328D + (((tickAnim - 16D) / 9D) * 3.7328D);
            zz = 9.2141D + (((tickAnim - 16D) / 9D) * -9.2141D);
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -27.5D + (((tickAnim - 25D) / 10D) * 23.66677D);
            yy = 0D + (((tickAnim - 25D) / 10D) * -8.0433D);
            zz = 0D + (((tickAnim - 25D) / 10D) * -21.2951D);
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -3.83323D + (((tickAnim - 35D) / 5D) * 1.06825D);
            yy = -8.0433D + (((tickAnim - 35D) / 5D) * 3.3212D);
            zz = -21.2951D + (((tickAnim - 35D) / 5D) * 8.1739D);
        }


        this.setRotateAngle(flipper2, flipper2.rotateAngleX + (float) Math.toRadians(xx), flipper2.rotateAngleY + (float) Math.toRadians(yy), flipper2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 26.83044D + (((tickAnim - 0D) / 10D) * -24.81881D);
            yy = -42.33858D + (((tickAnim - 0D) / 10D) * 33.75483D);
            zz = 10.00334D + (((tickAnim - 0D) / 10D) * -15.36622D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.01163D + (((tickAnim - 10D) / 10D) * -2.01163D);
            yy = -8.58375D + (((tickAnim - 10D) / 10D) * 21.08375D);
            zz = -5.36288D + (((tickAnim - 10D) / 10D) * 5.36288D);
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 20D) / 20D) * 26.83044D);
            yy = 12.5D + (((tickAnim - 20D) / 20D) * -54.83858D);
            zz = 0D + (((tickAnim - 20D) / 20D) * 10.00334D);
        }


        this.setRotateAngle(leftbackflipper, leftbackflipper.rotateAngleX + (float) Math.toRadians(xx), leftbackflipper.rotateAngleY + (float) Math.toRadians(yy), leftbackflipper.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -2.76498D + (((tickAnim - 0D) / 8D) * -48.83612D);
            yy = 4.7221D + (((tickAnim - 0D) / 8D) * -18.541D);
            zz = 13.12124D + (((tickAnim - 0D) / 8D) * -16.36994D);
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -51.6011D + (((tickAnim - 8D) / 8D) * 17.23559D);
            yy = -13.8189D + (((tickAnim - 8D) / 8D) * 17.55167D);
            zz = -3.2487D + (((tickAnim - 8D) / 8D) * -5.96541D);
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -34.36551D + (((tickAnim - 16D) / 9D) * 6.86551D);
            yy = 3.73277D + (((tickAnim - 16D) / 9D) * -3.73277D);
            zz = -9.21411D + (((tickAnim - 16D) / 9D) * 9.21411D);
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -27.5D + (((tickAnim - 25D) / 10D) * 23.66677D);
            yy = 0D + (((tickAnim - 25D) / 10D) * 8.04335D);
            zz = 0D + (((tickAnim - 25D) / 10D) * 21.29505D);
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -3.83323D + (((tickAnim - 35D) / 5D) * 1.06825D);
            yy = 8.04335D + (((tickAnim - 35D) / 5D) * -3.32125D);
            zz = 21.29505D + (((tickAnim - 35D) / 5D) * -8.17381D);
        }


        this.setRotateAngle(flipper4, flipper4.rotateAngleX + (float) Math.toRadians(xx), flipper4.rotateAngleY + (float) Math.toRadians(yy), flipper4.rotateAngleZ + (float) Math.toRadians(zz));

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        this.body.offsetY = 1.50F;

        this.faceTarget(f3, f4, 5, neck2);
        this.faceTarget(f3, f4, 5, neck3);
        this.faceTarget(f3, f4, 5, neck4);
        this.faceTarget(f3, f4, 5, neck5);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};
        AdvancedModelRenderer[] neckHead = {this.neck, this.neck2, this.neck3, this.neck4, this.neck5, this.head};

        EntityPrehistoricFloraYunguisaurus ee = (EntityPrehistoricFloraYunguisaurus) e;
        float speed = ee.getTravelSpeed()/2F;
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.5F;
        }
        if (!e.isInWater()) {
            speed = speed;
        }

        if (e.isInWater()) {
            if (!ee.getIsFast()) {
                this.chainWave(fishTail, speed * still * 2, 0.035F * still, -1.25, f2, 0.6F * still);
            } else {
                this.chainWave(fishTail, speed * still * 2, 0.025F * still, -1.15, f2, 0.6F * still);
            }

            this.chainSwing(fishTail, speed * still * 2, 0.03F * still, -1.0, f2, 0.8F * still);

            this.swing(body, speed * 0.5F, 0.02F, true, 0, 0, f2, 0.8F);
            this.bob(body, speed * 0.5F, 0.07F, true, f2, 0.8F);

            this.body.offsetZ = this.moveBox(0.25F, 0.1F, false, f2, 1) + 1F;

        }
        else {
            //On land do something...

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(15);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

