package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraThanahita;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelThanahita extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer armR3;
    private final AdvancedModelRenderer armL2;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer armR2;
    private final AdvancedModelRenderer armL;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legL7;

    private ModelAnimator animator;

    public ModelThanahita() {
        this.textureWidth = 35;
        this.textureHeight = 35;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 20.5F, -8.0F);
        this.body.cubeList.add(new ModelBox(body, 6, 0, -1.0F, -2.0F, 1.0F, 2, 2, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -2.0F, 1.0F, 3, 0, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 2, 0.5F, -2.5F, 1.0F, 0, 1, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 2, -0.5F, -2.5F, 1.0F, 0, 1, 12, 0.0F, false));

        this.armR3 = new AdvancedModelRenderer(this);
        this.armR3.setRotationPoint(-0.6F, 0.0F, 2.0F);
        this.body.addChild(armR3);
        this.setRotateAngle(armR3, -0.2618F, 0.0F, 0.3491F);
        this.armR3.cubeList.add(new ModelBox(armR3, 0, 5, 0.0F, -0.5F, -1.75F, 0, 4, 2, 0.0F, false));

        this.armL2 = new AdvancedModelRenderer(this);
        this.armL2.setRotationPoint(0.6F, 0.0F, 2.0F);
        this.body.addChild(armL2);
        this.setRotateAngle(armL2, -0.2618F, 0.0F, -0.3491F);
        this.armL2.cubeList.add(new ModelBox(armL2, 0, 5, 0.0F, -0.5F, -1.75F, 0, 4, 2, 0.0F, true));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.75F, -0.5F, 3.25F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, 0.6981F);
        this.legR.cubeList.add(new ModelBox(legR, 20, 22, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.75F, -0.5F, 3.25F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, -0.6981F);
        this.legL.cubeList.add(new ModelBox(legL, 20, 22, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.75F, -0.5F, 5.75F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, 0.6981F);
        this.legR2.cubeList.add(new ModelBox(legR2, 22, 6, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.75F, -0.5F, 5.75F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, -0.6981F);
        this.legL2.cubeList.add(new ModelBox(legL2, 22, 6, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.75F, -0.5F, 8.25F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, 0.6981F);
        this.legR3.cubeList.add(new ModelBox(legR3, 22, 0, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.75F, -0.5F, 8.25F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, -0.6981F);
        this.legL3.cubeList.add(new ModelBox(legL3, 22, 0, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.75F, -0.5F, 10.75F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, 0.5236F);
        this.legR4.cubeList.add(new ModelBox(legR4, 16, 21, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.75F, -0.5F, 10.75F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, -0.5236F);
        this.legL4.cubeList.add(new ModelBox(legL4, 16, 21, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.75F, -0.5F, 13.0F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, 0.5236F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 15, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.75F, -0.5F, 13.0F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, -0.5236F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 15, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.0F, 1.25F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 7, -1.5F, -0.5F, -4.25F, 3, 0, 4, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 0, 7, 0.5F, -1.0F, -4.25F, 0, 1, 4, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 0, 7, -0.5F, -1.0F, -4.25F, 0, 1, 4, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 10, 15, -1.0F, -0.5F, -4.0F, 2, 1, 4, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.9F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 19, 17, -1.0F, -0.75F, -4.0F, 2, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 12, -1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 2, 0, -1.25F, -0.76F, -3.0F, 1, 0, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 2, 0, 0.25F, -0.76F, -3.0F, 1, 0, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 4, 1, -0.5F, -0.25F, -4.01F, 1, 1, 0, 0.0F, false));

        this.armR2 = new AdvancedModelRenderer(this);
        this.armR2.setRotationPoint(-0.35F, 0.5F, -0.75F);
        this.neck.addChild(armR2);
        this.setRotateAngle(armR2, -0.4363F, 0.0F, 0.2182F);
        this.armR2.cubeList.add(new ModelBox(armR2, 10, 13, 0.0F, -0.5F, -1.75F, 0, 4, 2, 0.0F, false));

        this.armL = new AdvancedModelRenderer(this);
        this.armL.setRotationPoint(0.35F, 0.5F, -0.75F);
        this.neck.addChild(armL);
        this.setRotateAngle(armL, -0.4363F, 0.0F, -0.2182F);
        this.armL.cubeList.add(new ModelBox(armL, 10, 13, 0.0F, -0.5F, -1.75F, 0, 4, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.75F, 13.0F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -1.5F, -0.25F, 0.0F, 3, 0, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, 0.5F, -0.75F, 0.0F, 0, 1, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -0.5F, -0.75F, 0.0F, 0, 1, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 15, -0.99F, -0.25F, 0.0F, 2, 2, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 18, 15, -0.49F, 0.5F, 5.5F, 1, 1, 1, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.75F, 1.25F, 2.5F);
        this.tail.addChild(legR6);
        this.setRotateAngle(legR6, 0.4363F, 0.0F, 0.5236F);
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 0, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.75F, 1.25F, 2.5F);
        this.tail.addChild(legL6);
        this.setRotateAngle(legL6, 0.4363F, 0.0F, -0.5236F);
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 0, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, true));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.75F, 1.25F, 5.5F);
        this.tail.addChild(legR7);
        this.setRotateAngle(legR7, 0.48F, 0.0F, 0.2618F);
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 23, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.75F, 1.25F, 5.5F);
        this.tail.addChild(legL7);
        this.setRotateAngle(legL7, 0.48F, 0.0F, -0.2618F);
        this.legL7.cubeList.add(new ModelBox(legL7, 0, 23, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(armL, -0.4363F, 0.0F, -0.2182F);
        this.setRotateAngle(armL2, -0.2618F, 0.0F, -0.3491F);
        this.setRotateAngle(armR2, -0.4363F, 0.0F, 0.2182F);
        this.setRotateAngle(armR3, -0.2618F, 0.0F, 0.3491F);
        this.setRotateAngle(head, 0.2182F, 0.0436F, 0.0F);
        this.setRotateAngle(legL, 0.0F, 0.0F, -0.6981F);
        this.setRotateAngle(legL2, 0.0F, 0.0F, -0.6981F);
        this.setRotateAngle(legL3, 0.0F, 0.0F, -0.6981F);
        this.setRotateAngle(legL4, 0.0F, 0.0F, -0.5236F);
        this.setRotateAngle(legL5, 0.0F, 0.0F, -0.5236F);
        this.setRotateAngle(legL6, 0.4363F, 0.0F, -0.5236F);
        this.setRotateAngle(legL7, 0.48F, 0.0F, -0.2618F);
        this.setRotateAngle(legR, 0.0F, 0.0F, 0.6981F);
        this.setRotateAngle(legR2, 0.0F, 0.0F, 0.6981F);
        this.setRotateAngle(legR3, 0.0F, 0.0F, 0.6981F);
        this.setRotateAngle(legR4, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(legR5, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(legR6, 0.4363F, 0.0F, 0.5236F);
        this.setRotateAngle(legR7, 0.48F, 0.0F, 0.2618F);
        this.setRotateAngle(neck, -0.2182F, 0.1309F, 0.0F);
        this.setRotateAngle(tail, -0.0873F, 0.0873F, 0.0F);
        this.body.offsetY = 0.55F;
        this.body.render(0.01F);
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
        //this.body.offsetY = 1.320F;

        AdvancedModelRenderer[] bodyF = {this.neck, this.head};
        AdvancedModelRenderer[] bodyB = {this.body, this.tail};

        EntityPrehistoricFloraThanahita ee = (EntityPrehistoricFloraThanahita) e;

        if (ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.faceTarget(f3, f4, 6, head);
            this.faceTarget(f3, f4, 10, body);
        }

        float legFlapDegree = 0.3F;
        float legWalkDegree = 0.5F;
        float legSpeed = 0.23F;
        if (f3 != 0.0f || ee.getAnimation() == ee.LOOK_ANIMATION) {
            this.flap(legL, legSpeed, -legFlapDegree, false, 0, -legFlapDegree, f2, 0.3F);
            this.flap(legR, legSpeed, legFlapDegree, false, 2F, legFlapDegree, f2, 0.3F);
            this.flap(legL2, legSpeed, -legFlapDegree, false, 2.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR2, legSpeed, legFlapDegree, false, 4.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL3, legSpeed, -legFlapDegree, false, 4.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR3, legSpeed, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL4, legSpeed, -legFlapDegree, false, 6.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR4, legSpeed, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);
        }
        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.flap(legL5, legSpeed, -legFlapDegree, false, 8.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR5, legSpeed, legFlapDegree, false, 10.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL6, legSpeed * 1.1F, -legFlapDegree, false, 10.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR6, legSpeed * 1.1F, legFlapDegree, false, 12.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL7, legSpeed * 1.2F, -legFlapDegree, false, 12.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR7, legSpeed * 1.2F, legFlapDegree, false, 14.0F, legFlapDegree, f2, 0.3F);
        }

        if (f3 != 0.0f || ee.getAnimation() == ee.LOOK_ANIMATION) {
            this.walk(legL, legSpeed, -legWalkDegree, false, 0, -legWalkDegree, f2, 0.3F);
            this.walk(legR, legSpeed, legWalkDegree, false, 2F, legWalkDegree, f2, 0.3F);
            this.walk(legL2, legSpeed, -legWalkDegree, false, 2.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR2, legSpeed, legWalkDegree, false, 4.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL3, legSpeed, -legWalkDegree, false, 4.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR3, legSpeed, legWalkDegree, false, 6.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL4, legSpeed, -legWalkDegree, false, 6.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR4, legSpeed, legWalkDegree, false, 8.0F, legWalkDegree, f2, 0.3F);
        }
        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.walk(legL5, legSpeed, -legWalkDegree, false, 8.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR5, legSpeed, legWalkDegree, false, 10.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL6, legSpeed * 1.1F, -legWalkDegree * 1.1F, false, 10.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR6, legSpeed * 1.1F, legWalkDegree * 1.1F, false, 12.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL7, legSpeed * 1.2F, -legWalkDegree * 1.2F, false, 12.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR7, legSpeed * 1.2F, legWalkDegree * 1.2F, false, 14.0F, legWalkDegree, f2, 0.3F);
        }

        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.bob(body, 1F, 0.05F, false, f2, 1);
        }
        //this.walk(body6, 0.8F, -0.010f, false, 2, 0.15F, f2, 0.8F);

        if (ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.chainWave(bodyF, legSpeed * 1.25F, 0.4f, -0.8F, f2, 0.4F);
            this.chainSwing(bodyF, legSpeed * 1.25F, 0.25F, 0.8F, f2, 0.45F);
        }

        this.chainSwing(bodyB, 0.085F, 0.25f, 0.1, f2, 0.15F);

        this.walk(armL, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armL, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);
        this.swing(armL, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);

        this.walk(armL2, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armL2, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);
        this.swing(armL2, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);



        this.walk(armR2, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armR2, legSpeed * 1.1F, legWalkDegree * 1.4F, false, 0.0F, legWalkDegree, f2, 0.3F);
        this.swing(armR2, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);

        this.walk(armR3, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armR3, legSpeed * 1.1F, legWalkDegree * 1.4F, false, 1.0F, legWalkDegree, f2, 0.3F);
        this.swing(armR3, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraThanahita e = (EntityPrehistoricFloraThanahita) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.LOOK_ANIMATION);
        animator.startKeyframe(30);
        animator.move(this.body, 0,-1.5F,0);
        animator.rotate(this.tail, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(15);
        animator.move(this.body, 0,-1.5F,0);
        animator.rotate(this.tail, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(12.5), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-17.5), (float) Math.toRadians(7.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(7.5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(15);
        animator.move(this.body, 0,-1.5F,0);
        animator.rotate(this.tail, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(-12.5), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-17.5), (float) Math.toRadians(-7.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(-7.5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(15);
        animator.move(this.body, 0,-1.5F,0);
        animator.rotate(this.tail, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(12.5), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-17.5), (float) Math.toRadians(7.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(7.5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(15);
        animator.move(this.body, 0,-1.5F,0);
        animator.rotate(this.tail, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(-12.5), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-17.5), (float) Math.toRadians(-7.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(-7.5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.resetKeyframe(30);
    }
}
