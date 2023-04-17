package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCacops;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelCacops extends AdvancedModelBaseExtended {

    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended basin;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended upperleg1;
    private final AdvancedModelRendererExtended leg1;
    private final AdvancedModelRendererExtended feet1;
    private final AdvancedModelRendererExtended upperleg2;
    private final AdvancedModelRendererExtended leg2;
    private final AdvancedModelRendererExtended feet2;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended head_r1;
    private final AdvancedModelRendererExtended head_r2;
    private final AdvancedModelRendererExtended snout1;
    private final AdvancedModelRendererExtended teeth2;
    private final AdvancedModelRendererExtended snout2;
    private final AdvancedModelRendererExtended teeth1;
    private final AdvancedModelRendererExtended eye2;
    private final AdvancedModelRendererExtended eye1;
    private final AdvancedModelRendererExtended jaw1;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended teeth2a;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended teeth1a;
    private final AdvancedModelRendererExtended gums2;
    private final AdvancedModelRendererExtended osteoderme1;
    private final AdvancedModelRendererExtended upperarm1;
    private final AdvancedModelRendererExtended arm1;
    private final AdvancedModelRendererExtended hand1;
    private final AdvancedModelRendererExtended upperarm2;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended hand2;
    private final AdvancedModelRendererExtended osteoderme2;

    private ModelAnimator animator;

    public ModelCacops() {
        this.textureWidth = 92;
        this.textureHeight = 92;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 1.3F, 0.0F);


        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(-0.5F, 14.8F, 0.1F);
        this.root.addChild(body);
        this.setRotateAngle(body, -0.0456F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 27, 24, -4.5F, -4.0F, -0.1F, 10, 8, 5, 0.0F, false));

        this.basin = new AdvancedModelRendererExtended(this);
        this.basin.setRotationPoint(0.25F, 0.05F, 5.3F);
        this.body.addChild(basin);
        this.setRotateAngle(basin, -0.1309F, 0.0F, 0.0F);
        this.basin.cubeList.add(new ModelBox(basin, 31, 10, -3.25F, -3.5F, -3.0F, 7, 7, 7, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -0.3F, 3.6F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, -0.1384F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 46, -1.75F, -2.3F, 0.0F, 4, 5, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.1F, 4.9F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0911F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 33, 52, -1.25F, -1.6F, 0.0F, 3, 3, 5, 0.0F, false));

        this.upperleg1 = new AdvancedModelRendererExtended(this);
        this.upperleg1.setRotationPoint(-2.2F, 1.5F, 2.9F);
        this.basin.addChild(upperleg1);
        this.setRotateAngle(upperleg1, -0.1309F, -0.0967F, 1.457F);
        this.upperleg1.cubeList.add(new ModelBox(upperleg1, 0, 56, -1.4723F, -0.2452F, -2.1402F, 3, 5, 4, 0.0F, false));

        this.leg1 = new AdvancedModelRendererExtended(this);
        this.leg1.setRotationPoint(-0.1F, 3.6F, -0.2F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.0F, -0.2618F, 0.7418F);
        this.leg1.cubeList.add(new ModelBox(leg1, 52, 8, 0.0062F, -1.7467F, -1.5402F, 6, 3, 3, 0.0F, false));

        this.feet1 = new AdvancedModelRendererExtended(this);
        this.feet1.setRotationPoint(5.4F, 0.0F, -0.1F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, 0.6374F, 0.1309F, -0.6109F);
        this.feet1.cubeList.add(new ModelBox(feet1, 59, 48, 0.0062F, -2.2222F, -2.8855F, 1, 4, 4, 0.0F, false));

        this.upperleg2 = new AdvancedModelRendererExtended(this);
        this.upperleg2.setRotationPoint(2.7F, 1.5F, 2.9F);
        this.basin.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.1309F, 0.0967F, -1.457F);
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 0, 56, -1.5277F, -0.2452F, -2.1402F, 3, 5, 4, 0.0F, true));

        this.leg2 = new AdvancedModelRendererExtended(this);
        this.leg2.setRotationPoint(0.1F, 3.6F, -0.2F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, 0.2618F, -0.7418F);
        this.leg2.cubeList.add(new ModelBox(leg2, 52, 8, -6.0062F, -1.7467F, -1.5402F, 6, 3, 3, 0.0F, true));

        this.feet2 = new AdvancedModelRendererExtended(this);
        this.feet2.setRotationPoint(-5.4F, 0.0F, -0.1F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, 0.6374F, -0.1309F, 0.6109F);
        this.feet2.cubeList.add(new ModelBox(feet2, 59, 48, -1.0062F, -2.2222F, -2.8855F, 1, 4, 4, 0.0F, true));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.3F, -1.2F, -2.4F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0948F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 0, -5.3F, -2.7F, -5.0F, 11, 9, 8, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(-0.3F, 1.4F, -4.3F);
        this.chest.addChild(head);
        this.setRotateAngle(head, -0.0456F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 17, -3.5F, -3.7F, -8.0F, 8, 4, 8, 0.0F, false));

        this.head_r1 = new AdvancedModelRendererExtended(this);
        this.head_r1.setRotationPoint(4.5F, -4.65F, -6.95F);
        this.head.addChild(head_r1);
        this.setRotateAngle(head_r1, 0.0F, 0.0F, 0.5236F);
        this.head_r1.cubeList.add(new ModelBox(head_r1, 0, 0, 0.3F, -0.85F, -0.65F, 0, 2, 2, 0.0F, false));

        this.head_r2 = new AdvancedModelRendererExtended(this);
        this.head_r2.setRotationPoint(-3.5F, -4.65F, -6.95F);
        this.head.addChild(head_r2);
        this.setRotateAngle(head_r2, 0.0F, 0.0F, -0.5236F);
        this.head_r2.cubeList.add(new ModelBox(head_r2, 0, 2, -0.3F, -0.85F, -0.65F, 0, 2, 2, 0.0F, false));

        this.snout1 = new AdvancedModelRendererExtended(this);
        this.snout1.setRotationPoint(0.0F, -2.7F, -5.8F);
        this.head.addChild(snout1);
        this.snout1.cubeList.add(new ModelBox(snout1, 26, 37, -2.5F, -0.01F, -6.0F, 6, 3, 6, 0.0F, false));

        this.teeth2 = new AdvancedModelRendererExtended(this);
        this.teeth2.setRotationPoint(2.8F, 2.9F, -1.81F);
        this.snout1.addChild(teeth2);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 14, 53, -4.8F, 0.0F, -4.0F, 5, 1, 4, 0.0F, false));

        this.snout2 = new AdvancedModelRendererExtended(this);
        this.snout2.setRotationPoint(0.8F, -0.6F, 0.1F);
        this.snout1.addChild(snout2);
        this.setRotateAngle(snout2, 0.0911F, 0.0F, 0.0F);
        this.snout2.cubeList.add(new ModelBox(snout2, 44, 40, -3.3F, 0.0F, -6.0F, 6, 1, 6, -0.01F, false));

        this.teeth1 = new AdvancedModelRendererExtended(this);
        this.teeth1.setRotationPoint(3.8F, -0.1F, -3.9F);
        this.head.addChild(teeth1);
        this.setRotateAngle(teeth1, 0.0911F, 0.0F, 0.0F);
        this.teeth1.cubeList.add(new ModelBox(teeth1, 49, 0, -6.8F, 0.0F, -4.0F, 7, 1, 4, 0.0F, false));

        this.eye2 = new AdvancedModelRendererExtended(this);
        this.eye2.setRotationPoint(4.8F, -3.0F, -7.5F);
        this.head.addChild(eye2);
        this.eye2.cubeList.add(new ModelBox(eye2, 28, 53, -2.8F, -0.5F, 0.0F, 3, 2, 2, 0.0F, false));

        this.eye1 = new AdvancedModelRendererExtended(this);
        this.eye1.setRotationPoint(-1.2F, -3.0F, -7.5F);
        this.head.addChild(eye1);
        this.eye1.cubeList.add(new ModelBox(eye1, 18, 39, -2.8F, -0.5F, 0.0F, 3, 2, 2, 0.0F, false));

        this.jaw1 = new AdvancedModelRendererExtended(this);
        this.jaw1.setRotationPoint(0.3F, 0.3F, 0.0F);
        this.head.addChild(jaw1);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 0, 29, -3.8F, 0.0F, -8.0F, 8, 2, 8, 0.0F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -5.7F);
        this.jaw1.addChild(jaw2);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 0, 39, -2.8F, -0.01F, -6.0F, 6, 1, 6, 0.0F, false));

        this.teeth2a = new AdvancedModelRendererExtended(this);
        this.teeth2a.setRotationPoint(2.5F, -0.8F, -1.8F);
        this.jaw2.addChild(teeth2a);
        this.teeth2a.cubeList.add(new ModelBox(teeth2a, 52, 24, -4.8F, 0.0F, -4.0F, 5, 1, 4, -0.01F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.0F, 1.3F);
        this.jaw2.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.1121F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 30, 0, -2.8F, 0.0F, -7.2F, 6, 1, 7, -0.01F, false));

        this.teeth1a = new AdvancedModelRendererExtended(this);
        this.teeth1a.setRotationPoint(3.5F, -0.5F, -3.8F);
        this.jaw1.addChild(teeth1a);
        this.setRotateAngle(teeth1a, -0.0911F, 0.0F, 0.0F);
        this.teeth1a.cubeList.add(new ModelBox(teeth1a, 38, 47, -6.8F, 0.0F, -4.0F, 7, 1, 4, -0.01F, false));

        this.gums2 = new AdvancedModelRendererExtended(this);
        this.gums2.setRotationPoint(0.0F, -2.6F, 0.8F);
        this.jaw1.addChild(gums2);
        this.setRotateAngle(gums2, -0.3841F, 0.0F, 0.0F);
        this.gums2.cubeList.add(new ModelBox(gums2, 18, 46, -3.3F, 0.0F, -3.0F, 7, 4, 3, 0.0F, false));

        this.osteoderme1 = new AdvancedModelRendererExtended(this);
        this.osteoderme1.setRotationPoint(0.0F, -2.7F, -3.6F);
        this.chest.addChild(osteoderme1);
        this.osteoderme1.cubeList.add(new ModelBox(osteoderme1, 50, 30, -0.8F, -0.5F, -0.5F, 2, 1, 7, 0.0F, false));

        this.upperarm1 = new AdvancedModelRendererExtended(this);
        this.upperarm1.setRotationPoint(-3.7F, 2.6F, -4.6F);
        this.body.addChild(upperarm1);
        this.setRotateAngle(upperarm1, 0.3718F, 0.0F, 1.2825F);
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 49, 52, -1.4773F, -0.1698F, -1.9968F, 3, 5, 4, 0.0F, false));

        this.arm1 = new AdvancedModelRendererExtended(this);
        this.arm1.setRotationPoint(0.2F, 3.6F, -0.2F);
        this.upperarm1.addChild(arm1);
        this.setRotateAngle(arm1, 0.0F, 0.6981F, 0.6109F);
        this.arm1.cubeList.add(new ModelBox(arm1, 14, 58, 0.0078F, -1.6711F, -1.3968F, 5, 3, 3, 0.0F, false));

        this.hand1 = new AdvancedModelRendererExtended(this);
        this.hand1.setRotationPoint(4.3F, 0.0F, -0.2F);
        this.arm1.addChild(hand1);
        this.setRotateAngle(hand1, 0.0F, -0.6109F, -0.3491F);
        this.hand1.cubeList.add(new ModelBox(hand1, 59, 14, 0.0078F, -2.1711F, -2.8968F, 1, 4, 4, 0.0F, false));

        this.upperarm2 = new AdvancedModelRendererExtended(this);
        this.upperarm2.setRotationPoint(4.7F, 2.6F, -4.6F);
        this.body.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.3718F, 0.0F, -1.2825F);
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 49, 52, -1.5227F, -0.1698F, -1.9968F, 3, 5, 4, 0.0F, true));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(-0.2F, 3.6F, -0.2F);
        this.upperarm2.addChild(arm2);
        this.setRotateAngle(arm2, 0.0F, -0.6981F, -0.6109F);
        this.arm2.cubeList.add(new ModelBox(arm2, 14, 58, -5.0078F, -1.6711F, -1.3968F, 5, 3, 3, 0.0F, true));

        this.hand2 = new AdvancedModelRendererExtended(this);
        this.hand2.setRotationPoint(-4.3F, 0.0F, -0.2F);
        this.arm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.0F, 0.6109F, 0.3491F);
        this.hand2.cubeList.add(new ModelBox(hand2, 59, 14, -1.0078F, -2.1711F, -2.8968F, 1, 4, 4, 0.0F, true));

        this.osteoderme2 = new AdvancedModelRendererExtended(this);
        this.osteoderme2.setRotationPoint(0.3F, -3.9F, -0.6F);
        this.body.addChild(osteoderme2);
        this.osteoderme2.cubeList.add(new ModelBox(osteoderme2, 59, 57, -0.8F, -0.5F, 0.5F, 2, 1, 4, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(arm1, 0.0F, 0.6981F, 0.6109F);
        this.setRotateAngle(arm2, 0.0F, -0.6981F, -0.6109F);
        this.setRotateAngle(basin, -0.1309F, 0.0873F, 0.0F);
        this.setRotateAngle(body, -0.0456F, -0.0873F, 0.0F);
        this.setRotateAngle(chest, 0.0873F, -0.0873F, 0.0F);
        this.setRotateAngle(feet1, 0.6374F, 0.1309F, -0.6109F);
        this.setRotateAngle(feet2, 0.6374F, -0.1309F, 0.6109F);
        this.setRotateAngle(gums2, -0.3841F, 0.0F, 0.0F);
        this.setRotateAngle(hand1, 0.0F, -0.6109F, -0.3491F);
        this.setRotateAngle(hand2, 0.0F, 0.6109F, 0.3491F);
        this.setRotateAngle(head_r1, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(head_r2, 0.0F, 0.0F, -0.5236F);
        this.setRotateAngle(head, -0.3946F, -0.1309F, 0.0F);
        this.setRotateAngle(jaw1, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(leg1, 0.0F, -0.2618F, 0.7418F);
        this.setRotateAngle(leg2, 0.0F, 0.2618F, -0.7418F);
        this.setRotateAngle(lowerjaw, -0.1121F, 0.0F, 0.0F);
        this.setRotateAngle(snout2, 0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.1745F, -0.0873F, 0.0F);
        this.setRotateAngle(tail2, 0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(teeth1, -0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(teeth1, 0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(upperarm1, 0.3718F, 0.0F, 1.2825F);
        this.setRotateAngle(upperarm2, 0.3718F, 0.0F, -1.2825F);
        this.setRotateAngle(upperleg1, -0.1309F, -0.0967F, 1.457F);
        this.setRotateAngle(upperleg2, -0.1309F, 0.0967F, -1.457F);
        this.root.offsetY = 0.175F;
        this.root.render(0.01F);
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
        //this.root.offsetY = 1.2F;

        EntityPrehistoricFloraCacops Cacops = (EntityPrehistoricFloraCacops) e;

        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, head);

        float speed = 0.385F;
        if (Cacops.getIsFast()) {
            speed = speed * 1.52F;
        }
        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2};
        AdvancedModelRenderer[] Torso = {this.head, this.body};

        if (!Cacops.isReallyInWater()) {

            this.chainWave(Tail, speed, 0.05F, -0.16, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.08F, -0.16, f2, 0.5F);

            if (f3 == 0.0F || !Cacops.getIsMoving()) { //Not moving
                return;
            }

            this.flap(upperleg2, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(upperleg2, speed, -0.5F, true, 5, -0.25F, f2, 0.5F);
            this.walk(leg2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(feet2, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(upperleg1, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(upperleg1, speed, -0.5F, true, 8, -0.25F, f2, 0.5F);
            this.walk(leg1, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(feet1, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(upperarm2, speed, 0.35F, false, 3, -0.1F, f2, 0.5F);
            //this.swing(upperarm2, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(arm2, speed, -0.4F, false, 4, 0.15F, f2, 0.8F);
            this.walk(hand2, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(upperarm1, speed, -0.35F, false, 0, 0.1F, f2, 0.5F);
            //this.swing(upperarm1, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(arm1, speed, -0.4F, false, 1, 0.15F, f2, 0.8F);
            this.walk(hand1, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainSwing(Torso, speed, 0.08F, -0.16, f2, 0.7F);
            this.bob(body, speed*2, 0.11F, false, f2, 1F);

            this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.45), false, 1.5F, f2, 1);

        }
        else {
            speed = speed * 2F;

            //Feet:
            this.hand2.rotateAngleY = (float) Math.toRadians(-50);
            this.hand1.rotateAngleY = (float) Math.toRadians(50);
            this.feet2.rotateAngleZ = (float) Math.toRadians(-50);
            this.feet1.rotateAngleZ = (float) Math.toRadians(50);

            this.upperarm2.rotateAngleX= (float) Math.toRadians(40);
            this.upperarm1.rotateAngleX= (float) Math.toRadians(-40);
            this.upperleg2.rotateAngleZ= (float) Math.toRadians(25);
            this.upperleg1.rotateAngleZ= (float) Math.toRadians(-25);

            this.leg2.rotateAngleX= (float) Math.toRadians(17.5);
            this.leg1.rotateAngleX= (float) Math.toRadians(-17.5);

            AdvancedModelRenderer[] BackL = {this.leg2, this.feet2};
            AdvancedModelRenderer[] BackR = {this.leg1, this.feet1};

            this.flap(upperleg2, speed, 0.1F, false, 0F, 0.05F, f2, 1F);
            this.flap(upperleg1, speed, 0.1F, false, 3F, 0.05F, f2, 1F);
            this.chainWaveExtended(BackL, speed, -0.3F, -1, 0F,  f2, 1);
            this.chainWaveExtended(BackR, speed, -0.3F, -1, 3F, f2, 1);

            this.flap(upperarm2, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(upperarm2, speed, -0.4F, true, 8, 0.2F, f2, 0.5F);
            this.walk(arm2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(hand2, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);

            this.flap(upperarm1, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(upperarm1, speed, -0.4F, true, 5, 0.2F, f2, 0.5F);
            this.walk(arm1, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(hand1, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.1F, -0.16, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.3F, -0.16, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.16, f2, 0.7F);
        }
    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCacops e = (EntityPrehistoricFloraCacops) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
