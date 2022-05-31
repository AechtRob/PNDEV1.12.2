package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCoelurosauravus;
import net.lepidodendron.entity.EntityPrehistoricFloraGlaurung;
import net.lepidodendron.entity.EntityPrehistoricFloraRautiania;
import net.lepidodendron.entity.EntityPrehistoricFloraWeigeltisaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelWeigeltisaurid extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended body;
    public AdvancedModelRendererExtended neck;
    public AdvancedModelRendererExtended pelvis;
    public AdvancedModelRendererExtended leftfrontleg1;
    public AdvancedModelRendererExtended rightfrontleg1;
    public AdvancedModelRendererExtended wingleft;
    public AdvancedModelRendererExtended wingright;
    public AdvancedModelRendererExtended head;
    public AdvancedModelRendererExtended lowerjaw1;
    public AdvancedModelRendererExtended brow;
    public AdvancedModelRendererExtended lowerjaw2;
    public AdvancedModelRendererExtended upperjaw;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended leftrearleg1;
    public AdvancedModelRendererExtended rightrearleg1;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended tail3;
    public AdvancedModelRendererExtended leftrearleg2;
    public AdvancedModelRendererExtended lefthindfoot;
    public AdvancedModelRendererExtended rightrearleg2;
    public AdvancedModelRendererExtended righthindfoot;
    public AdvancedModelRendererExtended leftfrontleg2;
    public AdvancedModelRendererExtended leftfrontfoot;
    public AdvancedModelRendererExtended rightfrontleg2;
    public AdvancedModelRendererExtended rightfrontfoot;

    private ModelAnimator animator;

    public ModelWeigeltisaurid() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.lowerjaw1 = new AdvancedModelRendererExtended(this, 38, 32);
        this.lowerjaw1.setRotationPoint(0.0F, 0.2F, -0.9F);
        this.lowerjaw1.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(lowerjaw1, -0.1165565155089522F, 0.0F, 0.0F);
        this.rightrearleg1 = new AdvancedModelRendererExtended(this, 8, 42);
        this.rightrearleg1.setRotationPoint(-0.8F, 0.4F, 1.8F);
        this.rightrearleg1.addBox(-3.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(rightrearleg1, -0.05235987755982988F, -0.3665191429188092F, -0.3141592653589793F);
        this.leftrearleg2 = new AdvancedModelRendererExtended(this, 33, 25);
        this.leftrearleg2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leftrearleg2.addBox(-0.3F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(leftrearleg2, -0.3665191429188092F, -0.41887902047863906F, 1.0821041362364843F);
        this.rightrearleg2 = new AdvancedModelRendererExtended(this, 33, 27);
        this.rightrearleg2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.rightrearleg2.addBox(-2.7F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(rightrearleg2, -0.18203784098300857F, 0.41887902047863906F, -1.0471975511965976F);
        this.head = new AdvancedModelRendererExtended(this, 0, 12);
        this.head.setRotationPoint(0.0F, -0.3F, -1.9F);
        this.head.addBox(-1.5F, -0.7F, -1.8F, 3, 2, 2, 0.0F);
        this.setRotateAngle(head, 0.40980330836826856F, 0.0F, 0.0F);
        this.leftrearleg1 = new AdvancedModelRendererExtended(this, 0, 41);
        this.leftrearleg1.setRotationPoint(0.8F, 0.4F, 1.8F);
        this.leftrearleg1.addBox(0.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(leftrearleg1, 0.05235987755982988F, 0.3665191429188092F, 0.3141592653589793F);
        this.leftfrontfoot = new AdvancedModelRendererExtended(this, 21, 23);
        this.leftfrontfoot.setRotationPoint(2.7F, 0.0F, 0.0F);
        this.leftfrontfoot.addBox(-0.5F, -1.0F, -2.4F, 1, 2, 3, 0.0F);
        this.setRotateAngle(leftfrontfoot, 0.0F, -0.7853981633974483F, 0.20943951023931953F);
        this.leftfrontleg1 = new AdvancedModelRendererExtended(this, 21, 20);
        this.leftfrontleg1.setRotationPoint(1.6F, 0.3F, -2.8F);
        this.leftfrontleg1.addBox(0.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(leftfrontleg1, 0.0F, -0.6981317007977318F, 0.6981317007977318F);
        this.pelvis = new AdvancedModelRendererExtended(this, 0, 17);
        this.pelvis.setRotationPoint(0.0F, 0.0F, 8.5F);
        this.pelvis.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(pelvis, -0.18203784098300857F, 0.0F, 0.0F);
        this.brow = new AdvancedModelRendererExtended(this, 0, 45);
        this.brow.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.brow.addBox(-2.0F, -0.8F, -2.0F, 4, 1, 5, 0.0F);
        this.setRotateAngle(brow, 0.06044430043759062F, 0.0F, 0.0F);
        this.neck = new AdvancedModelRendererExtended(this, 0, 23);
        this.neck.setRotationPoint(0.0F, -0.3F, -4.0F);
        this.neck.addBox(-1.5F, -1.0F, -2.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(neck, -0.27314402793711257F, 0.0F, 0.0F);
        this.rightfrontleg1 = new AdvancedModelRendererExtended(this, 38, 35);
        this.rightfrontleg1.setRotationPoint(-1.6F, 0.3F, -2.8F);
        this.rightfrontleg1.addBox(-3.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(rightfrontleg1, 0.0F, 0.6981317007977318F, -0.6981317007977318F);
        this.wingright = new AdvancedModelRendererExtended(this, 0, 10);
        this.wingright.setRotationPoint(2.0F, 0.5F, -1.3F);
        this.wingright.addBox(0.0F, 0.0F, 0.0F, 26, 0, 10, 0.0F);
        this.tail1 = new AdvancedModelRendererExtended(this, 26, 32);
        this.tail1.setRotationPoint(0.0F, -0.3F, 2.5F);
        this.tail1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(tail1, 0.05235987755982988F, 0.0F, 0.0F);
        this.lowerjaw2 = new AdvancedModelRendererExtended(this, 10, 37);
        this.lowerjaw2.setRotationPoint(0.0F, 0.1F, -3.0F);
        this.lowerjaw2.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 4, 0.0F);
        this.tail3 = new AdvancedModelRendererExtended(this, 33, 20);
        this.tail3.setRotationPoint(0.0F, -0.3F, 9.5F);
        this.tail3.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 9, 0.0F);
        this.setRotateAngle(tail3, 0.27314402793711257F, 0.0F, 0.0F);
        this.rightfrontfoot = new AdvancedModelRendererExtended(this, 33, 20);
        this.rightfrontfoot.setRotationPoint(-2.7F, 0.2F, 0.0F);
        this.rightfrontfoot.addBox(-0.5F, -1.0F, -2.4F, 1, 2, 3, 0.0F);
        this.setRotateAngle(rightfrontfoot, 0.0F, 0.7853981633974483F, -0.20943951023931953F);
        this.lefthindfoot = new AdvancedModelRendererExtended(this, 0, 0);
        this.lefthindfoot.setRotationPoint(2.7F, 0.0F, 0.0F);
        this.lefthindfoot.addBox(-0.5F, -1.0F, -3.5F, 1, 2, 4, 0.0F);
        this.setRotateAngle(lefthindfoot, -0.9424777960769379F, 0.05235987755982988F, 0.3141592653589793F);
        this.wingleft = new AdvancedModelRendererExtended(this, 0, 0);
        this.wingleft.setRotationPoint(-2.0F, 0.51F, -1.3F);
        this.wingleft.addBox(-26.0F, 0.0F, 0.0F, 26, 0, 10, 0.0F);
        this.leftfrontleg2 = new AdvancedModelRendererExtended(this, 21, 28);
        this.leftfrontleg2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leftfrontleg2.addBox(-0.3F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(leftfrontleg2, 0.0F, 1.2217304763960306F, 0.8726646259971648F);
        this.tail2 = new AdvancedModelRendererExtended(this, 21, 20);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.tail2.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 10, 0.0F);
        this.setRotateAngle(tail2, 0.22759093446006054F, 0.0F, 0.0F);
        this.righthindfoot = new AdvancedModelRendererExtended(this, 0, 6);
        this.righthindfoot.setRotationPoint(-2.7F, 0.0F, 0.0F);
        this.righthindfoot.addBox(-0.5F, -1.0F, -3.5F, 1, 2, 4, 0.0F);
        this.setRotateAngle(righthindfoot, -0.9424777960769379F, -0.05235987755982988F, -0.3141592653589793F);
        this.rightfrontleg2 = new AdvancedModelRendererExtended(this, 0, 31);
        this.rightfrontleg2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.rightfrontleg2.addBox(-2.7F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(rightfrontleg2, 0.0F, -1.2217304763960306F, -0.8726646259971648F);
        this.upperjaw = new AdvancedModelRendererExtended(this, 0, 36);
        this.upperjaw.setRotationPoint(0.0F, 0.3F, 0.0F);
        this.upperjaw.addBox(-1.5F, -1.0F, -4.0F, 3, 1, 4, 0.0F);
        this.body = new AdvancedModelRendererExtended(this, 0, 20);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-2.0F, -1.5F, -4.0F, 4, 3, 13, 0.0F);
        this.head.addChild(this.lowerjaw1);
        this.pelvis.addChild(this.rightrearleg1);
        this.leftrearleg1.addChild(this.leftrearleg2);
        this.rightrearleg1.addChild(this.rightrearleg2);
        this.neck.addChild(this.head);
        this.pelvis.addChild(this.leftrearleg1);
        this.leftfrontleg2.addChild(this.leftfrontfoot);
        this.body.addChild(this.leftfrontleg1);
        this.body.addChild(this.pelvis);
        this.head.addChild(this.brow);
        this.body.addChild(this.neck);
        this.body.addChild(this.rightfrontleg1);
        this.body.addChild(this.wingright);
        this.pelvis.addChild(this.tail1);
        this.lowerjaw1.addChild(this.lowerjaw2);
        this.tail2.addChild(this.tail3);
        this.rightfrontleg2.addChild(this.rightfrontfoot);
        this.leftrearleg2.addChild(this.lefthindfoot);
        this.body.addChild(this.wingleft);
        this.leftfrontleg1.addChild(this.leftfrontleg2);
        this.tail1.addChild(this.tail2);
        this.rightrearleg2.addChild(this.righthindfoot);
        this.rightfrontleg1.addChild(this.rightfrontleg2);
        this.brow.addChild(this.upperjaw);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        if (entity instanceof EntityPrehistoricFloraRautiania) {
            this.body.render(f5 * 0.18F);
        }
        else if (entity instanceof EntityPrehistoricFloraCoelurosauravus) {
            this.body.render(f5 * 0.18F);
        }
        else if (entity instanceof EntityPrehistoricFloraGlaurung) {
            this.body.render(f5 * 0.18F);
        }
        else { //Weigeltisaurus
            this.body.render(f5 * 0.18F);
        }
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.render(0.01F);
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
        if (e instanceof EntityPrehistoricFloraRautiania) {
            this.body.offsetY = 1.45F;
        }
        else if (e instanceof EntityPrehistoricFloraCoelurosauravus) {
            this.body.offsetY = 1.45F;
        }
        else if (e instanceof EntityPrehistoricFloraGlaurung) {
            this.body.offsetY = 1.45F;
        }
        else { //Weigeltisaurus
            this.body.offsetY = 1.45F;
        }

        EntityPrehistoricFloraWeigeltisaurus ee = (EntityPrehistoricFloraWeigeltisaurus) e;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Torso = {this.neck, this.body, this.pelvis};

        this.faceTarget(f3, f4, 2, neck);
        this.faceTarget(f3, f4, 1, head);

        float speed = 0.39F;

        if ((f3 == 0.0F || !ee.getIsMoving()) && (!ee.getIsClimbing() || ee.getHeadCollided()) && !ee.getIsFlying()) {
            //System.err.println("Static animation");
            this.wingleft.rotateAngleY = (float) Math.toRadians(85);
            this.wingright.rotateAngleY = (float) Math.toRadians(-85);
            this.wingleft.scaleZ = 0.33F;
            this.wingright.scaleZ = 0.33F;
            this.chainWave(Tail, speed * 0.33F, 0.025F, -1.5, f2, 1);
            this.chainSwing(Tail, speed * 0.2F, 0.08F, -1.8, f2, 0.8F);
        }
        else if (!ee.getIsFlying()) {
            //System.err.println("Walk animation");
            this.wingleft.rotateAngleY = (float)Math.toRadians(85);
            this.wingright.rotateAngleY = (float)Math.toRadians(-85);
            this.wingleft.scaleZ = 0.33F;
            this.wingright.scaleZ = 0.33F;

            this.flap(leftrearleg1, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
            this.swing(leftrearleg1, speed, -0.5F, true, -1, 1F, f2, 0.5F);
            this.walk(leftrearleg2, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
            this.flap(leftrearleg2, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
            this.flap(lefthindfoot, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
            this.walk(lefthindfoot, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
            this.swing(lefthindfoot, speed, 0.2F, false, 3, 0F, f2, 0.5F);

            this.flap(rightrearleg1, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(rightrearleg1, speed, 0.5F, true, 2, -1F, f2, 0.5F);
            this.walk(rightrearleg2, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
            this.flap(rightrearleg2, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
            this.flap(righthindfoot, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
            this.walk(righthindfoot, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
            this.swing(righthindfoot, speed, -0.2F, false, 6, 0F, f2, 0.5F);

            this.flap(leftfrontleg1, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
            this.swing(leftfrontleg1, speed, -0.75F, true, 2, 0.5F, f2, 0.5F);
            this.walk(leftfrontleg2, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
            this.flap(leftfrontfoot, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
            this.walk(leftfrontfoot, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
            this.swing(leftfrontfoot, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);

            this.flap(rightfrontleg1, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
            this.swing(rightfrontleg1, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
            this.walk(rightfrontleg2, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
            this.flap(rightfrontfoot, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
            this.walk(rightfrontfoot, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
            this.swing(rightfrontfoot, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.1F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.8F, 0.18F, -2.4, f2, 0.8F);
            this.swing(body, speed, 0.1F, false, 0, -0.05F, f2, 0.75F);
            this.bob(body, speed, 0.1F, false, f2, 0.75F);

        }
        else { //flying
            //System.err.println("Flying animation");
            this.wingleft.rotateAngleY = (float)Math.toRadians(0);
            this.wingright.rotateAngleY = (float)Math.toRadians(0);
            this.wingleft.scaleZ = 1.0F;
            this.wingright.scaleZ = 1.0F;
            this.bob(body, speed * 2, 0.1F, false, f2, 1.00F);
            this.flap(body, speed, 0.08F, false, 0F, -0.04F, f2, 1.00F);
            this.chainWave(Tail, speed, 0.15F, -2, f2, 1);
            this.chainSwing(Tail, speed * 0.8F, 0.18F, -2.4, f2, 0.8F);
            this.swing(body, speed, 0.08F, false, 0, -0.04F, f2, 0.75F);

            this.leftfrontleg1.rotateAngleY = (float)Math.toRadians(-5.0);
            this.leftfrontleg1.rotateAngleZ = (float)Math.toRadians(23.48);
            this.leftfrontleg2.rotateAngleX = (float)Math.toRadians(-44.35);
            this.leftfrontleg2.rotateAngleY = (float)Math.toRadians(0);
            this.leftfrontleg2.rotateAngleZ = (float)Math.toRadians(-7.83);
            this.leftfrontfoot.rotateAngleX = (float)Math.toRadians(0);
            this.leftfrontfoot.rotateAngleY = (float)Math.toRadians(-75.65);
            this.leftfrontfoot.rotateAngleZ = (float)Math.toRadians(12.0);
            this.leftrearleg1.rotateAngleY = (float)Math.toRadians(-60.0);
            this.leftrearleg2.rotateAngleZ = (float)Math.toRadians(31.3);
            this.lefthindfoot.rotateAngleZ = (float)Math.toRadians(52.0);

            this.rightfrontleg1.rotateAngleY = (float)Math.toRadians(5.0);
            this.rightfrontleg1.rotateAngleZ = (float)Math.toRadians(-23.48);
            this.rightfrontleg2.rotateAngleX = (float)Math.toRadians(-44.35);
            this.rightfrontleg2.rotateAngleY = (float)Math.toRadians(0);
            this.rightfrontleg2.rotateAngleZ = (float)Math.toRadians(7.83);
            this.rightfrontfoot.rotateAngleX = (float)Math.toRadians(0);
            this.rightfrontfoot.rotateAngleY = (float)Math.toRadians(75.65);
            this.rightfrontfoot.rotateAngleZ = (float)Math.toRadians(-12.0);
            this.rightrearleg1.rotateAngleY = (float)Math.toRadians(60.0);
            this.rightrearleg2.rotateAngleZ = (float)Math.toRadians(-31.3);
            this.righthindfoot.rotateAngleZ = (float)Math.toRadians(-52.0);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraWeigeltisaurus e = (EntityPrehistoricFloraWeigeltisaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck, 0,0,-0.5F);
        animator.rotate(this.neck, (float) Math.toRadians(-20), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.move(this.neck, 0,0,-0.5F);
        animator.rotate(this.neck, (float) Math.toRadians(-20), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.move(this.neck, 0,0,-0.5F);
        animator.rotate(this.neck, (float) Math.toRadians(-20), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.move(this.neck, 0,0,-0.5F);
        animator.rotate(this.neck, (float) Math.toRadians(-20), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

    }

}
