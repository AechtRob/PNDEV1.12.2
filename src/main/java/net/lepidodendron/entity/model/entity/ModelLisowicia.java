package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLisowicia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelLisowicia extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended basin;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended upperarm1;
    private final AdvancedModelRendererExtended arm1;
    private final AdvancedModelRendererExtended hand1;
    private final AdvancedModelRendererExtended upperarm2;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended hand2;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended head1;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended head4;
    private final AdvancedModelRendererExtended beak1;
    private final AdvancedModelRendererExtended tusk1;
    private final AdvancedModelRendererExtended tusk2;
    private final AdvancedModelRendererExtended jaw1;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended jaw3;
    private final AdvancedModelRendererExtended beak2;
    private final AdvancedModelRendererExtended gums;
    private final AdvancedModelRendererExtended upperleg1;
    private final AdvancedModelRendererExtended leg1;
    private final AdvancedModelRendererExtended foot1;
    private final AdvancedModelRendererExtended toes1;
    private final AdvancedModelRendererExtended upperleg2;
    private final AdvancedModelRendererExtended leg2;
    private final AdvancedModelRendererExtended foot2;
    private final AdvancedModelRendererExtended toes2;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;

    private ModelAnimator animator;

    public ModelLisowicia() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.basin = new AdvancedModelRendererExtended(this);
        this.basin.setRotationPoint(0.0F, -6.6F, 17.0F);
        this.root.addChild(basin);
        this.setRotateAngle(basin, 0.0456F, 0.0F, 0.0F);
        this.basin.cubeList.add(new ModelBox(basin, 0, 47, -7.0F, -7.0F, -5.5F, 14, 20, 14, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -1.4F, -4.9F);
        this.basin.addChild(body);
        this.setRotateAngle(body, 0.0456F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -9.5F, -6.0F, -21.0F, 19, 25, 22, 0.0F, false));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 2.0F, -22.9F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 56, 47, -7.5F, -7.0F, -9.0F, 15, 20, 12, 0.0F, false));

        this.upperarm1 = new AdvancedModelRendererExtended(this);
        this.upperarm1.setRotationPoint(-7.8F, 8.1F, -4.2F);
        this.chest.addChild(upperarm1);
        this.setRotateAngle(upperarm1, 0.7741F, 0.0F, 0.0F);
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 0, 116, -3.0F, -1.0F, -4.5F, 6, 12, 9, 0.0F, false));

        this.arm1 = new AdvancedModelRendererExtended(this);
        this.arm1.setRotationPoint(-0.4F, 9.4F, 0.0F);
        this.upperarm1.addChild(arm1);
        this.setRotateAngle(arm1, -1.0016F, 0.0F, 0.0F);
        this.arm1.cubeList.add(new ModelBox(arm1, 30, 125, -2.5F, -1.0F, -4.0F, 5, 13, 8, 0.0F, false));

        this.hand1 = new AdvancedModelRendererExtended(this);
        this.hand1.setRotationPoint(0.0F, 11.1F, -0.1F);
        this.arm1.addChild(hand1);
        this.setRotateAngle(hand1, 0.1367F, 0.0F, 0.0F);
        this.hand1.cubeList.add(new ModelBox(hand1, 128, 57, -3.5F, -2.0F, -5.1F, 7, 4, 9, 0.0F, false));

        this.upperarm2 = new AdvancedModelRendererExtended(this);
        this.upperarm2.setRotationPoint(7.8F, 8.1F, -4.2F);
        this.chest.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.7741F, 0.0F, 0.0F);
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 113, 36, -3.0F, -1.0F, -4.5F, 6, 12, 9, 0.0F, false));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(0.4F, 9.4F, 0.0F);
        this.upperarm2.addChild(arm2);
        this.setRotateAngle(arm2, -1.0016F, 0.0F, 0.0F);
        this.arm2.cubeList.add(new ModelBox(arm2, 123, 119, -2.5F, -1.0F, -4.0F, 5, 13, 8, 0.0F, false));

        this.hand2 = new AdvancedModelRendererExtended(this);
        this.hand2.setRotationPoint(0.0F, 11.1F, -0.1F);
        this.arm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.1367F, 0.0F, 0.0F);
        this.hand2.cubeList.add(new ModelBox(hand2, 56, 128, -3.5F, -2.0F, -5.1F, 7, 4, 9, 0.0F, false));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, -3.2F, -6.7F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.0911F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 82, 0, -5.0F, -3.0F, -11.0F, 10, 17, 11, 0.0F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 154, -5.0F, -3.0F, 0.0F, 10, 17, 4, 0.0F, false));

        this.head1 = new AdvancedModelRendererExtended(this);
        this.head1.setRotationPoint(0.0F, -0.4F, -8.5F);
        this.neck1.addChild(head1);
        this.setRotateAngle(head1, -0.0456F, 0.0F, 0.0F);
        this.head1.cubeList.add(new ModelBox(head1, 36, 106, -5.5F, -3.0F, -6.0F, 11, 13, 6, 0.0F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, 3.9F, -5.0F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.182F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 0, 98, -4.5F, -3.0F, -9.0F, 9, 9, 9, 0.0F, false));

        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, -5.1F, 1.4F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.5463F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 114, 18, -4.0F, -2.0F, -10.0F, 8, 4, 10, 0.0F, false));

        this.head4 = new AdvancedModelRendererExtended(this);
        this.head4.setRotationPoint(0.0F, 0.8F, -7.4F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.182F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 83, 136, -3.5F, -4.0F, -5.0F, 7, 9, 5, 0.0F, false));

        this.beak1 = new AdvancedModelRendererExtended(this);
        this.beak1.setRotationPoint(0.0F, -0.7F, -4.4F);
        this.head4.addChild(beak1);
        this.setRotateAngle(beak1, -0.4554F, 0.0F, 0.0F);
        this.beak1.cubeList.add(new ModelBox(beak1, 0, 0, -2.5F, -2.5F, -2.0F, 5, 8, 4, 0.0F, false));

        this.tusk1 = new AdvancedModelRendererExtended(this);
        this.tusk1.setRotationPoint(2.7F, 1.5F, -4.6F);
        this.head4.addChild(tusk1);
        this.setRotateAngle(tusk1, -0.2443F, 0.0524F, -0.4538F);
        this.tusk1.cubeList.add(new ModelBox(tusk1, 60, 0, -1.0F, 0.0F, 0.0F, 1, 7, 6, 0.0F, false));

        this.tusk2 = new AdvancedModelRendererExtended(this);
        this.tusk2.setRotationPoint(-1.9F, 2.0F, -4.6F);
        this.head4.addChild(tusk2);
        this.setRotateAngle(tusk2, -0.2446F, -0.0524F, 0.4643F);
        this.tusk2.cubeList.add(new ModelBox(tusk2, 0, 47, -1.0F, 0.0F, 0.0F, 1, 7, 6, 0.0F, false));

        this.jaw1 = new AdvancedModelRendererExtended(this);
        this.jaw1.setRotationPoint(0.0F, 13.1F, 0.4F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, -0.2314F, 0.0F, 0.0F);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 134, 101, -4.9F, -7.4F, -5.0F, 10, 9, 5, 0.0F, false));
        this.jaw1.cubeList.add(new ModelBox(jaw1, 134, 101, -5.1F, -7.41F, -5.01F, 10, 9, 5, 0.0F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, -3.3F, -3.7F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.5009F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 102, 69, -4.0F, 0.0F, -10.0F, 8, 5, 10, 0.0F, false));

        this.jaw3 = new AdvancedModelRendererExtended(this);
        this.jaw3.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.1367F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 60, 13, -3.0F, 0.0F, -3.0F, 6, 5, 3, 0.0F, false));

        this.beak2 = new AdvancedModelRendererExtended(this);
        this.beak2.setRotationPoint(0.0F, 1.4F, -0.4F);
        this.jaw3.addChild(beak2);
        this.setRotateAngle(beak2, -0.6829F, 0.0F, 0.0F);
        this.beak2.cubeList.add(new ModelBox(beak2, 0, 12, -2.0F, 0.0F, -5.0F, 4, 4, 5, 0.0F, false));

        this.gums = new AdvancedModelRendererExtended(this);
        this.gums.setRotationPoint(0.0F, 3.3F, -0.2F);
        this.jaw2.addChild(gums);
        this.setRotateAngle(gums, -0.3643F, 0.0F, 0.0F);
        this.gums.cubeList.add(new ModelBox(gums, 91, 119, -3.5F, -8.0F, -9.0F, 7, 8, 9, 0.0F, false));

        this.upperleg1 = new AdvancedModelRendererExtended(this);
        this.upperleg1.setRotationPoint(-8.5F, 0.0F, 2.8F);
        this.basin.addChild(upperleg1);
        this.setRotateAngle(upperleg1, -0.5009F, 0.0F, 0.0F);
        this.upperleg1.cubeList.add(new ModelBox(upperleg1, 79, 79, -3.0F, -1.0F, -5.5F, 6, 16, 11, 0.0F, false));

        this.leg1 = new AdvancedModelRendererExtended(this);
        this.leg1.setRotationPoint(0.3F, 12.8F, -0.5F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.7285F, 0.0F, 0.0F);
        this.leg1.cubeList.add(new ModelBox(leg1, 70, 106, -3.0F, -1.0F, -4.5F, 6, 13, 9, 0.0F, false));

        this.foot1 = new AdvancedModelRendererExtended(this);
        this.foot1.setRotationPoint(0.0F, 11.7F, 0.0F);
        this.leg1.addChild(foot1);
        this.setRotateAngle(foot1, -0.2731F, 0.0F, 0.0F);
        this.foot1.cubeList.add(new ModelBox(foot1, 125, 84, -2.5F, -1.0F, -4.5F, 5, 8, 9, 0.0F, false));

        this.toes1 = new AdvancedModelRendererExtended(this);
        this.toes1.setRotationPoint(0.0F, 5.6F, 0.6F);
        this.foot1.addChild(toes1);
        this.toes1.cubeList.add(new ModelBox(toes1, 0, 81, -4.0F, -2.5F, -9.0F, 8, 5, 12, 0.0F, false));

        this.upperleg2 = new AdvancedModelRendererExtended(this);
        this.upperleg2.setRotationPoint(8.5F, 0.0F, 2.8F);
        this.basin.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.4554F, 0.0F, 0.0F);
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 45, 79, -3.0F, -1.0F, -5.5F, 6, 16, 11, 0.0F, false));

        this.leg2 = new AdvancedModelRendererExtended(this);
        this.leg2.setRotationPoint(-0.3F, 12.8F, -0.5F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.6829F, 0.0F, 0.0F);
        this.leg2.cubeList.add(new ModelBox(leg2, 104, 97, -3.0F, -1.0F, -4.5F, 6, 13, 9, 0.0F, false));

        this.foot2 = new AdvancedModelRendererExtended(this);
        this.foot2.setRotationPoint(0.0F, 11.7F, 0.0F);
        this.leg2.addChild(foot2);
        this.setRotateAngle(foot2, -0.2731F, 0.0F, 0.0F);
        this.foot2.cubeList.add(new ModelBox(foot2, 124, 0, -2.5F, -1.0F, -4.5F, 5, 8, 9, 0.0F, false));

        this.toes2 = new AdvancedModelRendererExtended(this);
        this.toes2.setRotationPoint(0.0F, 5.6F, 0.6F);
        this.foot2.addChild(toes2);
        this.toes2.cubeList.add(new ModelBox(toes2, 82, 28, -4.0F, -2.5F, -9.0F, 8, 5, 12, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -3.0F, 7.2F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, 0.5918F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 42, 47, -2.0F, -0.4F, -2.0F, 4, 8, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 6.8F, 0.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.5009F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 82, 28, -1.5F, -1.0F, -1.5F, 3, 9, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5 * 1.33f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.jaw1.rotateAngleX = (float) Math.toRadians(2);
        this.head1.rotateAngleX = (float) Math.toRadians(7);
        this.head1.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.root.offsetY = -0.45F;

        EntityPrehistoricFloraLisowicia Lisowicia = (EntityPrehistoricFloraLisowicia) e;
        float masterSpeed = Lisowicia.getTravelSpeed();

        this.faceTarget(f3, f4, 2, neck1);
        this.faceTarget(f3, f4, 4, head1);

        AdvancedModelRendererExtended[] Tail = {this.tail1, this.tail2};

        //if (Lisowicia.getAnimation() == Lisowicia.LAY_ANIMATION) {
            //this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            //this.chainFlap(Tail, (0.06F*0.9F) * 3, 0.10F, 0.10F, f2, 1F);
            //this.chainSwing(Tail, (0.06F*0.9F) * 2F * 3, 0.05F, 0.06F, f2, 1F);
            //return;
        //}

        if (f3 == 0.0F || !Lisowicia.getIsMoving()) { //Not moving
            this.swing(neck1, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck1, 0.06F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.6F), 0.20F, 0.2F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);
            this.walk(tail1, (0.06F*0.6F) * 1.5F, -0.10F, false, 0F, 0.1F, f2, 1F);
            return;
        }

        float speed = masterSpeed / 4.365F;
        if (Lisowicia.getIsFast()) {
            speed = speed * 1.5F;
        }

        //this.root.offsetY = -0.50F;
        this.upperarm2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(2.8), false, 1, f2, 1.5F);;
        this.upperarm1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(2.8), false, 4, f2, 1.5F);;
        this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.walk(upperarm2, speed, 0.50F, true, 5, 0.30F, f2, 1F);
        this.walk(upperarm1, speed, 0.50F, true, 8, 0.30F, f2, 1F);
        this.walk(upperleg2, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(upperleg1, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(arm2, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(arm1, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(leg2, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(leg1, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.walk(hand2, speed, 0.40F, true, 2, -0.25F, f2, 1F);
        this.walk(hand1, speed, 0.40F, true, 5, -0.25F, f2, 1F);
        this.walk(foot2, speed, 0.15F, true, 5, -0.09F, f2, 1F);
        this.walk(foot1, speed, 0.15F, true, 2, -0.09F, f2, 1F);
        this.walk(toes2, speed, 0.15F, true, 5, 0.14F, f2, 1F);
        this.walk(toes1, speed, 0.15F, true, 2, 0.14F, f2, 1F);

        this.bobExtended(root, speed * 2F, 0.245F, false, 2.5F,  f2, 1F);

        this.flap(basin, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(body, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(chest, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);

        this.flap(upperleg1, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(upperleg2, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(upperarm1, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
        this.flap(upperarm2, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(chest, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck1, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck1, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);
        this.walk(tail1, (speed*0.6F) * 1.5F, -0.10F, false, 0F, 0.1F, f2, 1F);

        this.root.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(9.0), false, 3.25F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLisowicia e = (EntityPrehistoricFloraLisowicia) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck1, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(7);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.neck1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(6);
        animator.resetKeyframe(6);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
