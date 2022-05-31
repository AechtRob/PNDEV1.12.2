package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPsarolepis extends AdvancedModelBase {
    public AdvancedModelRenderer Body1;
    public AdvancedModelRenderer Body2;
    public AdvancedModelRenderer Dorsalspine1;
    public AdvancedModelRenderer Dorsalfin1;
    public AdvancedModelRenderer Leftpectoralarm;
    public AdvancedModelRenderer Rightpectoralarm;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Back1;
    public AdvancedModelRenderer Belly1;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Back2;
    public AdvancedModelRenderer Belly2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Back3;
    public AdvancedModelRenderer Belly3;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer Tailfin;
    public AdvancedModelRenderer Analfin;
    public AdvancedModelRenderer Dorsalspine2;
    public AdvancedModelRenderer Dorsalfin2;
    public AdvancedModelRenderer Leftpelvicfin;
    public AdvancedModelRenderer Rightpelvicfin;
    public AdvancedModelRenderer Leftpectoralfin;
    public AdvancedModelRenderer Rightpectoralfin;
    public AdvancedModelRenderer Upperjaw1;
    public AdvancedModelRenderer Headslope;
    public AdvancedModelRenderer Throat;
    public AdvancedModelRenderer Lowerjaw1;
    public AdvancedModelRenderer Leftpectoralspine;
    public AdvancedModelRenderer Rightpectoralspine;
    public AdvancedModelRenderer Leftmouthside;
    public AdvancedModelRenderer Rightmouthside;
    public AdvancedModelRenderer Upperjaw2;
    public AdvancedModelRenderer Upperteeth1;
    public AdvancedModelRenderer Upperfrontteeth;
    public AdvancedModelRenderer Jawparting;
    public AdvancedModelRenderer Lowerjaw2;
    public AdvancedModelRenderer Lowerjaw3;
    public AdvancedModelRenderer Lowerteeth1;
    public AdvancedModelRenderer Lowerteeth3;

    private ModelAnimator animator;

    public ModelPsarolepis() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Rightmouthside = new AdvancedModelRenderer(this, 52, 57);
        this.Rightmouthside.setRotationPoint(-2.9000000953674316F, 0.10000000149011612F, -4.0F);
        this.Rightmouthside.addBox(0.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(Rightmouthside, -0.36093409463874954F, -0.12740903872453743F, 0.0F);
        this.Lowerteeth1 = new AdvancedModelRenderer(this, 39, 94);
        this.Lowerteeth1.setRotationPoint(0.0F, 0.6000000238418579F, -3.0F);
        this.Lowerteeth1.addBox(-2.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F);
        this.setRotateAngle(Lowerteeth1, -0.06370451936226872F, 0.0F, 0.0F);
        this.Lowerjaw3 = new AdvancedModelRenderer(this, 66, 87);
        this.Lowerjaw3.setRotationPoint(0.0F, 1.0F, -2.799999952316284F);
        this.Lowerjaw3.addBox(-1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(Lowerjaw3, -0.04241150198859518F, 0.0F, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 0, 52);
        this.Tail1.setRotationPoint(0.0F, 0.5F, 7.300000190734863F);
        this.Tail1.addBox(-2.5F, -1.0F, 0.0F, 5, 5, 7, 0.0F);
        this.Body1 = new AdvancedModelRenderer(this, 0, 80);
        this.Body1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Body1.addBox(-3.5F, -1.5F, -7.0F, 7, 8, 12, 0.0F);
        this.Leftpelvicfin = new AdvancedModelRenderer(this, 84, 24);
        this.Leftpelvicfin.setRotationPoint(1.2999999523162842F, 0.0F, 4.0F);
        this.Leftpelvicfin.addBox(0.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F);
        this.setRotateAngle(Leftpelvicfin, 0.0F, -0.46705011182842415F, 0.8066912015770679F);
        this.Lowerjaw1 = new AdvancedModelRenderer(this, 42, 75);
        this.Lowerjaw1.setRotationPoint(0.009999999776482582F, 6.199999809265137F, -3.5F);
        this.Lowerjaw1.addBox(-3.0F, -1.0F, -5.0F, 6, 1, 5, 0.0F);
        this.setRotateAngle(Lowerjaw1, -0.12740903872453743F, 0.0F, 0.0F);
        this.Lowerteeth3 = new AdvancedModelRenderer(this, 57, 89);
        this.Lowerteeth3.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.Lowerteeth3.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 2, 0.0F);
        this.Upperfrontteeth = new AdvancedModelRenderer(this, 58, 94);
        this.Upperfrontteeth.setRotationPoint(0.009999999776482582F, 0.0F, -3.0F);
        this.Upperfrontteeth.addBox(-2.5F, 0.0F, 0.0F, 5, 2, 4, 0.0F);
        this.setRotateAngle(Upperfrontteeth, -0.31834805156902407F, 0.0F, 0.0F);
        this.Leftmouthside = new AdvancedModelRenderer(this, 52, 66);
        this.Leftmouthside.setRotationPoint(2.9000000953674316F, 0.10000000149011612F, -4.0F);
        this.Leftmouthside.addBox(-4.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(Leftmouthside, -0.36093409463874954F, 0.12740903872453743F, 0.0F);
        this.Back3 = new AdvancedModelRenderer(this, 37, 8);
        this.Back3.setRotationPoint(0.0F, -1.649999976158142F, 0.0F);
        this.Back3.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 6, 0.0F);
        this.setRotateAngle(Back3, -0.10611601718967469F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 0, 41);
        this.Tail2.setRotationPoint(0.0F, 0.5F, 6.199999809265137F);
        this.Tail2.addBox(-2.0F, -1.0F, 0.0F, 4, 4, 6, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 71, 63);
        this.Head.setRotationPoint(0.0F, -0.5F, -7.0F);
        this.Head.addBox(-3.5F, 0.0F, -5.0F, 7, 6, 5, 0.0F);
        this.Back1 = new AdvancedModelRenderer(this, 0, 1);
        this.Back1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Back1.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 8, 0.0F);
        this.setRotateAngle(Back1, -0.10611601718967469F, 0.0F, 0.0F);
        this.Throat = new AdvancedModelRenderer(this, 29, 59);
        this.Throat.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Throat.addBox(-3.0F, -1.0F, -5.0F, 6, 1, 5, 0.0F);
        this.setRotateAngle(Throat, -0.169820528229565F, 0.0F, 0.0F);
        this.Back2 = new AdvancedModelRenderer(this, 20, 4);
        this.Back2.setRotationPoint(0.0F, -1.7000000476837158F, 0.0F);
        this.Back2.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
        this.setRotateAngle(Back2, -0.08482300397719036F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 0, 32);
        this.Tail3.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.Tail3.addBox(-1.5F, -1.0F, 0.0F, 3, 3, 5, 0.0F);
        this.Belly2 = new AdvancedModelRenderer(this, 20, 17);
        this.Belly2.setRotationPoint(0.0F, 4.800000190734863F, 0.0F);
        this.Belly2.addBox(-2.0F, -1.0F, 0.0F, 4, 1, 7, 0.0F);
        this.setRotateAngle(Belly2, 0.06370451936226872F, 0.0F, 0.0F);
        this.Dorsalspine2 = new AdvancedModelRenderer(this, 44, 0);
        this.Dorsalspine2.setRotationPoint(0.0F, 0.0F, 2.299999952316284F);
        this.Dorsalspine2.addBox(-0.5F, -5.300000190734863F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(Dorsalspine2, -0.6368706733475028F, 0.0F, 0.0F);
        this.Rightpectoralfin = new AdvancedModelRenderer(this, 88, 34);
        this.Rightpectoralfin.setRotationPoint(-0.699999988079071F, 0.699999988079071F, 0.20000000298023224F);
        this.Rightpectoralfin.addBox(-6.0F, -3.5F, 0.0F, 6, 4, 0, 0.0F);
        this.setRotateAngle(Rightpectoralfin, 0.0F, 0.0F, 0.06370451936226872F);
        this.Tail4 = new AdvancedModelRenderer(this, 0, 21);
        this.Tail4.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.Tail4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
        this.Headslope = new AdvancedModelRenderer(this, 34, 52);
        this.Headslope.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Headslope.addBox(-3.0F, 0.0F, -5.0F, 6, 1, 5, 0.0F);
        this.setRotateAngle(Headslope, 0.1911135497644277F, 0.0F, 0.0F);
        this.Upperjaw1 = new AdvancedModelRenderer(this, 29, 66);
        this.Upperjaw1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Upperjaw1.addBox(-3.0F, 0.0F, -5.0F, 6, 3, 5, 0.0F);
        this.setRotateAngle(Upperjaw1, 0.169820528229565F, 0.0F, 0.0F);
        this.Rightpectoralarm = new AdvancedModelRenderer(this, 79, 33);
        this.Rightpectoralarm.setRotationPoint(-3.5F, 5.0F, -6.199999809265137F);
        this.Rightpectoralarm.addBox(-3.0F, -1.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(Rightpectoralarm, -0.40334560078853393F, 1.0613347421062016F, -0.31834805156902407F);
        this.Analfin = new AdvancedModelRenderer(this, 80, 0);
        this.Analfin.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Analfin.addBox(0.0F, 0.0F, 0.0F, 0, 3, 6, 0.0F);
        this.setRotateAngle(Analfin, 0.12740903872453743F, 0.0F, 0.0F);
        this.Rightpectoralspine = new AdvancedModelRenderer(this, 27, 86);
        this.Rightpectoralspine.setRotationPoint(-3.200000047683716F, 6.5F, -2.0F);
        this.Rightpectoralspine.addBox(-5.0F, -4.0F, 0.0F, 6, 4, 1, 0.0F);
        this.setRotateAngle(Rightpectoralspine, -0.40334560078853393F, 1.0400417039265821F, -0.33964105645913F);
        this.Dorsalspine1 = new AdvancedModelRenderer(this, 49, 0);
        this.Dorsalspine1.setRotationPoint(0.0F, -1.5F, -4.900000095367432F);
        this.Dorsalspine1.addBox(-0.5F, -6.5F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(Dorsalspine1, -0.6368706733475028F, 0.0F, 0.0F);
        this.Rightpelvicfin = new AdvancedModelRenderer(this, 75, 24);
        this.Rightpelvicfin.setRotationPoint(-1.2999999523162842F, 0.0F, 4.0F);
        this.Rightpelvicfin.addBox(-4.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F);
        this.setRotateAngle(Rightpelvicfin, 0.0F, 0.4881685797985891F, -0.8066912015770679F);
        this.Lowerjaw2 = new AdvancedModelRenderer(this, 61, 82);
        this.Lowerjaw2.setRotationPoint(-0.009999999776482582F, -1.0F, -4.800000190734863F);
        this.Lowerjaw2.addBox(-2.5F, 0.0F, -3.0F, 5, 1, 3, 0.0F);
        this.setRotateAngle(Lowerjaw2, 0.12740903872453743F, 0.0F, 0.0F);
        this.Body2 = new AdvancedModelRenderer(this, 0, 65);
        this.Body2.setRotationPoint(0.0F, 0.5F, 4.300000190734863F);
        this.Body2.addBox(-3.0F, -1.0F, 0.0F, 6, 6, 8, 0.0F);
        this.Jawparting = new AdvancedModelRenderer(this, 43, 82);
        this.Jawparting.setRotationPoint(0.009999999776482582F, 0.0F, -3.0F);
        this.Jawparting.addBox(-3.0F, -1.0F, 0.0F, 6, 1, 5, 0.0F);
        this.setRotateAngle(Jawparting, 0.46705011182842415F, 0.0F, 0.0F);
        this.Dorsalfin2 = new AdvancedModelRenderer(this, 54, 0);
        this.Dorsalfin2.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Dorsalfin2.addBox(0.0F, -6.0F, 0.0F, 0, 6, 5, 0.0F);
        this.setRotateAngle(Dorsalfin2, -0.27593656206399647F, 0.0F, 0.0F);
        this.Upperjaw2 = new AdvancedModelRenderer(this, 65, 75);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Upperjaw2.addBox(-2.5F, 0.0F, -3.0F, 5, 2, 3, 0.0F);
        this.setRotateAngle(Upperjaw2, 0.21223203437934937F, 0.0F, 0.0F);
        this.Upperteeth1 = new AdvancedModelRenderer(this, 40, 89);
        this.Upperteeth1.setRotationPoint(0.0F, 2.299999952316284F, -4.800000190734863F);
        this.Upperteeth1.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 3, 0.0F);
        this.setRotateAngle(Upperteeth1, -0.33964105645913F, 0.0F, 0.0F);
        this.Leftpectoralarm = new AdvancedModelRenderer(this, 79, 29);
        this.Leftpectoralarm.setRotationPoint(3.5F, 5.0F, -6.199999809265137F);
        this.Leftpectoralarm.addBox(0.0F, -1.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(Leftpectoralarm, -0.40334560078853393F, -1.0613347421062016F, 0.31834805156902407F);
        this.Belly1 = new AdvancedModelRenderer(this, 0, 11);
        this.Belly1.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Belly1.addBox(-2.5F, -1.0F, 0.0F, 5, 1, 8, 0.0F);
        this.setRotateAngle(Belly1, 0.08482300397719036F, 0.0F, 0.0F);
        this.Tailfin = new AdvancedModelRenderer(this, 80, 0);
        this.Tailfin.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.Tailfin.addBox(0.0F, -7.0F, 0.0F, 0, 13, 10, 0.0F);
        this.Leftpectoralspine = new AdvancedModelRenderer(this, 27, 80);
        this.Leftpectoralspine.setRotationPoint(3.200000047683716F, 6.5F, -2.0F);
        this.Leftpectoralspine.addBox(-1.0F, -4.0F, 0.0F, 6, 4, 1, 0.0F);
        this.setRotateAngle(Leftpectoralspine, -0.40334560078853393F, -1.0400417039265821F, 0.33964105645913F);
        this.Dorsalfin1 = new AdvancedModelRenderer(this, 65, 0);
        this.Dorsalfin1.setRotationPoint(0.0F, -1.5F, -3.700000047683716F);
        this.Dorsalfin1.addBox(0.0F, -6.0F, 0.0F, 0, 6, 7, 0.0F);
        this.setRotateAngle(Dorsalfin1, -0.10611601718967469F, 0.0F, 0.0F);
        this.Belly3 = new AdvancedModelRenderer(this, 36, 16);
        this.Belly3.setRotationPoint(0.0F, 3.799999952316284F, 0.0F);
        this.Belly3.addBox(-1.5F, -1.0F, 0.0F, 3, 1, 6, 0.0F);
        this.setRotateAngle(Belly3, 0.12740903872453743F, 0.0F, 0.0F);
        this.Leftpectoralfin = new AdvancedModelRenderer(this, 88, 29);
        this.Leftpectoralfin.setRotationPoint(0.699999988079071F, 0.699999988079071F, 0.20000000298023224F);
        this.Leftpectoralfin.addBox(0.0F, -3.5F, 0.0F, 6, 4, 0, 0.0F);
        this.setRotateAngle(Leftpectoralfin, 0.0F, 0.0F, -0.06370451936226872F);
        this.Upperjaw1.addChild(this.Rightmouthside);
        this.Lowerjaw2.addChild(this.Lowerteeth1);
        this.Lowerjaw2.addChild(this.Lowerjaw3);
        this.Body2.addChild(this.Tail1);
        this.Belly1.addChild(this.Leftpelvicfin);
        this.Head.addChild(this.Lowerjaw1);
        this.Lowerjaw3.addChild(this.Lowerteeth3);
        this.Upperjaw2.addChild(this.Upperfrontteeth);
        this.Upperjaw1.addChild(this.Leftmouthside);
        this.Tail2.addChild(this.Back3);
        this.Tail1.addChild(this.Tail2);
        this.Body1.addChild(this.Head);
        this.Body2.addChild(this.Back1);
        this.Head.addChild(this.Throat);
        this.Tail1.addChild(this.Back2);
        this.Tail2.addChild(this.Tail3);
        this.Tail1.addChild(this.Belly2);
        this.Back2.addChild(this.Dorsalspine2);
        this.Rightpectoralarm.addChild(this.Rightpectoralfin);
        this.Tail3.addChild(this.Tail4);
        this.Head.addChild(this.Headslope);
        this.Head.addChild(this.Upperjaw1);
        this.Body1.addChild(this.Rightpectoralarm);
        this.Belly3.addChild(this.Analfin);
        this.Head.addChild(this.Rightpectoralspine);
        this.Body1.addChild(this.Dorsalspine1);
        this.Belly1.addChild(this.Rightpelvicfin);
        this.Lowerjaw1.addChild(this.Lowerjaw2);
        this.Body1.addChild(this.Body2);
        this.Lowerjaw1.addChild(this.Jawparting);
        this.Back2.addChild(this.Dorsalfin2);
        this.Upperjaw1.addChild(this.Upperjaw2);
        this.Upperjaw1.addChild(this.Upperteeth1);
        this.Body1.addChild(this.Leftpectoralarm);
        this.Body2.addChild(this.Belly1);
        this.Tail4.addChild(this.Tailfin);
        this.Head.addChild(this.Leftpectoralspine);
        this.Body1.addChild(this.Dorsalfin1);
        this.Tail2.addChild(this.Belly3);
        this.Leftpectoralarm.addChild(this.Leftpectoralfin);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body1.render(f5 * 0.2F);
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
        this.Body1.offsetY = 1.35F;

        //this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Tail1, this.Tail2, this.Tail3, this.Tail4};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 0.6F);
            this.chainSwing(fishTail, speed, 0.5F, -3, f2, 0.6F);
            this.swing(Body1, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Leftpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(Leftpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(Rightpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(Rightpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Body1.rotateAngleZ = (float) Math.toRadians(90);
                this.Body1.offsetY = 1.35F;
                this.bob(Body1, -speed, 5F, false, f2, 1);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Upperjaw1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(3);
    }
}