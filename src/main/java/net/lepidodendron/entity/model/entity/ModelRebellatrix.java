package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelRebellatrix extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Forehead;
    private final AdvancedModelRenderer Forehead1;
    private final AdvancedModelRenderer Jawangle;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Body1stsegment;
    private final AdvancedModelRenderer Firstdorsal;
    private final AdvancedModelRenderer Body2ndsegment;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer ventral;
    private final AdvancedModelRenderer Seconddorsal;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer tailbase;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer Tailbody;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer Tailnub;
    private final AdvancedModelRenderer Tailfork;
    private final AdvancedModelRenderer ArmL2;
    private final AdvancedModelRenderer ArmR2;
    private final AdvancedModelRenderer ArmL;
    private final AdvancedModelRenderer ArmR;

    private ModelAnimator animator;

    public ModelRebellatrix() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, 13.0F, -6.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-1.0F, 0.0F, -2.0F);
        this.body.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 46, 20, -3.0F, -3.0F, -6.0F, 7, 7, 7, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 56, 0, -2.5F, -2.0F, -10.0F, 6, 3, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 61, 43, -1.5F, -1.0F, -13.0F, 4, 2, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, 3.51F, -1.5F, -8.5F, 0, 1, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -2.51F, -1.5F, -8.5F, 0, 1, 1, 0.0F, true));

        this.Forehead = new AdvancedModelRenderer(this);
        this.Forehead.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Head.addChild(Forehead);
        this.setRotateAngle(Forehead, 0.3054F, 0.0F, 0.0F);
        this.Forehead.cubeList.add(new ModelBox(Forehead, 58, 38, -2.0F, -1.0F, -10.0F, 5, 1, 4, 0.0F, false));
        this.Forehead.cubeList.add(new ModelBox(Forehead, 63, 7, -1.0F, -1.0F, -13.0F, 3, 1, 3, 0.0F, false));

        this.Forehead1 = new AdvancedModelRenderer(this);
        this.Forehead1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Forehead.addChild(Forehead1);
        this.setRotateAngle(Forehead1, -0.0873F, 0.0F, 0.0F);
        this.Forehead1.cubeList.add(new ModelBox(Forehead1, 0, 0, -2.5F, -0.3F, -6.1F, 6, 2, 7, -0.01F, false));

        this.Jawangle = new AdvancedModelRenderer(this);
        this.Jawangle.setRotationPoint(1.0F, 0.875F, -6.2F);
        this.Head.addChild(Jawangle);
        this.setRotateAngle(Jawangle, -0.5236F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.0F, -1.0F);
        this.Jawangle.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 56, 11, -3.5F, -2.6F, -2.0F, 6, 2, 4, -0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 3.0F, -6.0F);
        this.Head.addChild(Jaw);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 1.0F, 0.0F);
        this.Jaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 58, -3.0F, -2.0F, -4.0F, 5, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 1.0F, -4.0F);
        this.Jaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 56, -2.0F, -3.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.Body1stsegment = new AdvancedModelRenderer(this);
        this.Body1stsegment.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.body.addChild(Body1stsegment);
        this.Body1stsegment.cubeList.add(new ModelBox(Body1stsegment, 22, 0, -3.5F, -4.5F, 0.5F, 6, 9, 11, 0.0F, false));

        this.Firstdorsal = new AdvancedModelRenderer(this);
        this.Firstdorsal.setRotationPoint(0.0F, -4.0F, 8.0F);
        this.Body1stsegment.addChild(Firstdorsal);
        this.setRotateAngle(Firstdorsal, -0.3491F, 0.0F, 0.0F);
        this.Firstdorsal.cubeList.add(new ModelBox(Firstdorsal, 46, 49, 0.0F, -9.0F, 0.0F, 0, 9, 7, 0.0F, false));

        this.Body2ndsegment = new AdvancedModelRenderer(this);
        this.Body2ndsegment.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Body1stsegment.addChild(Body2ndsegment);
        this.Body2ndsegment.cubeList.add(new ModelBox(Body2ndsegment, 0, 43, -3.0F, -4.5F, 0.5F, 5, 9, 8, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Body2ndsegment.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 29, 33, -2.5F, -4.0F, -2.0F, 4, 8, 9, 0.0F, false));

        this.ventral = new AdvancedModelRenderer(this);
        this.ventral.setRotationPoint(0.0F, 4.0F, 2.0F);
        this.Body3.addChild(ventral);
        this.setRotateAngle(ventral, -0.829F, 0.0F, 0.0F);
        this.ventral.cubeList.add(new ModelBox(ventral, 46, 29, -0.4F, -3.8257F, -1.1234F, 0, 5, 8, 0.0F, false));

        this.Seconddorsal = new AdvancedModelRenderer(this);
        this.Seconddorsal.setRotationPoint(0.0F, -4.0F, 2.0F);
        this.Body3.addChild(Seconddorsal);
        this.setRotateAngle(Seconddorsal, 0.7854F, 0.0F, 0.0F);
        this.Seconddorsal.cubeList.add(new ModelBox(Seconddorsal, 19, 64, -1.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));
        this.Seconddorsal.cubeList.add(new ModelBox(Seconddorsal, 26, 40, -0.4F, -2.0F, -2.0F, 0, 5, 10, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 48, 43, -2.0F, -3.0F, 0.0F, 3, 6, 7, 0.0F, false));

        this.tailbase = new AdvancedModelRenderer(this);
        this.tailbase.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body4.addChild(tailbase);
        this.tailbase.cubeList.add(new ModelBox(tailbase, 0, 57, -0.4F, -5.0F, 0.0F, 0, 10, 3, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 45, 0, -1.5F, -2.0F, 1.0F, 2, 4, 7, 0.0F, false));

        this.Tailbody = new AdvancedModelRenderer(this);
        this.Tailbody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body5.addChild(Tailbody);
        this.Tailbody.cubeList.add(new ModelBox(Tailbody, 22, 12, -0.4F, -11.0F, 0.0F, 0, 22, 8, 0.0F, false));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 36, 59, -1.0F, -1.0F, 1.0F, 1, 2, 6, 0.0F, false));

        this.Tailnub = new AdvancedModelRenderer(this);
        this.Tailnub.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body6.addChild(Tailnub);
        this.Tailnub.cubeList.add(new ModelBox(Tailnub, 38, 15, -0.4F, -2.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.Tailfork = new AdvancedModelRenderer(this);
        this.Tailfork.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body6.addChild(Tailfork);
        this.Tailfork.cubeList.add(new ModelBox(Tailfork, 0, 0, -0.4F, -16.0F, 0.0F, 0, 32, 11, 0.0F, false));

        this.ArmL2 = new AdvancedModelRenderer(this);
        this.ArmL2.setRotationPoint(2.0F, 4.0F, 3.0F);
        this.Body2ndsegment.addChild(ArmL2);
        this.setRotateAngle(ArmL2, -0.6181F, 0.1427F, -0.1008F);
        this.ArmL2.cubeList.add(new ModelBox(ArmL2, 62, 63, -1.0F, 0.0F, -1.0F, 1, 2, 4, 0.0F, false));
        this.ArmL2.cubeList.add(new ModelBox(ArmL2, 6, 55, -0.1F, -1.0F, 1.0F, 0, 4, 5, 0.0F, false));

        this.ArmR2 = new AdvancedModelRenderer(this);
        this.ArmR2.setRotationPoint(-3.0F, 4.0F, 3.0F);
        this.Body2ndsegment.addChild(ArmR2);
        this.setRotateAngle(ArmR2, -0.6181F, -0.1427F, 0.1008F);
        this.ArmR2.cubeList.add(new ModelBox(ArmR2, 56, 61, 0.0F, 0.0F, -1.0F, 1, 2, 4, 0.0F, false));
        this.ArmR2.cubeList.add(new ModelBox(ArmR2, 18, 38, 0.1F, -1.0F, 1.0F, 0, 4, 5, 0.0F, false));

        this.ArmL = new AdvancedModelRenderer(this);
        this.ArmL.setRotationPoint(3.0F, 2.0F, 1.0F);
        this.Body1stsegment.addChild(ArmL);
        this.setRotateAngle(ArmL, -0.3237F, 0.3323F, -0.109F);
        this.ArmL.cubeList.add(new ModelBox(ArmL, 11, 60, -1.0F, -1.0F, 0.0F, 1, 2, 5, 0.0F, false));
        this.ArmL.cubeList.add(new ModelBox(ArmL, 46, 24, -0.1F, -1.0F, 1.0F, 0, 3, 10, 0.0F, false));

        this.ArmR = new AdvancedModelRenderer(this);
        this.ArmR.setRotationPoint(-3.0F, 2.0F, 1.0F);
        this.Body1stsegment.addChild(ArmR);
        this.setRotateAngle(ArmR, -0.3237F, -0.3323F, 0.109F);
        this.ArmR.cubeList.add(new ModelBox(ArmR, 19, 0, -1.0F, -1.0F, 0.0F, 1, 2, 5, 0.0F, false));
        this.ArmR.cubeList.add(new ModelBox(ArmR, 26, 45, -0.9F, -1.0F, 1.0F, 0, 3, 10, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.345F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = -0.13F;
        this.body.offsetY = -0.14F;
        this.body.offsetZ = 0.05F;
        this.body.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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

        this.body.offsetY = 1.0F;
        this.body.offsetZ = -0.1F;

        AdvancedModelRenderer[] fishTail = {this.Body2ndsegment, this.Body3, this.Body4, this.Body5, this.Body6};

        float speed = 0.198F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.2F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.225F;
        }

        speed = speed * 1.3F;

        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.40F * still, -1.05, f2, 0.5F * still);
            this.swing(body, speed, 0.16F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.05F, true, 0, 0, f2, 0.5F);
        }

        this.walk(ArmL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.swing(ArmL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.walk(ArmR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.swing(ArmR, (float) (speed * 0.75), -0.2F, true, 0, 0, f2, 1);

        this.walk(ArmL2, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.swing(ArmL2, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.flap(ArmL2, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

        this.walk(ArmR2, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.swing(ArmR2, (float) (speed * 0.75), -0.2F, true, 3, 0, f2, 1);
        this.flap(ArmR2, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);

        this.walk(ventral, (float) (speed * 0.75), 0.1F, true, 0, -0.05F, f2, 0.5F);
        this.swing(ventral, (float) (speed * 0.75 * 0.5), 0.1F, true, 0, 0.05F, f2, 1);

        this.walk(Seconddorsal, (float) (speed * 0.75), 0.2F, true, 0, -0.1F, f2, 0.5F);
        this.swing(Seconddorsal, (float) (speed * 0.75 * 0.5), 0.1F, true, 0, 0.05F, f2, 1);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 1.0F;
            this.bob(body, -speed * 2.2F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.head, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(3);
    }
}