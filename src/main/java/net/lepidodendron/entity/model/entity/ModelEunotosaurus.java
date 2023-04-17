package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDimetrodon;
import net.lepidodendron.entity.EntityPrehistoricFloraEunotosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEunotosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended body3;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended hindlegRx;
    private final AdvancedModelRendererExtended hindlegR;
    private final AdvancedModelRendererExtended hindlegR2;
    private final AdvancedModelRendererExtended hindlegR3;
    private final AdvancedModelRendererExtended hindlegR4;
    private final AdvancedModelRendererExtended hindlegLx;
    private final AdvancedModelRendererExtended hindlegL;
    private final AdvancedModelRendererExtended hindlegL2;
    private final AdvancedModelRendererExtended hindlegL3;
    private final AdvancedModelRendererExtended hindlegL4;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended forelegR;
    private final AdvancedModelRendererExtended forelegRx;
    private final AdvancedModelRendererExtended forelegR1;
    private final AdvancedModelRendererExtended forelegRx2;
    private final AdvancedModelRendererExtended forelegR2;
    private final AdvancedModelRendererExtended forelegL;
    private final AdvancedModelRendererExtended forelegLx;
    private final AdvancedModelRendererExtended forelegL2;
    private final AdvancedModelRendererExtended forelegLx2;
    private final AdvancedModelRendererExtended forelegL3;

    private ModelAnimator animator;

    public ModelEunotosaurus() {
        this.textureWidth = 80;
        this.textureHeight = 75;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 16.7F, -2.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 19, -4.5F, -3.5F, -4.0F, 9, 6, 7, 0.0F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -0.85F, 1.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -7.0F, -3.3171F, 1.3516F, 14, 8, 10, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 27, 42, -6.0F, -3.3171F, 11.3516F, 12, 8, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 47, 17, -6.0F, -3.3171F, -0.6484F, 12, 8, 2, 0.0F, false));

        this.body3 = new AdvancedModelRendererExtended(this);
        this.body3.setRotationPoint(0.0F, -0.0671F, 10.9516F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0436F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 27, 28, -4.0F, -2.75F, 0.0F, 8, 7, 6, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, 0.4F, 6.0F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 61, 40, -2.5F, -1.5F, -1.0F, 5, 4, 2, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 48, -3.0F, -1.5F, 1.0F, 6, 4, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 7.6F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 34, -1.49F, -1.5F, 0.0F, 3, 3, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.25F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 46, 43, -1.0F, -1.26F, -0.4F, 2, 3, 10, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 49, 0, -0.99F, -0.75F, -1.0F, 2, 2, 10, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0436F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 4.75F, -70.0F);
        this.tail5.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 53, -0.5F, -5.51F, 68.7F, 1, 2, 10, 0.0F, false));

        this.hindlegRx = new AdvancedModelRendererExtended(this);
        this.hindlegRx.setRotationPoint(-3.0F, 2.7F, 5.2F);
        this.body3.addChild(hindlegRx);
        this.setRotateAngle(hindlegRx, 0.0873F, 0.0F, 0.0F);


        this.hindlegR = new AdvancedModelRendererExtended(this);
        this.hindlegR.setRotationPoint(0.0F, -0.2493F, 0.2812F);
        this.hindlegRx.addChild(hindlegR);
        this.setRotateAngle(hindlegR, 0.0F, -0.3491F, 0.0F);
        this.hindlegR.cubeList.add(new ModelBox(hindlegR, 26, 19, -6.1368F, -0.9F, -1.8759F, 7, 2, 3, 0.0F, false));

        this.hindlegR2 = new AdvancedModelRendererExtended(this);
        this.hindlegR2.setRotationPoint(-4.7368F, 0.3F, -0.4759F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.0F, 0.0F, -1.5708F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 56, 34, -3.81F, -1.41F, -1.39F, 5, 2, 3, 0.0F, false));

        this.hindlegR3 = new AdvancedModelRendererExtended(this);
        this.hindlegR3.setRotationPoint(-3.8F, -0.4F, -0.4F);
        this.hindlegR2.addChild(hindlegR3);
        this.setRotateAngle(hindlegR3, -0.6981F, 0.0F, 0.0F);


        this.hindlegR4 = new AdvancedModelRendererExtended(this);
        this.hindlegR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hindlegR3.addChild(hindlegR4);
        this.setRotateAngle(hindlegR4, 0.0F, -1.5708F, 0.0F);
        this.hindlegR4.cubeList.add(new ModelBox(hindlegR4, 0, 65, -4.02F, -2.49F, 0.02F, 5, 4, 0, 0.0F, false));

        this.hindlegLx = new AdvancedModelRendererExtended(this);
        this.hindlegLx.setRotationPoint(3.0F, 2.8F, 5.6F);
        this.body3.addChild(hindlegLx);
        this.setRotateAngle(hindlegLx, 0.0873F, 0.0F, 0.0F);


        this.hindlegL = new AdvancedModelRendererExtended(this);
        this.hindlegL.setRotationPoint(0.0F, 0.0162F, -0.5086F);
        this.hindlegLx.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 0.3491F, 0.0F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 50, 28, -1.0F, -1.3F, -1.5F, 7, 2, 3, 0.0F, false));

        this.hindlegL2 = new AdvancedModelRendererExtended(this);
        this.hindlegL2.setRotationPoint(4.8F, -0.7F, 0.3F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0F, 0.0F, 1.5708F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 51, 57, -0.59F, -1.21F, -1.79F, 5, 2, 3, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRendererExtended(this);
        this.hindlegL3.setRotationPoint(4.4F, -0.2F, -0.8F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, -0.6981F, 0.0F, 0.0F);


        this.hindlegL4 = new AdvancedModelRendererExtended(this);
        this.hindlegL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hindlegL3.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, 0.0F, 1.5708F, 0.0F);
        this.hindlegL4.cubeList.add(new ModelBox(hindlegL4, 11, 66, -0.98F, -2.49F, 0.02F, 5, 4, 0, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 30, 53, -2.5F, -1.75F, -4.0F, 5, 4, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 2.25F, -6.0F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 0, -2.0F, -2.5F, 2.0F, 4, 2, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0436F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 37, 63, -1.49F, -1.5F, -2.0F, 3, 3, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.neck2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 39, -1.0F, -0.8F, -2.0F, 2, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.0436F, 0.0F, 0.0F);


        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.0175F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 38, 0.95F, -1.3F, -2.0F, 0, 2, 2, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 5, 36, -0.95F, -1.3F, -2.0F, 0, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.lowerjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 13, -1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.lowerjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 19, -0.5F, -0.8F, -2.1F, 1, 1, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 66, -1.0F, -0.8F, -1.5F, 2, 1, 3, 0.0F, false));

        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(upperjaw);


        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1396F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 64, 5, -2.0F, -0.5F, -1.8F, 4, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.0F, -3.6F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.4399F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 34, -0.5F, -0.148F, -0.9731F, 2, 2, 1, -0.03F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-0.5F, -1.9F, -4.4F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.9861F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 23, -0.5F, 0.1067F, -0.1261F, 2, 1, 1, -0.01F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.8F, -5.0F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.9861F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 33, 25, -0.5F, -0.5007F, -0.7122F, 2, 1, 1, -0.02F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.3F, -5.6F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5672F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 34, -0.5F, -1.1541F, -0.8995F, 2, 1, 1, -0.01F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1222F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 50, 63, -1.5F, -1.2F, -2.5F, 3, 2, 3, 0.0F, false));

        this.forelegR = new AdvancedModelRendererExtended(this);
        this.forelegR.setRotationPoint(-3.7F, 1.9F, -2.0F);
        this.body.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.0F, 0.48F, 0.0F);


        this.forelegRx = new AdvancedModelRendererExtended(this);
        this.forelegRx.setRotationPoint(0.1033F, 0.1F, 0.1519F);
        this.forelegR.addChild(forelegRx);
        this.setRotateAngle(forelegRx, 0.0F, 0.0F, -0.3491F);
        this.forelegRx.cubeList.add(new ModelBox(forelegRx, 0, 60, -5.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));

        this.forelegR1 = new AdvancedModelRendererExtended(this);
        this.forelegR1.setRotationPoint(-4.4F, -0.3F, 0.0F);
        this.forelegRx.addChild(forelegR1);
        this.setRotateAngle(forelegR1, 0.0F, 0.0F, -1.1781F);


        this.forelegRx2 = new AdvancedModelRendererExtended(this);
        this.forelegRx2.setRotationPoint(0.3171F, 0.1778F, 0.05F);
        this.forelegR1.addChild(forelegRx2);
        this.forelegRx2.cubeList.add(new ModelBox(forelegRx2, 63, 63, -3.91F, -1.01F, -1.04F, 4, 2, 2, 0.0F, false));

        this.forelegR2 = new AdvancedModelRendererExtended(this);
        this.forelegR2.setRotationPoint(-3.9F, 0.0F, -0.05F);
        this.forelegRx2.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 0.0F, -1.5708F, 0.0F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 0, 0, -4.02F, -1.49F, 0.02F, 4, 3, 0, 0.0F, false));

        this.forelegL = new AdvancedModelRendererExtended(this);
        this.forelegL.setRotationPoint(4.0F, 2.0F, -1.6F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.48F, 0.0F);


        this.forelegLx = new AdvancedModelRendererExtended(this);
        this.forelegLx.setRotationPoint(-0.5541F, 0.0F, -0.0644F);
        this.forelegL.addChild(forelegLx);
        this.setRotateAngle(forelegLx, 0.0F, 0.0F, 0.3491F);
        this.forelegLx.cubeList.add(new ModelBox(forelegLx, 61, 47, -1.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));

        this.forelegL2 = new AdvancedModelRendererExtended(this);
        this.forelegL2.setRotationPoint(4.3F, -0.5F, -0.1F);
        this.forelegLx.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 0.0F, 1.1781F);


        this.forelegLx2 = new AdvancedModelRendererExtended(this);
        this.forelegLx2.setRotationPoint(-0.0941F, 0.1619F, 0.05F);
        this.forelegL2.addChild(forelegLx2);
        this.forelegLx2.cubeList.add(new ModelBox(forelegLx2, 64, 0, -0.09F, -1.01F, -0.94F, 4, 2, 2, 0.0F, false));

        this.forelegL3 = new AdvancedModelRendererExtended(this);
        this.forelegL3.setRotationPoint(3.9F, 0.0F, 0.05F);
        this.forelegLx2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.0F, 1.5708F, 0.0F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 0, 4, 0.02F, -1.49F, 0.02F, 4, 3, 0, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
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
        //this.Hips.offsetY = 0.013F;

        EntityPrehistoricFloraEunotosaurus euno = (EntityPrehistoricFloraEunotosaurus) e;
        float masterSpeed = euno.getTravelSpeed();

        this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 5, neck2);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        euno.tailBuffer.applyChainSwingBuffer(Tail);

        if (euno.getAnimation() == euno.LAY_ANIMATION) {
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.5F * 2, 0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !euno.getIsMoving()) { //Not moving
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            //this.chainWave(Tail, (0.06F*0.9F), -0.06F, -0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.225F;
        if (euno.getIsFast()) {
            speed = speed * 2;
        }

        this.forelegL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.forelegR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.hindlegL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.hindlegR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(forelegL, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(forelegR, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(hindlegL, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(hindlegR, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(forelegL, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(forelegR, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(hindlegL, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(hindlegR, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(forelegL2, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(forelegR1, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(hindlegL2, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(hindlegR2, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(forelegL2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(forelegR1, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(hindlegL2, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(hindlegR2, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(forelegL3, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(forelegR2, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(hindlegL4, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(hindlegR4, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.swing(body2, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);


        //this.chainWave(Tail, (speed*0.6F), -0.085F, -0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEunotosaurus e = (EntityPrehistoricFloraEunotosaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.head, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
