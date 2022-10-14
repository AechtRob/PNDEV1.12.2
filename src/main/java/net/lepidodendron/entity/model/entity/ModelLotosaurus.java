package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLotosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelLotosaurus extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended Hips;
    public AdvancedModelRendererExtended Belly;
    public AdvancedModelRendererExtended Tailbase;
    public AdvancedModelRendererExtended Hiphumpfront;
    public AdvancedModelRendererExtended Rightthigh;
    public AdvancedModelRendererExtended Leftthigh;
    public AdvancedModelRendererExtended Bodyfront;
    public AdvancedModelRendererExtended Bellyhump;
    public AdvancedModelRendererExtended Neck;
    public AdvancedModelRendererExtended Fronthumpfront;
    public AdvancedModelRendererExtended Leftupperarm;
    public AdvancedModelRendererExtended Rightupperarm;
    public AdvancedModelRendererExtended Head;
    public AdvancedModelRendererExtended Neckhump;
    public AdvancedModelRendererExtended Upperjawback;
    public AdvancedModelRendererExtended Lowerjawback;
    public AdvancedModelRendererExtended Upperjawmiddle;
    public AdvancedModelRendererExtended Lefteye;
    public AdvancedModelRendererExtended Righteye;
    public AdvancedModelRendererExtended Upperjawfront;
    public AdvancedModelRendererExtended Faceslopemiddle;
    public AdvancedModelRendererExtended Faceslopefront;
    public AdvancedModelRendererExtended Lowerjawmiddleback;
    public AdvancedModelRendererExtended Masseter;
    public AdvancedModelRendererExtended Lowerjawmiddlefront;
    public AdvancedModelRendererExtended Lowerjawslopeback;
    public AdvancedModelRendererExtended Lowerjawfront;
    public AdvancedModelRendererExtended Lowerjawslopefront;
    public AdvancedModelRendererExtended Fronthumpback;
    public AdvancedModelRendererExtended Leftlowerarm;
    public AdvancedModelRendererExtended Leftfrontfoot;
    public AdvancedModelRendererExtended Rightlowerarm;
    public AdvancedModelRendererExtended Rightfrontfoot;
    public AdvancedModelRendererExtended Tailmiddlebase;
    public AdvancedModelRendererExtended Tailbasehump;
    public AdvancedModelRendererExtended Tailmiddle;
    public AdvancedModelRendererExtended Tailmidbasehump;
    public AdvancedModelRendererExtended Tailmiddleend;
    public AdvancedModelRendererExtended Tailmiddlehump;
    public AdvancedModelRendererExtended Tailend;
    public AdvancedModelRendererExtended Hiphumpback;
    public AdvancedModelRendererExtended Rightshin;
    public AdvancedModelRendererExtended Rightheel;
    public AdvancedModelRendererExtended Righttoes;
    public AdvancedModelRendererExtended Leftshin;
    public AdvancedModelRendererExtended Leftheel;
    public AdvancedModelRendererExtended Lefttoes;

    private ModelAnimator animator;

    public ModelLotosaurus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Leftthigh = new AdvancedModelRendererExtended(this, 80, 71);
        this.Leftthigh.setRotationPoint(3.0F, 1.5F, -0.5F);
        this.Leftthigh.addBox(-1.0F, -1.0F, -2.0F, 4, 8, 6, 0.0F);
        this.setRotateAngle(Leftthigh, -0.1485275233394591F, -0.04241150198859518F, 0.0F);
        this.Neck = new AdvancedModelRendererExtended(this, 31, 69);
        this.Neck.setRotationPoint(0.0F, 0.4000000059604645F, -5.800000190734863F);
        this.Neck.addBox(-2.0F, -1.0F, -7.5F, 4, 6, 9, 0.0F);
        this.setRotateAngle(Neck, -0.10611601718967469F, 0.0F, 0.0F);
        this.Upperjawmiddle = new AdvancedModelRendererExtended(this, 17, 28);
        this.Upperjawmiddle.setRotationPoint(0.0F, 0.9300000071525574F, -1.600000023841858F);
        this.Upperjawmiddle.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Upperjawmiddle, 0.10611601718967469F, 0.0F, 0.0F);
        this.Tailmiddle = new AdvancedModelRendererExtended(this, 60, 53);
        this.Tailmiddle.setRotationPoint(0.0F, -0.4000000059604645F, 6.0F);
        this.Tailmiddle.addBox(-1.5F, -0.5F, 0.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(Tailmiddle, 0.06370451936226872F, 0.0F, 0.0F);
        this.Neckhump = new AdvancedModelRendererExtended(this, 43, 16);
        this.Neckhump.setRotationPoint(0.0F, -4.5F, 0.0F);
        this.Neckhump.addBox(-1.0F, 0.0F, -8.0F, 2, 3, 8, 0.0F);
        this.setRotateAngle(Neckhump, 0.4457571069383183F, 0.0F, 0.0F);
        this.Belly = new AdvancedModelRendererExtended(this, 0, 77);
        this.Belly.setRotationPoint(0.0F, -0.4000000059604645F, -3.5F);
        this.Belly.addBox(-4.5F, -1.5F, -12.0F, 9, 11, 12, 0.0F);
        this.setRotateAngle(Belly, 0.08482300397719036F, 0.0F, 0.0F);
        this.Tailend = new AdvancedModelRendererExtended(this, 24, 38);
        this.Tailend.setRotationPoint(0.0F, 0.0F, 3.200000047683716F);
        this.Tailend.addBox(-0.5F, -0.5F, 0.0F, 1, 2, 4, 0.0F);
        this.setRotateAngle(Tailend, 0.10611601718967469F, 0.0F, 0.0F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 88, 60);
        this.Leftlowerarm.setRotationPoint(1.0F, 6.0F, 1.2000000476837158F);
        this.Leftlowerarm.addBox(-1.5F, -0.5F, -2.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.5731661290180989F, 0.0F, 0.04241150198859518F);
        this.Rightheel = new AdvancedModelRendererExtended(this, 65, 46);
        this.Rightheel.setRotationPoint(0.0F, 8.0F, 1.0F);
        this.Rightheel.addBox(-2.0F, -0.5F, -2.5F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Rightheel, -0.10611601718967469F, 0.0F, 0.0F);
        this.Faceslopemiddle = new AdvancedModelRendererExtended(this, 36, 25);
        this.Faceslopemiddle.setRotationPoint(0.009999999776482582F, -0.4099999964237213F, -1.75F);
        this.Faceslopemiddle.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Faceslopemiddle, 0.2546435405291338F, 0.0F, 0.0F);
        this.Masseter = new AdvancedModelRendererExtended(this, 0, 19);
        this.Masseter.setRotationPoint(0.0F, 0.20000000298023224F, -3.0F);
        this.Masseter.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Masseter, -0.4457571069383183F, 0.0F, 0.0F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 31, 48);
        this.Leftfrontfoot.setRotationPoint(0.0F, 5.699999809265137F, -1.2000000476837158F);
        this.Leftfrontfoot.addBox(-2.0F, -0.5F, -3.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.04241150198859518F, 0.0F, 0.0F);
        this.Tailmiddleend = new AdvancedModelRendererExtended(this, 31, 41);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.30000001192092896F, 5.199999809265137F);
        this.Tailmiddleend.addBox(-1.0F, -0.5F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Tailmiddleend, 0.04241150198859518F, 0.0F, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 0, 57);
        this.Hips.setRotationPoint(0.0F, 7.0F, 9.0F);
        this.Hips.addBox(-3.5F, -1.5F, -5.0F, 7, 9, 10, 0.0F);
        this.setRotateAngle(Hips, -0.08482300164692443F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRendererExtended(this, 43, 85);
        this.Tailbase.setRotationPoint(0.0F, -0.5F, 4.0F);
        this.Tailbase.addBox(-2.5F, -1.0F, 0.0F, 5, 5, 10, 0.0F);
        this.setRotateAngle(Tailbase, -0.169820528229565F, 0.0F, 0.0F);
        this.Lowerjawfront = new AdvancedModelRendererExtended(this, 33, 32);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Lowerjawfront.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Lowerjawfront, 0.13229595596958962F, 0.0F, 0.0F);
        this.Lowerjawback = new AdvancedModelRendererExtended(this, 0, 26);
        this.Lowerjawback.setRotationPoint(0.0F, 2.0F, 0.5F);
        this.Lowerjawback.addBox(-2.5F, 0.0F, -3.0F, 5, 2, 3, 0.0F);
        this.Fronthumpback = new AdvancedModelRendererExtended(this, 80, 19);
        this.Fronthumpback.setRotationPoint(0.0F, -3.0999999046325684F, 2.0F);
        this.Fronthumpback.addBox(-2.0F, 0.0F, 0.0F, 4, 5, 6, 0.0F);
        this.setRotateAngle(Fronthumpback, 0.2546435405291338F, 0.0F, 0.0F);
        this.Lowerjawslopefront = new AdvancedModelRendererExtended(this, 31, 28);
        this.Lowerjawslopefront.setRotationPoint(0.0F, -0.009999999776482582F, -1.7000000476837158F);
        this.Lowerjawslopefront.addBox(-0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Lowerjawslopefront, -0.008726646259971648F, 0.0F, 0.0F);
        this.Tailmiddlebase = new AdvancedModelRendererExtended(this, 48, 66);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.10000000149011612F, 9.300000190734863F);
        this.Tailmiddlebase.addBox(-2.0F, -1.0F, 0.0F, 4, 4, 7, 0.0F);
        this.setRotateAngle(Tailmiddlebase, -0.08482300397719036F, 0.0F, 0.0F);
        this.Tailbasehump = new AdvancedModelRendererExtended(this, 35, 0);
        this.Tailbasehump.setRotationPoint(0.0F, -0.8999999761581421F, -0.20000000298023224F);
        this.Tailbasehump.addBox(-1.5F, -3.299999952316284F, -0.5F, 3, 4, 11, 0.0F);
        this.setRotateAngle(Tailbasehump, -0.10611601718967469F, 0.0F, 0.0F);
        this.Hiphumpback = new AdvancedModelRendererExtended(this, 65, 0);
        this.Hiphumpback.setRotationPoint(0.009999999776482582F, -5.0F, 6.0F);
        this.Hiphumpback.addBox(-2.0F, 0.0F, 0.0F, 4, 5, 6, 0.0F);
        this.setRotateAngle(Hiphumpback, -0.21223203437934937F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 0, 39);
        this.Bodyfront.setRotationPoint(0.0F, 0.30000001192092896F, -11.0F);
        this.Bodyfront.addBox(-4.0F, -1.5F, -7.0F, 8, 10, 7, 0.0F);
        this.setRotateAngle(Bodyfront, 0.04241150198859518F, 0.0F, 0.0F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 71, 63);
        this.Leftshin.setRotationPoint(1.0F, 6.599999904632568F, -1.0F);
        this.Leftshin.addBox(-1.5F, -0.5F, -0.5F, 3, 9, 4, 0.0F);
        this.setRotateAngle(Leftshin, 0.33964105645913F, 0.0F, 0.0F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 64, 78);
        this.Rightshin.setRotationPoint(-1.0F, 6.599999904632568F, -1.0F);
        this.Rightshin.addBox(-1.5F, -0.5F, -0.5F, 3, 9, 4, 0.0F);
        this.setRotateAngle(Rightshin, 0.33964105645913F, 0.0F, 0.0F);
        this.Tailmiddlehump = new AdvancedModelRendererExtended(this, 58, 12);
        this.Tailmiddlehump.setRotationPoint(0.0F, 0.10000000149011612F, 0.0F);
        this.Tailmiddlehump.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 6, 0.0F);
        this.setRotateAngle(Tailmiddlehump, -0.21223203437934937F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRendererExtended(this, 0, 32);
        this.Head.setRotationPoint(0.0F, 0.20000000298023224F, -6.5F);
        this.Head.addBox(-2.5F, -1.0F, -2.5F, 5, 3, 3, 0.0F);
        this.setRotateAngle(Head, 0.33964105645913F, 0.0F, 0.0F);
        this.Lowerjawslopeback = new AdvancedModelRendererExtended(this, 22, 21);
        this.Lowerjawslopeback.setRotationPoint(0.009999999776482582F, 1.899999976158142F, -0.11999999731779099F);
        this.Lowerjawslopeback.addBox(-1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(Lowerjawslopeback, -0.169820528229565F, 0.0F, 0.0F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 79, 52);
        this.Rightlowerarm.setRotationPoint(-1.0F, 6.0F, 1.2000000476837158F);
        this.Rightlowerarm.addBox(-1.5F, -0.5F, -2.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.5731661290180989F, 0.0F, -0.04241150198859518F);
        this.Lowerjawmiddleback = new AdvancedModelRendererExtended(this, 14, 24);
        this.Lowerjawmiddleback.setRotationPoint(0.0F, -0.009999999776482582F, -2.6700000762939453F);
        this.Lowerjawmiddleback.addBox(-1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(Lowerjawmiddleback, 0.04241150198859518F, 0.0F, 0.0F);
        this.Bellyhump = new AdvancedModelRendererExtended(this, 0, 0);
        this.Bellyhump.setRotationPoint(0.0F, -1.5F, -6.0F);
        this.Bellyhump.addBox(-2.5F, -5.0F, -6.0F, 5, 5, 12, 0.0F);
        this.Fronthumpfront = new AdvancedModelRendererExtended(this, 67, 25);
        this.Fronthumpfront.setRotationPoint(0.0F, -1.0F, -7.0F);
        this.Fronthumpfront.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Fronthumpfront, 0.1485275233394591F, 0.0F, 0.0F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 74, 86);
        this.Rightthigh.setRotationPoint(-3.0F, 1.5F, -0.5F);
        this.Rightthigh.addBox(-3.0F, -1.0F, -2.0F, 4, 8, 6, 0.0F);
        this.setRotateAngle(Rightthigh, -0.1485275233394591F, 0.04241150198859518F, 0.0F);
        this.Upperjawback = new AdvancedModelRendererExtended(this, 17, 33);
        this.Upperjawback.setRotationPoint(0.0F, -1.0F, -2.299999952316284F);
        this.Upperjawback.addBox(-1.5F, 0.0F, -2.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(Upperjawback, 0.04241150198859518F, 0.0F, 0.0F);
        this.Upperjawfront = new AdvancedModelRendererExtended(this, 25, 26);
        this.Upperjawfront.setRotationPoint(0.0F, 0.8199999928474426F, -1.0F);
        this.Upperjawfront.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Upperjawfront, 0.169820528229565F, 0.0F, 0.0F);
        this.Lefteye = new AdvancedModelRendererExtended(this, 30, 24);
        this.Lefteye.setRotationPoint(1.4500000476837158F, 1.100000023841858F, -1.899999976158142F);
        this.Lefteye.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Lefteye, -0.04241150198859518F, 0.1911135497644277F, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 26, 55);
        this.Leftupperarm.setRotationPoint(3.0F, 5.5F, -4.300000190734863F);
        this.Leftupperarm.addBox(-1.0F, -1.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.4881685797985891F, 0.0F, -0.04241150198859518F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 43, 54);
        this.Rightupperarm.setRotationPoint(-3.0F, 5.5F, -4.5F);
        this.Rightupperarm.addBox(-3.0F, -1.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.4881685797985891F, 0.0F, 0.04241150198859518F);
        this.Righteye = new AdvancedModelRendererExtended(this, 37, 29);
        this.Righteye.setRotationPoint(-1.4500000476837158F, 1.100000023841858F, -1.899999976158142F);
        this.Righteye.addBox(0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Righteye, -0.04241150198859518F, -0.1911135497644277F, 0.0F);
        this.Righttoes = new AdvancedModelRendererExtended(this, 40, 39);
        this.Righttoes.setRotationPoint(-0.009999999776482582F, 0.49000000953674316F, -2.25F);
        this.Righttoes.addBox(-2.0F, -1.0F, -2.799999952316284F, 4, 2, 3, 0.0F);
        this.Faceslopefront = new AdvancedModelRendererExtended(this, 26, 30);
        this.Faceslopefront.setRotationPoint(-0.009999999776482582F, 0.0F, -2.0F);
        this.Faceslopefront.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Faceslopefront, 0.7391469115879876F, 0.0F, 0.0F);
        this.Lefttoes = new AdvancedModelRendererExtended(this, 51, 34);
        this.Lefttoes.setRotationPoint(0.009999999776482582F, 0.49000000953674316F, -2.25F);
        this.Lefttoes.addBox(-2.0F, -1.0F, -2.799999952316284F, 4, 2, 3, 0.0F);
        this.Lowerjawmiddlefront = new AdvancedModelRendererExtended(this, 28, 34);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerjawmiddlefront.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Lowerjawmiddlefront, 0.08482300397719036F, 0.0F, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 48, 47);
        this.Rightfrontfoot.setRotationPoint(0.0F, 5.699999809265137F, -1.2000000476837158F);
        this.Rightfrontfoot.addBox(-2.0F, -0.5F, -3.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.04241150198859518F, 0.0F, 0.0F);
        this.Tailmidbasehump = new AdvancedModelRendererExtended(this, 66, 14);
        this.Tailmidbasehump.setRotationPoint(0.0F, -0.6499999761581421F, 0.0F);
        this.Tailmidbasehump.addBox(-1.0F, -2.5F, 0.0F, 2, 3, 7, 0.0F);
        this.setRotateAngle(Tailmidbasehump, -0.12740903872453743F, 0.0F, 0.0F);
        this.Hiphumpfront = new AdvancedModelRendererExtended(this, 80, 6);
        this.Hiphumpfront.setRotationPoint(0.0F, -1.5F, -5.599999904632568F);
        this.Hiphumpfront.addBox(-2.0F, -5.0F, 0.0F, 4, 5, 6, 0.0F);
        this.setRotateAngle(Hiphumpfront, -0.06370451936226872F, 0.0F, 0.0F);
        this.Leftheel = new AdvancedModelRendererExtended(this, 53, 40);
        this.Leftheel.setRotationPoint(0.0F, 8.0F, 1.0F);
        this.Leftheel.addBox(-2.0F, -0.5F, -2.5F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Leftheel, -0.10611601718967469F, 0.0F, 0.0F);
        this.Hips.addChild(this.Leftthigh);
        this.Bodyfront.addChild(this.Neck);
        this.Upperjawback.addChild(this.Upperjawmiddle);
        this.Tailmiddlebase.addChild(this.Tailmiddle);
        this.Neck.addChild(this.Neckhump);
        this.Hips.addChild(this.Belly);
        this.Tailmiddleend.addChild(this.Tailend);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Rightshin.addChild(this.Rightheel);
        this.Upperjawmiddle.addChild(this.Faceslopemiddle);
        this.Lowerjawback.addChild(this.Masseter);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Tailmiddle.addChild(this.Tailmiddleend);
        this.Hips.addChild(this.Tailbase);
        this.Lowerjawmiddlefront.addChild(this.Lowerjawfront);
        this.Head.addChild(this.Lowerjawback);
        this.Fronthumpfront.addChild(this.Fronthumpback);
        this.Lowerjawslopeback.addChild(this.Lowerjawslopefront);
        this.Tailbase.addChild(this.Tailmiddlebase);
        this.Tailbase.addChild(this.Tailbasehump);
        this.Hiphumpfront.addChild(this.Hiphumpback);
        this.Belly.addChild(this.Bodyfront);
        this.Leftthigh.addChild(this.Leftshin);
        this.Rightthigh.addChild(this.Rightshin);
        this.Tailmiddle.addChild(this.Tailmiddlehump);
        this.Neck.addChild(this.Head);
        this.Lowerjawmiddleback.addChild(this.Lowerjawslopeback);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Lowerjawback.addChild(this.Lowerjawmiddleback);
        this.Belly.addChild(this.Bellyhump);
        this.Bodyfront.addChild(this.Fronthumpfront);
        this.Hips.addChild(this.Rightthigh);
        this.Head.addChild(this.Upperjawback);
        this.Upperjawmiddle.addChild(this.Upperjawfront);
        this.Upperjawback.addChild(this.Lefteye);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Upperjawback.addChild(this.Righteye);
        this.Rightheel.addChild(this.Righttoes);
        this.Upperjawfront.addChild(this.Faceslopefront);
        this.Leftheel.addChild(this.Lefttoes);
        this.Lowerjawmiddleback.addChild(this.Lowerjawmiddlefront);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Tailmiddlebase.addChild(this.Tailmidbasehump);
        this.Hips.addChild(this.Hiphumpfront);
        this.Leftshin.addChild(this.Leftheel);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5 * 0.500f);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Lowerjawback.rotateAngleX = (float) Math.toRadians(25);
        this.Neck.render(0.01F);
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
        this.Hips.offsetY = 0.75F;
        //float ZOffsetter = 0.60F;

        EntityPrehistoricFloraLotosaurus Lotosaurus = (EntityPrehistoricFloraLotosaurus) e;
        float masterSpeed = Lotosaurus.getTravelSpeed();

        if (Lotosaurus.isDrinking()) {
            this.faceTarget(f3, f4, 1, Hips);
        }

        //System.err.println("PFDrink " + Lotosaurus.getPFDrinking());

        //float masterSpeed = 0;

        this.faceTarget(f3, f4, 2, Neck);
        this.faceTarget(f3, f4, 4, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddle, this.Tailmiddleend, this.Tailend};

        if (Lotosaurus.getAnimation() == Lotosaurus.LAY_ANIMATION) {
            //this.Lotosaurus.offsetZ = ZOffsetter;
            this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);

            return;
         }

        if (!Lotosaurus.isReallyInWater()) {

            if (f3 == 0.0F || !Lotosaurus.getIsMoving()) {
                this.swing(Neck, 0.05F, 0.10F, false, 0F, 0.05F, f2, 0.8F);
                this.walk(Neck, 0.05F * 2, -0.02F, false, 0F, -0.01F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
            }

            if (Lotosaurus.getIsFast()) { //Running
                float speed = masterSpeed / 1.8F;
                //this.basin.offsetY = 0.75F;
                this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.425), false, 3, f2, 1.5F);
                this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.425), false, 0, f2, 1.5F);

                //this.chainWaveExtended(ArmL, speed, -(float)Math.toRadians(20), 0.5, 8, f2, 1F);
                //this.chainWaveExtended(ArmR, speed, -(float)Math.toRadians(20), 0.5, 5, f2, 1F);

                this.walk(Leftupperarm, speed, (float)Math.toRadians(40), true, 11.0F, -(float)Math.toRadians(28), f2, 1.0F);
                this.walk(Rightupperarm, speed, (float)Math.toRadians(40), true, 8.0F, -(float)Math.toRadians(28), f2, 1.0F);

                this.walk(Leftlowerarm, speed, 0.36F, true, 9.5F, 0F, f2, 1F);
                this.walk(Rightlowerarm, speed, 0.36F, true, 6.5F, 0F, f2, 1F);

                this.walk(Leftfrontfoot, speed, (float)Math.toRadians(25), false, 7.0F, (float)Math.toRadians(15), f2, 1F);
                this.walk(Rightfrontfoot, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);



                //---backlegs
                this.walk(Leftthigh, speed, (float)Math.toRadians(30), true, 8.0F, -(float)Math.toRadians(15), f2, 1.0F);
                this.walk(Rightthigh, speed, (float)Math.toRadians(30), true, 5.0F, -(float)Math.toRadians(15), f2, 1.0F);

                this.walk(Leftshin, speed, 0.3F, true, 6.5F, 0F, f2, 1F);
                this.walk(Rightshin, speed, 0.3F, true, 3.5F, 0F, f2, 1F);

                this.walk(Leftheel, speed, (float)Math.toRadians(20), false, 4.0F, (float)Math.toRadians(10), f2, 1F);
                this.walk(Rightheel, speed, (float)Math.toRadians(20), false, 1.0F, (float)Math.toRadians(10), f2, 1F);

                this.walk(Lefttoes, speed, 0.6F, true, 4.5F, 0.535F, f2, 1F);
                this.walk(Righttoes, speed, 0.6F, true, 1.5F, 0.535F, f2, 1F);

                this.bobExtended(Hips, speed * 2F, 1.23F, false, 3.5F, f2, 1F);

                this.bobExtended(Leftthigh, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(Rightthigh, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(Hips, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(Belly, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(Bodyfront, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(Neck, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);

                this.flap(Leftthigh, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(Rightthigh, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(Belly, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(Bodyfront, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.25), false, 1.75F, f2, 1) + 0.2F;

                //---


                this.walk(Neck, speed * 4, -0.05F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(Head, speed * 4, 0.05F, false, 2.5F, 0F, f2, 0.5F);

                this.chainWave(Tail, (speed * 1.2F), 0.125F, 0.5F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 4F, 0.05F, 0.12F, f2, 1F);

            }
            else { //Walking
                float speed = masterSpeed / 2.50F;
                //this.basin.offsetY = 0.815F;
                this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.225), false, 3, f2, 1.5F);
                this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.225), false, 0, f2, 1.5F);

                //this.chainWaveExtended(ArmL, speed, -(float)Math.toRadians(10), 0.5, 8, f2, 1F);
                //this.chainWaveExtended(ArmR, speed, -(float)Math.toRadians(10), 0.5, 5, f2, 1F);

                this.walk(Leftupperarm, speed, (float)Math.toRadians(20), true, 11.0F, (float)Math.toRadians(10), f2, 1.0F);
                this.walk(Rightupperarm, speed, (float)Math.toRadians(20), true, 8.0F, (float)Math.toRadians(10), f2, 1.0F);

                this.walk(Leftlowerarm, speed, 0.36F, true, 9.5F, 0F, f2, 1F);
                this.walk(Rightlowerarm, speed, 0.36F, true, 6.5F, 0F, f2, 1F);

                this.walk(Leftfrontfoot, speed, (float)Math.toRadians(15), false, 7.0F, (float)Math.toRadians(7), f2, 1F);
                this.walk(Rightfrontfoot, speed, (float)Math.toRadians(15), false, 4.0F, (float)Math.toRadians(7), f2, 1F);




                this.walk(Leftthigh, speed, (float)Math.toRadians(30), true, 8.0F, -(float)Math.toRadians(10), f2, 1.0F);
                this.walk(Rightthigh, speed, (float)Math.toRadians(30), true, 5.0F, -(float)Math.toRadians(10), f2, 1.0F);

                this.walk(Leftshin, speed, 0.25F, true, 6.5F, 0F, f2, 1F);
                this.walk(Rightshin, speed, 0.25F, true, 3.5F, 0F, f2, 1F);

                this.walk(Leftheel, speed, (float)Math.toRadians(20), false, 4.0F, (float)Math.toRadians(10), f2, 1F);
                this.walk(Rightheel, speed, (float)Math.toRadians(20), false, 1.0F, (float)Math.toRadians(10), f2, 1F);

                this.walk(Lefttoes, speed, 0.6F, true, 4.5F, 0.535F, f2, 0.8F);
                this.walk(Righttoes, speed, 0.6F, true, 1.5F, 0.535F, f2, 0.8F);

                this.bobExtended(Hips, speed * 2F, 0.63F, false, 3.5F, f2, 1F);

                this.bobExtended(Leftthigh, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(Rightthigh, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(Hips, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(Belly, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(Bodyfront, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(Neck, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);

                this.flap(Leftthigh, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(Rightthigh, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(Belly, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(Bodyfront, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(Neck, speed * 0.5F, -0.05F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(Head, speed * 0.5F, 0.050F * 2.25F, false, 2.5F, 0F, f2, 0.9F);

                this.chainWave(Tail, (speed * 0.5F), 0.125F * 0.55F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.0), false, 1.75F, f2, 1) + 0.2F;

            }
        }
        else {
            //Swimming pose:
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water
            return;
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLotosaurus e = (EntityPrehistoricFloraLotosaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Hips, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-12.2), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.Hips, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.DRINK_ANIMATION); //?? ticks
        animator.resetKeyframe(10);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(3);
        animator.rotate(this.Neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks

    }
}
