package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLystrosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLystrosaurus extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended Hips;
    public AdvancedModelRendererExtended Bodymiddle;
    public AdvancedModelRendererExtended Tail1;
    public AdvancedModelRendererExtended Leftthigh;
    public AdvancedModelRendererExtended Rightthigh;
    public AdvancedModelRendererExtended Bodyfront;
    public AdvancedModelRendererExtended Neck;
    public AdvancedModelRendererExtended Leftupperarm;
    public AdvancedModelRendererExtended Rightupperarm;
    public AdvancedModelRendererExtended Head;
    public AdvancedModelRendererExtended Upperjaw1;
    public AdvancedModelRendererExtended Lowerjaw1;
    public AdvancedModelRendererExtended Eyes;
    public AdvancedModelRendererExtended Upperjaw2;
    public AdvancedModelRendererExtended Upperbeak;
    public AdvancedModelRendererExtended Lefttusk;
    public AdvancedModelRendererExtended Righttusk;
    public AdvancedModelRendererExtended Lowerjaw2;
    public AdvancedModelRendererExtended Jawparting;
    public AdvancedModelRendererExtended Lowerjaw3;
    public AdvancedModelRendererExtended Lowerjaw4;
    public AdvancedModelRendererExtended Lowerbeak;
    public AdvancedModelRendererExtended Leftlowerarm;
    public AdvancedModelRendererExtended Leftfrontfoot;
    public AdvancedModelRendererExtended Rightlowerarm;
    public AdvancedModelRendererExtended Rightfrontfoot;
    public AdvancedModelRendererExtended Tail2;
    public AdvancedModelRendererExtended Tail3;
    public AdvancedModelRendererExtended Leftshin;
    public AdvancedModelRendererExtended Lefthindfoot;
    public AdvancedModelRendererExtended Rightshin;
    public AdvancedModelRendererExtended Righthindfoot;

    private ModelAnimator animator;

    public ModelLystrosaurus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Tail3 = new AdvancedModelRendererExtended(this, 51, 43);
        this.Tail3.setRotationPoint(0.0F, 0.10000000149011612F, 2.5F);
        this.Tail3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Tail3, -0.31834805156902407F, 0.0F, 0.0F);
        this.Righttusk = new AdvancedModelRendererExtended(this, 1, 0);
        this.Righttusk.setRotationPoint(-1.399999976158142F, 2.299999952316284F, -4.300000190734863F);
        this.Righttusk.addBox(-0.5F, -0.5F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Righttusk, -1.1037462482559859F, 0.12740903872453743F, 0.0F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 43, 14);
        this.Jawparting.setRotationPoint(-0.009999999776482582F, 0.5F, -4.199999809265137F);
        this.Jawparting.addBox(-2.0F, -4.0F, 0.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(Jawparting, -0.31834805156902407F, 0.0F, 0.0F);
        this.Lowerjaw3 = new AdvancedModelRendererExtended(this, 17, 4);
        this.Lowerjaw3.setRotationPoint(0.0F, 3.0F, -2.0F);
        this.Lowerjaw3.addBox(-1.5F, -3.0F, -1.5F, 3, 3, 2, 0.0F);
        this.setRotateAngle(Lowerjaw3, -0.36093409463874954F, 0.0F, 0.0F);
        this.Upperbeak = new AdvancedModelRendererExtended(this, 28, 4);
        this.Upperbeak.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Upperbeak.addBox(-1.5F, 0.0F, -1.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(Upperbeak, 0.2972295835988592F, 0.0F, 0.0F);
        this.Lowerjaw2 = new AdvancedModelRendererExtended(this, 44, 29);
        this.Lowerjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjaw2.addBox(-2.0F, 0.0F, -2.0F, 4, 3, 2, 0.0F);
        this.setRotateAngle(Lowerjaw2, 0.2972295835988592F, 0.0F, 0.0F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 33, 19);
        this.Rightlowerarm.setRotationPoint(0.0F, 3.799999952316284F, 0.0F);
        this.Rightlowerarm.addBox(-1.5F, -1.0F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.31834805156902407F, -0.10611601718967469F, -1.018923235956417F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 55, 75);
        this.Leftfrontfoot.setRotationPoint(0.0F, 4.53000020980835F, 0.30000001192092896F);
        this.Leftfrontfoot.addBox(-2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.06370451936226872F, 0.0F, -0.021293017373673524F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 34, 52);
        this.Rightshin.setRotationPoint(0.0F, 5.0F, -0.20000000298023224F);
        this.Rightshin.addBox(-1.5F, -0.5F, -1.5F, 3, 7, 4, 0.0F);
        this.setRotateAngle(Rightshin, 0.33964105645913F, 0.021293017373673524F, -0.5307546228683145F);
        this.Upperjaw2 = new AdvancedModelRendererExtended(this, 39, 5);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Upperjaw2.addBox(-2.0F, 0.0F, -5.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(Upperjaw2, 1.0613347421062016F, 0.0F, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 0, 59);
        this.Hips.setRotationPoint(0.0F, 9.15F, 7.0F);
        this.Hips.addBox(-4.0F, -1.0F, -2.0F, 8, 8, 9, 0.0F);
        this.setRotateAngle(Hips, -0.10611601852125524F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRendererExtended(this, 0, 12);
        this.Head.setRotationPoint(0.009999999776482582F, 0.6000000238418579F, -4.0F);
        this.Head.addBox(-3.5F, -3.0F, -4.0F, 7, 6, 4, 0.0F);
        this.setRotateAngle(Head, 0.21223203437934937F, 0.0F, 0.0F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 36, 76);
        this.Rightthigh.setRotationPoint(-3.200000047683716F, 3.0F, 2.5F);
        this.Rightthigh.addBox(-2.0F, -1.0F, -2.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(Rightthigh, -0.1911135497644277F, 0.0F, 0.5094616179782085F);
        this.Upperjaw1 = new AdvancedModelRendererExtended(this, 23, 9);
        this.Upperjaw1.setRotationPoint(0.0F, -2.9000000953674316F, -3.200000047683716F);
        this.Upperjaw1.addBox(-2.5F, 0.0F, -3.0F, 5, 6, 3, 0.0F);
        this.setRotateAngle(Upperjaw1, 0.06370451936226872F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 34, 40);
        this.Leftupperarm.setRotationPoint(3.299999952316284F, 5.800000190734863F, -5.0F);
        this.Leftupperarm.addBox(-2.0F, -1.0F, -2.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.33964105645913F, 0.0F, -0.9765117298066328F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 34, 64);
        this.Leftshin.setRotationPoint(0.0F, 5.0F, -0.20000000298023224F);
        this.Leftshin.addBox(-1.5F, -0.5F, -1.5F, 3, 7, 4, 0.0F);
        this.setRotateAngle(Leftshin, 0.33964105645913F, -0.021293017373673524F, 0.5307546228683145F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 48, 67);
        this.Rightfrontfoot.setRotationPoint(0.0F, 4.53000020980835F, 0.30000001192092896F);
        this.Rightfrontfoot.addBox(-2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.06370451936226872F, 0.0F, 0.021293017373673524F);
        this.Lowerbeak = new AdvancedModelRendererExtended(this, 0, 6);
        this.Lowerbeak.setRotationPoint(0.009999999776482582F, -3.0F, -1.399999976158142F);
        this.Lowerbeak.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.Neck = new AdvancedModelRendererExtended(this, 0, 25);
        this.Neck.setRotationPoint(0.0F, 0.30000001192092896F, -6.5F);
        this.Neck.addBox(-3.0F, -1.5F, -6.0F, 6, 7, 7, 0.0F);
        this.setRotateAngle(Neck, -0.2546435405291338F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRendererExtended(this, 48, 50);
        this.Tail2.setRotationPoint(0.0F, 0.800000011920929F, 2.799999952316284F);
        this.Tail2.addBox(-1.0F, -0.5F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Tail2, -0.2546435405291338F, 0.0F, 0.0F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 49, 88);
        this.Leftthigh.setRotationPoint(3.200000047683716F, 3.0F, 2.5F);
        this.Leftthigh.addBox(-2.0F, -1.0F, -2.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(Leftthigh, -0.1911135497644277F, 0.0F, -0.5094616179782085F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 0, 40);
        this.Bodyfront.setRotationPoint(0.0F, 0.10000000149011612F, -10.5F);
        this.Bodyfront.addBox(-4.5F, -1.5F, -8.0F, 9, 10, 8, 0.0F);
        this.setRotateAngle(Bodyfront, 0.06370451936226872F, 0.0F, 0.0F);
        this.Bodymiddle = new AdvancedModelRendererExtended(this, 0, 77);
        this.Bodymiddle.setRotationPoint(0.0F, 0.30000001192092896F, -1.5F);
        this.Bodymiddle.addBox(-5.5F, -1.5F, -11.5F, 11, 10, 12, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.10611601718967469F, 0.0F, 0.0F);
        this.Righthindfoot = new AdvancedModelRendererExtended(this, 63, 83);
        this.Righthindfoot.setRotationPoint(0.0F, 5.5F, 0.4000000059604645F);
        this.Righthindfoot.addBox(-2.5F, 0.0F, -4.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Righthindfoot, -0.06370451936226872F, 0.42446406875869874F, -0.021293017373673524F);
        this.Lefthindfoot = new AdvancedModelRendererExtended(this, 68, 92);
        this.Lefthindfoot.setRotationPoint(0.0F, 5.5F, 0.4000000059604645F);
        this.Lefthindfoot.addBox(-2.5F, 0.0F, -4.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Lefthindfoot, -0.06370451936226872F, -0.42446406875869874F, 0.021293017373673524F);
        this.Tail1 = new AdvancedModelRendererExtended(this, 48, 58);
        this.Tail1.setRotationPoint(0.0F, -0.5F, 6.900000095367432F);
        this.Tail1.addBox(-1.5F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Tail1, -0.36093409463874954F, 0.0F, 0.0F);
        this.Eyes = new AdvancedModelRendererExtended(this, 53, 0);
        this.Eyes.setRotationPoint(0.0F, -1.600000023841858F, -4.400000095367432F);
        this.Eyes.addBox(-3.0F, -1.5F, -1.5F, 6, 4, 3, 0.0F);
        this.setRotateAngle(Eyes, -0.06370451936226872F, 0.0F, 0.0F);
        this.Lowerjaw1 = new AdvancedModelRendererExtended(this, 46, 22);
        this.Lowerjaw1.setRotationPoint(0.0F, 1.5F, -0.9900000095367432F);
        this.Lowerjaw1.addBox(-2.5F, 0.0F, -3.0F, 5, 3, 3, 0.0F);
        this.Lowerjaw4 = new AdvancedModelRendererExtended(this, 6, 0);
        this.Lowerjaw4.setRotationPoint(-0.009999999776482582F, 0.0F, -1.399999976158142F);
        this.Lowerjaw4.addBox(-1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Lowerjaw4, -0.4881685797985891F, 0.0F, 0.0F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 27, 30);
        this.Rightupperarm.setRotationPoint(-3.299999952316284F, 5.800000190734863F, -5.0F);
        this.Rightupperarm.addBox(-2.0F, -1.0F, -2.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.33964105645913F, 0.0F, 0.9765117298066328F);
        this.Lefttusk = new AdvancedModelRendererExtended(this, 15, 0);
        this.Lefttusk.setRotationPoint(1.399999976158142F, 2.299999952316284F, -4.300000190734863F);
        this.Lefttusk.addBox(-0.5F, -0.5F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Lefttusk, -1.1037462482559859F, -0.12740903872453743F, 0.0F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 20, 19);
        this.Leftlowerarm.setRotationPoint(0.0F, 3.799999952316284F, 0.0F);
        this.Leftlowerarm.addBox(-1.5F, -1.0F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.31834805156902407F, 0.10611601718967469F, 1.018923235956417F);
        this.Tail2.addChild(this.Tail3);
        this.Upperjaw2.addChild(this.Righttusk);
        this.Lowerjaw1.addChild(this.Jawparting);
        this.Lowerjaw2.addChild(this.Lowerjaw3);
        this.Upperjaw2.addChild(this.Upperbeak);
        this.Lowerjaw1.addChild(this.Lowerjaw2);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Rightthigh.addChild(this.Rightshin);
        this.Upperjaw1.addChild(this.Upperjaw2);
        this.Neck.addChild(this.Head);
        this.Hips.addChild(this.Rightthigh);
        this.Head.addChild(this.Upperjaw1);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Leftthigh.addChild(this.Leftshin);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Lowerjaw3.addChild(this.Lowerbeak);
        this.Bodyfront.addChild(this.Neck);
        this.Tail1.addChild(this.Tail2);
        this.Hips.addChild(this.Leftthigh);
        this.Bodymiddle.addChild(this.Bodyfront);
        this.Hips.addChild(this.Bodymiddle);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Leftshin.addChild(this.Lefthindfoot);
        this.Hips.addChild(this.Tail1);
        this.Head.addChild(this.Eyes);
        this.Head.addChild(this.Lowerjaw1);
        this.Lowerjaw3.addChild(this.Lowerjaw4);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Upperjaw2.addChild(this.Lefttusk);
        this.Leftupperarm.addChild(this.Leftlowerarm);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5 * 0.63f);
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
        this.Hips.offsetY = 0.56F;

        EntityPrehistoricFloraLystrosaurus Lystrosaurus = (EntityPrehistoricFloraLystrosaurus) e;
        float masterSpeed = Lystrosaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 2, Neck);
        this.faceTarget(f3, f4, 4, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail1, this.Tail2, this.Tail3};

        // || (Lystrosaurus.moveStrafing == 0 && Lystrosaurus.moveVertical == 0 && Lystrosaurus.moveForward == 0)

        if (Lystrosaurus.getAnimation() == Lystrosaurus.LAY_ANIMATION) {
            this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F) * 3, 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F * 3, 0.05F, 0.06F, f2, 1F);
            return;
        }

        if (f3 == 0.0F || !Lystrosaurus.getIsMoving()) { //Not moving
            this.swing(Neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 1.225F;
        if (Lystrosaurus.getIsFast()) {
            speed = speed * 2;
        }

        this.Leftupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.Rightupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(Leftupperarm, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(Rightupperarm, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(Leftthigh, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(Rightthigh, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(Leftupperarm, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(Rightupperarm, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(Leftthigh, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(Rightthigh, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(Leftlowerarm, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(Rightlowerarm, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(Leftshin, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(Rightshin, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(Leftlowerarm, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(Rightlowerarm, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(Leftshin, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(Rightshin, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(Leftfrontfoot, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(Rightfrontfoot, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(Lefthindfoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(Righthindfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(Hips, speed * 2F, 0.245F, false, 2.5F,  f2, 1F);

        this.flap(Hips, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(Bodymiddle, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(Bodyfront, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(Bodyfront, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(Neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLystrosaurus e = (EntityPrehistoricFloraLystrosaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.rotate(this.Tail1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
