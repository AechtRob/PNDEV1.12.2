package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraClaudiosaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelClaudiosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended body3;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
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
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended upperjaw;
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

    public ModelClaudiosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 21.0F, -14.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -7.0F, 8.0F, 8, 7, 10, 0.0F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -5.85F, 18.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 21, 25, -3.5F, -0.9F, -1.0F, 7, 6, 7, 0.0F, false));

        this.body3 = new AdvancedModelRendererExtended(this);
        this.body3.setRotationPoint(0.0F, 0.15F, 6.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0436F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 32, -3.0F, -0.75F, -1.0F, 6, 5, 7, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, 1.0F, 6.0F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 17, -1.5F, -1.5F, -1.0F, 3, 4, 11, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 10.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 7, -1.49F, -1.5F, 0.0F, 3, 3, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.25F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 38, -1.0F, -1.26F, 0.0F, 2, 3, 10, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 39, 28, -0.99F, -0.75F, 0.0F, 2, 2, 10, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0436F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 40, 40, -0.5F, -0.76F, 0.0F, 1, 2, 10, 0.0F, false));

        this.hindlegRx = new AdvancedModelRendererExtended(this);
        this.hindlegRx.setRotationPoint(-3.0F, 1.2F, 2.0F);
        this.body3.addChild(hindlegRx);
        this.setRotateAngle(hindlegRx, 0.0873F, 0.0F, 0.0F);


        this.hindlegR = new AdvancedModelRendererExtended(this);
        this.hindlegR.setRotationPoint(0.0F, 1.0F, 1.5F);
        this.hindlegRx.addChild(hindlegR);
        this.setRotateAngle(hindlegR, 0.0F, -0.3491F, 0.0F);
        this.hindlegR.cubeList.add(new ModelBox(hindlegR, 26, 0, -6.0F, -1.0F, -1.5F, 7, 2, 3, 0.0F, false));

        this.hindlegR2 = new AdvancedModelRendererExtended(this);
        this.hindlegR2.setRotationPoint(-6.0F, -1.0F, -1.5F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.0F, 0.0F, -1.5708F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 17, 20, -7.01F, -0.01F, 0.01F, 7, 2, 3, 0.0F, false));

        this.hindlegR3 = new AdvancedModelRendererExtended(this);
        this.hindlegR3.setRotationPoint(-7.0F, 1.0F, 1.0F);
        this.hindlegR2.addChild(hindlegR3);
        this.setRotateAngle(hindlegR3, -0.6981F, 0.0F, 0.0F);


        this.hindlegR4 = new AdvancedModelRendererExtended(this);
        this.hindlegR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hindlegR3.addChild(hindlegR4);
        this.setRotateAngle(hindlegR4, 0.0F, -1.5708F, 0.0F);
        this.hindlegR4.cubeList.add(new ModelBox(hindlegR4, 16, 51, -7.02F, -3.99F, 0.02F, 8, 7, 0, 0.0F, false));

        this.hindlegLx = new AdvancedModelRendererExtended(this);
        this.hindlegLx.setRotationPoint(3.0F, 1.2F, 2.0F);
        this.body3.addChild(hindlegLx);
        this.setRotateAngle(hindlegLx, 0.0873F, 0.0F, 0.0F);


        this.hindlegL = new AdvancedModelRendererExtended(this);
        this.hindlegL.setRotationPoint(0.0F, 1.0F, 1.5F);
        this.hindlegLx.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 0.3491F, 0.0F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 30, 40, -1.0F, -1.0F, -1.5F, 7, 2, 3, 0.0F, false));

        this.hindlegL2 = new AdvancedModelRendererExtended(this);
        this.hindlegL2.setRotationPoint(6.0F, -1.0F, -1.5F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0F, 0.0F, 1.5708F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 37, 20, 0.01F, -0.01F, 0.01F, 7, 2, 3, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRendererExtended(this);
        this.hindlegL3.setRotationPoint(7.0F, 1.0F, 1.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, -0.6981F, 0.0F, 0.0F);


        this.hindlegL4 = new AdvancedModelRendererExtended(this);
        this.hindlegL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hindlegL3.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, 0.0F, 1.5708F, 0.0F);
        this.hindlegL4.cubeList.add(new ModelBox(hindlegL4, 0, 52, -0.98F, -3.99F, 0.02F, 8, 7, 0, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -5.0F, 8.0F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 42, 0, -2.5F, -1.75F, -4.0F, 5, 4, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 2.25F, -6.0F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 9, -2.0F, -2.5F, 2.0F, 4, 2, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0873F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 44, -1.49F, -1.5F, -4.0F, 3, 3, 5, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 17, 15, 1.25F, -0.5F, -2.0F, 0, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 6, 15, -1.25F, -0.5F, -2.0F, 0, 2, 2, 0.0F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 17, -1.0F, 0.0F, -5.0F, 2, 1, 2, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 48, 52, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 0, -1.5F, -2.0F, -5.0F, 3, 2, 2, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 52, 40, -2.0F, -2.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.forelegR = new AdvancedModelRendererExtended(this);
        this.forelegR.setRotationPoint(-4.0F, -3.0F, 11.0F);
        this.body.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.0F, 0.48F, 0.0F);


        this.forelegRx = new AdvancedModelRendererExtended(this);
        this.forelegRx.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.forelegR.addChild(forelegRx);
        this.setRotateAngle(forelegRx, 0.0F, 0.0F, -0.3491F);
        this.forelegRx.cubeList.add(new ModelBox(forelegRx, 32, 52, -5.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));

        this.forelegR1 = new AdvancedModelRendererExtended(this);
        this.forelegR1.setRotationPoint(-5.0F, -1.0F, -1.0F);
        this.forelegRx.addChild(forelegR1);
        this.setRotateAngle(forelegR1, 0.0F, 0.0F, -1.1781F);


        this.forelegRx2 = new AdvancedModelRendererExtended(this);
        this.forelegRx2.setRotationPoint(0.0F, 1.0F, 1.25F);
        this.forelegR1.addChild(forelegRx2);
        this.forelegRx2.cubeList.add(new ModelBox(forelegRx2, 52, 45, -4.01F, -1.01F, -1.24F, 4, 2, 2, 0.0F, false));

        this.forelegR2 = new AdvancedModelRendererExtended(this);
        this.forelegR2.setRotationPoint(-4.0F, 0.0F, -0.25F);
        this.forelegRx2.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 0.0F, -1.5708F, 0.0F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 0, 7, -4.02F, -1.49F, 0.02F, 4, 3, 0, 0.0F, false));

        this.forelegL = new AdvancedModelRendererExtended(this);
        this.forelegL.setRotationPoint(4.0F, -3.0F, 11.0F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.48F, 0.0F);


        this.forelegLx = new AdvancedModelRendererExtended(this);
        this.forelegLx.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.forelegL.addChild(forelegLx);
        this.setRotateAngle(forelegLx, 0.0F, 0.0F, 0.3491F);
        this.forelegLx.cubeList.add(new ModelBox(forelegLx, 52, 16, -1.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));

        this.forelegL2 = new AdvancedModelRendererExtended(this);
        this.forelegL2.setRotationPoint(5.0F, -1.0F, -1.0F);
        this.forelegLx.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 0.0F, 1.1781F);

        this.forelegLx2 = new AdvancedModelRendererExtended(this);
        this.forelegLx2.setRotationPoint(0.0F, 1.0F, 1.25F);
        this.forelegL2.addChild(forelegLx2);
        this.forelegLx2.cubeList.add(new ModelBox(forelegLx2, 11, 44, 0.01F, -1.01F, -1.24F, 4, 2, 2, 0.0F, false));

        this.forelegL3 = new AdvancedModelRendererExtended(this);
        this.forelegL3.setRotationPoint(4.0F, 0.0F, -0.25F);
        this.forelegLx2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.0F, 1.5708F, 0.0F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 0, 4, 0.02F, -1.49F, 0.02F, 4, 3, 0, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.135f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.offsetZ = -1.4F;
        this.body.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = 1.29F;

        EntityPrehistoricFloraClaudiosaurus Claudiosaurus = (EntityPrehistoricFloraClaudiosaurus) e;

        this.faceTarget(f3, f4, 5, neck2);
        this.faceTarget(f3, f4, 5, head);

        float speed = 0.2F;
        AdvancedModelRenderer[] Tail = {this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Torso = {this.neck2, this.neck};

        AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (!Claudiosaurus.isReallyInWater()) {

            if (f3 == 0.0F || !Claudiosaurus.getIsMoving()) {
                return;
            }

            this.swing(this.forelegRx, speed * 0.4F, 0.6F,false, -0.8F,0.4F, f2, 1F);
            this.swing(this.forelegLx, speed * 0.4F, 0.6F,true, 0.8F,0.4F, f2, 1F);
            this.flap(this.forelegRx, speed * 0.4F, 0.2F,false, -0.8F,0.2F, f2, 1F);
            this.flap(this.forelegLx, speed * 0.4F, 0.2F,true, 0.8F,0.2F, f2, 1F);

            this.swing(this.hindlegL, speed * 0.4F, 0.6F,false, -0.8F,0.4F, f2, 1F);
            this.swing(this.hindlegR, speed * 0.4F, 0.6F,true, 0.8F,0.4F, f2, 1F);
            this.flap(this.hindlegL, speed * 0.4F, 0.2F,false, -0.8F,0.2F, f2, 1F);
            this.flap(this.hindlegR, speed * 0.4F, 0.2F,true, 0.8F,0.2F, f2, 1F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.8F, 0.12F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
        }
        else {
            //Swimming pose:
            this.setRotateAngle(hindlegRx, 0.0F, 0.5236F, 0.0F);
            this.setRotateAngle(hindlegR, 1.2217F, 0.0F, 0.0F);
            this.setRotateAngle(hindlegR2, 0.0F, 0.0F, -0.8727F);
            this.setRotateAngle(hindlegR3, -2.2689F, 0.0F, 0.0F);
            this.setRotateAngle(hindlegR4, 0.0F, 0.3491F, 0.0F);
            this.setRotateAngle(hindlegLx, 0.0F, -0.5236F, 0.0F);
            this.setRotateAngle(hindlegL, 1.2217F, 0.0F, 0.0F);
            this.setRotateAngle(hindlegL2, 0.0F, 0.0F, 0.8727F);
            this.setRotateAngle(hindlegL3, -2.2689F, 0.0F, 0.0F);
            this.setRotateAngle(hindlegL4, 0.0F, -0.3491F, 0.0F);
            this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(forelegR, 0.0F, 1.0472F, 0.0F);
            this.setRotateAngle(forelegRx, 2.2689F, 0.0F, 0.0F);
            this.setRotateAngle(forelegR1, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(forelegRx2, 0.0F, 0.0F, 0.48F);
            this.setRotateAngle(forelegR2, 0.0F, -0.6109F, 0.0F);
            this.setRotateAngle(forelegL, 0.0F, -1.0472F, 0.0F);
            this.setRotateAngle(forelegLx, 2.2689F, 0.0F, 0.0F);
            this.setRotateAngle(forelegL2, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(forelegLx2, 0.0F, 0.0F, -0.48F);
            this.setRotateAngle(forelegL3, 0.0F, 0.6109F, 0.0F);
            this.setRotateAngle(body2, 0.0F, 00F, 0.0F);
            this.setRotateAngle(body3, 0.0F, 00F, 0.0F);
            this.setRotateAngle(tail, 0.0F, 00F, 0.0F);
            this.setRotateAngle(tail2, 0.0F, 00F, 0.0F);
            this.setRotateAngle(tail3, 0.0F, 00F, 0.0F);
            this.setRotateAngle(tail4, 0.0F, 00F, 0.0F);
            this.setRotateAngle(tail5, 0.0F, 00F, 0.0F);
            this.setRotateAngle(neck, 0.0F, 00F, 0.0F);
            this.setRotateAngle(neck2, 0.0F, 00F, 0.0F);
            this.setRotateAngle(head, 0.0F, 00F, 0.0F);
            // ----------

            speed = speed * 2F;

            this.chainWave(Whole, speed, 0.15F, -4.2, f2, 1);
            this.chainWaveExtended(Torso, speed, -0.25F, 3, 1F, f2, 1);
            this.bob(body, speed, 0.15F, false, f2, 1);

            if (f3 == 0.0F) {
                return;
            }

            //this.flap(this.rightleg2, speed * 0.7F, 0.3F,false, 0F,0.5F, f2, 0.7F);
            //this.flap(this.leftleg2, speed * 0.7F, -0.3F,false, 0F,0.5F, f2, 0.7F);

            //this.swing(this.rightarm2, speed * 0.7F, 0.5F,false, 2F,0.5F, f2, 1F);
            //this.swing(this.leftarm2, speed * 0.7F, -0.5F,false, 2F,0.5F, f2, 1F);

            this.chainSwing(Tail, speed, 0.05F, -2, f2, 1);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,-1F);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,-1F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(0), (float) Math.toRadians(-25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
