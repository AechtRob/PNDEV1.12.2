package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSphenotitan;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelSphenotitan extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended bodyfront;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended forelegL;
    private final AdvancedModelRendererExtended forelegL1;
    private final AdvancedModelRendererExtended forelegL2;
    private final AdvancedModelRendererExtended forelegR;
    private final AdvancedModelRendererExtended forelegR2;
    private final AdvancedModelRendererExtended forelegR3;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended hindlegL;
    private final AdvancedModelRendererExtended hindlegL2;
    private final AdvancedModelRendererExtended hindlegL3;
    private final AdvancedModelRendererExtended hindlegR;
    private final AdvancedModelRendererExtended hindlegR2;
    private final AdvancedModelRendererExtended hindlegR3;

    private ModelAnimator animator;

    public ModelSphenotitan() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 26.05F, -3.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 39, -2.5F, -8.0F, -19.75F, 5, 5, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -8.0F, -19.75F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0698F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 39, -2.5F, 0.0F, 0.025F, 5, 1, 2, -0.01F, false));

        this.bodyfront = new AdvancedModelRendererExtended(this);
        this.bodyfront.setRotationPoint(0.0F, -5.0F, -17.75F);
        this.body.addChild(bodyfront);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 0, -3.0F, -3.01F, 0.0F, 6, 5, 10, 0.0F, false));
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 12, 0, -3.5F, -1.26F, 0.0F, 7, 0, 10, 0.0F, false));
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 34, 16, -3.0F, -3.0F, 10.0F, 6, 5, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -3.0F, -1.5F);
        this.bodyfront.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 16, 0.0F, -0.925F, 0.0F, 0, 1, 13, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -3.0F, -2.0F);
        this.bodyfront.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0698F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 53, -3.0F, 0.0F, 11.975F, 6, 1, 2, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 53, -3.0F, -0.01F, 2.0F, 6, 1, 10, -0.01F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -2.1F, 11.75F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, 0.3054F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 30, -2.5F, -1.6893F, -1.2963F, 5, 4, 5, -0.01F, false));
        this.neck.cubeList.add(new ModelBox(neck, 16, 22, 0.0F, -2.7093F, 0.6937F, 0, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 3.3007F, 3.7037F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 43, -1.5F, -1.775F, -4.95F, 3, 2, 4, -0.01F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 6.3007F, 5.9537F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 0, -2.0F, -8.54F, -5.5F, 4, 1, 4, -0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -0.4493F, 3.7037F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.3054F, 0.0F, 0.0F);


        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, -0.25F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 33, -2.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 15, -2.0F, -2.0F, 0.0F, 4, 2, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 6, -1.5F, 0.0F, 4.0F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 57, 39, -0.5F, -0.35F, 5.95F, 1, 1, 0, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, 4.0F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2705F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 28, -1.5F, -1.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 32, 6, -2.5F, -2.75F, -0.25F, 5, 3, 4, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 19, -2.0F, -1.75F, 3.75F, 4, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -1.75F, 0.0F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 57, 39, -0.5F, 1.95F, 5.5F, 1, 1, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, -1.75F, 0.0F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 17, -1.0F, 1.2F, 5.0F, 2, 2, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, -1.75F, 0.0F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 38, -2.0F, -1.5F, -0.5F, 4, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -1.75F, 0.0F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3491F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 17, -1.5F, -2.25F, 2.75F, 3, 1, 3, 0.0F, false));

        this.forelegL = new AdvancedModelRendererExtended(this);
        this.forelegL.setRotationPoint(-2.5F, 0.0F, 10.75F);
        this.bodyfront.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.6109F, 0.0F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 46, 5, -3.0F, -0.75F, -1.25F, 4, 2, 2, 0.0F, false));

        this.forelegL1 = new AdvancedModelRendererExtended(this);
        this.forelegL1.setRotationPoint(-2.5F, 0.0F, -0.25F);
        this.forelegL.addChild(forelegL1);
        this.setRotateAngle(forelegL1, 1.4399F, 0.6981F, 1.2217F);
        this.forelegL1.cubeList.add(new ModelBox(forelegL1, 48, 21, -0.65F, 0.0F, -1.01F, 2, 3, 2, 0.0F, false));

        this.forelegL2 = new AdvancedModelRendererExtended(this);
        this.forelegL2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.forelegL1.addChild(forelegL2);
        this.setRotateAngle(forelegL2, -0.3491F, -0.7418F, -0.6109F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 44, 38, -1.5F, 0.05F, -1.01F, 3, 1, 3, 0.0F, false));

        this.forelegR = new AdvancedModelRendererExtended(this);
        this.forelegR.setRotationPoint(2.5F, 0.0F, 10.75F);
        this.bodyfront.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.0F, 0.6109F, 0.0F);
        this.forelegR.cubeList.add(new ModelBox(forelegR, 0, 23, -1.0F, -0.75F, -1.25F, 4, 2, 2, 0.0F, false));

        this.forelegR2 = new AdvancedModelRendererExtended(this);
        this.forelegR2.setRotationPoint(2.5F, 0.0F, -0.25F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 1.4399F, -0.6981F, -1.2217F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 48, 11, -1.35F, 0.0F, -1.01F, 2, 3, 2, 0.0F, false));

        this.forelegR3 = new AdvancedModelRendererExtended(this);
        this.forelegR3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.forelegR2.addChild(forelegR3);
        this.setRotateAngle(forelegR3, -0.3491F, 0.7418F, 0.6109F);
        this.forelegR3.cubeList.add(new ModelBox(forelegR3, 16, 21, -1.5F, 0.05F, -1.01F, 3, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -7.0F, -19.75F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.3054F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 20, 33, -2.0F, -0.75F, -3.5F, 4, 4, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 5, 0.0F, -1.5F, -3.5F, 0, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.75F, -3.25F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2007F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 18, 20, -1.5F, -1.0F, -9.75F, 3, 3, 10, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 7, 0.0F, -1.75F, -9.75F, 0, 1, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, -9.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0698F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 15, -1.0F, -0.5F, -11.0F, 2, 2, 12, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 4, 0.0F, -1.25F, -11.0F, 0, 1, 11, 0.0F, false));

        this.hindlegL = new AdvancedModelRendererExtended(this);
        this.hindlegL.setRotationPoint(-2.0F, -5.5F, -17.75F);
        this.body.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 0.2618F, 0.0F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 14, 41, -4.0F, -0.5F, -1.75F, 5, 2, 3, 0.0F, false));

        this.hindlegL2 = new AdvancedModelRendererExtended(this);
        this.hindlegL2.setRotationPoint(-3.25F, 0.5F, 0.0F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, -1.0734F, -0.0873F, 0.0F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 14, 46, -1.5F, 0.0F, -1.01F, 3, 4, 2, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRendererExtended(this);
        this.hindlegL3.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 1.1994F, -0.3716F, -0.7848F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 0, 46, -1.5F, 0.0F, -0.51F, 3, 1, 4, 0.0F, false));

        this.hindlegR = new AdvancedModelRendererExtended(this);
        this.hindlegR.setRotationPoint(2.0F, -5.5F, -17.75F);
        this.body.addChild(hindlegR);
        this.setRotateAngle(hindlegR, 0.0F, -0.2618F, 0.0F);
        this.hindlegR.cubeList.add(new ModelBox(hindlegR, 34, 23, -1.0F, -0.5F, -1.75F, 5, 2, 3, 0.0F, false));

        this.hindlegR2 = new AdvancedModelRendererExtended(this);
        this.hindlegR2.setRotationPoint(3.25F, 0.5F, 0.0F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, -1.0734F, 0.0873F, 0.0F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 0, 0, -1.5F, 0.0F, -1.01F, 3, 4, 2, 0.0F, false));

        this.hindlegR3 = new AdvancedModelRendererExtended(this);
        this.hindlegR3.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.hindlegR2.addChild(hindlegR3);
        this.setRotateAngle(hindlegR3, 1.1994F, 0.3716F, 0.7848F);
        this.hindlegR3.cubeList.add(new ModelBox(hindlegR3, 40, 43, -1.5F, 0.0F, -0.51F, 3, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.2f);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.offsetZ = 1.8F;
        this.jaw.rotateAngleX = (float) Math.toRadians(-12.5);
        this.head.rotateAngleY = (float) Math.toRadians(15.6);
        this.head.rotateAngleZ = (float) Math.toRadians(-1.7);
        this.neck.rotateAngleY = (float) Math.toRadians(11.9);
        this.bodyfront.rotateAngleY = (float) Math.toRadians(-12.5);
        this.tail.rotateAngleY = (float) Math.toRadians(4.7);
        this.tail2.rotateAngleY = (float) Math.toRadians(14.6);
        this.tail3.rotateAngleY = (float) Math.toRadians(-14.9);
        this.forelegR.rotateAngleY = (float) Math.toRadians(22.5);
        this.hindlegR.rotateAngleY = (float) Math.toRadians(-45);
        this.body.render(0.1F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.body.rotateAngleY = (float)Math.toRadians(180);
        this.body.offsetY = 1.2F;
        this.body.offsetZ = -0.10F;

        EntityPrehistoricFloraSphenotitan entitySphenotitan = (EntityPrehistoricFloraSphenotitan) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRendererExtended[] Torso = {this.bodyfront, this.body};

        float speed = 0.65F;

        //EntityPrehistoricFloraentitySphenotitan entitySphenotitan = (EntityPrehistoricFloraentitySphenotitan) e;
        if (f3 == 0.0F || !entitySphenotitan.getIsMoving()) { //Not moving
            this.chainWave(Tail, speed * 0.23F, 0.025F, -1.5, f2, 1);
            this.chainSwing(Tail, speed * 0.2F, 0.08F, -1.8, f2, 0.8F);
            return;
        }

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
        this.walk(forelegL1, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
        this.flap(forelegL2, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
        this.walk(forelegL2, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
        this.swing(forelegL2, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);

        this.flap(forelegR, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
        this.swing(forelegR, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
        this.walk(forelegR2, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
        this.flap(forelegR3, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
        this.walk(forelegR3, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
        this.swing(forelegR3, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);

        this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
        this.chainSwing(Tail, speed * 0.8F, 0.18F, -2.4, f2, 0.8F);
        this.chainSwing(Torso, speed, 0.08F, -2, f2, 0.75F);
        
        this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.5), false, 1.5F, f2, 1) - 0.10F;

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSphenotitan e = (EntityPrehistoricFloraSphenotitan) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
