package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCarbotubulus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCarbotubulus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer legright6;
    private final AdvancedModelRenderer legleft6;
    private final AdvancedModelRenderer legright7;
    private final AdvancedModelRenderer legleft7;
    private final AdvancedModelRenderer legright8;
    private final AdvancedModelRenderer legleft8;
    private final AdvancedModelRenderer legright9;
    private final AdvancedModelRenderer legleft9;

    private ModelAnimator animator;

    public ModelCarbotubulus() {
        this.textureWidth = 32;
        this.textureHeight = 40;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 20.0F, -8.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -2.0F, 3.0F, 3, 2, 11, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-1.0F, -0.5F, 5.0F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, 0.0F, 0.0F, 0.6981F);
        this.legright.cubeList.add(new ModelBox(legright, 4, 27, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.0F, -0.5F, 5.0F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, 0.0F, -0.6981F);
        this.legleft.cubeList.add(new ModelBox(legleft, 4, 27, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-1.0F, -0.5F, 7.0F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, 0.0F, 0.6981F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 27, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(1.0F, -0.5F, 7.0F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.0F, -0.6981F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 27, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-1.0F, -0.5F, 9.0F);
        this.body.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, 0.0F, 0.6981F);
        this.legright3.cubeList.add(new ModelBox(legright3, 26, 13, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(1.0F, -0.5F, 9.0F);
        this.body.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, 0.0F, -0.6981F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 26, 13, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-1.0F, -0.5F, 11.0F);
        this.body.addChild(legright4);
        this.setRotateAngle(legright4, 0.0F, 0.0F, 0.6981F);
        this.legright4.cubeList.add(new ModelBox(legright4, 24, 23, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(1.0F, -0.5F, 11.0F);
        this.body.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, 0.0F, -0.6981F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 24, 23, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, true));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-1.0F, -0.5F, 13.0F);
        this.body.addChild(legright5);
        this.setRotateAngle(legright5, 0.0F, 0.0F, 0.6981F);
        this.legright5.cubeList.add(new ModelBox(legright5, 20, 23, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(1.0F, -0.5F, 13.0F);
        this.body.addChild(legleft5);
        this.setRotateAngle(legleft5, 0.0F, 0.0F, -0.6981F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 20, 23, -0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.1745F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 12, 15, -1.0F, -1.0F, -5.75F, 2, 2, 6, -0.01F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-0.6F, 0.4F, -1.5F);
        this.neck.addChild(armright);
        this.setRotateAngle(armright, 0.1309F, 0.0F, 0.8727F);
        this.armright.cubeList.add(new ModelBox(armright, 6, 18, 0.0F, 0.25F, -2.75F, 0, 6, 3, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(0.6F, 0.4F, -1.5F);
        this.neck.addChild(armleft);
        this.setRotateAngle(armleft, 0.1309F, 0.0F, -0.8727F);
        this.armleft.cubeList.add(new ModelBox(armleft, 6, 18, 0.0F, 0.25F, -2.75F, 0, 6, 3, 0.0F, true));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-0.6F, 0.4F, -2.5F);
        this.neck.addChild(armright2);
        this.setRotateAngle(armright2, -0.0873F, 0.0F, 0.9599F);
        this.armright2.cubeList.add(new ModelBox(armright2, 0, 18, 0.0F, 0.25F, -2.75F, 0, 6, 3, 0.0F, false));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(0.6F, 0.4F, -2.5F);
        this.neck.addChild(armleft2);
        this.setRotateAngle(armleft2, -0.0873F, 0.0F, -0.9599F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 0, 18, 0.0F, 0.25F, -2.75F, 0, 6, 3, 0.0F, true));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(-0.6F, 0.4F, -3.5F);
        this.neck.addChild(armright3);
        this.setRotateAngle(armright3, -0.3927F, 0.0F, 1.0908F);
        this.armright3.cubeList.add(new ModelBox(armright3, 0, 0, 0.0F, 0.25F, -2.75F, 0, 6, 3, 0.0F, false));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(0.6F, 0.4F, -3.5F);
        this.neck.addChild(armleft3);
        this.setRotateAngle(armleft3, -0.3927F, 0.0F, -1.0908F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 0, 0, 0.0F, 0.25F, -2.75F, 0, 6, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.25F, -5.45F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 17, 0, -1.0F, -0.75F, -4.0F, 2, 2, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.25F, -0.76F, -3.0F, 1, 0, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 0.25F, -0.76F, -3.0F, 1, 0, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 2, 2, -0.5F, -0.25F, -4.01F, 1, 1, 0, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.75F, 13.75F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 13, -1.5F, -0.25F, 0.0F, 3, 2, 5, 0.01F, false));

        this.legright6 = new AdvancedModelRenderer(this);
        this.legright6.setRotationPoint(-1.5F, 1.5F, 1.0F);
        this.tail.addChild(legright6);
        this.setRotateAngle(legright6, 0.2618F, 0.0F, 0.8901F);
        this.legright6.cubeList.add(new ModelBox(legright6, 22, 13, -0.5F, -0.5F, -0.5F, 1, 6, 1, 0.0F, false));
        this.legright6.cubeList.add(new ModelBox(legright6, 6, 0, -0.5F, -0.5F, 0.0F, 1, 6, 1, -0.01F, false));
        this.legright6.cubeList.add(new ModelBox(legright6, 0, 0, 0.0F, 5.5F, -0.25F, 0, 1, 1, 0.0F, false));

        this.legleft6 = new AdvancedModelRenderer(this);
        this.legleft6.setRotationPoint(1.5F, 1.5F, 1.0F);
        this.tail.addChild(legleft6);
        this.setRotateAngle(legleft6, 0.2618F, 0.0F, -0.8901F);
        this.legleft6.cubeList.add(new ModelBox(legleft6, 22, 13, -0.5F, -0.5F, -0.5F, 1, 6, 1, 0.0F, true));
        this.legleft6.cubeList.add(new ModelBox(legleft6, 6, 0, -0.5F, -0.5F, 0.0F, 1, 6, 1, -0.01F, true));
        this.legleft6.cubeList.add(new ModelBox(legleft6, 0, 0, 0.0F, 5.5F, -0.25F, 0, 1, 1, 0.0F, true));

        this.legright7 = new AdvancedModelRenderer(this);
        this.legright7.setRotationPoint(-1.5F, 1.5F, 2.5F);
        this.tail.addChild(legright7);
        this.setRotateAngle(legright7, 0.4363F, 0.0F, 0.9599F);
        this.legright7.cubeList.add(new ModelBox(legright7, 16, 23, -0.5F, -0.5F, -0.5F, 1, 6, 1, 0.0F, false));
        this.legright7.cubeList.add(new ModelBox(legright7, 12, 23, -0.5F, -0.5F, 0.0F, 1, 6, 1, -0.01F, false));
        this.legright7.cubeList.add(new ModelBox(legright7, 0, 1, 0.0F, 5.5F, -0.25F, 0, 1, 1, 0.0F, false));

        this.legleft7 = new AdvancedModelRenderer(this);
        this.legleft7.setRotationPoint(1.5F, 1.5F, 2.5F);
        this.tail.addChild(legleft7);
        this.setRotateAngle(legleft7, 0.4363F, 0.0F, -0.9599F);
        this.legleft7.cubeList.add(new ModelBox(legleft7, 16, 23, -0.5F, -0.5F, -0.5F, 1, 6, 1, 0.0F, true));
        this.legleft7.cubeList.add(new ModelBox(legleft7, 12, 23, -0.5F, -0.5F, 0.0F, 1, 6, 1, -0.01F, true));
        this.legleft7.cubeList.add(new ModelBox(legleft7, 0, 1, 0.0F, 5.5F, -0.25F, 0, 1, 1, 0.0F, true));

        this.legright8 = new AdvancedModelRenderer(this);
        this.legright8.setRotationPoint(-1.5F, 1.5F, 4.0F);
        this.tail.addChild(legright8);
        this.setRotateAngle(legright8, 0.6545F, 0.0F, 0.9599F);
        this.legright8.cubeList.add(new ModelBox(legright8, 16, 23, -0.5F, -0.5F, -0.5F, 1, 6, 1, 0.0F, false));
        this.legright8.cubeList.add(new ModelBox(legright8, 12, 23, -0.5F, -0.5F, 0.0F, 1, 6, 1, -0.01F, false));
        this.legright8.cubeList.add(new ModelBox(legright8, 0, 1, 0.0F, 5.5F, -0.25F, 0, 1, 1, 0.0F, false));

        this.legleft8 = new AdvancedModelRenderer(this);
        this.legleft8.setRotationPoint(1.5F, 1.5F, 4.0F);
        this.tail.addChild(legleft8);
        this.setRotateAngle(legleft8, 0.6545F, 0.0F, -0.9599F);
        this.legleft8.cubeList.add(new ModelBox(legleft8, 16, 23, -0.5F, -0.5F, -0.5F, 1, 6, 1, 0.0F, true));
        this.legleft8.cubeList.add(new ModelBox(legleft8, 12, 23, -0.5F, -0.5F, 0.0F, 1, 6, 1, -0.01F, true));
        this.legleft8.cubeList.add(new ModelBox(legleft8, 0, 1, 0.0F, 5.5F, -0.25F, 0, 1, 1, 0.0F, true));

        this.legright9 = new AdvancedModelRenderer(this);
        this.legright9.setRotationPoint(-1.0F, 1.0F, 5.0F);
        this.tail.addChild(legright9);
        this.setRotateAngle(legright9, 0.9163F, -0.3491F, 0.0F);
        this.legright9.cubeList.add(new ModelBox(legright9, 28, 5, -0.5F, -0.5F, -0.5F, 1, 5, 1, 0.0F, false));
        this.legright9.cubeList.add(new ModelBox(legright9, 8, 27, 0.0F, -0.5F, -0.5F, 1, 5, 1, -0.01F, false));
        this.legright9.cubeList.add(new ModelBox(legright9, 2, 1, -0.25F, 4.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legleft9 = new AdvancedModelRenderer(this);
        this.legleft9.setRotationPoint(1.0F, 1.0F, 5.0F);
        this.tail.addChild(legleft9);
        this.setRotateAngle(legleft9, 0.9163F, 0.3491F, 0.0F);
        this.legleft9.cubeList.add(new ModelBox(legleft9, 28, 5, -0.5F, -0.5F, -0.5F, 1, 5, 1, 0.0F, true));
        this.legleft9.cubeList.add(new ModelBox(legleft9, 8, 27, -1.0F, -0.5F, -0.5F, 1, 5, 1, -0.01F, true));
        this.legleft9.cubeList.add(new ModelBox(legleft9, 2, 1, -0.75F, 4.5F, 0.0F, 1, 1, 0, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.body.offsetY = 0.55F;
        this.body.render(0.01F);
        resetToDefaultPose();

    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.0F;
        this.body.offsetX = -1.338F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 1.63F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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

        EntityPrehistoricFloraCarbotubulus ee = (EntityPrehistoricFloraCarbotubulus) e;

        if (ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.faceTarget(f3, f4, 6, head);
            this.faceTarget(f3, f4, 10, body);
        }

        float legFlapDegree = 0.3F;
        float legWalkDegree = 0.5F;
        float legSpeed = 0.23F;
        if (f3 != 0.0f || ee.getAnimation() == ee.LOOK_ANIMATION) {
            this.flap(legleft, legSpeed, -legFlapDegree, false, 0, -legFlapDegree, f2, 0.3F);
            this.flap(legright, legSpeed, legFlapDegree, false, 2F, legFlapDegree, f2, 0.3F);
            this.flap(legleft2, legSpeed, -legFlapDegree, false, 2.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legright2, legSpeed, legFlapDegree, false, 4.0F, legFlapDegree, f2, 0.3F);
            this.flap(legleft3, legSpeed, -legFlapDegree, false, 4.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legright3, legSpeed, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);
            this.flap(legleft4, legSpeed, -legFlapDegree, false, 6.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legright4, legSpeed, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);
        }
        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.flap(legleft5, legSpeed, -legFlapDegree, false, 8.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legright5, legSpeed, legFlapDegree, false, 10.0F, legFlapDegree, f2, 0.3F);
            this.flap(legleft6, legSpeed * 1.1F, -legFlapDegree, false, 10.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legright6, legSpeed * 1.1F, legFlapDegree, false, 12.0F, legFlapDegree, f2, 0.3F);
            this.flap(legleft7, legSpeed * 1.2F, -legFlapDegree, false, 12.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legright7, legSpeed * 1.2F, legFlapDegree, false, 14.0F, legFlapDegree, f2, 0.3F);
            this.flap(legleft8, legSpeed * 1.2F, -legFlapDegree, false, 14.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legright8, legSpeed * 1.2F, legFlapDegree, false, 16.0F, legFlapDegree, f2, 0.3F);
            this.flap(legleft9, legSpeed * 1.2F, -legFlapDegree, false, 16.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legright9, legSpeed * 1.2F, legFlapDegree, false, 18.0F, legFlapDegree, f2, 0.3F);
        }

        if (f3 != 0.0f || ee.getAnimation() == ee.LOOK_ANIMATION) {
            this.walk(legleft, legSpeed, -legWalkDegree, false, 0, -legWalkDegree, f2, 0.3F);
            this.walk(legright, legSpeed, legWalkDegree, false, 2F, legWalkDegree, f2, 0.3F);
            this.walk(legleft2, legSpeed, -legWalkDegree, false, 2.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legright2, legSpeed, legWalkDegree, false, 4.0F, legWalkDegree, f2, 0.3F);
            this.walk(legleft3, legSpeed, -legWalkDegree, false, 4.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legright3, legSpeed, legWalkDegree, false, 6.0F, legWalkDegree, f2, 0.3F);
            this.walk(legleft4, legSpeed, -legWalkDegree, false, 6.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legright4, legSpeed, legWalkDegree, false, 8.0F, legWalkDegree, f2, 0.3F);
        }
        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.walk(legleft5, legSpeed, -legWalkDegree, false, 8.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legright5, legSpeed, legWalkDegree, false, 10.0F, legWalkDegree, f2, 0.3F);
            this.walk(legleft6, legSpeed * 1.1F, -legWalkDegree * 1.1F, false, 10.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legright6, legSpeed * 1.1F, legWalkDegree * 1.1F, false, 12.0F, legWalkDegree, f2, 0.3F);
            this.walk(legleft7, legSpeed * 1.2F, -legWalkDegree * 1.2F, false, 12.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legright7, legSpeed * 1.2F, legWalkDegree * 1.2F, false, 14.0F, legWalkDegree, f2, 0.3F);
            this.walk(legleft8, legSpeed * 1.2F, -legWalkDegree * 1.2F, false, 14.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legright8, legSpeed * 1.2F, legWalkDegree * 1.2F, false, 16.0F, legWalkDegree, f2, 0.3F);
            this.walk(legleft9, legSpeed * 1.2F, -legWalkDegree * 1.2F, false, 16.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legright9, legSpeed * 1.2F, legWalkDegree * 1.2F, false, 18.0F, legWalkDegree, f2, 0.3F);
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

        this.walk(armleft, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armleft, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);
        this.swing(armleft, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);

        this.walk(armleft2, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armleft2, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);
        this.swing(armleft2, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);

        this.walk(armleft3, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armleft3, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);
        this.swing(armleft3, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);



        this.walk(armright, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armright, legSpeed * 1.1F, legWalkDegree * 1.4F, false, 0.0F, legWalkDegree, f2, 0.3F);
        this.swing(armright, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);

        this.walk(armright2, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armright2, legSpeed * 1.1F, legWalkDegree * 1.4F, false, 1.0F, legWalkDegree, f2, 0.3F);
        this.swing(armright2, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);

        this.walk(armright3, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armright3, legSpeed * 1.1F, legWalkDegree * 1.4F, false, 1.0F, legWalkDegree, f2, 0.3F);
        this.swing(armright3, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCarbotubulus e = (EntityPrehistoricFloraCarbotubulus) entity;
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
