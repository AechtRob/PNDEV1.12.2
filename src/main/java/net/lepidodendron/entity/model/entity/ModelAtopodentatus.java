package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAtopodentatus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAtopodentatus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer leg1;
    private final AdvancedModelRenderer lrgpiece1;
    private final AdvancedModelRenderer legfinger1;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer lrgpiece2;
    private final AdvancedModelRenderer legfinger2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer arm1;
    private final AdvancedModelRenderer armpiece1;
    private final AdvancedModelRenderer arm1finger1;
    private final AdvancedModelRenderer arm2;
    private final AdvancedModelRenderer armpiece2;
    private final AdvancedModelRenderer arm1finger2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;


    private ModelAnimator animator;

    public ModelAtopodentatus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 21.0F, 33.0F);
        this.hip.cubeList.add(new ModelBox(hip, 80, 36, -6.0F, -4.75F, -1.0F, 12, 12, 8, 0.0F, false));

        this.leg1 = new AdvancedModelRenderer(this);
        this.leg1.setRotationPoint(5.5F, 2.0F, 4.0F);
        this.hip.addChild(leg1);
        this.setRotateAngle(leg1, 0.0F, -0.6109F, 0.6109F);
        this.leg1.cubeList.add(new ModelBox(leg1, 0, 19, -2.0F, -1.0F, -2.0F, 10, 3, 4, 0.0F, false));

        this.lrgpiece1 = new AdvancedModelRenderer(this);
        this.lrgpiece1.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.leg1.addChild(lrgpiece1);
        this.setRotateAngle(lrgpiece1, 0.0F, -0.6981F, 0.2618F);
        this.lrgpiece1.cubeList.add(new ModelBox(lrgpiece1, 0, 12, -1.0F, -0.5F, -2.5F, 8, 2, 5, 0.0F, false));

        this.legfinger1 = new AdvancedModelRenderer(this);
        this.legfinger1.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.lrgpiece1.addChild(legfinger1);
        this.setRotateAngle(legfinger1, 0.0F, -0.2182F, 0.3491F);
        this.legfinger1.cubeList.add(new ModelBox(legfinger1, 58, 23, 0.0F, 0.0F, -3.0F, 10, 1, 6, 0.0F, false));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(-5.5F, 2.0F, 4.0F);
        this.hip.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, 0.6109F, -0.6109F);
        this.leg2.cubeList.add(new ModelBox(leg2, 0, 19, -8.0F, -1.0F, -2.0F, 10, 3, 4, 0.0F, true));

        this.lrgpiece2 = new AdvancedModelRenderer(this);
        this.lrgpiece2.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.leg2.addChild(lrgpiece2);
        this.setRotateAngle(lrgpiece2, 0.0F, 0.6981F, -0.2618F);
        this.lrgpiece2.cubeList.add(new ModelBox(lrgpiece2, 0, 12, -7.0F, -0.5F, -2.5F, 8, 2, 5, 0.0F, true));

        this.legfinger2 = new AdvancedModelRenderer(this);
        this.legfinger2.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.lrgpiece2.addChild(legfinger2);
        this.setRotateAngle(legfinger2, 0.0F, 0.2182F, -0.3491F);
        this.legfinger2.cubeList.add(new ModelBox(legfinger2, 58, 23, -10.0F, 0.0F, -3.0F, 10, 1, 6, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.hip.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 44, -3.5F, -4.0F, -1.0F, 7, 10, 18, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 17.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 50, 44, -2.5F, -3.0F, -1.0F, 5, 7, 18, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.0F, 17.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 58, 0, -1.5F, -3.0F, -1.0F, 3, 4, 19, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.0F, 18.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 66, 71, -1.0F, -1.0F, -1.0F, 2, 2, 19, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hip.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -7.0F, -5.0F, -30.0F, 14, 14, 30, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.0F, -30.0F);
        this.body2.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 39, 69, -6.0F, -5.25F, -10.0F, 12, 10, 11, 0.0F, false));

        this.arm1 = new AdvancedModelRenderer(this);
        this.arm1.setRotationPoint(4.75F, 2.0F, -4.0F);
        this.body.addChild(arm1);
        this.setRotateAngle(arm1, 0.0F, -0.5236F, 0.6109F);
        this.arm1.cubeList.add(new ModelBox(arm1, 26, 72, 0.0F, -1.0F, -2.0F, 8, 3, 4, 0.0F, false));

        this.armpiece1 = new AdvancedModelRenderer(this);
        this.armpiece1.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.arm1.addChild(armpiece1);
        this.setRotateAngle(armpiece1, 0.0F, 0.3491F, 0.0F);
        this.armpiece1.cubeList.add(new ModelBox(armpiece1, 78, 56, -1.0F, -0.5F, -1.5F, 7, 2, 3, 0.0F, false));

        this.arm1finger1 = new AdvancedModelRenderer(this);
        this.arm1finger1.setRotationPoint(6.0F, -1.0F, -1.0F);
        this.armpiece1.addChild(arm1finger1);
        this.setRotateAngle(arm1finger1, 0.0F, -0.5236F, 0.0F);
        this.arm1finger1.cubeList.add(new ModelBox(arm1finger1, 0, 72, 0.0F, 1.0F, -1.5F, 8, 1, 5, 0.0F, false));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(-4.75F, 2.0F, -4.0F);
        this.body.addChild(arm2);
        this.setRotateAngle(arm2, 0.0F, 0.5236F, -0.6109F);
        this.arm2.cubeList.add(new ModelBox(arm2, 26, 72, -8.0F, -1.0F, -2.0F, 8, 3, 4, 0.0F, true));

        this.armpiece2 = new AdvancedModelRenderer(this);
        this.armpiece2.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.arm2.addChild(armpiece2);
        this.setRotateAngle(armpiece2, 0.0F, -0.3491F, 0.0F);
        this.armpiece2.cubeList.add(new ModelBox(armpiece2, 78, 56, -6.0F, -0.5F, -1.5F, 7, 2, 3, 0.0F, true));

        this.arm1finger2 = new AdvancedModelRenderer(this);
        this.arm1finger2.setRotationPoint(-6.0F, -1.0F, -1.0F);
        this.armpiece2.addChild(arm1finger2);
        this.setRotateAngle(arm1finger2, 0.0F, 0.5236F, 0.0F);
        this.arm1finger2.cubeList.add(new ModelBox(arm1finger2, 0, 72, -8.0F, 1.0F, -1.5F, 8, 1, 5, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.0F, -10.0F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 32, 44, -3.5F, -2.5F, -8.0F, 7, 5, 9, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.neck.addChild(neck3);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 0, -3.0F, -1.0F, -7.0F, 6, 4, 8, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, -7.0F);
        this.neck3.addChild(head);


        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 51, -2.5F, -1.0F, -4.0F, 5, 1, 4, 0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 58, 0, -2.0F, -1.0F, -6.0F, 4, 1, 2, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 55, 49, -2.0F, -2.6958F, -1.3541F, 4, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.073F, -7.6058F);
        this.upperjaw.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0611F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 29, -4.0F, -0.5F, 0.0F, 8, 1, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.0F, -6.0F);
        this.upperjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 58, -4.0F, -0.1F, -2.0F, 8, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.4F, -4.1F);
        this.upperjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 5, -1.5F, 0.9961F, -1.0668F, 3, 1, 1, -0.002F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 26, -1.5F, -0.0039F, -3.0668F, 3, 1, 3, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.7F, -1.5F);
        this.upperjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 55, 44, -1.5F, 0.0956F, -2.6784F, 3, 2, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.25F, 9.0F);
        this.upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.7F, -2.75F, -12.4F, 1, 2, 3, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 0, -1.7F, -2.75F, -12.4F, 1, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 78, -2.0F, 0.0F, -6.0F, 4, 1, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 57, -2.0F, -1.0F, -2.0F, 4, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.3463F, -7.5621F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 56, -4.0F, -0.5F, 0.0F, 8, 1, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 26, -4.0F, 0.0F, -1.8F, 8, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.0F, -6.0F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 44, -1.5F, -1.0F, 0.0F, 3, 1, 6, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = -1.0F;
        this.hip.offsetX = 0.1F;
        this.hip.rotateAngleY = (float)Math.toRadians(120);
        this.hip.rotateAngleX = (float)Math.toRadians(1);
        this.hip.rotateAngleZ = (float)Math.toRadians(0);
        this.hip.scaleChildren = true;
        float scaler = 0.8F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hip, 0.2F, 3.8F, 0.0F);
        this.setRotateAngle(arm1, 0.0F, -0.8727F, 0.6109F);
        this.setRotateAngle(arm1finger1, 0.0F, -0.5236F, 0.0F);
        this.setRotateAngle(arm1finger2, 0.0F, 0.5236F, 0.0F);
        this.setRotateAngle(arm2, 0.0F, 0.8727F, -0.6109F);
        this.setRotateAngle(armpiece1, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(armpiece2, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0611F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(leg1, 0.0F, -0.6109F, 0.6109F);
        this.setRotateAngle(leg2, 0.0F, 0.6109F, -0.6109F);
        this.setRotateAngle(legfinger1, 0.0F, -0.2182F, 0.3491F);
        this.setRotateAngle(legfinger2, 0.0F, 0.2182F, -0.3491F);
        this.setRotateAngle(lrgpiece1, 0.0F, -0.6981F, 0.2618F);
        this.setRotateAngle(lrgpiece2, 0.0F, 0.6981F, -0.2618F);
        this.setRotateAngle(neck, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(neck3, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.5236F, 0.0F);
        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(arm1, 0.0F, -0.8727F, 0.6109F);
        this.setRotateAngle(arm1finger1, 0.0F, -0.5236F, 0.0F);
        this.setRotateAngle(arm1finger2, 0.0F, 0.5236F, 0.0F);
        this.setRotateAngle(arm2, 0.0F, 0.8727F, -0.6109F);
        this.setRotateAngle(armpiece1, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(armpiece2, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0611F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(hip, 0.9163F, 0.2618F, 0.0873F);
        this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(leg1, 0.0F, -0.6109F, 0.6109F);
        this.setRotateAngle(leg2, 0.0F, 0.6109F, -0.6109F);
        this.setRotateAngle(legfinger1, 0.0F, -0.2182F, 0.3491F);
        this.setRotateAngle(legfinger2, 0.0F, 0.2182F, -0.3491F);
        this.setRotateAngle(lrgpiece1, 0.0F, -0.6981F, 0.2618F);
        this.setRotateAngle(lrgpiece2, 0.0F, 0.6981F, -0.2618F);
        this.setRotateAngle(neck, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(neck3, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.5236F, 0.0F);
        this.hip.offsetY = -0.9F;
        this.hip.offsetZ = -0.3F;
        this.hip.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(arm1, 0.0F, -0.8727F, 0.6109F);
        this.setRotateAngle(arm1finger1, 0.0F, -0.5236F, 0.0F);
        this.setRotateAngle(arm1finger2, 0.0F, 0.5236F, 0.0F);
        this.setRotateAngle(arm2, 0.0F, 0.8727F, -0.6109F);
        this.setRotateAngle(armpiece1, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(armpiece2, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0611F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(hip, 0.4163F, 0.2618F, 0.0873F);
        this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(leg1, 0.0F, -0.6109F, 0.6109F);
        this.setRotateAngle(leg2, 0.0F, 0.6109F, -0.6109F);
        this.setRotateAngle(legfinger1, 0.0F, -0.2182F, 0.3491F);
        this.setRotateAngle(legfinger2, 0.0F, 0.2182F, -0.3491F);
        this.setRotateAngle(lrgpiece1, 0.0F, -0.6981F, 0.2618F);
        this.setRotateAngle(lrgpiece2, 0.0F, 0.6981F, -0.2618F);
        this.setRotateAngle(neck, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(neck3, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.5236F, 0.0F);
        this.hip.offsetY = 0.2F;
        this.hip.offsetZ = -0.3F;
        this.hip.render(0.01F);
        resetToDefaultPose();
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
        EntityPrehistoricFloraAtopodentatus ee = (EntityPrehistoricFloraAtopodentatus) entitylivingbaseIn;
        if (!ee.isInWater()) {
            this.leg1.rotateAngleZ = (float)Math.toRadians(-15);
            this.leg2.rotateAngleZ = (float)Math.toRadians(15);
            this.legfinger1.rotateAngleZ = (float)Math.toRadians(-5);
            this.legfinger2.rotateAngleZ = (float)Math.toRadians(5);
            this.tail.rotateAngleX = (float)Math.toRadians(-7.5);
            this.tail2.rotateAngleX = (float)Math.toRadians(2.5);
            this.tail3.rotateAngleX = (float)Math.toRadians(2.5);

            if (!ee.getIsMoving()) {
                this.arm1.rotateAngleZ = -(float)Math.toRadians(-17.5);
                this.arm2.rotateAngleZ = -(float)Math.toRadians(17.5);
                return;
            }

            this.arm1.rotateAngleY = (float) Math.toRadians((-50F * getMoveAngle2(ee, partialTickTime)) + 20F);
            this.arm2.rotateAngleY = -(float) Math.toRadians((-50F * getMoveAngle2(ee, partialTickTime)) + 20F);

            if (ee.getMoveAngle() >= 0) {
                this.body.rotateAngleX = (float) Math.toRadians(-5.0 * getMoveAngle(ee, partialTickTime));
                this.body2.rotateAngleX = (float) Math.toRadians(5.0 * getMoveAngle(ee, partialTickTime));
                //this.body.offsetY = 0.05F;

                this.arm1.rotateAngleZ = -(float)Math.toRadians(-17.5 + (20 * getMoveAngle(ee, partialTickTime)));
                this.arm2.rotateAngleZ = -(float)Math.toRadians(17.5 - (20 * getMoveAngle(ee, partialTickTime)));
            }
            else {
                this.arm1.rotateAngleZ = -(float)Math.toRadians(-17.5);
                this.arm2.rotateAngleZ = -(float)Math.toRadians(17.5);
            }
        }
    }

    public double getMoveAngle(EntityPrehistoricFloraAtopodentatus ee, float partialTicks) {
        return Math.sin(Math.PI * 2	* getMoveFraction(ee, partialTicks));
    }

    public double getMoveAngle2(EntityPrehistoricFloraAtopodentatus ee, float partialTicks) {
        return Math.sin(Math.PI * 4	* getMoveFraction(ee, partialTicks));
    }

    public double getMoveFraction(EntityPrehistoricFloraAtopodentatus ee, float partialTicks) {
        double ii = Math.floor(((double)ee.ticksExisted + ee.getTickOffset() + partialTicks) / (double)ee.flapLength());
        double i = (ee.ticksExisted + ee.getTickOffset() + partialTicks) - (ii * ee.flapLength());
        return (i / (double)ee.flapLength());
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        this.hip.offsetY = -0.3F;
        //this.body.offsetZ = 1.0F;

        this.faceTarget(f3, f4, 6, neck);
        this.faceTarget(f3, f4, 6, neck3);
        this.faceTarget(f3, f4, 6, head);

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] neckHead = {this.neck, this.neck3, this.head};
        ((EntityPrehistoricFloraAtopodentatus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        AdvancedModelRenderer[] frontLeft = {this.arm1, this.armpiece1, this.arm1finger1};
        AdvancedModelRenderer[] frontRight = {this.arm2, this.armpiece2, this.arm1finger2};
        AdvancedModelRenderer[] backLeft = {this.leg1, this.lrgpiece1, this.legfinger1};
        AdvancedModelRenderer[] backRight = {this.leg2, this.lrgpiece2, this.legfinger2};

        EntityPrehistoricFloraAtopodentatus ee = (EntityPrehistoricFloraAtopodentatus) e;
        float speed = ee.getTravelSpeed()/4F;
        if (ee.getIsFast()) {
            speed = speed * 1.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.5F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            if (!ee.getIsFast()) {
                this.chainWave(fishTail, speed * still, 0.075F * still, -1.25, f2, 0.6F * still);
                this.chainWave(neckHead, speed * still, 0.100F * still, -1.25, f2, 0.6F * still);
            } else {
                this.chainWave(fishTail, speed * still, 0.085F * still, -1.15, f2, 0.6F * still);
                this.chainWave(neckHead, speed * still, 0.100F * still, -1.15, f2, 0.6F * still);
            }

            this.chainSwing(fishTail, speed * still * 2, 0.125F * still, -1.0, f2, 0.8F * still);
            this.chainSwing(neckHead, speed * still * 2, 0.065F * still, -1.0, f2, 0.8F * still);

            this.swing(body, speed * 0.5F, 0.002F, true, 0, 0, f2, 0.8F);
            this.bob(body, speed * 0.5F, 0.05F, true, f2, 0.8F);

            this.chainFlapExtended(frontLeft, (float) (speed * 1.25), 0.75F,  0.8F, 0, f2, 0.5F);
            this.chainSwingExtended(frontLeft, (float) (speed * 1.25), 0.4F, 0, 0, f2, 0.5F);
            this.chainWaveExtended(frontLeft, (float) (speed * 1.25), 0.4F, 0, 0, f2, 0.5F);

            this.chainFlapExtended(frontRight, (float) (speed * 1.25), 0.75F,  0.8F,  3F, f2, 0.5F);
            this.chainSwingExtended(frontRight, (float) (speed * 1.25), 0.4F,  0, 3F, f2, 0.5F);
            this.chainWaveExtended(frontRight, (float) (speed * 1.25), 0.4F,  0, 3F, f2, 0.5F);

            this.chainFlapExtended(backLeft, (float) (speed * 1.25), 0.75F,  1.8F, 3F, f2, 0.5F);
            this.chainSwingExtended(backLeft, (float) (speed * 1.25), 0.4F,  1, 3F, f2, 0.5F);
            this.chainWaveExtended(backLeft, (float) (speed * 1.25), 0.4F,  1, 3F, f2, 0.5F);

            this.chainFlapExtended(backRight, (float) (speed * 1.25), 0.75F,  1.8F, 0, f2, 0.5F);
            this.chainSwingExtended(backRight, (float) (speed * 1.25), 0.4F,  1, 0, f2, 0.5F);
            this.chainWaveExtended(backRight, (float) (speed * 1.25), 0.4F, 1, 0, f2, 0.5F);
        }
        else {
            //On land:
            //this.leg1.rotateAngleZ = (float)Math.toRadians(-15);
            //this.leg2.rotateAngleZ = (float)Math.toRadians(15);
            //this.legfinger1.rotateAngleZ = (float)Math.toRadians(-5);
            //this.legfinger2.rotateAngleZ = (float)Math.toRadians(5);
            //this.tail.rotateAngleX = (float)Math.toRadians(-7.5);
            //this.tail2.rotateAngleX = (float)Math.toRadians(2.5);
            //this.tail3.rotateAngleX = (float)Math.toRadians(2.5);

            this.chainSwing(fishTail, speed * still * 0.7F, 0.185F * still * 0.7F, -1.85, f2, 0.6F * still * 0.7F);
            this.chainSwing(neckHead, speed * still * 0.7F, 0.285F * still * 0.7F, -1.15, f2, 0.6F * still * 0.7F);

            //if (f3 == 0 || !ee.getIsMoving()) {
            //    this.arm1.rotateAngleZ = -(float)Math.toRadians(-17.5);
            //    this.arm2.rotateAngleZ = -(float)Math.toRadians(17.5);
            //    return;
            //}

            this.chainSwing(backLeft, (float) (speed * 0.65), 0.05F,  1, f2, 0.5F);
            this.chainSwing(backRight, (float) (speed * 0.65), 0.05F,  1, f2, 0.5F);

            //this.arm1.rotateAngleY = (float) Math.toRadians((-50F * ee.getMoveAngle2()) + 20F);
            //this.arm2.rotateAngleY = -(float) Math.toRadians((-50F * ee.getMoveAngle2()) + 20F);

            this.swing(body, speed * 0.5F * 0.7F, 0.002F, true, 0, 0, f2, 0.8F * 0.7F);

            //if (ee.getMoveAngle() >= 0) {
            //    this.body.rotateAngleX = (float) Math.toRadians(-5.0 * ee.getMoveAngle());
            //    this.body2.rotateAngleX = (float) Math.toRadians(5.0 * ee.getMoveAngle());
            //    this.body.offsetY = 0.05F;

            //    this.arm1.rotateAngleZ = -(float)Math.toRadians(-17.5 + (20 * ee.getMoveAngle()));
           //     this.arm2.rotateAngleZ = -(float)Math.toRadians(17.5 - (20 * ee.getMoveAngle()));
           //}
           // else {
           //     this.arm1.rotateAngleZ = -(float)Math.toRadians(-17.5);
           //     this.arm2.rotateAngleZ = -(float)Math.toRadians(17.5);
            //}

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        //setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

