package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEuparkeria;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEuparkeria extends AdvancedModelBase {
    private final AdvancedModelRenderer bodybase1;
    private final AdvancedModelRenderer bodybase;
    private final AdvancedModelRenderer upperbodybase;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer forelegR;
    private final AdvancedModelRenderer forelegR2;
    private final AdvancedModelRenderer forelegR3;
    private final AdvancedModelRenderer forelegL;
    private final AdvancedModelRenderer forelegL2;
    private final AdvancedModelRenderer forelegL3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer hindlegR;
    private final AdvancedModelRenderer hindlegR2;
    private final AdvancedModelRenderer hindlegR3;
    private final AdvancedModelRenderer hindlegL;
    private final AdvancedModelRenderer hindlegL2;
    private final AdvancedModelRenderer hindlegL3;

    private ModelAnimator animator;

    public ModelEuparkeria() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bodybase1 = new AdvancedModelRenderer(this);
        this.bodybase1.setRotationPoint(0.0F, 24.0F, -2.0F);


        this.bodybase = new AdvancedModelRenderer(this);
        this.bodybase.setRotationPoint(0.0F, -8.7F, 10.5F);
        this.bodybase1.addChild(bodybase);
        this.setRotateAngle(bodybase, 0.0436F, 0.0F, 0.0F);
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 35, -2.0F, -2.1309F, -3.7471F, 4, 5, 8, 0.0F, false));

        this.upperbodybase = new AdvancedModelRenderer(this);
        this.upperbodybase.setRotationPoint(0.0F, -0.1309F, -2.7471F);
        this.bodybase.addChild(upperbodybase);
        this.setRotateAngle(upperbodybase, 0.0873F, 0.0F, 0.0F);
        this.upperbodybase.cubeList.add(new ModelBox(upperbodybase, 0, 0, -2.5F, -2.1F, -11.0F, 5, 6, 11, 0.0F, false));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -2.0F, -11.0F);
        this.upperbodybase.addChild(upperbody);
        this.setRotateAngle(upperbody, 0.0436F, 0.0F, 0.0F);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 25, 38, -2.0F, 0.0F, -4.0F, 4, 5, 5, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.925F, -3.5F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, -0.2705F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 38, 20, -1.0F, -2.0F, -6.5F, 2, 4, 7, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.0F, -6.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);


        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 39, 45, -1.0F, 0.0F, -8.0F, 2, 1, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 17, 38, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 22, 5, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 15, 49, -1.5F, -3.0F, -3.0F, 3, 3, 3, 0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 36, 9, -1.0F, -2.0F, -8.0F, 2, 2, 5, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 44, 38, -1.0F, -0.75F, -8.0F, 2, 1, 5, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.0F, -8.0F);
        this.upperjaw.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 49, -1.0F, 0.0F, 0.1F, 2, 1, 5, -0.01F, false));

        this.forelegR = new AdvancedModelRenderer(this);
        this.forelegR.setRotationPoint(-2.0F, 3.425F, -3.0F);
        this.upperbody.addChild(forelegR);
        this.setRotateAngle(forelegR, -0.2705F, -0.3927F, 0.0873F);
        this.forelegR.cubeList.add(new ModelBox(forelegR, 20, 20, -1.5F, -1.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.forelegR2 = new AdvancedModelRenderer(this);
        this.forelegR2.setRotationPoint(-0.5F, 0.0F, 4.0F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 0.0873F, 0.0F, 0.0F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 28, 49, -0.99F, 0.0F, -1.0F, 2, 5, 2, 0.0F, true));

        this.forelegR3 = new AdvancedModelRenderer(this);
        this.forelegR3.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.forelegR2.addChild(forelegR3);
        this.setRotateAngle(forelegR3, 0.0F, 0.3491F, 0.0F);
        this.forelegR3.cubeList.add(new ModelBox(forelegR3, 22, 0, -1.99F, 0.0F, -4.0F, 4, 0, 4, 0.0F, true));

        this.forelegL = new AdvancedModelRenderer(this);
        this.forelegL.setRotationPoint(2.0F, 3.425F, -3.0F);
        this.upperbody.addChild(forelegL);
        this.setRotateAngle(forelegL, -0.2705F, 0.3927F, -0.0873F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 20, 20, -0.5F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.forelegL2 = new AdvancedModelRenderer(this);
        this.forelegL2.setRotationPoint(0.5F, 0.0F, 4.0F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0873F, 0.0F, 0.0F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 28, 49, -1.01F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false));

        this.forelegL3 = new AdvancedModelRenderer(this);
        this.forelegL3.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.0F, -0.3491F, 0.0F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 22, 0, -2.01F, 0.0F, -4.0F, 4, 0, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5309F, 4.2529F);
        this.bodybase.addChild(tail);
        this.setRotateAngle(tail, -0.2705F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 18, -1.5F, -1.0F, -0.75F, 3, 3, 13, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 12.25F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 23, -1.0F, -0.5F, -1.0F, 2, 2, 12, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 10.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2618F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 20, 5, -0.5F, -0.5F, -1.0F, 1, 1, 13, 0.0F, false));

        this.hindlegR = new AdvancedModelRenderer(this);
        this.hindlegR.setRotationPoint(-2.0F, -10.05F, 10.0F);
        this.bodybase1.addChild(hindlegR);
        this.setRotateAngle(hindlegR, -0.0873F, 0.1745F, 0.0F);
        this.hindlegR.cubeList.add(new ModelBox(hindlegR, 0, 18, -1.5F, 0.0F, -2.0F, 2, 5, 4, 0.0F, true));

        this.hindlegR2 = new AdvancedModelRenderer(this);
        this.hindlegR2.setRotationPoint(-0.5F, 4.1F, -0.5F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.0873F, 0.0F, 0.0F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 0, 0, -1.0F, 0.0F, -1.0F, 2, 6, 3, -0.01F, true));

        this.hindlegR3 = new AdvancedModelRenderer(this);
        this.hindlegR3.setRotationPoint(0.0F, 6.0F, -1.0F);
        this.hindlegR2.addChild(hindlegR3);
        this.hindlegR3.cubeList.add(new ModelBox(hindlegR3, 36, 0, -2.0F, 0.0F, -6.0F, 4, 0, 8, 0.0F, true));

        this.hindlegL = new AdvancedModelRenderer(this);
        this.hindlegL.setRotationPoint(2.0F, -10.05F, 10.0F);
        this.bodybase1.addChild(hindlegL);
        this.setRotateAngle(hindlegL, -0.0873F, -0.1745F, 0.0F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 0, 18, -0.5F, 0.0F, -2.0F, 2, 5, 4, 0.0F, false));

        this.hindlegL2 = new AdvancedModelRenderer(this);
        this.hindlegL2.setRotationPoint(0.5F, 4.1F, -0.5F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0873F, 0.0F, 0.0F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 0, 0, -1.0F, 0.0F, -1.0F, 2, 6, 3, -0.01F, false));

        this.hindlegL3 = new AdvancedModelRenderer(this);
        this.hindlegL3.setRotationPoint(0.0F, 6.0F, -1.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 36, 0, -2.0F, 0.0F, -6.0F, 4, 0, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.bodybase1.render(f5 * 0.2f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.bodybase1.offsetZ = -0.71F;
        this.bodybase1.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
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
        this.bodybase1.offsetY = 1.2F;

        EntityPrehistoricFloraEuparkeria Euparkeria = (EntityPrehistoricFloraEuparkeria) e;

        this.faceTarget(f3, f4, 8, upperbody);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Torso = {this.upperbody, this.upperbodybase, this.bodybase};
        Euparkeria.tailBuffer.applyChainSwingBuffer(Tail);

        float speed = 1.15F;

        //EntityPrehistoricFloraEuparkeria Euparkeria = (EntityPrehistoricFloraEuparkeria) e;
        if (f3 == 0.0F || !Euparkeria.getIsMoving()) { //Not moving
            this.chainWave(Tail, speed * 0.33F, 0.025F, -1.5, f2, 1);
            this.chainSwing(Tail, speed * 0.2F, 0.08F, -1.8, f2, 0.8F);
            return;
        }

        if (Euparkeria.getIsFast()) {
            speed = speed * 1.40F;
            
            this.bodybase1.offsetY = 1.10F;
            this.bodybase1.rotateAngleX = (float)(Math.toRadians(-30));
            this.hindlegL.rotateAngleX = (float)(Math.toRadians(25));
            this.hindlegR.rotateAngleX = (float)(Math.toRadians(25));
            this.tail.rotateAngleX = (float)(Math.toRadians(15));
            this.tail2.rotateAngleX = (float)(Math.toRadians(2.5));
            this.tail3.rotateAngleX = (float)(Math.toRadians(10));
            this.upperbodybase.rotateAngleX = (float)(Math.toRadians(0));
            this.upperbody.rotateAngleX = (float)(Math.toRadians(15));
            this.neck.rotateAngleX = (float)(Math.toRadians(-3));

            this.forelegL.rotateAngleX = (float)(Math.toRadians(-38));
            this.forelegR.rotateAngleX = (float)(Math.toRadians(-38));
            this.forelegL2.rotateAngleX = (float)(Math.toRadians(25));
            this.forelegR2.rotateAngleX = (float)(Math.toRadians(25));
            this.forelegL3.rotateAngleX = (float)(Math.toRadians(40));
            this.forelegR3.rotateAngleX = (float)(Math.toRadians(40));

            this.flap(hindlegL, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
            this.swing(hindlegL, speed, -0.5F, true, -1, 1F, f2, 0.5F);
            this.walk(hindlegL2, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
            this.flap(hindlegL2, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
            this.flap(hindlegL3, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
            this.walk(hindlegL3, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
            this.swing(hindlegL3, speed, 0.2F, false, 3, 0F, f2, 0.5F);

            this.flap(hindlegR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(hindlegR, speed, 0.5F, true, 2, -1F, f2, 0.5F);
            this.walk(hindlegR2, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
            this.flap(hindlegR2, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
            this.flap(hindlegR3, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
            this.walk(hindlegR3, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
            this.swing(hindlegR3, speed, -0.2F, false, 6, 0F, f2, 0.5F);

            float foreleg = 1.5F;
            this.flap(forelegL, speed, 0.45F * foreleg, false, 0, -0.18F * foreleg, f2, 0.5F);
            this.swing(forelegL, speed, -0.75F * foreleg, true, 2, 0.5F * foreleg, f2, 0.5F);
            this.walk(forelegL2, speed, -0.5F * foreleg, true, 0, 0.0F * foreleg, f2, 0.8F);
            this.flap(forelegL3, speed, 0.2F * foreleg, false, -1.5F, 0.4F * foreleg, f2, 0.3F);
            this.walk(forelegL3, speed, 0.2F * foreleg, false, -1.5F, 0.4F * foreleg, f2, 0.5F);
            this.swing(forelegL3, speed, 0.2F * foreleg, false, -1.5F, 0F * foreleg, f2, 0.5F);

            this.flap(forelegR, speed, -0.45F * foreleg, false, -3, 0.18F * foreleg, f2, 0.5F);
            this.swing(forelegR, speed, 0.75F * foreleg, true, -1, -0.5F * foreleg, f2, 0.5F);
            this.walk(forelegR2, speed, -0.5F * foreleg, true, -3, 0.0F * foreleg, f2, 0.8F);
            this.flap(forelegR3, speed, -0.2F * foreleg, false, 1.5F, -0.4F * foreleg, f2, 0.3F);
            this.walk(forelegR3, speed, 0.2F * foreleg, false, 1.5F, 0.4F * foreleg, f2, 0.5F);
            this.swing(forelegR3, speed, -0.2F * foreleg, false, 1.5F, 0F * foreleg, f2, 0.5F);

            this.chainWave(Tail, speed, 0.1F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.8F, 0.23F, -2.4, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.12F, -2, f2, 0.75F);
            this.bob(bodybase1, speed, 0.25F, false, f2, 1F);
            this.swing(bodybase1, speed, 0.08F, false, 0, 0.04F, f2, 0.85F);

        }
        else {
            this.flap(hindlegL, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
            this.swing(hindlegL, speed, -0.5F, true, -1, 1F, f2, 0.5F);
            this.walk(hindlegL2, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
            this.flap(hindlegL2, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
            this.flap(hindlegL3, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
            this.walk(hindlegL3, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
            this.swing(hindlegL3, speed, 0.2F, false, 3, 0F, f2, 0.5F);

            this.flap(hindlegR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(hindlegR, speed, 0.5F, true, 2, -1F, f2, 0.5F);
            this.walk(hindlegR2, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
            this.flap(hindlegR2, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
            this.flap(hindlegR3, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
            this.walk(hindlegR3, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
            this.swing(hindlegR3, speed, -0.2F, false, 6, 0F, f2, 0.5F);

            this.flap(forelegL, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
            this.swing(forelegL, speed, -0.75F, true, 2, 0.5F, f2, 0.5F);
            this.walk(forelegL2, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
            this.flap(forelegL3, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
            this.walk(forelegL3, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
            this.swing(forelegL3, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);

            this.flap(forelegR, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
            this.swing(forelegR, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
            this.walk(forelegR2, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
            this.flap(forelegR3, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
            this.walk(forelegR3, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
            this.swing(forelegR3, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.1F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.8F, 0.18F, -2.4, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.08F, -2, f2, 0.75F);
            this.swing(bodybase1, speed, 0.08F, false, 0, 0.04F, f2, 0.75F);

        }
    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEuparkeria e = (EntityPrehistoricFloraEuparkeria) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.upperbody, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.upperbody, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
