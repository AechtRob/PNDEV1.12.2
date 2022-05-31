package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraInostrancevia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelInostrancevia extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended body;
    public AdvancedModelRendererExtended bodyfront;
    public AdvancedModelRendererExtended hips;
    public AdvancedModelRendererExtended fur1;
    public AdvancedModelRendererExtended neck;
    public AdvancedModelRendererExtended lefttupperarm;
    public AdvancedModelRendererExtended rightupperarm;
    public AdvancedModelRendererExtended head;
    public AdvancedModelRendererExtended lowerjaw1;
    public AdvancedModelRendererExtended upperjaw1;
    public AdvancedModelRendererExtended lowerjaw2;
    public AdvancedModelRendererExtended jawparting;
    public AdvancedModelRendererExtended lowerjaw3;
    public AdvancedModelRendererExtended lowerjawslope;
    public AdvancedModelRendererExtended lowerjawteeth1;
    public AdvancedModelRendererExtended lowerjawteeth2;
    public AdvancedModelRendererExtended upperjaw2;
    public AdvancedModelRendererExtended upperjawteeth1;
    public AdvancedModelRendererExtended rightsabre;
    public AdvancedModelRendererExtended leftsabre;
    public AdvancedModelRendererExtended nose;
    public AdvancedModelRendererExtended upperjawteeth;
    public AdvancedModelRendererExtended leftlowerarm;
    public AdvancedModelRendererExtended leftfrontfoot;
    public AdvancedModelRendererExtended rightlowerarm;
    public AdvancedModelRendererExtended rightfrontfoot;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended leftthigh;
    public AdvancedModelRendererExtended rightthigh;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended tail3;
    public AdvancedModelRendererExtended leftshin;
    public AdvancedModelRendererExtended lefthindfoot;
    public AdvancedModelRendererExtended rightshin;
    public AdvancedModelRendererExtended righthindfoot;
    public AdvancedModelRendererExtended fur2;
    public AdvancedModelRendererExtended fur3;

    private ModelAnimator animator;

    public ModelInostrancevia() {
        this.textureWidth = 120;
        this.textureHeight = 120;
        this.lowerjaw2 = new AdvancedModelRendererExtended(this, 53, 100);
        this.lowerjaw2.setRotationPoint(0.0F, 0.16F, -5.4F);
        this.lowerjaw2.addBox(-2.5F, 0.0F, -5.0F, 5, 3, 6, 0.0F);
        this.setRotateAngle(lowerjaw2, 0.10471975511965977F, 0.0F, 0.0F);
        this.rightthigh = new AdvancedModelRendererExtended(this, 97, 102);
        this.rightthigh.setRotationPoint(-2.0F, 1.5F, 7.5F);
        this.rightthigh.addBox(-4.0F, -3.0F, -3.5F, 4, 11, 7, 0.0F);
        this.setRotateAngle(rightthigh, -0.2792526803190927F, 0.0F, 0.0F);
        this.neck = new AdvancedModelRendererExtended(this, 0, 52);
        this.neck.setRotationPoint(0.0F, -1.0F, -7.0F);
        this.neck.addBox(-3.0F, -4.0F, -9.0F, 6, 8, 11, 0.0F);
        this.setRotateAngle(neck, -0.22759093446006054F, 0.0F, 0.0F);
        this.upperjaw1 = new AdvancedModelRendererExtended(this, 0, 97);
        this.upperjaw1.setRotationPoint(0.0F, -1.9F, -5.2F);
        this.upperjaw1.addBox(-2.5F, 0.0F, -6.0F, 5, 4, 7, 0.0F);
        this.setRotateAngle(upperjaw1, 0.10471975511965977F, 0.0F, 0.0F);
        this.upperjaw2 = new AdvancedModelRendererExtended(this, 0, 89);
        this.upperjaw2.setRotationPoint(0.0F, 4.0F, -6.0F);
        this.upperjaw2.addBox(-2.0F, -4.0F, -2.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(upperjaw2, -0.10471975511965977F, 0.0F, 0.0F);
        this.tail1 = new AdvancedModelRendererExtended(this, 52, 26);
        this.tail1.setRotationPoint(0.0F, -2.1F, 11.0F);
        this.tail1.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(tail1, -0.40980330836826856F, 0.0F, 0.0F);
        this.fur1 = new AdvancedModelRendererExtended(this, 0, 73);
        this.fur1.setRotationPoint(0.0F, -5.3F, -10.5F);
        this.fur1.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 5, 0.0F);
        this.setRotateAngle(fur1, 0.40980330836826856F, 0.0F, 0.0F);
        this.rightfrontfoot = new AdvancedModelRendererExtended(this, 77, 37);
        this.rightfrontfoot.setRotationPoint(0.0F, 6.5F, 0.5F);
        this.rightfrontfoot.addBox(-2.5F, 0.0F, -5.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(rightfrontfoot, -0.06981317007977318F, 0.0F, 0.0F);
        this.tail2 = new AdvancedModelRendererExtended(this, 48, 37);
        this.tail2.setRotationPoint(0.0F, -0.3F, 4.5F);
        this.tail2.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(tail2, -0.27314402793711257F, 0.0F, 0.0F);
        this.lefttupperarm = new AdvancedModelRendererExtended(this, 90, 60);
        this.lefttupperarm.setRotationPoint(2.0F, 3.0F, -5.5F);
        this.lefttupperarm.addBox(0.0F, -1.5F, -2.5F, 4, 8, 5, 0.0F);
        this.setRotateAngle(lefttupperarm, 0.17453292519943295F, 0.0F, 0.0F);
        this.lowerjawslope = new AdvancedModelRendererExtended(this, 53, 92);
        this.lowerjawslope.setRotationPoint(0.0F, 1.1F, -3.9F);
        this.lowerjawslope.addBox(-2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(lowerjawslope, -0.36425021489121656F, 0.0F, 0.0F);
        this.rightshin = new AdvancedModelRendererExtended(this, 100, 86);
        this.rightshin.setRotationPoint(-2.0F, 6.0F, -1.0F);
        this.rightshin.addBox(-1.5F, 0.0F, -2.5F, 3, 9, 5, 0.0F);
        this.setRotateAngle(rightshin, 0.6283185307179586F, 0.0F, 0.0F);
        this.body = new AdvancedModelRendererExtended(this, 0, 0);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-4.5F, -6.0F, -8.5F, 9, 12, 17, 0.0F);
        this.lowerjawteeth1 = new AdvancedModelRendererExtended(this, 32, 93);
        this.lowerjawteeth1.setRotationPoint(0.0F, 0.3F, -2.2F);
        this.lowerjawteeth1.addBox(-1.5F, -1.0F, -1.5F, 3, 1, 3, 0.0F);
        this.setRotateAngle(lowerjawteeth1, -0.2792526803190927F, 0.0F, 0.0F);
        this.righthindfoot = new AdvancedModelRendererExtended(this, 96, 75);
        this.righthindfoot.setRotationPoint(0.0F, 8.5F, 1.0F);
        this.righthindfoot.addBox(-2.5F, 0.0F, -6.0F, 5, 2, 7, 0.0F);
        this.setRotateAngle(righthindfoot, -0.2617993877991494F, 0.0F, 0.0F);
        this.fur2 = new AdvancedModelRendererExtended(this, 0, 73);
        this.fur2.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.fur2.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 5, 0.0F);
        this.setRotateAngle(fur2, 0.18203784098300857F, 0.0F, 0.0F);
        this.leftthigh = new AdvancedModelRendererExtended(this, 74, 102);
        this.leftthigh.setRotationPoint(2.0F, 1.5F, 7.5F);
        this.leftthigh.addBox(0.0F, -3.0F, -3.5F, 4, 11, 7, 0.0F);
        this.setRotateAngle(leftthigh, -0.2792526803190927F, 0.0F, 0.0F);
        this.jawparting = new AdvancedModelRendererExtended(this, 30, 112);
        this.jawparting.setRotationPoint(0.0F, -0.7F, -1.2F);
        this.jawparting.addBox(-2.5F, -2.0F, -2.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(jawparting, -0.4553564018453205F, 0.0F, 0.0F);
        this.nose = new AdvancedModelRendererExtended(this, 0, 80);
        this.nose.setRotationPoint(0.0F, -1.0F, -1.1F);
        this.nose.addBox(-1.5F, -3.0F, -1.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(nose, 0.20943951023931953F, 0.0F, 0.0F);
        this.head = new AdvancedModelRendererExtended(this, 0, 110);
        this.head.setRotationPoint(0.0F, -2.0F, -9.0F);
        this.head.addBox(-3.5F, -2.0F, -4.5F, 7, 4, 6, 0.0F);
        this.setRotateAngle(head, 0.31869712141416456F, 0.0F, 0.0F);
        this.lowerjawteeth2 = new AdvancedModelRendererExtended(this, 32, 84);
        this.lowerjawteeth2.setRotationPoint(0.0F, 0.0F, -1.7F);
        this.lowerjawteeth2.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.upperjawteeth1 = new AdvancedModelRendererExtended(this, 32, 105);
        this.upperjawteeth1.setRotationPoint(0.0F, 3.8F, -2.4F);
        this.upperjawteeth1.addBox(-2.0F, 0.0F, -1.5F, 4, 1, 3, 0.0F);
        this.setRotateAngle(upperjawteeth1, 0.10471975511965977F, 0.0F, 0.0F);
        this.lowerjaw1 = new AdvancedModelRendererExtended(this, 49, 112);
        this.lowerjaw1.setRotationPoint(0.0F, 2.01F, -0.1F);
        this.lowerjaw1.addBox(-3.5F, 0.0F, -4.5F, 7, 3, 5, 0.0F);
        this.setRotateAngle(lowerjaw1, 0.0F, 0.0F, 0.0F);
        this.tail3 = new AdvancedModelRendererExtended(this, 67, 34);
        this.tail3.setRotationPoint(0.0F, -0.2F, 4.5F);
        this.tail3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(tail3, 0.091106186954104F, 0.0F, 0.0F);
        this.leftshin = new AdvancedModelRendererExtended(this, 81, 86);
        this.leftshin.setRotationPoint(2.0F, 6.0F, -1.0F);
        this.leftshin.addBox(-1.5F, 0.0F, -2.5F, 3, 9, 5, 0.0F);
        this.setRotateAngle(leftshin, 0.6283185307179586F, 0.0F, 0.0F);
        this.upperjawteeth = new AdvancedModelRendererExtended(this, 32, 99);
        this.upperjawteeth.setRotationPoint(0.0F, -0.3F, -1.8F);
        this.upperjawteeth.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(upperjawteeth, 0.07853981633974483F, 0.0F, 0.0F);
        this.lefthindfoot = new AdvancedModelRendererExtended(this, 70, 75);
        this.lefthindfoot.setRotationPoint(0.0F, 8.5F, 1.0F);
        this.lefthindfoot.addBox(-2.5F, 0.0F, -6.0F, 5, 2, 7, 0.0F);
        this.setRotateAngle(lefthindfoot, -0.2617993877991494F, 0.0F, -0.017453292519943295F);
        this.leftsabre = new AdvancedModelRendererExtended(this, 43, 90);
        this.leftsabre.setRotationPoint(-1.9F, 4.0F, -5.03F);
        this.leftsabre.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.hips = new AdvancedModelRendererExtended(this, 54, 0);
        this.hips.setRotationPoint(0.0F, -0.6F, 7.5F);
        this.hips.addBox(-4.0F, -5.0F, 0.0F, 8, 10, 12, 0.0F);
        this.setRotateAngle(hips, -0.06981317007977318F, 0.0F, 0.0F);
        this.leftfrontfoot = new AdvancedModelRendererExtended(this, 95, 33);
        this.leftfrontfoot.setRotationPoint(0.0F, 6.5F, 0.5F);
        this.leftfrontfoot.addBox(-2.5F, 0.0F, -5.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(leftfrontfoot, -0.06981317007977318F, 0.0F, 0.0F);
        this.bodyfront = new AdvancedModelRendererExtended(this, 0, 30);
        this.bodyfront.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.bodyfront.addBox(-4.0F, -5.5F, -9.0F, 8, 11, 9, 0.0F);
        this.setRotateAngle(bodyfront, 0.05235987755982988F, 0.0F, 0.0F);
        this.lowerjaw3 = new AdvancedModelRendererExtended(this, 53, 82);
        this.lowerjaw3.setRotationPoint(0.0F, 0.1F, -4.3F);
        this.lowerjaw3.addBox(-2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(lowerjaw3, -0.10471975511965977F, 0.0F, 0.0F);
        this.rightlowerarm = new AdvancedModelRendererExtended(this, 71, 47);
        this.rightlowerarm.setRotationPoint(-2.0F, 5.0F, 0.0F);
        this.rightlowerarm.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(rightlowerarm, -0.17453292519943295F, 0.0F, 0.0F);
        this.rightupperarm = new AdvancedModelRendererExtended(this, 70, 61);
        this.rightupperarm.setRotationPoint(-2.0F, 3.0F, -5.5F);
        this.rightupperarm.addBox(-4.0F, -1.5F, -2.5F, 4, 8, 5, 0.0F);
        this.setRotateAngle(rightupperarm, 0.18203784098300857F, 0.0F, 0.0F);
        this.fur3 = new AdvancedModelRendererExtended(this, 0, 73);
        this.fur3.setRotationPoint(0.0F, -0.9F, -1.9F);
        this.fur3.addBox(-4.0F, 0.0F, 0.0F, 8, 0, 5, 0.0F);
        this.setRotateAngle(fur3, 0.18203784098300857F, 0.0F, 0.0F);
        this.rightsabre = new AdvancedModelRendererExtended(this, 43, 90);
        this.rightsabre.setRotationPoint(1.9F, 4.0F, -5.03F);
        this.rightsabre.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.leftlowerarm = new AdvancedModelRendererExtended(this, 90, 47);
        this.leftlowerarm.setRotationPoint(2.0F, 5.0F, 0.0F);
        this.leftlowerarm.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(leftlowerarm, -0.17453292519943295F, 0.0F, 0.0F);
        this.lowerjaw1.addChild(this.lowerjaw2);
        this.hips.addChild(this.rightthigh);
        this.bodyfront.addChild(this.neck);
        this.head.addChild(this.upperjaw1);
        this.upperjaw1.addChild(this.upperjaw2);
        this.hips.addChild(this.tail1);
        this.body.addChild(this.fur1);
        this.rightlowerarm.addChild(this.rightfrontfoot);
        this.tail1.addChild(this.tail2);
        this.bodyfront.addChild(this.lefttupperarm);
        this.lowerjaw2.addChild(this.lowerjawslope);
        this.rightthigh.addChild(this.rightshin);
        this.lowerjaw2.addChild(this.lowerjawteeth1);
        this.rightshin.addChild(this.righthindfoot);
        this.fur1.addChild(this.fur2);
        this.hips.addChild(this.leftthigh);
        this.lowerjaw1.addChild(this.jawparting);
        this.upperjaw2.addChild(this.nose);
        this.neck.addChild(this.head);
        this.lowerjaw3.addChild(this.lowerjawteeth2);
        this.upperjaw1.addChild(this.upperjawteeth1);
        this.head.addChild(this.lowerjaw1);
        this.tail2.addChild(this.tail3);
        this.leftthigh.addChild(this.leftshin);
        this.upperjaw2.addChild(this.upperjawteeth);
        this.leftshin.addChild(this.lefthindfoot);
        this.upperjaw1.addChild(this.leftsabre);
        this.body.addChild(this.hips);
        this.leftlowerarm.addChild(this.leftfrontfoot);
        this.body.addChild(this.bodyfront);
        this.lowerjaw2.addChild(this.lowerjaw3);
        this.rightupperarm.addChild(this.rightlowerarm);
        this.bodyfront.addChild(this.rightupperarm);
        this.fur2.addChild(this.fur3);
        this.upperjaw1.addChild(this.rightsabre);
        this.lefttupperarm.addChild(this.leftlowerarm);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.775f);
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
        this.body.offsetY = 0.7F;

        EntityPrehistoricFloraInostrancevia Inostrancevia = (EntityPrehistoricFloraInostrancevia) e;
        float masterSpeed = Inostrancevia.getTravelSpeed();

        //masterSpeed = 0.345F;

        this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRendererExtended[] Tail = {this.tail1, this.tail2, this.tail3};

        if (Inostrancevia.getAnimation() == Inostrancevia.LAY_ANIMATION) {
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Inostrancevia.getIsMoving()) { //Not moving
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), -0.06F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.225F;
        if (Inostrancevia.getIsFast()) {
            speed = speed * 2;
        }

        this.lefttupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.rightupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.leftlowerarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 2, f2, 1.5F);;
        this.rightlowerarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 5, f2, 1.5F);;
        this.leftshin.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.2), false, 5, f2, 1.5F);;
        this.rightshin.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.2), false, 2, f2, 1.5F);;

        this.flap(lefttupperarm, speed, -0.1F, true, 4, -0.1F, f2, 1F);
        this.flap(rightupperarm, speed, 0.1F, true, 7, 0.1F, f2, 1F);
        this.flap(leftthigh, speed, -0.05F, false, 7, -0.05F, f2, 1F);
        this.flap(rightthigh, speed, 0.05F, false, 4, 0.05F, f2, 1F);

        this.walk(lefttupperarm, speed, 0.40F, true, 5, 0F, f2, 1F);
        this.walk(rightupperarm, speed, 0.40F, true, 8, 0F, f2, 1F);
        this.walk(leftthigh, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(rightthigh, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(leftlowerarm, speed, 0.25F, true, 6, 0.125F, f2, 1F);
        this.walk(rightlowerarm, speed, 0.25F, true, 9, 0.125F, f2, 1F);
        this.walk(leftshin, speed, 0.20F, true, 9, 0.10F, f2, 1F);
        this.walk(rightshin, speed, 0.20F, true, 6, 0.10F, f2, 1F);

        //this.flap(leftlowerarm, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        //this.flap(rightlowerarm, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        //this.flap(leftshin, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        //this.flap(rightshin, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(leftfrontfoot, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(rightfrontfoot, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(lefthindfoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(righthindfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(body, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.swing(hips, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.swing(body, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.swing(bodyfront, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(bodyfront, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (speed*0.6F), -0.085F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraInostrancevia e = (EntityPrehistoricFloraInostrancevia) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(-40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.move(this.body, 0 , 5,0);
        animator.rotate(this.body, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftfrontfoot, (float) Math.toRadians(16), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightfrontfoot, (float) Math.toRadians(16), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftthigh, (float) Math.toRadians(-100), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightthigh, (float) Math.toRadians(-100), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftshin, (float) Math.toRadians(80), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightshin, (float) Math.toRadians(80), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lefthindfoot, (float) Math.toRadians(44), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.righthindfoot, (float) Math.toRadians(44), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
