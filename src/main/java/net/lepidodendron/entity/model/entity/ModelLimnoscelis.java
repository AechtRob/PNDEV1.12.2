package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLimnoscelis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLimnoscelis extends AdvancedModelBase {
    public AdvancedModelRenderer Hips;
    public AdvancedModelRenderer Belly;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Leftthigh;
    public AdvancedModelRenderer Rightthigh;
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Neck;
    public AdvancedModelRenderer Leftupperarm;
    public AdvancedModelRenderer Rightupperarm;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Upperjaw1;
    public AdvancedModelRenderer Lowerjaw1;
    public AdvancedModelRenderer Upperjaw2;
    public AdvancedModelRenderer Upperteeth1;
    public AdvancedModelRenderer Upperteeth2;
    public AdvancedModelRenderer Lowerjaw2;
    public AdvancedModelRenderer Jawparting;
    public AdvancedModelRenderer Lowerjaw3;
    public AdvancedModelRenderer Lowerteeth;
    public AdvancedModelRenderer Leftlowerarm;
    public AdvancedModelRenderer Leftfrontfoot;
    public AdvancedModelRenderer Rightlowerarm;
    public AdvancedModelRenderer Rightfrontfoot;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer Leftshin;
    public AdvancedModelRenderer Lefthindfoot;
    public AdvancedModelRenderer Rightshin;
    public AdvancedModelRenderer Righthindfoot;

    private ModelAnimator animator;

    public ModelLimnoscelis() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Hips = new AdvancedModelRenderer(this, 0, 41);
        this.Hips.setRotationPoint(0.0F, 15.5F, 9.0F);
        this.Hips.addBox(-3.5F, -1.5F, -6.5F, 7, 7, 12, 0.0F);
        this.setRotateAngle(Hips, -0.08482300164692443F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRenderer(this, 29, 31);
        this.Leftupperarm.setRotationPoint(3.200000047683716F, 4.099999904632568F, -6.0F);
        this.Leftupperarm.addBox(-1.0F, -1.5F, -2.0F, 6, 4, 4, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.0F, -0.27593656206399647F, -0.1485275233394591F);
        this.Neck = new AdvancedModelRenderer(this, 37, 89);
        this.Neck.setRotationPoint(0.0F, 0.800000011920929F, -9.0F);
        this.Neck.addBox(-3.0F, -1.5F, -4.0F, 6, 6, 5, 0.0F);
        this.setRotateAngle(Neck, -0.04241150198859518F, 0.0F, 0.0F);
        this.Upperjaw1 = new AdvancedModelRenderer(this, 65, 80);
        this.Upperjaw1.setRotationPoint(0.0F, -1.5F, -4.0F);
        this.Upperjaw1.addBox(-2.5F, 0.0F, -3.0F, 5, 4, 3, 0.0F);
        this.setRotateAngle(Upperjaw1, 0.08482300397719036F, 0.0F, 0.0F);
        this.Lowerjaw2 = new AdvancedModelRenderer(this, 56, 72);
        this.Lowerjaw2.setRotationPoint(0.0F, 2.0F, -3.799999952316284F);
        this.Lowerjaw2.addBox(-1.5F, -2.0F, -3.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Lowerjaw2, -0.12740903872453743F, 0.0F, 0.0F);
        this.Leftthigh = new AdvancedModelRenderer(this, 1, 0);
        this.Leftthigh.setRotationPoint(2.5F, 2.700000047683716F, 0.0F);
        this.Leftthigh.addBox(-1.0F, -1.5F, -2.0F, 7, 4, 4, 0.0F);
        this.setRotateAngle(Leftthigh, 0.0F, 0.2546435405291338F, -0.1485275233394591F);
        this.Lowerjaw3 = new AdvancedModelRenderer(this, 43, 71);
        this.Lowerjaw3.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.Lowerjaw3.addBox(-1.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Lowerjaw3, 0.12740903872453743F, 0.0F, 0.0F);
        this.Leftshin = new AdvancedModelRenderer(this, 49, 18);
        this.Leftshin.setRotationPoint(4.5F, 0.699999988079071F, 0.0F);
        this.Leftshin.addBox(-1.5F, -0.5F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(Leftshin, 0.0F, -0.06370451936226872F, -0.10611601718967469F);
        this.Rightlowerarm = new AdvancedModelRenderer(this, 50, 40);
        this.Rightlowerarm.setRotationPoint(-3.5999999046325684F, 0.699999988079071F, 0.0F);
        this.Rightlowerarm.addBox(-1.5F, -0.5F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.5307546228683145F, 0.1485275233394591F, 0.1485275233394591F);
        this.Lefthindfoot = new AdvancedModelRenderer(this, 63, 43);
        this.Lefthindfoot.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Lefthindfoot.addBox(-2.5F, 0.0F, -5.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Lefthindfoot, 0.0F, -0.2792526803190927F, 0.19111355309337907F);
        this.Rightupperarm = new AdvancedModelRenderer(this, 29, 40);
        this.Rightupperarm.setRotationPoint(-3.200000047683716F, 4.099999904632568F, -6.0F);
        this.Rightupperarm.addBox(-5.0F, -1.5F, -2.0F, 6, 4, 4, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.0F, 0.27593656206399647F, 0.1485275233394591F);
        this.Tail3 = new AdvancedModelRenderer(this, 20, 14);
        this.Tail3.setRotationPoint(0.0F, 0.4000000059604645F, 9.0F);
        this.Tail3.addBox(-1.5F, -1.0F, -0.5F, 3, 4, 11, 0.0F);
        this.setRotateAngle(Tail3, 0.15358897750445236F, 0.0F, 0.0F);
        this.Rightthigh = new AdvancedModelRenderer(this, 24, 0);
        this.Rightthigh.setRotationPoint(-2.5F, 2.700000047683716F, 0.0F);
        this.Rightthigh.addBox(-6.0F, -1.5F, -2.0F, 7, 4, 4, 0.0F);
        this.setRotateAngle(Rightthigh, 0.0F, -0.2546435405291338F, 0.1485275233394591F);
        this.Upperjaw2 = new AdvancedModelRenderer(this, 60, 89);
        this.Upperjaw2.setRotationPoint(0.0F, 3.9000000953674316F, -3.299999952316284F);
        this.Upperjaw2.addBox(-1.5F, -4.0F, -4.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(Upperjaw2, -0.06370451936226872F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 0, 9);
        this.Tail2.setRotationPoint(0.0F, -0.20000000298023224F, 8.5F);
        this.Tail2.addBox(-2.0F, -1.0F, -0.5F, 4, 5, 10, 0.0F);
        this.setRotateAngle(Tail2, 0.013613567666213066F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 42, 80);
        this.Head.setRotationPoint(0.0F, -0.10000000149011612F, -2.5F);
        this.Head.addBox(-3.5F, -1.5F, -4.0F, 7, 4, 4, 0.0F);
        this.setRotateAngle(Head, 0.06370451936226872F, 0.0F, 0.0F);
        this.Leftfrontfoot = new AdvancedModelRenderer(this, 64, 18);
        this.Leftfrontfoot.setRotationPoint(0.0F, 4.5F, -0.5F);
        this.Leftfrontfoot.addBox(-2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.6579891413176677F, -0.4881685797985891F, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRenderer(this, 64, 26);
        this.Rightfrontfoot.setRotationPoint(0.0F, 4.5F, -0.5F);
        this.Rightfrontfoot.addBox(-2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.6579891413176677F, 0.4881685797985891F, 0.0F);
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 82);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, -10.800000190734863F);
        this.Bodyfront.addBox(-4.0F, -1.0F, -9.5F, 8, 8, 10, 0.0F);
        this.setRotateAngle(Bodyfront, -0.021293017373673524F, 0.0F, 0.0F);
        this.Upperteeth1 = new AdvancedModelRenderer(this, 31, 67);
        this.Upperteeth1.setRotationPoint(0.0F, 4.0F, -3.0F);
        this.Upperteeth1.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 3, 0.0F);
        this.Jawparting = new AdvancedModelRenderer(this, 74, 88);
        this.Jawparting.setRotationPoint(0.009999999776482582F, 0.20000000298023224F, -3.5999999046325684F);
        this.Jawparting.addBox(-2.5F, -4.0F, 0.0F, 5, 4, 3, 0.0F);
        this.setRotateAngle(Jawparting, -0.40334560078853393F, 0.0F, 0.0F);
        this.Lowerteeth = new AdvancedModelRenderer(this, 31, 61);
        this.Lowerteeth.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Lowerteeth.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F);
        this.Leftlowerarm = new AdvancedModelRenderer(this, 50, 50);
        this.Leftlowerarm.setRotationPoint(3.5999999046325684F, 0.699999988079071F, 0.0F);
        this.Leftlowerarm.addBox(-1.5F, -0.5F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.5307546228683145F, -0.1485275233394591F, -0.1485275233394591F);
        this.Righthindfoot = new AdvancedModelRenderer(this, 63, 34);
        this.Righthindfoot.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Righthindfoot.addBox(-2.5F, 0.0F, -5.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(Righthindfoot, 0.08482300164692443F, 0.2792526803190927F, -0.19111355309337907F);
        this.Rightshin = new AdvancedModelRenderer(this, 50, 29);
        this.Rightshin.setRotationPoint(-4.5F, 0.699999988079071F, 0.0F);
        this.Rightshin.addBox(-1.5F, -0.5F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(Rightshin, 0.0F, 0.06370451936226872F, 0.10611601718967469F);
        this.Belly = new AdvancedModelRenderer(this, 0, 61);
        this.Belly.setRotationPoint(0.0F, -0.699999988079071F, -6.0F);
        this.Belly.addBox(-4.5F, -1.0F, -11.5F, 9, 8, 12, 0.0F);
        this.setRotateAngle(Belly, 0.10611601718967469F, 0.0F, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 0, 25);
        this.Tail1.setRotationPoint(0.0F, 0.30000001192092896F, 5.0F);
        this.Tail1.addBox(-2.5F, -1.5F, -0.5F, 5, 6, 9, 0.0F);
        this.setRotateAngle(Tail1, -0.14503686816442177F, 0.0F, 0.0F);
        this.Tail4 = new AdvancedModelRenderer(this, 38, 0);
        this.Tail4.setRotationPoint(0.0F, 0.20000000298023224F, 10.0F);
        this.Tail4.addBox(-1.0F, -1.0F, -0.5F, 2, 3, 14, 0.0F);
        this.setRotateAngle(Tail4, 0.037524580582353764F, 0.0F, 0.0F);
        this.Lowerjaw1 = new AdvancedModelRenderer(this, 53, 65);
        this.Lowerjaw1.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Lowerjaw1.addBox(-3.5F, 0.0F, -4.0F, 7, 2, 4, 0.0F);
        this.Upperteeth2 = new AdvancedModelRenderer(this, 42, 60);
        this.Upperteeth2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Upperteeth2.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Bodyfront.addChild(this.Neck);
        this.Head.addChild(this.Upperjaw1);
        this.Lowerjaw1.addChild(this.Lowerjaw2);
        this.Hips.addChild(this.Leftthigh);
        this.Lowerjaw2.addChild(this.Lowerjaw3);
        this.Leftthigh.addChild(this.Leftshin);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Leftshin.addChild(this.Lefthindfoot);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Tail2.addChild(this.Tail3);
        this.Hips.addChild(this.Rightthigh);
        this.Upperjaw1.addChild(this.Upperjaw2);
        this.Tail1.addChild(this.Tail2);
        this.Neck.addChild(this.Head);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Belly.addChild(this.Bodyfront);
        this.Upperjaw1.addChild(this.Upperteeth1);
        this.Lowerjaw1.addChild(this.Jawparting);
        this.Lowerjaw3.addChild(this.Lowerteeth);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Rightthigh.addChild(this.Rightshin);
        this.Hips.addChild(this.Belly);
        this.Hips.addChild(this.Tail1);
        this.Tail3.addChild(this.Tail4);
        this.Head.addChild(this.Lowerjaw1);
        this.Upperjaw2.addChild(this.Upperteeth2);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5 * 0.37f);
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
        this.Hips.offsetY = 0.93F; //72

        EntityPrehistoricFloraLimnoscelis Limnoscelis = (EntityPrehistoricFloraLimnoscelis) e;

        this.faceTarget(f3, f4, 2, Head);

        float speed = 0.2F;
        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3};
        AdvancedModelRenderer[] Torso = {this.Head, this.Neck, this.Bodyfront, this.Belly, this.Hips};

        if (!Limnoscelis.isReallyInWater()) {
            if (f3 == 0.0F || !Limnoscelis.getIsMoving()) {
                return;
            }
            ////this.flap(Leftthigh, speed, 0.65F, false, -3, -0.35F, f2, 0.5F);
            this.flap(Leftthigh, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
            ////this.swing(Leftthigh, speed, -0.3F, true, -1, 0.25F, f2, 0.5F);
            this.swing(Leftthigh, speed, -0.5F, true, -1, 1F, f2, 0.5F);
            this.walk(Leftshin, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
            //this.flap(Lefthindfoot, speed, 0.5F, false, 3, 0.4F, f2, 0.3F);
            //this.walk(Lefthindfoot, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);
            //this.swing(Lefthindfoot, speed, 0.4F, false, 3, 0F, f2, 0.5F);
            this.flap(Lefthindfoot, speed, 0.5F, false, 0, 0.4F, f2, 0.3F);
            this.walk(Lefthindfoot, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);
            this.swing(Lefthindfoot, speed, 0.4F, false, 0, 0F, f2, 0.5F);

            ////this.flap(Rightthigh, speed, -0.65F, false, 0, 0.35F, f2, 0.5F);
            this.flap(Rightthigh, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            ////this.swing(Rightthigh, speed, 0.3F, true, 2, -0.25F, f2, 0.5F);
            this.swing(Rightthigh, speed, 0.5F, true, 2, -1F, f2, 0.5F);
            this.walk(Rightshin, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
            //this.flap(Righthindfoot, speed, -0.5F, false, 6, -0.4F, f2, 0.3F);
            //this.walk(Righthindfoot, speed, 0.8F, false, 6, 0.4F, f2, 0.5F);
            //this.swing(Righthindfoot, speed, -0.4F, false, 6, 0F, f2, 0.5F);
            this.flap(Righthindfoot, speed, -0.5F, false, 3, -0.4F, f2, 0.3F);
            this.walk(Righthindfoot, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);
            this.swing(Righthindfoot, speed, -0.4F, false, 3, 0F, f2, 0.5F);

            this.flap(Leftupperarm, speed, 0.25F, false, 0, -0.18F, f2, 0.5F);
            this.swing(Leftupperarm, speed, -0.15F, true, 2, 0.1F, f2, 0.5F);
            this.walk(Leftlowerarm, speed, -0.3F, true, 0, 0.0F, f2, 0.8F);
            //this.flap(Leftfrontfoot, speed, 0.25F, true, 6, 0.2F, f2, 0.3F);
            //this.walk(Leftfrontfoot, speed, 0.25F, true, 6, 0.2F, f2, 0.3F);
            //this.swing(Leftfrontfoot, speed, 0.15F, true, 6, 0F, f2, 0.3F);
            this.flap(Leftfrontfoot, speed, 0.3F, false, -3, 0.4F, f2, 0.3F);
            this.walk(Leftfrontfoot, speed, 0.5F, false, -3, 0.4F, f2, 0.5F);
            this.swing(Leftfrontfoot, speed, 0.3F, false, -3, 0F, f2, 0.5F);

            this.flap(Rightupperarm, speed, -0.25F, false, -3, 0.18F, f2, 0.5F);
            this.swing(Rightupperarm, speed, 0.15F, true, -1, -0.1F, f2, 0.5F);
            this.walk(Rightlowerarm, speed, -0.3F, true, -3, 0.0F, f2, 0.8F);
            //this.flap(Rightfrontfoot, speed, -0.25F, true, 3, -0.2F, f2, 0.3F);
            //this.walk(Rightfrontfoot, speed, 0.25F, true, 3, 0.2F, f2, 0.3F);
            //this.swing(Rightfrontfoot, speed, -0.15F, true, 3, 0F, f2, 0.3F);
            this.flap(Rightfrontfoot, speed, -0.5F, false, 0, -0.4F, f2, 0.3F);
            this.walk(Rightfrontfoot, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);
            this.swing(Rightfrontfoot, speed, -0.4F, false, 0, 0F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.3F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
        }
        else {
            speed = speed * 2F;
            this.Lefthindfoot.rotateAngleX = (float) Math.toRadians(45);
            this.Righthindfoot.rotateAngleX = (float) Math.toRadians(45);

            this.Leftthigh.rotateAngleZ= (float) Math.toRadians(30);
            this.Leftshin.rotateAngleZ= (float) Math.toRadians(-40);
            this.Leftthigh.rotateAngleY= (float) Math.toRadians(-40);
            //if (!Limnoscelis.isInWater()) {
            //    this.Leftthigh.rotateAngleX= (float) Math.toRadians(10);}
           // else {
                this.Leftthigh.rotateAngleX = (float) Math.toRadians(70);
           // }

            this.Rightthigh.rotateAngleZ= (float) Math.toRadians(-30);
            this.Rightshin.rotateAngleZ= (float) Math.toRadians(40);
            this.Rightthigh.rotateAngleY= (float) Math.toRadians(40);
            //if (!Limnoscelis.isInWater()) {
                this.Rightthigh.rotateAngleX = (float) Math.toRadians(10);
            //}
            //else {
            //    this.Rightthigh.rotateAngleX= (float) Math.toRadians(70);
            //}

            this.Leftfrontfoot.rotateAngleX = (float) Math.toRadians(45);
            this.Rightfrontfoot.rotateAngleX = (float) Math.toRadians(45);

            this.Leftupperarm.rotateAngleZ= (float) Math.toRadians(30);
            //if (!Limnoscelis.isInWater()) {
            //    this.Leftupperarm.rotateAngleX = (float) Math.toRadians(10);
            //}
            //else {
                this.Leftupperarm.rotateAngleX = (float) Math.toRadians(70);
            //}

            this.Rightupperarm.rotateAngleZ= (float) Math.toRadians(-30);
            //if (!Limnoscelis.isInWater()) {
            //    this.Rightupperarm.rotateAngleX = (float) Math.toRadians(10);
            //}
            //else {
                this.Rightupperarm.rotateAngleX = (float) Math.toRadians(70);
            //}

            this.Leftlowerarm.rotateAngleY= (float) Math.toRadians(25);
            this.Leftlowerarm.rotateAngleZ= (float) Math.toRadians(-25);
            this.Rightlowerarm.rotateAngleY= (float) Math.toRadians(-25);
            this.Rightlowerarm.rotateAngleZ= (float) Math.toRadians(25);

            AdvancedModelRenderer[] BackL = {this.Leftthigh, this.Leftshin, this.Lefthindfoot};
            AdvancedModelRenderer[] BackR = {this.Rightthigh, this.Rightshin, this.Righthindfoot};
            AdvancedModelRenderer[] FrontL = {this.Leftupperarm, this.Leftlowerarm, this.Leftfrontfoot};
            AdvancedModelRenderer[] FrontR = {this.Rightupperarm, this.Rightlowerarm, this.Rightfrontfoot};

            this.chainWave(BackL, speed * 0.5F, 0.3F, -3, f2, 1);
            this.chainWave(BackR, speed * 0.5F, 0.3F, 0, f2, 1);
            this.chainWave(FrontL, speed * 0.5F, 0.3F, 0, f2, 1);
            this.chainWave(FrontR, speed * 0.5F, 0.3F, -3, f2, 1);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.3F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Head, 0,0,-1F);
        animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.Head, 0,0,-1F);
        animator.rotate(this.Head, (float) Math.toRadians(-45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
