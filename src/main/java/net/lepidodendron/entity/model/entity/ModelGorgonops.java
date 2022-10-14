package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGorgonops;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelGorgonops extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended Hips;
    public AdvancedModelRendererExtended Belly;
    public AdvancedModelRendererExtended Leftthigh;
    public AdvancedModelRendererExtended Rightthigh;
    public AdvancedModelRendererExtended Tail1;
    public AdvancedModelRendererExtended Bodyfront;
    public AdvancedModelRendererExtended Leftupperarm;
    public AdvancedModelRendererExtended Rightupperarm;
    public AdvancedModelRendererExtended Neck;
    public AdvancedModelRendererExtended Leftlowerarm;
    public AdvancedModelRendererExtended Leftfrontfoot;
    public AdvancedModelRendererExtended Rightlowerarm;
    public AdvancedModelRendererExtended Rightfrontfoot;
    public AdvancedModelRendererExtended Head;
    public AdvancedModelRendererExtended Upperjaw1;
    public AdvancedModelRendererExtended Lowerjaw1;
    public AdvancedModelRendererExtended Upperjaw3;
    public AdvancedModelRendererExtended Leftsabre;
    public AdvancedModelRendererExtended Rightsabre;
    public AdvancedModelRendererExtended Upperjawteeth1;
    public AdvancedModelRendererExtended Nose;
    public AdvancedModelRendererExtended Upperjawteeth2;
    public AdvancedModelRendererExtended Lowerjaw2;
    public AdvancedModelRendererExtended Jawparting;
    public AdvancedModelRendererExtended Lowerjaw3;
    public AdvancedModelRendererExtended Lowerjawslope;
    public AdvancedModelRendererExtended Lowerjawteeth1;
    public AdvancedModelRendererExtended Lowerjawteeth2;
    public AdvancedModelRendererExtended Leftshin;
    public AdvancedModelRendererExtended Lefthindfoot;
    public AdvancedModelRendererExtended Rightshin;
    public AdvancedModelRendererExtended Righthindfoot;
    public AdvancedModelRendererExtended Tail2;
    public AdvancedModelRendererExtended Tail3;

    private ModelAnimator animator;

    public ModelGorgonops() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Hips = new AdvancedModelRendererExtended(this, 0, 48);
        this.Hips.setRotationPoint(0.0F, 3.8F, 11.0F);
        this.Hips.addBox(-4.0F, -1.0F, -5.0F, 8, 10, 12, 0.0F);
        this.setRotateAngle(Hips, -0.12740903539558604F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRendererExtended(this, 29, 2);
        this.Tail3.setRotationPoint(0.0F, 0.20000000298023224F, 4.5F);
        this.Tail3.addBox(-1.0F, -0.5F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(Tail3, 0.021293017373673524F, 0.0F, 0.0F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 64, 49);
        this.Rightupperarm.setRotationPoint(-3.0F, 7.400000095367432F, -7.800000190734863F);
        this.Rightupperarm.addBox(-3.0F, -1.5F, -2.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.06370451936226872F, 0.0F, 0.0F);
        this.Righthindfoot = new AdvancedModelRendererExtended(this, 19, 16);
        this.Righthindfoot.setRotationPoint(0.0F, 8.0F, 2.700000047683716F);
        this.Righthindfoot.addBox(-2.5F, 0.0F, -6.0F, 5, 2, 7, 0.0F);
        this.setRotateAngle(Righthindfoot, -0.12740903872453743F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 76, 63);
        this.Leftupperarm.setRotationPoint(3.0F, 7.300000190734863F, -7.800000190734863F);
        this.Leftupperarm.addBox(-1.0F, -1.5F, -2.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.06370451936226872F, 0.0F, 0.0F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 0, 8);
        this.Leftfrontfoot.setRotationPoint(0.0F, 6.5F, -0.30000001192092896F);
        this.Leftfrontfoot.addBox(-2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.021293017373673524F, 0.0F, 0.0F);
        this.Lowerjaw1 = new AdvancedModelRendererExtended(this, 76, 18);
        this.Lowerjaw1.setRotationPoint(0.0F, 2.5F, -1.0F);
        this.Lowerjaw1.addBox(-3.5F, 0.0F, -5.0F, 7, 3, 5, 0.0F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 41, 50);
        this.Rightthigh.setRotationPoint(-3.0F, 2.9000000953674316F, 2.200000047683716F);
        this.Rightthigh.addBox(-3.0F, -1.5F, -3.0F, 4, 11, 7, 0.0F);
        this.setRotateAngle(Rightthigh, -0.1911135497644277F, 0.0F, 0.0F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 77, 77);
        this.Rightshin.setRotationPoint(-1.0F, 8.600000381469727F, -2.5F);
        this.Rightshin.addBox(-1.5F, 0.0F, -0.5F, 3, 9, 5, 0.0F);
        this.setRotateAngle(Rightshin, 0.4457571069383183F, 0.0F, 0.0F);
        this.Leftsabre = new AdvancedModelRendererExtended(this, 44, 4);
        this.Leftsabre.setRotationPoint(1.899999976158142F, 4.0F, -5.599999904632568F);
        this.Leftsabre.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Leftsabre, 0.06370451936226872F, 0.0F, 0.0F);
        this.Lowerjawteeth1 = new AdvancedModelRendererExtended(this, 69, 7);
        this.Lowerjawteeth1.setRotationPoint(0.0F, 0.0F, -3.799999952316284F);
        this.Lowerjawteeth1.addBox(-1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Lowerjawteeth1, -0.21223203437934937F, 0.0F, 0.0F);
        this.Upperjawteeth2 = new AdvancedModelRendererExtended(this, 52, 9);
        this.Upperjawteeth2.setRotationPoint(0.0F, 3.5F, -1.7999999523162842F);
        this.Upperjawteeth2.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Upperjawteeth2, 0.10611601718967469F, 0.0F, 0.0F);
        this.Lowerjawteeth2 = new AdvancedModelRendererExtended(this, 43, 8);
        this.Lowerjawteeth2.setRotationPoint(0.0F, 0.5F, -3.200000047683716F);
        this.Lowerjawteeth2.addBox(-1.0F, -3.0F, 0.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Lowerjawteeth2, -0.021293017373673524F, 0.0F, 0.0F);
        this.Neck = new AdvancedModelRendererExtended(this, 53, 81);
        this.Neck.setRotationPoint(0.0F, 0.30000001192092896F, -8.5F);
        this.Neck.addBox(-3.0F, -1.0F, -10.0F, 6, 8, 11, 0.0F);
        this.setRotateAngle(Neck, -0.23352505591421208F, 0.0F, 0.0F);
        this.Lowerjaw3 = new AdvancedModelRendererExtended(this, 66, 17);
        this.Lowerjaw3.setRotationPoint(0.0F, 0.10000000149011612F, -4.300000190734863F);
        this.Lowerjaw3.addBox(-2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(Lowerjaw3, -0.12740903872453743F, 0.0F, 0.0F);
        this.Tail1 = new AdvancedModelRendererExtended(this, 0, 17);
        this.Tail1.setRotationPoint(0.0F, 1.0F, 6.5F);
        this.Tail1.addBox(-2.0F, -0.5F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(Tail1, -0.5307546228683145F, 0.0F, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 45, 24);
        this.Rightfrontfoot.setRotationPoint(0.0F, 6.5F, -0.30000001192092896F);
        this.Rightfrontfoot.addBox(-2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.021293017373673524F, 0.0F, 0.0F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 82, 49);
        this.Jawparting.setRotationPoint(0.0F, 0.20000000298023224F, -4.800000190734863F);
        this.Jawparting.addBox(-2.5F, -4.0F, 0.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(Jawparting, -0.4881685797985891F, 0.0F, 0.0F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 48, 37);
        this.Leftlowerarm.setRotationPoint(1.0F, 5.0F, 0.5F);
        this.Leftlowerarm.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.12740903872453743F, 0.0F, 0.0F);
        this.Nose = new AdvancedModelRendererExtended(this, 37, 14);
        this.Nose.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Nose.addBox(-1.5F, 0.0F, -1.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(Nose, 0.2972295835988592F, 0.0F, 0.0F);
        this.Lowerjaw2 = new AdvancedModelRendererExtended(this, 44, 14);
        this.Lowerjaw2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Lowerjaw2.addBox(-2.5F, 0.0F, -5.0F, 5, 3, 5, 0.0F);
        this.setRotateAngle(Lowerjaw2, 0.1485275233394591F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 0, 27);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, -13.5F);
        this.Bodyfront.addBox(-4.0F, -1.0F, -11.0F, 8, 11, 9, 0.0F);
        this.setRotateAngle(Bodyfront, 0.06370451936226872F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRendererExtended(this, 63, 38);
        this.Head.setRotationPoint(0.0F, 0.10000000149011612F, -7.599999904632568F);
        this.Head.addBox(-3.5F, -1.5F, -6.0F, 7, 4, 6, 0.0F);
        this.setRotateAngle(Head, 0.23352505591421208F, 0.0F, 0.0F);
        this.Upperjaw3 = new AdvancedModelRendererExtended(this, 68, 27);
        this.Upperjaw3.setRotationPoint(0.0F, 0.0F, -5.599999904632568F);
        this.Upperjaw3.addBox(-2.0F, 0.0F, -2.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(Upperjaw3, -0.10611601718967469F, 0.0F, 0.0F);
        this.Rightsabre = new AdvancedModelRendererExtended(this, 50, 6);
        this.Rightsabre.setRotationPoint(-1.899999976158142F, 4.0F, -5.599999904632568F);
        this.Rightsabre.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Rightsabre, 0.06370451936226872F, 0.0F, 0.0F);
        this.Upperjawteeth1 = new AdvancedModelRendererExtended(this, 60, 12);
        this.Upperjawteeth1.setRotationPoint(0.0F, 4.0F, -4.400000095367432F);
        this.Upperjawteeth1.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
        this.setRotateAngle(Upperjawteeth1, 0.10611601718967469F, 0.0F, 0.0F);
        this.Lefthindfoot = new AdvancedModelRendererExtended(this, 26, 26);
        this.Lefthindfoot.setRotationPoint(0.0F, 8.0F, 2.700000047683716F);
        this.Lefthindfoot.addBox(-2.5F, 0.0F, -6.0F, 5, 2, 7, 0.0F);
        this.setRotateAngle(Lefthindfoot, -0.12740903872453743F, 0.0F, 0.0F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 59, 66);
        this.Leftshin.setRotationPoint(1.0F, 8.600000381469727F, -2.5F);
        this.Leftshin.addBox(-1.5F, 0.0F, -0.5F, 3, 9, 5, 0.0F);
        this.setRotateAngle(Leftshin, 0.4457571069383183F, 0.0F, 0.0F);
        this.Belly = new AdvancedModelRendererExtended(this, 0, 71);
        this.Belly.setRotationPoint(0.0F, -0.10000000149011612F, -4.0F);
        this.Belly.addBox(-4.5F, -1.0F, -17.0F, 9, 12, 17, 0.0F);
        this.setRotateAngle(Belly, 0.10611601718967469F, 0.0F, 0.0F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 36, 69);
        this.Leftthigh.setRotationPoint(3.0F, 2.9000000953674316F, 2.200000047683716F);
        this.Leftthigh.addBox(-1.0F, -1.5F, -3.0F, 4, 11, 7, 0.0F);
        this.setRotateAngle(Leftthigh, -0.1911135497644277F, 0.0F, 0.0F);
        this.Lowerjawslope = new AdvancedModelRendererExtended(this, 78, 12);
        this.Lowerjawslope.setRotationPoint(0.009999999776482582F, 3.0999999046325684F, -4.800000190734863F);
        this.Lowerjawslope.addBox(-2.0F, -2.0F, -3.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(Lowerjawslope, -0.4457571069383183F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRendererExtended(this, 17, 5);
        this.Tail2.setRotationPoint(0.0F, 0.10000000149011612F, 4.5F);
        this.Tail2.addBox(-1.5F, -0.5F, 0.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(Tail2, -0.40334560078853393F, 0.0F, 0.0F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 33, 44);
        this.Rightlowerarm.setRotationPoint(-1.0F, 5.0F, 0.5F);
        this.Rightlowerarm.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.12740903872453743F, 0.0F, 0.0F);
        this.Upperjaw1 = new AdvancedModelRendererExtended(this, 78, 27);
        this.Upperjaw1.setRotationPoint(0.0F, -1.5F, -6.0F);
        this.Upperjaw1.addBox(-2.5F, 0.0F, -6.0F, 5, 4, 6, 0.0F);
        this.setRotateAngle(Upperjaw1, 0.1485275233394591F, 0.0F, 0.0F);
        this.Tail2.addChild(this.Tail3);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Head.addChild(this.Lowerjaw1);
        this.Hips.addChild(this.Rightthigh);
        this.Rightthigh.addChild(this.Rightshin);
        this.Upperjaw1.addChild(this.Leftsabre);
        this.Lowerjaw2.addChild(this.Lowerjawteeth1);
        this.Upperjaw3.addChild(this.Upperjawteeth2);
        this.Lowerjaw3.addChild(this.Lowerjawteeth2);
        this.Bodyfront.addChild(this.Neck);
        this.Lowerjaw2.addChild(this.Lowerjaw3);
        this.Hips.addChild(this.Tail1);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Lowerjaw1.addChild(this.Jawparting);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Upperjaw3.addChild(this.Nose);
        this.Lowerjaw1.addChild(this.Lowerjaw2);
        this.Belly.addChild(this.Bodyfront);
        this.Neck.addChild(this.Head);
        this.Upperjaw1.addChild(this.Upperjaw3);
        this.Upperjaw1.addChild(this.Rightsabre);
        this.Upperjaw1.addChild(this.Upperjawteeth1);
        this.Leftshin.addChild(this.Lefthindfoot);
        this.Leftthigh.addChild(this.Leftshin);
        this.Hips.addChild(this.Belly);
        this.Hips.addChild(this.Leftthigh);
        this.Lowerjaw2.addChild(this.Lowerjawslope);
        this.Tail1.addChild(this.Tail2);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Head.addChild(this.Upperjaw1);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5 * 0.47f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Lowerjaw1.rotateAngleX = (float) Math.toRadians(46);
        this.Neck.render(0.01F);
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
        this.Hips.offsetY = 0.8F;

        EntityPrehistoricFloraGorgonops Gorgonops = (EntityPrehistoricFloraGorgonops) e;
        float masterSpeed = Gorgonops.getTravelSpeed();

        this.faceTarget(f3, f4, 5, Neck);
        this.faceTarget(f3, f4, 5, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail1, this.Tail2, this.Tail3};

        if (Gorgonops.getAnimation() == Gorgonops.LAY_ANIMATION) {
            this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Gorgonops.getIsMoving()) { //Not moving
            this.swing(Neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), -0.06F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.105F;
        if (Gorgonops.getIsFast()) {
            speed = speed * 1.9F;
        }

        this.Leftupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.Rightupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(Leftupperarm, speed, -0.1F, true, 4, -0.1F, f2, 1F);
        this.flap(Rightupperarm, speed, 0.1F, true, 7, 0.1F, f2, 1F);
        this.flap(Leftthigh, speed, -0.05F, false, 7, -0.05F, f2, 1F);
        this.flap(Rightthigh, speed, 0.05F, false, 4, 0.05F, f2, 1F);

        this.walk(Leftupperarm, speed, 0.40F, true, 5, 0F, f2, 1F);
        this.walk(Rightupperarm, speed, 0.40F, true, 8, 0F, f2, 1F);
        this.walk(Leftthigh, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(Rightthigh, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(Leftlowerarm, speed, 0.25F, true, 6, 0.125F, f2, 1F);
        this.walk(Rightlowerarm, speed, 0.25F, true, 9, 0.125F, f2, 1F);
        this.walk(Leftshin, speed, 0.20F, true, 9, 0.10F, f2, 1F);
        this.walk(Rightshin, speed, 0.20F, true, 6, 0.10F, f2, 1F);

        //this.flap(Leftlowerarm, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        //this.flap(Rightlowerarm, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        //this.flap(Leftshin, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        //this.flap(Rightshin, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(Leftfrontfoot, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(Rightfrontfoot, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(Lefthindfoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(Righthindfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(Hips, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.swing(Hips, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.swing(Belly, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.swing(Bodyfront, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(Bodyfront, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(Neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (speed*0.6F), -0.085F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.9), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraGorgonops e = (EntityPrehistoricFloraGorgonops) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(-40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.move(this.Belly, 0 , 5,0);
        animator.rotate(this.Belly, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftfrontfoot, (float) Math.toRadians(16), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightfrontfoot, (float) Math.toRadians(16), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftthigh, (float) Math.toRadians(-100), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightthigh, (float) Math.toRadians(-100), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftshin, (float) Math.toRadians(80), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightshin, (float) Math.toRadians(80), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lefthindfoot, (float) Math.toRadians(44), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Righthindfoot, (float) Math.toRadians(44), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
