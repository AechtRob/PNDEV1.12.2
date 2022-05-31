package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLabidosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLabidosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended leg2;
    private final AdvancedModelRendererExtended legs2;
    private final AdvancedModelRendererExtended foot2;
    private final AdvancedModelRendererExtended leg;
    private final AdvancedModelRendererExtended legs;
    private final AdvancedModelRendererExtended foot;
    private final AdvancedModelRendererExtended bodyback;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended leg4;
    private final AdvancedModelRendererExtended legs4;
    private final AdvancedModelRendererExtended foot4;
    private final AdvancedModelRendererExtended leg3;
    private final AdvancedModelRendererExtended legs3;
    private final AdvancedModelRendererExtended foot3;

    private ModelAnimator animator;

    public ModelLabidosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 24.0F, -12.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -7.75F, 5.0F, 9, 5, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 43, 43, -3.5F, -7.75F, 4.0F, 7, 5, 1, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -6.0F, 4.0F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 44, -2.99F, -1.74F, -2.0F, 6, 4, 2, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.25F, -1.9F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 43, 24, -2.0F, -1.15F, -4.0F, 4, 3, 3, 0.0F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 42, 15, -1.0F, 0.0F, -10.0F, 2, 2, 4, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 31, 31, -2.5F, 0.0F, -5.0F, 5, 2, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 24, 52, -1.5F, 0.0F, -6.0F, 3, 2, 1, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 7, -0.5F, -0.75F, -9.9F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lowerjaw.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.48F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 19, -4.4F, -0.02F, -6.3F, 1, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lowerjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.48F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 36, 3.4F, -0.01F, -6.3F, 1, 2, 3, 0.0F, false));

        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.0436F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 24, 19, -3.0F, -3.25F, -5.01F, 6, 3, 5, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 32, 0, -1.5F, -3.26F, -11.0F, 3, 2, 6, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 2, 1.4F, -3.2F, -6.0F, 1, 1, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 0, -2.4F, -3.2F, -6.0F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 3.0F, -2.0F);
        this.upperjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2618F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 2.1F, -5.75F, -2.3F, 2, 2, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 3.0F, -2.0F);
        this.upperjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 7, -4.1F, -5.75F, -2.3F, 2, 2, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -0.35F, 0.0F);
        this.upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.6109F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 30, 3.7F, -2.74F, -6.35F, 2, 2, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -0.35F, 0.0F);
        this.upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.6109F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 49, -5.7F, -2.74F, -6.35F, 2, 2, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 3.0F, -2.0F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 9, -0.5F, -5.05F, -8.64F, 1, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 19, -1.0F, -7.7F, -8.65F, 2, 3, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 2.65F, -2.0F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2182F, -0.3491F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 60, -3.41F, -3.33F, -5.65F, 1, 1, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 2.65F, -2.0F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2182F, 0.3491F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 60, 2.41F, -3.33F, -5.65F, 1, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 2.65F, -2.0F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 61, -1.49F, -3.2F, -5.5F, 3, 1, 2, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 5, -1.49F, -3.2F, -9.5F, 3, 1, 4, 0.0F, false));

        this.leg2 = new AdvancedModelRendererExtended(this);
        this.leg2.setRotationPoint(-3.0F, -5.0F, 5.25F);
        this.body.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, 0.4363F, 0.0F);
        this.leg2.cubeList.add(new ModelBox(leg2, 30, 27, -4.0F, -0.25F, -1.0F, 4, 2, 2, 0.0F, false));

        this.legs2 = new AdvancedModelRendererExtended(this);
        this.legs2.setRotationPoint(-3.25F, 1.0F, -0.2F);
        this.leg2.addChild(legs2);
        this.setRotateAngle(legs2, -0.3491F, 0.0F, 0.0F);
        this.legs2.cubeList.add(new ModelBox(legs2, 0, 50, -0.85F, -0.25F, -0.9F, 2, 4, 2, 0.0F, false));

        this.foot2 = new AdvancedModelRendererExtended(this);
        this.foot2.setRotationPoint(0.25F, 3.25F, 0.0F);
        this.legs2.addChild(foot2);
        this.setRotateAngle(foot2, 0.3491F, 0.0F, 0.0F);
        this.foot2.cubeList.add(new ModelBox(foot2, 44, 38, -1.5F, 0.0F, -2.75F, 3, 1, 4, 0.0F, false));

        this.leg = new AdvancedModelRendererExtended(this);
        this.leg.setRotationPoint(3.0F, -5.0F, 5.25F);
        this.body.addChild(leg);
        this.setRotateAngle(leg, 0.0F, -0.4363F, 0.0F);
        this.leg.cubeList.add(new ModelBox(leg, 0, 39, 0.0F, -0.25F, -1.0F, 4, 2, 2, 0.0F, false));

        this.legs = new AdvancedModelRendererExtended(this);
        this.legs.setRotationPoint(3.25F, 1.0F, -0.2F);
        this.leg.addChild(legs);
        this.setRotateAngle(legs, -0.3491F, 0.0F, 0.0F);
        this.legs.cubeList.add(new ModelBox(legs, 50, 10, -1.15F, -0.25F, -0.9F, 2, 4, 2, 0.0F, false));

        this.foot = new AdvancedModelRendererExtended(this);
        this.foot.setRotationPoint(-0.25F, 3.25F, 0.0F);
        this.legs.addChild(foot);
        this.setRotateAngle(foot, 0.3491F, 0.0F, 0.0F);
        this.foot.cubeList.add(new ModelBox(foot, 26, 45, -1.5F, 0.0F, -2.75F, 3, 1, 4, 0.0F, false));

        this.bodyback = new AdvancedModelRendererExtended(this);
        this.bodyback.setRotationPoint(0.0F, -5.25F, 19.0F);
        this.body.addChild(bodyback);
        this.bodyback.cubeList.add(new ModelBox(bodyback, 0, 19, -3.0F, -2.5F, 0.0F, 6, 5, 6, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -1.65F, 5.75F);
        this.bodyback.addChild(tail1);
        this.setRotateAngle(tail1, -0.2618F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 30, -2.0F, -0.75F, 0.0F, 4, 4, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 18, 27, -1.5F, -0.5F, 0.0F, 3, 3, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 5.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2182F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 12, 36, -1.0F, -0.5F, 0.0F, 2, 2, 6, 0.0F, false));

        this.leg4 = new AdvancedModelRendererExtended(this);
        this.leg4.setRotationPoint(3.0F, 0.25F, 3.5F);
        this.bodyback.addChild(leg4);
        this.setRotateAngle(leg4, 0.0F, 0.3491F, 0.0F);
        this.leg4.cubeList.add(new ModelBox(leg4, 32, 8, -1.0F, -1.25F, -1.0F, 5, 3, 3, 0.0F, false));

        this.legs4 = new AdvancedModelRendererExtended(this);
        this.legs4.setRotationPoint(3.25F, 1.0F, 0.5F);
        this.leg4.addChild(legs4);
        this.setRotateAngle(legs4, 0.3491F, -0.5236F, 0.0F);
        this.legs4.cubeList.add(new ModelBox(legs4, 38, 49, -1.15F, -0.25F, -0.9F, 2, 4, 2, 0.0F, false));

        this.foot4 = new AdvancedModelRendererExtended(this);
        this.foot4.setRotationPoint(-0.25F, 3.25F, 0.0F);
        this.legs4.addChild(foot4);
        this.setRotateAngle(foot4, -0.3491F, -0.1745F, 0.0524F);
        this.foot4.cubeList.add(new ModelBox(foot4, 44, 0, -1.5F, 0.0F, -2.75F, 3, 1, 4, 0.0F, false));

        this.leg3 = new AdvancedModelRendererExtended(this);
        this.leg3.setRotationPoint(-3.0F, 0.25F, 3.5F);
        this.bodyback.addChild(leg3);
        this.setRotateAngle(leg3, 0.0F, -0.3491F, 0.0F);
        this.leg3.cubeList.add(new ModelBox(leg3, 28, 38, -4.0F, -1.25F, -1.0F, 5, 3, 3, 0.0F, false));

        this.legs3 = new AdvancedModelRendererExtended(this);
        this.legs3.setRotationPoint(-3.25F, 1.0F, 0.5F);
        this.leg3.addChild(legs3);
        this.setRotateAngle(legs3, 0.3491F, 0.5236F, 0.0F);
        this.legs3.cubeList.add(new ModelBox(legs3, 46, 49, -0.85F, -0.25F, -0.9F, 2, 4, 2, 0.0F, false));

        this.foot3 = new AdvancedModelRendererExtended(this);
        this.foot3.setRotationPoint(0.25F, 3.25F, 0.0F);
        this.legs3.addChild(foot3);
        this.setRotateAngle(foot3, -0.3491F, 0.1745F, -0.0524F);
        this.foot3.cubeList.add(new ModelBox(foot3, 16, 44, -1.5F, 0.0F, -2.75F, 3, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.385f);
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
        this.body.offsetY = 0.91F;

        EntityPrehistoricFloraLabidosaurus Labidosaurus = (EntityPrehistoricFloraLabidosaurus) e;
        float masterSpeed = Labidosaurus.getTravelSpeed();

        //masterSpeed = 0.315F;

        this.faceTarget(f3, f4, 4, neck);
        this.faceTarget(f3, f4, 6, head);

        AdvancedModelRendererExtended[] Tail = {this.bodyback, this.tail1, this.tail2, this.tail3};
        AdvancedModelRendererExtended[] Body = {this.neck, this.body};

        if (Labidosaurus.getAnimation() == Labidosaurus.LAY_ANIMATION) {
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Labidosaurus.getIsMoving()) { //Not moving
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), 0.02F, 0.1F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        float speed = masterSpeed / 1.155F;

        this.leg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.leg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.leg4.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.leg3.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(leg, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(leg2, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(leg4, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(leg3, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(leg, speed, 0.30F, true, 5, 0.20F, f2, 1F);
        this.walk(leg2, speed, 0.30F, true, 8, 0.20F, f2, 1F);
        this.walk(leg4, speed, 0.25F, true, 8, 0F, f2, 1F);
        this.walk(leg3, speed, 0.25F, true, 5, 0F, f2, 1F);

        this.walk(legs, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(legs2, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(legs4, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(legs3, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(legs, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(legs2, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(legs4, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(legs3, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(foot, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(foot2, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(foot4, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(foot3, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(body, speed * 2F, 0.05F, false, 2.5F,  f2, 1F);

        this.flap(bodyback, speed, 0.10F, false, 5.0F,0.05F, f2, 1.0F);
        //this.flap(body, speed, -0.10F, false, 5.0F,-0.05F, f2, 1.0F);
        //this.flap(front_body, speed, -0.14F, false, 5.0F,-0.07F, f2, 1.0F);

        //this.walk(front_body, speed * 2, 0.03F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (0.06F*0.9F), 0.025F, 0.1F, f2, 1F);
        this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.07F, 0.06F, f2, 1F);
        this.chainWave(Body, (0.06F*0.9F), 0.018F, 0.08F, f2, 1F);

        this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.12), false, 2.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLabidosaurus e = (EntityPrehistoricFloraLabidosaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(5), 0,0);
        animator.rotate(this.head, (float) Math.toRadians(-10), 0,0);
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), 0,0);
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(4);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(15);
        animator.endKeyframe();
        animator.setStaticKeyframe(20);
        animator.resetKeyframe(15);

    }
}
