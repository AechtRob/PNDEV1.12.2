package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDiictodon;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelDiictodon extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended body;
    public AdvancedModelRendererExtended bodyfront;
    public AdvancedModelRendererExtended pelvis;
    public AdvancedModelRendererExtended neck;
    public AdvancedModelRendererExtended frontleftleg1;
    public AdvancedModelRendererExtended frontrightleg1;
    public AdvancedModelRendererExtended headbase;
    public AdvancedModelRendererExtended jawbase;
    public AdvancedModelRendererExtended head;
    public AdvancedModelRendererExtended lowerjawjoint;
    public AdvancedModelRendererExtended lowerjaw;
    public AdvancedModelRendererExtended lowermouth;
    public AdvancedModelRendererExtended snoutbase;
    public AdvancedModelRendererExtended snout;
    public AdvancedModelRendererExtended uppermouth;
    public AdvancedModelRendererExtended muzzleleft;
    public AdvancedModelRendererExtended muzzleright;
    public AdvancedModelRendererExtended tuskleft;
    public AdvancedModelRendererExtended tuskright;
    public AdvancedModelRendererExtended frontleftleg2;
    public AdvancedModelRendererExtended frontleftfoot;
    public AdvancedModelRendererExtended frontrightleg2;
    public AdvancedModelRendererExtended frontrightfoot;
    public AdvancedModelRendererExtended tailbase;
    public AdvancedModelRendererExtended rearleftleg1;
    public AdvancedModelRendererExtended rearrightleg1;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended rearleftleg2;
    public AdvancedModelRendererExtended rearleftfoot;
    public AdvancedModelRendererExtended rearrightleg2;
    public AdvancedModelRendererExtended rearrightfoot;

    private ModelAnimator animator;

    public ModelDiictodon() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.frontleftleg2 = new AdvancedModelRendererExtended(this, 41, 52);
        this.frontleftleg2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.frontleftleg2.addBox(0.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(frontleftleg2, 0.2792526803190927F, 0.2792526803190927F, 0.8726646259971648F);
        this.head = new AdvancedModelRendererExtended(this, 0, 39);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-2.5F, -2.0F, -5.0F, 5, 4, 5, 0.0F);
        this.lowerjaw = new AdvancedModelRendererExtended(this, 24, 55);
        this.lowerjaw.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.lowerjaw.addBox(-1.5F, -0.5F, -3.0F, 3, 1, 3, 0.0F);
        this.lowermouth = new AdvancedModelRendererExtended(this, 0, 61);
        this.lowermouth.setRotationPoint(0.0F, -0.5F, -2.1F);
        this.lowermouth.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(lowermouth, -0.3839724354387525F, 0.0F, 0.0F);
        this.headbase = new AdvancedModelRendererExtended(this, 0, 30);
        this.headbase.setRotationPoint(0.0F, -0.7F, -2.5F);
        this.headbase.addBox(-3.0F, -2.2F, -3.5F, 6, 4, 4, 0.0F);
        this.setRotateAngle(headbase, 0.296705972839036F, 0.0F, 0.0F);
        this.lowerjawjoint = new AdvancedModelRendererExtended(this, 23, 51);
        this.lowerjawjoint.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.lowerjawjoint.addBox(-2.5F, 0.0F, -1.0F, 5, 1, 1, 0.0F);
        this.muzzleright = new AdvancedModelRendererExtended(this, 14, 60);
        this.muzzleright.setRotationPoint(-1.8F, 1.1F, -2.0F);
        this.muzzleright.addBox(-0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(muzzleright, -0.5585053606381855F, 0.0F, 0.0F);
        this.muzzleleft = new AdvancedModelRendererExtended(this, 14, 60);
        this.muzzleleft.setRotationPoint(1.8F, 1.1F, -2.0F);
        this.muzzleleft.addBox(-0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(muzzleleft, -0.5585053606381855F, 0.0F, 0.0F);
        this.frontrightfoot = new AdvancedModelRendererExtended(this, 41, 57);
        this.frontrightfoot.setRotationPoint(-3.5F, 0.0F, 0.1F);
        this.frontrightfoot.addBox(-1.0F, -1.5F, -3.0F, 1, 3, 4, 0.0F);
        this.frontrightleg1 = new AdvancedModelRendererExtended(this, 34, 44);
        this.frontrightleg1.setRotationPoint(-1.7F, 1.3F, -2.3F);
        this.frontrightleg1.addBox(-5.0F, -1.5F, -1.5F, 5, 3, 3, 0.0F);
        this.setRotateAngle(frontrightleg1, 0.0F, 0.3839724354387525F, -0.6981317007977318F);
        this.bodyfront = new AdvancedModelRendererExtended(this, 0, 8);
        this.bodyfront.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.bodyfront.addBox(-3.0F, -3.0F, -4.0F, 6, 6, 4, 0.0F);
        this.setRotateAngle(bodyfront, 0.05235987755982988F, 0.0F, 0.0F);
        this.pelvis = new AdvancedModelRendererExtended(this, 40, 19);
        this.pelvis.setRotationPoint(0.0F, -0.3F, 3.2F);
        this.pelvis.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(pelvis, -0.17453292519943295F, 0.0F, 0.0F);
        this.rearrightleg1 = new AdvancedModelRendererExtended(this, 19, 37);
        this.rearrightleg1.setRotationPoint(-1.7F, 0.5F, 4.0F);
        this.rearrightleg1.addBox(-6.0F, -1.5F, -1.5F, 6, 3, 3, 0.0F);
        this.setRotateAngle(rearrightleg1, 0.22689280275926282F, -0.5235987755982988F, -0.5235987755982988F);
        this.tail1 = new AdvancedModelRendererExtended(this, 52, 41);
        this.tail1.setRotationPoint(0.0F, -0.2F, 3.0F);
        this.tail1.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(tail1, 0.03490658503988659F, 0.0F, 0.0F);
        this.tail2 = new AdvancedModelRendererExtended(this, 54, 48);
        this.tail2.setRotationPoint(0.0F, -0.2F, 2.0F);
        this.tail2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tail2, 0.05235987755982988F, 0.0F, 0.0F);
        this.frontleftfoot = new AdvancedModelRendererExtended(this, 41, 57);
        this.frontleftfoot.setRotationPoint(3.5F, 0.0F, 0.1F);
        this.frontleftfoot.addBox(0.0F, -1.5F, -3.0F, 1, 3, 4, 0.0F);
        this.tuskleft = new AdvancedModelRendererExtended(this, 14, 56);
        this.tuskleft.setRotationPoint(0.0F, 1.0F, -0.2F);
        this.tuskleft.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.snout = new AdvancedModelRendererExtended(this, 0, 55);
        this.snout.setRotationPoint(0.0F, -0.6F, -0.4F);
        this.snout.addBox(-1.5F, -1.0F, -3.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(snout, 0.6283185307179586F, 0.0F, 0.0F);
        this.tuskright = new AdvancedModelRendererExtended(this, 14, 56);
        this.tuskright.setRotationPoint(0.0F, 1.0F, -0.2F);
        this.tuskright.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.rearleftleg1 = new AdvancedModelRendererExtended(this, 19, 37);
        this.rearleftleg1.setRotationPoint(1.7F, 0.5F, 4.0F);
        this.rearleftleg1.addBox(0.0F, -1.5F, -1.5F, 6, 3, 3, 0.0F);
        this.setRotateAngle(rearleftleg1, 0.22689280275926282F, 0.5235987755982988F, 0.5235987755982988F);
        this.tailbase = new AdvancedModelRendererExtended(this, 48, 32);
        this.tailbase.setRotationPoint(0.0F, -0.8F, 5.0F);
        this.tailbase.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(tailbase, 0.03490658503988659F, 0.0F, 0.0F);
        this.rearrightleg2 = new AdvancedModelRendererExtended(this, 20, 32);
        this.rearrightleg2.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.rearrightleg2.addBox(-5.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F);
        this.setRotateAngle(rearrightleg2, 0.3490658503988659F, 0.22689280275926282F, -1.2740903539558606F);
        this.frontrightleg2 = new AdvancedModelRendererExtended(this, 41, 52);
        this.frontrightleg2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.frontrightleg2.addBox(-4.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(frontrightleg2, -0.2792526803190927F, -0.2792526803190927F, -0.8726646259971648F);
        this.frontleftleg1 = new AdvancedModelRendererExtended(this, 34, 44);
        this.frontleftleg1.setRotationPoint(1.7F, 1.3F, -2.3F);
        this.frontleftleg1.addBox(0.0F, -1.5F, -1.5F, 5, 3, 3, 0.0F);
        this.setRotateAngle(frontleftleg1, 0.0F, -0.3839724354387525F, 0.6981317007977318F);
        this.neck = new AdvancedModelRendererExtended(this, 2, 21);
        this.neck.setRotationPoint(0.0F, 0.0F, -3.2F);
        this.neck.addBox(-2.0F, -2.5F, -4.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(neck, -0.296705972839036F, 0.0F, 0.0F);
        this.snoutbase = new AdvancedModelRendererExtended(this, 0, 50);
        this.snoutbase.setRotationPoint(0.0F, -0.4F, -4.3F);
        this.snoutbase.addBox(-2.0F, -1.5F, -1.0F, 4, 3, 1, 0.0F);
        this.setRotateAngle(snoutbase, 0.3141592653589793F, 0.0F, 0.0F);
        this.rearleftleg2 = new AdvancedModelRendererExtended(this, 20, 32);
        this.rearleftleg2.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.rearleftleg2.addBox(0.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F);
        this.setRotateAngle(rearleftleg2, 0.3490658503988659F, -0.22689280275926282F, 1.2740903539558606F);
        this.body = new AdvancedModelRendererExtended(this, 28, 0);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-3.5F, -3.5F, -5.5F, 7, 7, 11, 0.0F);
        this.setRotateAngle(body, -0.05235987755982988F, 0.0F, 0.0F);
        this.jawbase = new AdvancedModelRendererExtended(this, 24, 61);
        this.jawbase.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.jawbase.addBox(-2.5F, -0.5F, -2.0F, 5, 1, 2, 0.0F);
        this.rearleftfoot = new AdvancedModelRendererExtended(this, 41, 57);
        this.rearleftfoot.setRotationPoint(4.5F, 0.1F, 0.0F);
        this.rearleftfoot.addBox(0.0F, -1.5F, -3.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(rearleftfoot, -1.5707963267948966F, 0.0F, 0.0F);
        this.rearrightfoot = new AdvancedModelRendererExtended(this, 41, 57);
        this.rearrightfoot.setRotationPoint(-4.5F, 0.1F, 0.0F);
        this.rearrightfoot.addBox(-1.0F, -1.5F, -3.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(rearrightfoot, -1.5707963267948966F, 0.0F, 0.0F);
        this.uppermouth = new AdvancedModelRendererExtended(this, 21, 45);
        this.uppermouth.setRotationPoint(0.0F, 0.2F, -2.8F);
        this.uppermouth.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(uppermouth, -0.9424777960769379F, 0.0F, 0.0F);
        this.frontleftleg1.addChild(this.frontleftleg2);
        this.headbase.addChild(this.head);
        this.lowerjawjoint.addChild(this.lowerjaw);
        this.lowerjaw.addChild(this.lowermouth);
        this.neck.addChild(this.headbase);
        this.jawbase.addChild(this.lowerjawjoint);
        this.snout.addChild(this.muzzleright);
        this.snout.addChild(this.muzzleleft);
        this.frontrightleg2.addChild(this.frontrightfoot);
        this.bodyfront.addChild(this.frontrightleg1);
        this.body.addChild(this.bodyfront);
        this.body.addChild(this.pelvis);
        this.pelvis.addChild(this.rearrightleg1);
        this.tailbase.addChild(this.tail1);
        this.tail1.addChild(this.tail2);
        this.frontleftleg2.addChild(this.frontleftfoot);
        this.muzzleleft.addChild(this.tuskleft);
        this.snoutbase.addChild(this.snout);
        this.muzzleright.addChild(this.tuskright);
        this.pelvis.addChild(this.rearleftleg1);
        this.pelvis.addChild(this.tailbase);
        this.rearrightleg1.addChild(this.rearrightleg2);
        this.frontrightleg1.addChild(this.frontrightleg2);
        this.bodyfront.addChild(this.frontleftleg1);
        this.bodyfront.addChild(this.neck);
        this.head.addChild(this.snoutbase);
        this.rearleftleg1.addChild(this.rearleftleg2);
        this.headbase.addChild(this.jawbase);
        this.rearleftleg2.addChild(this.rearleftfoot);
        this.rearrightleg2.addChild(this.rearrightfoot);
        this.snout.addChild(this.uppermouth);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.30f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.render(0.1F);
        GlStateManager.enableCull();
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
        this.body.offsetY = 1.35F;

        EntityPrehistoricFloraDiictodon Diictodon = (EntityPrehistoricFloraDiictodon) e;
        float masterSpeed = Diictodon.getTravelSpeed();

        this.faceTarget(f3, f4, 2, neck);
        this.faceTarget(f3, f4, 4, headbase);

        AdvancedModelRendererExtended[] Tail = {this.tailbase, this.tail1, this.tail2};

        if (Diictodon.getAnimation() == Diictodon.LAY_ANIMATION) {
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (Diictodon.getScreaming()) {
            this.neck.rotateAngleX = (float) Math.toRadians(-55);
            this.walk(jawbase, 1.5F, 0.15F, false, 0, 1.5F, f2, 1F);
        }

        if (f3 == 0.0F || !Diictodon.getIsMoving()) { //Not moving
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        float speed = masterSpeed / 0.965F;
        if (Diictodon.getIsFast()) {
            speed = speed * 1.5F;
        }

        this.frontleftleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 1, f2, 1.5F);;
        this.frontrightleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 4, f2, 1.5F);;
        this.rearleftleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 4, f2, 1.5F);;
        this.rearrightleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 1, f2, 1.5F);;

        this.flap(frontleftleg1, speed, -0.1F, true, 4, 0.05F, f2, 1F);
        this.flap(frontrightleg1, speed, 0.1F, true, 7, -0.05F, f2, 1F);
        this.flap(rearleftleg1, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(rearrightleg1, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.swing(frontleftleg1, speed, -0.40F, true, 5, 0.18F, f2, 1F);
        this.swing(frontrightleg1, speed, 0.40F, true, 8, -0.18F, f2, 1F);
        this.swing(rearleftleg1, speed, -0.30F, true, 8, 0F, f2, 1F);
        this.swing(rearrightleg1, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.swing(frontleftleg2, speed, -0.25F, true, 6, 0F, f2, 1F);
        this.swing(frontrightleg2, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.swing(rearleftleg2, speed, -0.20F, true, 9, 0F, f2, 1F);
        this.swing(rearrightleg2, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(frontleftleg2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(frontrightleg2, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(rearleftleg2, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(rearrightleg2, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.swing(frontleftfoot, speed, -0.30F, true, 2, 0.10F, f2, 1F);
        this.swing(frontrightfoot, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.swing(rearleftfoot, speed, -0.25F, true, 5, 0.08F, f2, 1F);
        this.swing(rearrightfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(body, speed * 2F, 0.245F, false, 2.5F,  f2, 1F);

        this.flap(pelvis, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);
        this.flap(body, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
        this.flap(bodyfront, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(bodyfront, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDiictodon e = (EntityPrehistoricFloraDiictodon) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.headbase, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjawjoint, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.headbase, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjawjoint, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.headbase, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjawjoint, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
